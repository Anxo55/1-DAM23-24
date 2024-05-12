print("Dame 3 numeros para saber cual es el mayor de los 3: ")
print(" ")

numero1 = int(input("Dame el primer entero: "))
numero2 = int(input("Dame el segundo entero: "))
numero3 = int(input("Dame el tercer entero: "))

print(" ")

if numero1 > numero2 and numero1 > numero3:

    print("El numero "+str(numero1)+" es el mayor")

elif numero2 > numero1 and numero2 > numero3:

    print("El numero "+str(numero2)+" es el mayor")

elif numero3 > numero2 and numero3 > numero1:

    print("El numero "+str(numero3)+" es el mayor")