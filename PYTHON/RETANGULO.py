import math

base = float(input("Digite a base do retangulo: "))
alt = float(input("Digite a altura do retangulo: "))

area = base * alt
peri = 2 * base + 2 * alt
diag = math.sqrt(base ** 2 + alt ** 2)

print(f"AREA = {area:.4f}")
print(f"PERIMETRO = {peri:.4f}")
print(f"DIAGONAL = {diag:.4f}")
