#Display initial message
# Perfect - Let us begin.

# We will break down our code into multiple sections.

# The 1st component of your code needs to be the section defining the project.

# Task
# Write the code to output the following to the console.

# Welcome to Calculator
# Choose one operation:
#   1. Add
#   2. Subtract
#   3. Exit

def calculatorDisplay():
    display = """Welcome to the calculator

choose one operation:
1. Add
2. Subtract
3. Exit
"""

    return(display)
    
if __name__ == '__main__':
    print(calculatorDisplay())