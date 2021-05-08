'''PROBLEM 003
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143?
'''

import math
from MyLib import isPrime

n = 600851475143
for i in range(1, int(math.sqrt(n))):
    if isPrime(i) and n%i==0: max = i

print(f"The largest prime factor of the number {n} is {max}")