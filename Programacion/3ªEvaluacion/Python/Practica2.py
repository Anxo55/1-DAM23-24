class CalculadoraMenu:
    def mostrar_menu(self):
        while True:
            print("----- Calculadora -----")
            print("1. Suma")
            print("2. Resta")
            print("3. Salir")
            opcion = input("Seleccione una opción: ")

            if opcion == '1':
                self.realizar_suma()
            elif opcion == '2':
                self.realizar_resta()
            elif opcion == '3':
                print("¡Hasta luego!")
                break
            else:
                print("Opción inválida. Por favor, seleccione una opción válida.")

    def realizar_suma(self):
        num1 = float(input("Ingrese el primer número: "))
        num2 = float(input("Ingrese el segundo número: "))
        resultado = num1 + num2
        print("La suma de", num1, "y", num2, "es:", resultado)

    def realizar_resta(self):
        num1 = float(input("Ingrese el primer número: "))
        num2 = float(input("Ingrese el segundo número: "))
        resultado = num1 - num2
        print("La resta de", num1, "y", num2, "es:", resultado)


# Crear una instancia de la clase CalculadoraMenu
calculadora = CalculadoraMenu()
# Mostrar el menú
calculadora.mostrar_menu()