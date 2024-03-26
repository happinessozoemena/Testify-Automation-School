
import main
import unittest

class TestMain(unittest.TestCase):

   def test_addition(self):
    self.assertEqual(main.addition(1,2),3, "Should be 3")
    self.assertEqual(main.addition(5,5),10, "Should be 10")
    self.assertEqual(main.addition(40,20),60, "Should be 60")
    self.assertEqual(main.addition(-3,2),-1, "Should be -1")

   def test_subtraction(self):
    self.assertEqual(main.Subtraction(10,5),5, "Should be 5")


    def test_multiplication(self):
      self.assertEqual(main.Multiplication(2,2),4, "Should be 4")    

      


    if _name_ =='_main_':
        unittest.main( )
    
    

