#Create a function that reverses an array

def reverse_array(array):
    array.reverse()
    return array

if __name__ == "__main__":
    sample_array = [1, 2, 3, 4, 5]
    reversed_array = reverse_array(sample_array.copy())  # Use copy to avoid modifying the original array
    print(f"Original array: {sample_array}")
    print(f"Reversed array: {reversed_array}")
