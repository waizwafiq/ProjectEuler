'''PROBLEM 007
* By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
* What is the 10 001st prime number?
'''

from MyLib import isPrime
import math

n, i, count = 10001, 0, 0
if n==1: print("Prime number: 2")
else:
    while count != n:
        if isPrime(i):
            #increase the counter by 1 everytime a prime number is found
            #loop until count = n
            count+=1
        i+=1
    print(f"{n}th prime number: {i-1}")