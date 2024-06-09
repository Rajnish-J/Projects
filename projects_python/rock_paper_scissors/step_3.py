# Lets us go to the next step and create the 'judge' function which decides who won the specific round.

# Task

# Update the determine_winner() function
# There are 3 scenarios
# Both choices - user_choice and computer_choice are the same
# In this case, determine_winner() should return It's a tie!
# You have the winning selection

# In this case, determine_winner() should return Congratulations! You win this round!
# Computer has the winning selection

#In this case, determine_winner() should return Computer wins this round!
# For each scenario
# The Function will output the winner of the round
# Update the global variables - you_score and computer_score which will be used at the end of the match to finalize the eventual winner

import random

you_score = 0
computer_score = 0

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

def get_computer_choice():
    """
    Function to randomly generate computer's choice
    """
    return random.choice(['rock', 'paper', 'scissors'])

# Solution as follows
def determine_winner(user_choice, computer_choice):
    """
    Function to determine the winner of the game
    """
    global you_score, computer_score;
        
    if user_choice == computer_choice:
        return "It's a tie!"
    elif (user_choice == 'rock' and computer_choice == 'scissors') or \
         (user_choice == 'paper' and computer_choice == 'rock') or \
         (user_choice == 'scissors' and computer_choice == 'paper'):
         
        you_score = you_score + 1
        return "Congratulations! You win this round!"
    else:
        computer_score = computer_score + 1
        return "Computer wins this round!"
        

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
        computer_choice = get_computer_choice()
        print(f"You chose: {user_choice}")
        print(f"Computer chose: {computer_choice}")
        print(determine_winner(user_choice, computer_choice))
        n = n + 1