import math

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

def isPalindrome(num) -> bool:
    ori, reverse = num, 0
    while num>0:
        reverse = reverse*10 + num%10
        num = num//10
    return ori == reverse