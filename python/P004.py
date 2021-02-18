'''PROBLEM 004
A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is
9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
'''

from itertools import product
from MyLib import isPalindrome

for i ,j in product(range(1000,100,-1), range(1000,100,-1)):
    if isPalindrome(i*j):
        print(f"{i*j} = {i} x {j}")
        break
