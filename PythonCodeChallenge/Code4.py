#Print a table containing multiplication tables

def print_multiplication_table(n):
    # Print the header row
    print("    ", end="")
    for i in range(1, n + 1):
        print(f"{i:4}", end="")
    print("\n" + "----" * (n + 1))

    # Print the table rows
    for i in range(1, n + 1):
        print(f"{i:2} |", end="")
        for j in range(1, n + 1):
            print(f"{i * j:4}", end="")
        print()

if __name__ == "__main__":
    size = 10
    print_multiplication_table(size)
