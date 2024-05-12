print("Vamos a pedirle varios numeros al cliente")

numero1 = int(input("Dame el primer entero: "))

numero2 = int(input("Dame el segundo entero: "))

suma = numero1 + numero2

print("La suma de los numeros es: "+str(suma))
print("")

print("A continuacion tras dar los valores nos dirá que numero es mayor")

if (numero1 > numero2):
    print("El numero 1 es mayor que el numero 2")
else:
    print("El numero 2 es mayor que el numero 1")    

