valor = int(input("Dame el valor para hacer la conversion: "))
conversor = input("De dolares a euros(D), de euros a dolares(E)").lower()

if conversor == "d":
    euro = valor / 1.05
    print(euro)
elif conversor == "e":
    dolar = valor * 1.05
    print(dolar)    
else:
    print("incorrecto")    

    
