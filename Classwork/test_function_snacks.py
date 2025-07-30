from unittest import TestCase
import function_snacks
		
class TestSnacksFunction(TestCase): 
        def test_that_function_snacks_function_exists(self):
                function_snacks.get_divisor(10)




#create function so that if nos divisible by 5, retrurnts its square root
#else return remainder of the number divided by 5.
#handle edge cases like negative nos and non negative inouts .
#input 10 function returns 3.16 AS SQUARE ROOT



#CREATE FUNCTION THAT TAKES INVESTMENT AMOUNT .monthly interest rate , years as parameter and 
#computes a future investment value at a given interest rate for a specified number of years
#the future investment is determined with formula
#future_investment_value = investment-amount*(1+monthly_interest-rate)** number of montha