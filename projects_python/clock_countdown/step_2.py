# Project - Digital Clock & Countdown timer
# Let us now update the digital_clock() function.

# If we ask our trusted friend ChatGPT about how to display the current time using python - we get the following response

# import time

# Get the current time
# current_time = time.localtime()

# Format the time as a string
# time_string = time.strftime("%Y-%m-%d %H:%M:%S", current_time)

# Print the current time
# print("Current Time:", time_string)

# Task
# Review the syntax given above and paste it into the digital_clock() function.

# Notice the output - You get a static clock - i.e. - time is displayed only once.
# Can you update the function such that the time is updated every second?

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
    while(True):
        # Get the current time
        current_time = time.localtime()
        
        # Format the time as a string
        time_string = time.strftime("%Y-%m-%d %H:%M:%S", current_time)
        
        # Print the current time
        print("Current Time:", time_string)
        time.sleep(1)    


def countdown_timer():
    """Counts down from a given number of seconds."""

if __name__ == '__main__':
    while True:
        choice = input("Choose an option (1:Digital Clock, 2:Countdown Timer): ")
        userChoice(choice)