# In the previous problem, we created a random password of length 4 from a string containing only letter.

# Task
# We have given 3 standard strings - consisting of letters, numbers and special characters respectively.

# In this problem - lets execute the following

# Create a password of length 8
# The first 6 character should be a random combination of letters
# The 7th character should be a number
# The 8th character should be a special charater

import random
import string

string_char = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'
string_num = '0123456789'
string_special = '~!@#$%^&*()'

password = ''

# Solution as follows

# Creating the first 6 characters of 'password' as a combination of alphabets
for i in range(6):
    password = password + random.choice(string_char)
    
# The 7th character should be a number
password = password + random.choice(string_num)

# The 8th character should be a special character
password = password + random.choice(string_special)

print(password)