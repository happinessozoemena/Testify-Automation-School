#Create a test case that compares two strings
#Create another test case that compares different numbers

#Use any unit testing framework from this week's lessons.

import unittest

class TestComparisons(unittest.TestCase):

    def test_compare_strings(self):
        string1 = "hello"
        string2 = "hello"
        self.assertEqual(string1, string2, "The strings should be equal")

    def test_compare_numbers(self):
        number1 = 42
        number2 = 42
        self.assertEqual(number1, number2, "The numbers should be equal")

    def test_compare_different_numbers(self):
        number1 = 42
        number2 = 43
        self.assertNotEqual(number1, number2, "The numbers should be different")

if __name__ == '__main__':
    unittest.main()
