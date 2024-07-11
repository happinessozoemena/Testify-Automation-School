#Sort an array of numbers in descending order

def sort_numbers_descending_in_place(numbers):
    numbers.sort(reverse=True)

if __name__ == "__main__":
    sample_numbers = [5, 2, 9, 1, 5, 6]
    sort_numbers_descending_in_place(sample_numbers)
    print(f"Sorted array: {sample_numbers}")
