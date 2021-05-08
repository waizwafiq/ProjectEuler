'''PROBLEM 006
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.'''

n, SumSq, SqSum = 100, 0, 0
for i in range(1,n+1):
    SumSq, SqSum = SumSq+i*i,SqSum+i

SqSum *= SqSum
print(f"The difference between the sum of the squares of the first {n} natural numbers and the square of the sum is ", end="")
print(f"{SqSum} - {SumSq} = {SqSum-SumSq}")
