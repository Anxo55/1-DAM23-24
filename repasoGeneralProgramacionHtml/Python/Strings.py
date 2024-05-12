texto = "Hola Mundo"
print (texto)
# shift mas alt para duplicar
print(texto.upper())
print(texto.lower())
print(texto.find("Mun"))
print(texto.find("mun"))
nuevoTexto = texto.replace("Mun", "chanchito feliz")
print(texto, nuevoTexto)

# Nos devuelve un booleano
print("Mundo" in texto)