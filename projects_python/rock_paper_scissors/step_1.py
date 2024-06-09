# We have created the skeleton structure of the flow we discussed.
# Check out the code in the IDE.

# Task

# Update the get_user_choice() to take the input from the user
# If the user provides input as 'Rock', 'ROCK', 'rock' or 'RoCk' - all are valid - hence convert all inputs into lowercase
# If the user provides any input other than rock, paper or scissors (after checking for the validation above), please output 'Invalid choice! Please enter 'rock', 'paper', 
# or 'scissors'.'

# Concept
# Remember that when input() is used together like strip().lower(), it first removes any leading or trailing whitespace from the string and then converts the resulting 
# string to lowercase.

import random

you_score = 0
computer_score = 0

# Solution as follows
def get_user_choice():
    """
    Function to get user's choice (rock, paper, or scissors)
    """
    while True:
        user_choice = input("Enter your choice (rock, paper, or scissors): ").strip().lower()
        if user_choice in ['rock', 'paper', 'scissors']:
            return user_choice
        else:
            print("Invalid choice! Please enter 'rock', 'paper', or 'scissors'.")


"""
Main code
"""
if __name__ == '__main__':
    print("Let's play Rock, Paper, Scissors!")
    print("This game is the best of 3!")
    print("\n")
    
    n = 0
    while n < 3:
        print(f"Round: {n+1}")
        user_choice = get_user_choice()
        n = n + 1