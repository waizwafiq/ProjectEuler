'''PROBLEM 010
* The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
* Find the sum of all the primes below two million.'''
from MyLib import isPrime

sum, max = 0, int(2e6)
for p in range(1,max):
    if(isPrime(p)): sum+=p

print(f"The sum of all primes below {max} is {sum}")