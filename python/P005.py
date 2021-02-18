'''PROBLEM 005
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
'''

max, i, repeat = 20, 2520, True

while repeat:
    i+=max
    for j in range(1,max+1):
        if i%j != 0:
            repeat = True
            break
        repeat = False

print(f"Smallest positive number that is evenly divisible by all of the numbers from 1 to {max} = {i}")