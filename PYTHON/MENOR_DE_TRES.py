import math

a = int(input("Primeiro valor: "))
b = int(input("Segundo valor: "))
c = int(input("Terceiro valor: "))


if a < b and a < c:
    print("MENOR = ", a)
elif b < c:
    print("MENOR = ", b)
else:
    print("MENOR = ", c)
