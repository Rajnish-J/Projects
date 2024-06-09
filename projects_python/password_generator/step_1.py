# Let us think a bit more about the Password construction scenario.

# Password construction

# Create a random password of length (N−2) consisting only alphabets. Remember that the 1st character of the password should necessarily be an alphabet

# If 'use_numbers' is 'Yes', then concatenate any random number at the end. If it is 'No', then concatenate any random alphabet at the end. 
# Now the password string has length (N−1).

# If 'use_special_chars' is 'Yes', then concatenate any random special character at the end. If it is 'No', then concatenate any random alphabet at the end. 
# Now the password string has length N.

# Check the code given in the IDE to generate a random string of length 4 consisting of only alphabets.

# I've added comments explaining each part of the code to make it clearer - we are generating a password of length 4:

# The import statements bring in the random and string modules, which are needed for generating random characters and accessing string-related functionality, respectively.
# The string_char variable contains the alphabets from which the password will be generated.
# The password variable is initialized as an empty string.
# The for loop iterates 4 times, each time appending a randomly chosen character from string_char to the password.
# Finally, the generated password is printed.

# Importing necessary modules
import random  # For generating random numbers
import string  # For accessing string constants and helper functions

# Define a string containing the characters to choose from for the password
string_char = 'abcdefgh'

# Initialize an empty string to hold the generated password
password = ''

# Loop 4 times to generate 4 characters for the password
for _ in range(4):
    # Randomly choose one character from the string_char and append it to the password
    password += random.choice(string_char)

# Print the generated password
print(password)