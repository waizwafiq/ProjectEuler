from math import factorial as fact

w,h = 20,20
print (f"Routes through a {w}x{h} grid: {fact(w+h)//(fact(w)*fact(h))}")
