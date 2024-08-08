# Notes on Changes
## Tennis Game 3
### General:

- Changed p1 and p2 variables to playerOneScore and playerTwoScore as it makes the code easier to read and understand
- Renamed p1N and p2N variables to playerOneName and playerTwoName, so it is clearer what the variable mean and the variables have been made final as they do not change.
- Changed variable s to be playerOneScoreAsString to make it clearer what it means.
- Changed the variable p to be arrayOfScoreNames, so it is clearer what it means.
- Added playerTwoScoreAsString variable for consistency, and it makes the line of code where it is used more readable.
- If and else did not have curly brackets marking, which statements fall under them, which can be misleading.
- There is an else statement directly into an if statement. This could be collapsed into an if statement. The statement after this should be in an else statement for clarity.
- The s string had multiple was used to for playerOne’s score and is later used again to be either “player1” and “player2” in the case of advantage or a win. The variable having multiple purposes is confusing so I have made a new String variable called playerNameWithHigherScore.
- With the check to see if it is advantage I changed it from a long multiplication to a Math.pow to make it clearer what is being done (making the difference positive) and it to make the code shorter/simpler.
- Moved arrayOfScoreNames to start with other variable declarations, so they are grouped in a neater format.

### wonPoint function:

- Used .equals() for strings as we care that they have equal value, and we don’t care if they reference the same thing.
- Made the if else statement into an if-else-if statement as we don’t want to increase player 2’s score if we get other values such as undefined.
- This function only allowed the player’s to be called player1 and player2 when they should be whatever the p1N and p2N variable calls them.