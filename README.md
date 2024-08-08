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

## Tennis Game 1
### General:

- Made name variables final for the same reason
- Used .equals() to compare strings for the same reason
- This code also hard codes the player names being “player1” and “player2” so I put in the playerName variable.
- String builder has better performance than string concatenation in a loop
- Changed m_score1 and m_score2 to player1Score and player2Score, so it is clearer what they mean.
- First switch statement replaced with enhanced switch statement as it is neater and takes up fewer lines.
- Added spaces between variables and mathematical operators as it makes the code more readable.
- Initialising temp score to 0 was redundant as it gets reassigned.
- Moved the if else statement in the for loops to be multiple lines with curly braces, so it is easier to understand the purpose of it.
- Made sure opening curly braces came right after for loop statement and if/else statements instead of on the next line.

## Summary

I worked on game for less time, but I overall found the code more confusing and struggled to make it less so without 
really changing the structure of the code so much it was unrecognisable. I think that the code for game 3 is more suitable
but still not perfect.