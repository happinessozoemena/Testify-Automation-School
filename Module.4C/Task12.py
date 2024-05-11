
# Declare a global variable with name as language and the value as "Python"
language = "Python"

# Create a function
def print_language():
    # Declare a variable with name as language and value as "Java"
    language = "Java"
    # Print out the variable in the function
    print("Inside the function:", language)

# Print out the global variable name into the console
print("Outside the function:", language)

# Invoke the function
print_language()
