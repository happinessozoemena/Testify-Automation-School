#Create a function that filters out negative numbers.

def filter_negative_numbers(numbers):
    return [num for num in numbers if num >= 0]

if __name__ == "__main__":
    sample_numbers = [10, -3, 5, -7, 8, -2, 1, 4]
    filtered_numbers = filter_negative_numbers(sample_numbers)
    print(f"Original list: {sample_numbers}")
    print(f"Filtered list: {filtered_numbers}")
