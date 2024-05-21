#Print all even numbers from 0 – 100

def print_even_numbers():
    for number in range(0, 101):
        if number % 2 == 0:
            print(number)

if __name__ == "__main__":
    print_even_numbers()
