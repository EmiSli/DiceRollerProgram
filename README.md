# Dice Roller Game
## This is a simple Java console application that simulates rolling dice. The program allows the user to roll a dice multiple times, displays the visual representation of each dice roll, shows the value of each roll, and calculates the total sum.
## Features
- Ask the user how many times they want to roll the dice.
- Display an ASCII art representation of each dice roll.
- Show the numeric value of each roll.
- Calculate and display the total sum of all rolls.
- Allow the user to play multiple rounds until they choose to exit.
## How to Run
1. Make sure you have Java installed (JDK 17+ recommended).
2. Compile the program using:
   javac Main.java
3. Run the program using:
   java Main
4. Follow the instructions in the console:
    - Enter the number of dice rolls you want.
    - View each roll and the total sum.
    - Choose whether to play again or exit.
## Example Output

Enter the number of rolls: 3
```
 -------
|       |
|   ●   |
|       |
 ------- 
```
You rolled 1
```
 -------
| ●     |
|   ●   |
|     ● |
 ------- 
```
You rolled 3
```
 -------
| ●   ● |
| ●   ● |
| ●   ● |
 ------- 
```
You rolled 6

Your total is: 10

Do you want to play again? (Y-yes/N-no):
## Notes

- The number of rolls must be greater than 0.
- Input is validated; the program will ask again if invalid input is entered.
- Dice rolls are random, ranging from 1 to 6.

## Author

Created by Emilia Śliwka
