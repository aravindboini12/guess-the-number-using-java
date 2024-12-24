# Guess the Number Game 🎲

This is a simple command-line game where the user tries to guess a randomly generated number between 0 and 99. The program provides hints to help the user get closer to the correct number.

---

## Features
- The computer generates a random number between `0` and `99`.
- The user guesses the number, and the program provides feedback:
  - If the guess is **too high**, it prompts the user to guess lower.
  - If the guess is **too low**, it prompts the user to guess higher.
- The game continues until the user correctly guesses the number.
- The program tracks the total number of guesses taken by the user.

---

## How to Play
1. Run the program in a Java-enabled environment.
2. Enter your guess when prompted.
3. Follow the feedback provided by the program:
   - "Too high" → Guess a lower number.
   - "Too low" → Guess a higher number.
4. Keep guessing until you find the correct number.
5. Once you guess correctly, the program will display the total number of attempts you took.

---

## Code Highlights
### `Game` Class
- **Constructor**:
  - Generates a random number using `Random` between `0` and `99`.
- **`userNumber()` Method**:
  - Accepts user input as a guess.
- **`isCorrectGuess()` Method**:
  - Compares the user's guess with the random number.
  - Provides feedback if the guess is too high or too low.
  - Tracks the number of attempts.

### `guessTheNumber` Class
- Contains the `main` method to initialize the game loop.
- Keeps prompting the user until they guess correctly.

---

## Example Output
```
Enter your guess:
50
Too high...
Enter your guess:
25
Too low...
Enter your guess:
37
Your guess is correct after 3 guesses!
```

---

## Prerequisites
- Java Development Kit (JDK) installed on your system.

---

## How to Run
1. Save the code in a file named `guessTheNumber.java`.
2. Compile the code:
   ```bash
   javac guessTheNumber.java
   ```
3. Run the program:
   ```bash
   java guessTheNumber
   ```

---

## Future Improvements
- Add difficulty levels (e.g., easy, medium, hard with different ranges).
- Include a scoreboard or leaderboards to track best performances.
- Implement a graphical user interface (GUI).

---

Feel free to use and modify the code! 😊
