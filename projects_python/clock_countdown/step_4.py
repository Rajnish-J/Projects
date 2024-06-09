# Project - Digital Clock & Countdown timer
# In the previous implementation, notice that the current time was displayed after every second on a new line.

# This is not ideal.

# Check the code in the IDE - here we use the carriage return character (\r) to overwrite the previous output with the updated time.
# This will give the appearance of the time being updated in the same line.

# Run the code to check how it functions.

# New Concept Alert

# In Python, the end parameter in the print() function is used to specify what character(s) should be printed at the end of the output.
# By default, end='\n', which means that a newline character (\n) is printed at the end of the output, causing the next print statement to start on a new line.

# When you set end='', it means that no additional characters will be printed at the end of the output.
# This effectively prevents the print() function from adding a newline character after the printed content, and the next print() will happen on the 
# same line replacing the existing content.

import time
import sys

def digital_clock():
    """Displays a digital clock."""
    # Solution as follows
    
    while (1):
        # Get the current time
        current_time = time.localtime()
        
        # Format the time as a string
        time_string = time.strftime("%Y-%m-%d %H:%M:%S", current_time)
        
        # Print the current time
        print("Current Time:", time_string)
        time.sleep(1)
    

def countdown_timer():
    """Counts down from a given number of seconds."""

while (1):
    choice = input("Choose an option (1: Digital Clock, 2: Countdown Timer): ")

    if choice == "1":
        digital_clock()
    elif choice == "2":
        seconds = int(input("Enter the number of seconds to countdown: "))
        countdown_timer()
    else:
        print("Invalid choice!")