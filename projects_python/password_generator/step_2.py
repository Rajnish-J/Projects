# New Concept

# random.choice() is a function provided by Python's random module.

# It's used to select a random element from a non-empty sequence (such as a list, tuple, or string).

# import random

# Define a list of fruits
# fruits = ["apple", "banana", "orange", "grape", "kiwi"]

# Select a random fruit from the list
# random_fruit = random.choice(fruits)

# print("Randomly selected fruit:", random_fruit)
# In this example, random.choice(fruits) will select one fruit from the list fruits at random and assign it to the variable random_fruit. 
# Each fruit in the list has an equal probability of being chosen.

# We have populated an implementation of the above as well as randint() in the IDE.
# Click on Run and play around with the code to see how it functions.

import random

# Define a list of fruits
fruits = ["apple", "banana", "orange", "grape", "kiwi"]

# Select a random fruit from the list using random.choice
random_fruit = random.choice(fruits)
print("List of fruits:", fruits, "\n")
print("Randomly selected fruit:", random_fruit, "\n")




# Generate a random index within the range of the list usint randint
random_index = random.randint(0, len(fruits) - 1)

# Get the element at the random index
random_fruit = fruits[random_index]
print("Random index is:", random_index)
print("Randomly selected fruit:", random_fruit)