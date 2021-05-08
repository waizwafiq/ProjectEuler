'''PROBLEM 014
The following iterative sequence is defined for the set of positive integers:
        n → n/2 (n is even)
        n → 3n + 1 (n is odd)
Using the rule above and starting with 13, we generate the following sequence:
        13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
Which starting number, under one million, produces the longest chain?
NOTE: Once the chain starts the terms are allowed to go above one million.
'''

def collatz(n:int, count = 1, keyCount = 0) -> int:
    '''The Collatz Conjecture:
            f(n) = n/2      if n is even,
            f(n) = 3*n+1    if n is odd;
        This function will print out the chain until it reaches 1
    :param n: The positive integer to determine the chain
    :param count: To count the number of chains (default at 1; includes the initial integer n)
    :param keyCount: If 0, dont get chain count; else, get chain count by fetching the second element.
    :return: If keyCount=0, fetch first element to print the chain.
             else, fetch second element to get the number of chains
    '''
    if n!=1 and keyCount == 0: print(int(n), end=" -> ")

    if n == 1:
        return 1, count
    elif n%2 == 0:
        return collatz(n/2, count+1, keyCount)
    elif n%2 != 0:
        return collatz(3*n+1, count+1, keyCount)

maxChains = 0
for i in range(int(1e6-1e3), int(1e6)):
    print(collatz(i)[0]) #prints the chain
    chains = collatz(i, keyCount=1)[1]
    if chains > maxChains:
        maxChains = chains
        largestNumChain = i

print(f"\n\nlargest chain: {maxChains} chains by number {largestNumChain}")
print(collatz(largestNumChain)[0])

