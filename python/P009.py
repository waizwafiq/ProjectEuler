'''PROBLEM 009
* A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
*                       a^2 + b^2 = c^2
* For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
* There exists exactly one Pythagorean triplet for which a + b + c = 1000.
* Find the product abc.'''

from itertools import product
import math

for a,b in product(range(1,1000),range(1,1000)):
    c1,c2 = int(math.sqrt(a**2 + b**2)), math.sqrt(a**2 + b**2)
    if c1 == c2 and a+b+c2 == 1000 and a<b:
        print(f"{a}**2 + {b}**2 = {c1}**2")
        print(f"abc = {a*b*c1}")