class CalculadoraMenu:
    def mostrarMenu(self):
        while True:
            print("------CALCULADORA------")
            print("1 Operacion de SUMA")
            print("2 Operacion de RESTA")
            print("3 Operacion de MULTIPLICACION")
            print("4 Operacion de DIVISION")
            print("5 SALIR del programa")
            opcion = input("Dame una opcion: ")

            if opcion == '1':
                self.operacion_suma()
            elif opcion == '2':
                self.operacion_resta()
            elif opcion == '3':
                self.operacion_multiplicacion()
            elif opcion == '4':
                self.operacion_division()
            elif opcion == '5':
                print("Saliendo del programa...")
                break
            else:
                print("opcion invalida, prueba otra opcion")



    def operacion_suma(self):
        numero1 = int(input("Dame el primero numero: "))
        numero2 = int(input("Dame el segundo numero: "))
        suma = numero1 + numero2
        print("La suma de los valores es: "+str(suma))


    def operacion_resta(self):
        numero1 = int(input("Dame el primer numero: "))
        numero2 = int(input("Dame el segundo numero: "))
        resta = numero1 - numero2
        print("La resta de los valores es: "+str(resta))

    def operacion_multiplicacion(self):
        numero1 = int(input("Dame el primer numero: "))
        numero2 = int(input("Dame el segundo numero: "))
        multiplicacion = numero1 * numero2
        print("La multiplicacion de los valores es: "+str(multiplicacion))

    def operacion_division(self):
        numero1 = int(input("Dame el primer numero: "))
        numero2 = int(input("Dame el segundo numero: "))
        division = numero1 / numero2
        print("La division de los valores es: "+division)              



calcular = CalculadoraMenu()
calcular.mostrarMenu()      