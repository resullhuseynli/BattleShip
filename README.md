# Battleships Game

## Overview
This project is a simple implementation of the classic Battleships game. A player will place 5 of their ships on a 10 by 10 grid. The computer player will deploy five ships on the same grid. Once the game starts, the player and computer take turns trying to sink each other's ships by guessing the coordinates to "attack". The game ends when either the player or computer has no ships left.

## How to Play
1. **Deploy Ships**: 
   - The player will be prompted to enter the coordinates (row and column) to place their 5 ships on the grid.
   - The computer will randomly place its 5 ships on the grid.

2. **Take Turns**:
   - The player and computer take turns to attack each other's ships by guessing the coordinates.
   - If a ship is hit, it will be marked on the grid.
   - The game continues until all ships of either the player or the computer are sunk.

3. **Winning the Game**:
   - The game ends when either the player or the computer has no ships left.
   - The winner is announced based on who has remaining ships.

## Classes and Methods
- **Main.java**: Initializes the game, sets up the grid, and controls the game flow.
- **GameOcean.java**: Creates and displays the game grid.
- **DeployingShips.java**: Handles the deployment of ships for both the player and the computer.
- **AttackTheShips.java**: Manages the attack logic for both the player and the computer.
- **WhoIsWinner.java**: Determines and announces the winner of the game.

## Running the Game
1. Compile the Java files:
   ```sh
   javac Main.java GameOcean.java DeployingShips.java AttackTheShips.java WhoIsWinner.java

## Requirements
Java Development Kit (JDK) 8 or higher
## License
This project is licensed under the MIT License.