#Return a Boolean if a number is divisible by 1

def is_divisible_by_1(number):
    return number % 1 == 0

if __name__ == "__main__"
    sample_number = 10
    result = is_divisible_by_1(sample_number)
    print(f"Is {sample_number} divisible by 1? {result}")
