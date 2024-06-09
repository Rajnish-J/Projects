# We had seen earlier how to generate the string. Let us now add it to our project.

# Remember the flow for password construction

# Create a random password of length (N−2) consisting only alphabets. Remember that the 1st character of the password should necessarily be an alphabet
# If 'use_numbers' is 'Yes', then concatenate any random number at the end. If it is 'No', then concatenate any random alphabet at the end. 
# Now the password string has length (N−1).

# If 'use_special_chars' is 'Yes', then concatenate any random special character at the end. If it is 'No', then concatenate any random alphabet at the end. 
# Now the password string has length N.

# Task
# We have created the parent strings string_char, string_num & string_special.
# Using these strings and the logic above, go ahead and update the generate_password() function.

# Remember to pass length, use_special_chars, use_numbers as parameters to the function.

import random
import string

# Global strings to be used to randomly generate password components
string_char = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'
string_num = '0123456789'
string_special = '~!@#$%^&*()'

def userInput():
    length = int(input("Enter the length of the password: "))
    use_special_chars = input("Include special characters?(yes/no):").lower() == 'yes'
    use_numbers = input("Include numbers?(yes/no): ").lower() == 'yes'
    return(length, use_special_chars, use_numbers)

# Solution as follows
def generate_password(length, use_special_chars, use_numbers):
    """Generates a random password based on user preferences."""
    password = ''

    # Generate remaining characters
    for _ in range(length-2):
        password += random.choice(string_char)

    # Replace second last character with number if required
    if use_numbers:
        password = password + random.choice(string_num)
    else:
        password = password + random.choice(string_char)

    # Replace last character with special character if required
    if use_special_chars:
        password = password + random.choice(string_special)
    else:
        password = password + random.choice(string_char)

    return password


if __name__ == '__main__':
    length, use_special_chars, use_numbers = userInput()
    generated_password = generate_password(length, use_special_chars, use_numbers)
    print("\nGenerated Password:", generated_password)