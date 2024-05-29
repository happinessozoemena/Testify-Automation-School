#Sort an array of strings in alphabetical order

def sort_strings_in_place(strings):
    strings.sort()

if __name__ == "__main__":
    sample_strings = ["banana", "apple", "cherry", "date", "orange"]
    sort_strings_in_place(sample_strings)
    print(f"Sorted array: {sample_strings}")
