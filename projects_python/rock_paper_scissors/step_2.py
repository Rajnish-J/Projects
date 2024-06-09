# Lets us go to the next step - let us generate the random option for the computer

# Task

# Update the get_computer_choice() function to generate one of 'rock', 'paper' or 'scissors'
# We have already imported the random function in Python

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

# Update the code below to solve the problem
def get_computer_choice():
    """
    Function to randomly generate computer's choice
    """
    return random.choice(['rock', 'paper', 'scissors'])


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
        n = n + 1