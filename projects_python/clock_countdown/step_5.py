# Project - Digital Clock & Countdown timer

# Let's get to the next step and update our countdown_timer() function.

# Here, we have already accepted the countdown duration integer input from the user.
# Let us use this to create our timer function.

# Task

# Update the countdown_timer() function to accept 'seconds' as an input
# Initiate the timer and output the time remaining
# Just as the previous exercise, use \r to update the time remaining on the same line
# Update the time remaining every second using the sleep() function

# New Concept Alert
# In Python, \r is a special character known as the carriage return.
# When encountered in a string, it instructs the cursor to return to the beginning of the current line, without advancing to the next line.
# This means that any subsequent characters printed will overwrite the existing content on that line.

# print("Hello\rWorld")
# will output

# World
# \r causes the cursor to return to the beginning of the line after printing "Hello".
# As a result, "World" overwrites "Hello", and the final output is just "World".

import time
import sys

def userChoice(choice):
    if choice == "1":
        digital_clock()
    elif choice == "2":
        seconds = int(input("Enter the number of seconds to countdown: "))
        countdown_timer(seconds)
    else:
        print("Invalid choice!")

def digital_clock():
    """Displays a digital clock."""
    while True:
        current_time = time.strftime("%H:%M:%S", time.localtime())
        print("\rDigital Clock: " + current_time, end = '')
        time.sleep(1)
    
# Solution as follows
def countdown_timer(seconds):
    """Counts down from a given number of seconds."""
    print("Countdown Timer started!")
    while seconds > 0:
        print("\rTime remaining: " + str(seconds) + " seconds", end = '')
        time.sleep(1)
        seconds -= 1
    print("\nTime's up!")
    
    
if __name__ == '__main__':
    while True:
        choice = input("Choose an option (1:Digital Clock, 2:Countdown Timer): ")
        userChoice(choice)