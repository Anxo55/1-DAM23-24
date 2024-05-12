class Menu:
    def menu_para_mostrar(self):
        while True:
            print("------MENU------")
            print("Opcion -1- numero mayor entre 2")
            print("Opcion -2- numero mayor entre 3")
            print("Opcion -3- joven, adulto, persona mayor")
            print("Opcion -4- SALIR")
            opcion = input("Dame una opcion: ")

            if opcion =='1':
                self.numero_mayor_de_dos()
            elif opcion == '2':
                self.numero_mayor_de_tres()
            elif opcion == '3':
                self.edad_persona()
            elif opcion == '4':
                print("Saliendo del programa...")
                break
            else:
                print("Opcion incorrecto, pruebe otra vez")




    def numero_mayor_de_dos(self):
        numero1 = int(input("Dame el primer numero: "))
        numero2 = int(input("Dame el segundo numero: "))

        if numero1 > numero2:
            print("El numero "+str(numero1)+ " es mayor que el numero "+str(numero2))
        else:
             print("El numero "+str(numero2)+ " es mayor que el numero "+str(numero1))


    def numero_mayor_de_tres(self):
        numero1 = int(input("Dame el primer numero: "))
        numero2 = int(input("Dame el segundo numero: "))
        numero3 = int(input("Dame el tercer numero: "))

        if numero1 > numero2:
            print("El numero "+str(numero1)+ " es mayor que el numero "+str(numero2))
        else:
             print("El numero "+str(numero2)+ " es mayor que el numero "+str(numero1)) 

        if numero2 > numero3:
            print("El numero "+str(numero2)+ " es mayor que el numero "+str(numero3))
        else:
             print("El numero "+str(numero3)+ " es mayor que el numero "+str(numero2))       

        if numero1 > numero3:
            print("El numero "+str(numero1)+ " es mayor que el numero "+str(numero3))
        else:
             print("El numero "+str(numero3)+ " es mayor que el numero "+str(numero1)) 



    def edad_persona(self):
        edad = int(input("Dime la edad de la persona: "))
        if edad < 18:
            print("Es una persona menor de edad")
        elif edad >=18 and edad <=40:
            print("Es una persona adulta")
        elif edad > 40:
            print("Es una persona de la tercera edad") 


menu = Menu()
menu.menu_para_mostrar()