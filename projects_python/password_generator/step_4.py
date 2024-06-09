# Let us now work on the project and build it step by step.

# We have populated the skeleton structure for this project.

# Task
# Let us first handle user input

# Accept user input for Length of the password as an integer (length N)

# Accept user input for 'use_special_chars' as 'Yes / No'. If input is 'Yes' - then set 'use_special_chars' as True
# Accept user input for 'use_numbers' as 'Yes / No'. If input is 'Yes' - then set 'use_numbers' as True
# While accepting user inputs - treat all - 'YES', 'Yes', 'yes' - as 'yes' - i.e. - your code should be case insensitive

# New concept
# .lower() is a method that can be applied to strings in Python.
# When you call .lower() on a string, it returns a copy of the string converted to lowercase.
# When you combine input() with .lower(), you can create a case-insensitive input mechanism.

# user_input = input("Please enter something: ").lower()

# So, if the user enters "Hello", user_input will store "hello".
# Similarly, if the user enters "HELLO", user_input will still store "hello".
# This allows you to compare the user's input in a case-insensitive manner, or perform operations that should be case-insensitive

import random
import string

# Global strings to be used to randomly generate password components
string_char = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'
string_num = '0123456789'
string_special = '~!@#$%^&*()'

# Solution as follows
def userInput():
    length = int(input("Enter the length of the password: "))
    use_special_chars = input("Include special characters?(yes/no):").lower() == 'yes'
    use_numbers = input("Include numbers?(yes/no): ").lower() == 'yes'
    return(length, use_special_chars, use_numbers)
    

def generate_password(length, use_special_chars, use_numbers):
    """Generates a random password based on user preferences."""


if __name__ == '__main__':
    length, use_special_chars, use_numbers = userInput()
    generated_password = generate_password(length, use_special_chars, use_numbers)
    print("\nGenerated Password:", generated_password)