'''PROBLEM 002
Each new term in the Fibonacci sequence is generated by adding the previous two terms.
By starting with 1 and 2, the first 10 terms will be:
                  1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
By considering the terms in the Fibonacci sequence whose values do not exceed four million,
find the sum of the even-valued terms.
'''

sum, fn, f1, f0 = 2, 0, 2, 1
while fn<4e6:
    fn = f0+f1
    f0,f1 = f1,fn
    if fn%2==0: sum+=fn
print(f"Sum of the even-valued terms = {sum}")

