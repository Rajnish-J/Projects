# Project - Calculator
# Great - you created a calculator using Python!

# Here are some additions that you can try in the Project yourself

# Create the 'Division' and 'Multiplication' functions - output the Quotient, Remainder and Product respectively

# Add an 'Exception' handler
# Currently, if the user input is any character or number other than 1 or 2 - the Calculator exits the program.
# Update this as follows
# * If the User inputs 1 or 2 - Do Addition or Subtraction
# * If the User inputs 3 - Exit
# * If the User inputs any other number of character - provide an exception error saying 'Operation does not exist - please provide the correct input'

def calculatorDisplay():
    
    display = """Welcome to Calculator
    
Choose one operation:
1. Add
2. Subtract
3. Exit
"""
    return(display)


def calculatorFunction(user_choice):
    if user_choice == 1:
        print("Let's perform addition")
        a, b = user_input()
        output = addition(a, b)
        return f"The sum is: {output}"
    elif user_choice == 2:
        print("Let's perform subtraction")
        a, b = user_input()
        output = subtraction(a, b)
        return f"The difference is: {output}"
    else:
        return("Exiting the calculator, bye bye!")

def user_input():
    print("Give two numbers on two lines")
    a = int(input("Number 1 is: "))
    b = int(input("Number 2 is: "))
    return a, b

def addition(a, b):
    return(a + b)

def subtraction(a, b):
    return(a - b)


if __name__ == '__main__':
    while True:
        print(calculatorDisplay())
        user_choice = int(input("Select the operation: "))
        value = calculatorFunction(user_choice)
        print(value)
        # Solution as follows
        if value == "Exiting the calculator, bye bye!":
            break