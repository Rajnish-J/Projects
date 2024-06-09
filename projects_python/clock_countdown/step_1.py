# Project - Digital Clock & Countdown timer
# Let us begin and create the project step by step.

# We have created a skeleton structure of the overall project for you in the IDE.
# As a 1st step, let us accept user input on whether he wants to display the 'Digital Clock' or the 'Countdown timer' and then call the corresponding function

# Task

# Update the userChoice() function to achieve the following.
# Accept the user input as one of either '1' or '2'

# * If the user input is 1 - call the digital_clock() function
# * If the user input is 2
# * Ask the user for the countdown target time with the prompt - 'Enter the number of seconds to countdown:' and accept an integer input
# * call the countdown_timer() function with seconds as the variable passed to it
# * If the user input is anything else - output 'Invalid choice!'

import time
import sys

# Update the code below to solve the problem
def userChoice(choice):
    if choice == "1":
        digital_clock()
    elif choice == "2":
        seconds = int(input("Enter the number of seconds"))
        countdown_timer(seconds)
    else:
        print("Invalid choice!")

def digital_clock():
    """Displays a digital clock."""

def countdown_timer(seconds):
    """Counts down from a given number of seconds."""

if __name__ == '__main__':
    while True:
        choice = input("Choose an option (1:Digital Clock, 2:Countdown Timer): ")
        userChoice(choice)