def getNonNegativeInteger():
    while True:
        try:
            num = int(input("Enter a non-negative integer: "))  # Get user input
            if num >= 0:  # Check if it's non-negative
                return num
            else:
                print("Invalid input. Please enter a non-negative integer.")
        except ValueError:
            print("Invalid input. Please enter a valid integer.")

def calculateFactorial(n):
    factorial = 1
    for i in range(1, n + 1):  # Loop from 1 to n
        factorial *= i
    return factorial

# Main Program Flow
num = getNonNegativeInteger()  # Get non-negative integer from user
result = calculateFactorial(num)  # Calculate factorial
print(f"The factorial of {num} is {result}")  # Display result
