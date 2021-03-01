import math
from typing import List

def isPrime(num) -> bool:

    '''A function to determine if a very long number num is prime or not
    Algorithm: Simple 6k+-1 optimization
    * return:
    * > true: prime
    * > false: not prime'''
    if num<=3: return num>1
    if num%2==0 or num%3==0: return False

    for i in range(5, int(math.sqrt(num))+1, 6):
        if num%i==0 or num%(i+2)==0:
            return False
    return True

def fastPrimes(n: int):
    '''Reference:
    https://stackoverflow.com/questions/2068372/fastest-way-to-list-all-primes-below-n-in-python/3035188#3035188
    '''
    import numpy as np
    sieve = np.ones(n // 3 + (n % 6 == 2), dtype=np.bool)
    for i in range(1, int(n ** 0.5) // 3 + 1):
        if sieve[i]:
            k = 3*i + 1 | 1
            sieve[          k * k//3       :: 2*k] = False
            sieve[k * (k-2 * (i&1) + 4)//3 :: 2*k] = False
    return np.r_[2, 3, ((3 * np.nonzero(sieve)[0][1:] + 1) | 1)]

def isPalindrome(num) -> bool:
    ori, reverse = num, 0
    while num>0:
        reverse = reverse*10 + num%10
        num = num//10
    return ori == reverse

def getDivisors(num) -> List[int]:
    divisors = [1, num]
    for i in range(2,int(math.sqrt(num))+1):
        if num%i == 0:
            divisors.extend([i, num//i])
    return sorted(set(divisors))

def getNthTriangleNum(N:int) -> int:
    sum = 0
    for i in range(1,N+1): sum+=i
    return sum

def permutate(num: int):
    from itertools import permutations as P
    digs = [int(x) for x in str(num)] #get the digits list of num
    return set(P(digs))
