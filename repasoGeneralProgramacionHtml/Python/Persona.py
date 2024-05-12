print("Pasaremos el nombre y la edad de una persona.")
print("")

nombre = input("Dime el nombre de la persona: ")
edad = int(input("Dime la edad de dicha persona: "))

print("Hola me llamo "+nombre+ " y tengo "+str(edad)+ " años")

if edad >= 18:
    print("Acabo de cumplir los 18.")
elif edad < 18:
    print("Todavia soy menor de edad.")
