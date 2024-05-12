print("Dame dos numeros y muestra su suma: ")

numero1 = int(input("Dame el primer numero entero: "))
numero2 = int(input("Dame el segundo numero entero: "))
print("")

print("El primer numero es: "+str(numero1))
print("El segundo numero es: "+str(numero2))

suma = numero1 + numero2

print("La suma de los dos numero enteros es: "+str(suma))
print("")

print("Mostrando cual de los dos numeros es el mayor: ")

if(numero1 > numero2):
    print("El numero "+str(numero1)+" es mayor que el numero "+str(numero2))
else:
    print("El numero "+str(numero2)+" es mayor que que el numero "+str(numero1))
    