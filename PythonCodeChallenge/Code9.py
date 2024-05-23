#Return the number of vowels in a string

def count_vowels(input_string):
    vowels = "aeiouAEIOU"
    count = 0
    for char in input_string:
        if char in vowels:
            count += 1
    return count

if __name__ == "__main__":

    sample_string = "Hello, World!"
    num_vowels = count_vowels(sample_string)
    print(f"The number of vowels in '{sample_string}' is: {num_vowels}")
