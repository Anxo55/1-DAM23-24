class Calculadora:
    def menu_mostra(muestra):
        while True:
            print("------CALCULADORA-----")
            print("Opcion 1 - SUMA")
            print("Opcion 2 - RESTA")
            print("Opcion 3 - SALIR")
            opcion = input("Escoge una opcion: ")

            if opcion == '1':
                muestra.operacionSuma()
            elif opcion == '2':
                muestra.operacionResta()
            elif opcion =='3':
                print("Saliendo del programa...")
                break
            else:
                print("Opcion invalida, vuelve a introducir otra opcion")
            


    def operacionSuma(muestra):
        numero1 = int(input("Dame el primer numero: "))
        numero2 = int(input("Dame el segundo numero: "))
        suma = numero1 + numero2
        print("La suma de los valores es: "+str(suma))

    def operacionResta(muestra):
        numero1 = int(input("Dame el primer numero: "))
        numero2 = int(input("Dame el segundo numero: "))
        resta = numero1 - numero2
        print("La resta de los valores es: "+str(resta))    


calculadora = Calculadora()
calculadora.menu_mostra()

