import random

numeroAleatorio = random.randint(1, 100)
intentos = 0
adivina = False

print("Adivina el numero entre 1-100")

while not adivina:
    numeroElegido = int(input("Dame el numero a elegir: "))
    intentos += 1
    
    if numeroElegido > numeroAleatorio:
        print("El numero es más pequeño")
    elif numeroElegido < numeroAleatorio:
        print("El numero es más grande")
    else:
        adivina = True
        print("¡Acertaste el numero en", intentos, "intentos!")