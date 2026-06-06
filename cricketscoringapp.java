

import java.awt.*;
import javax.swing.*;


  public class cricketscoringapp extends JFrame{
   
    private int ballperover = 6;
    private int totalover;
    private JLabel scoreLabel;
    private boolean ismatchover = false ;
    private boolean isfirstinnings = true;
    private int teamarun = 0, teamawicket = 0;
    private int teambrun = 0, teambwicket = 0;
    private int target = 0;
    private int totalball = 0;


    public cricketscoringapp(int overs) {
      this.totalover = overs;
      
      setTitle("CRICKET SCORING APP");
      setSize(500, 300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());
      setLocationRelativeTo(null);

      scoreLabel = new JLabel("0/0 in 0.0 overs",SwingConstants.CENTER);
      scoreLabel.setFont(new Font("Arial",Font.BOLD,18));
      add(scoreLabel,BorderLayout.NORTH);

      JPanel buttonPanel = new JPanel(new GridLayout(2,4,10,10));
      String[] button = {"0","1","2","3","4","5","6","w"};
       
      for (String text : button){
        JButton btn = new JButton(text);
        btn.setFont(new Font("Arial",Font.PLAIN,16));
        buttonPanel.add(btn);

        btn.addActionListener(e -> handleInput(text));

      }
       add(buttonPanel,BorderLayout.CENTER);

       setVisible(true);

    }
    private void handleInput(String input){
       
       if(ismatchover){
         JOptionPane.showMessageDialog(this,"match is over");
         return;
       }
       if(isfirstinnings){
          if(input.equalsIgnoreCase("w")){
           teamawicket++;
          }else{
           teamarun += Integer.parseInt(input);
          }
        totalball++;
       

       if(teamawicket>=10 || totalball >= ballperover*totalover ){
          isfirstinnings = false;
          target = teamarun + 1;
          totalball = 0;
          JOptionPane.showMessageDialog(this,"match is over and target is : "+ target);
          
       }
     } else {  
         if(input.equalsIgnoreCase("w")){
           teambwicket++;
         }
         else{
           teambrun += Integer.parseInt(input);  
         }

       totalball++;
        
       if(teambrun >= target){
         ismatchover = true;
         JOptionPane.showMessageDialog(this,"team B wins by " +(10-teambwicket) + "wickets");
       }
       else if(teamawicket>=10 || totalball >= ballperover*totalover){
         ismatchover = true;
         if(teambrun == teamarun){
         JOptionPane.showMessageDialog(this,"match has been drawn");
         }
         else{
          ismatchover = true;
          JOptionPane.showMessageDialog(this,"team A wins by "+ (target-1-teambrun)+"runs");
       }
      }
     }
       
       updatescore();

    }

     private  void updatescore(){
       int currentover = totalball/ballperover;
       int currentball = totalball%ballperover;

       String displaytext;
       if (isfirstinnings){    
        displaytext = "Team A : " + teamarun + "/" + teamawicket + " in " + currentover + "." + currentball;
       }
       else{
        displaytext = "Team B : " + teambrun + "/" + teambwicket + " in " + currentover + "." + currentball;
       }
       scoreLabel.setText(displaytext);
    }
  

    public static void main(String[] args) {
        int overs = Integer.parseInt(JOptionPane.showInputDialog("enter the no of overs"));
        new cricketscoringapp(overs);
    }
  
  }



