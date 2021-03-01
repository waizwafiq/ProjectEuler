'''PROBLEM 020
    n! means n × (n − 1) × ... × 3 × 2 × 1
    For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
    and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
    Find the sum of the digits in the number 100!
'''

from math import factorial as fact
from operator import add
from functools import reduce

num = [int(x) for x in str(fact(100))]
num = list(filter(lambda num:num!=0, num))
print(reduce(add, num))
