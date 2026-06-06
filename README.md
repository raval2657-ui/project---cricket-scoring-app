# 🏏 Cricket Scoring App

A simple desktop-based cricket scoring application built with **Java Swing**. It supports a two-team match with customizable overs, live score tracking, wicket logging, and automatic win/loss/draw detection.

---

## Features

- Set a custom number of overs before the match starts
- Score runs (0–6) and wickets with a single click
- Live scoreboard updates after every ball
- Automatic innings transition after Team A's innings ends
- Win/loss/draw result detection at the end of the match

---

## How to Run

### Prerequisites
- Java JDK 8 or higher installed
- A terminal or any Java IDE (IntelliJ, Eclipse, VS Code with Java extension)

### Steps

1. **Clone the repository**
   bash
   git clone https://github.com/your-username/cricket-scoring-app.git
   cd cricket-scoring-app
   

2. **Compile the file**
   bash
   javac cricketscoringapp.java
   ```

3. **Run the app**
   bash
   java cricketscoringapp
   

4. Enter the number of overs in the dialog box that appears and start scoring!

---

## How to Use

| Button | Action |
|--------|--------|
| `0` – `6` | Add runs scored off that ball |
| `W` | Record a wicket |

- **First innings:** Score for Team A. The innings ends when 10 wickets fall or all overs are bowled.
- **Second innings:** Team B chases the target. The match ends when Team B wins, loses, or draws.

---

## Game Rules Implemented

- Match ends for Team A when **10 wickets** fall or **overs are exhausted**
- Team B wins if they **reach or exceed the target**
- Team A wins if Team B is **all out or overs end** before reaching the target
- A **draw** is declared if both teams finish with equal runs

---

## Project Structure

cricket-scoring-app/
│
└── cricketscoringapp.java   # Main application file




