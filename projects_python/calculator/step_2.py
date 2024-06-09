# Handle user choice
# Now, the user is expected to input his desired operation.

# Based on the user input - our program needs to initiate the Addition / Subtraction / Exit operation

# Task
# Update the calculatorFunction(user_choice) function in the IDE to write the conditions based on user choice.

# Click on 'Run' to review how your code functions in the console.

def calculatorDisplay():
    
    display = """Welcome to Calculator
    
Choose one operation:
1. Add
2. Subtract
3. Exit
"""
    return(display)

def calculatorFunction(user_choice):
    if(user_choice == 1):
        return("Let's initiate addition")
    if(user_choice == 2):
        return("Let's initiate subtraction")
    if(user_choice == 3):
        return("Exit the program")
    

if __name__ == '__main__':
    print(calculatorDisplay())
    user_choice = int(input("Select the operation: "))
    value = calculatorFunction(user_choice)
    print(value)