print("Dame tres numero para determinar cual es el mayor y el menor: ")
print(" ")

numero1 = int(input("Dame el primer entero: "))
numero2 = int(input("Dame el segundo entero: "))
numero3 = int(input("Dame el tercer entero: "))

print(" ")

if numero1 > numero2 and numero1 > numero3:
        print("El numero "+str(numero1)+" es el mayor")
if numero2> numero3 and numero1 >numero3:
        print("El numero "+str(numero3)+" es el mas pequeño")
elif numero3 > numero2 and numero1 > numero2:
        print("El numero "+str(numero2)+" es el mas pequeño")    

if numero2 > numero1 and numero2 > numero3:
        print("El numero "+str(numero2)+" es el mayor")
if numero2> numero3 and numero1 >numero3:
        print("El numero "+str(numero3)+" es el mas pequeño")
elif numero2 > numero1 and numero3 > numero1:
        print("El numero "+str(numero1)+" es el mas pequeño")

if numero3 > numero1 and numero3 > numero2:
        print("El numero "+str(numero3)+" es el mayor")
if numero3> numero1 and numero2 >numero1:
        print("El numero "+str(numero1)+" es el mas pequeño")
elif numero1 > numero2 and numero3 > numero2:
        print("El numero "+str(numero2)+" es el mas pequeño")