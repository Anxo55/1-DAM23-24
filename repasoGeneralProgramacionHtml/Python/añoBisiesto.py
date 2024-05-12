print('Dame un numero para determinar si es o no bisiesto!')

anio = int(input('Dame el anio: '))
print('El anio para determinar es: '+str(anio))

if anio % 4 == 0 and anio % 100 !=0 or anio % 400 == 0:
    print('El anio '+str(anio)+ ' es un anio bisiesto')
else:
    print('El anio '+str(anio)+' no es un anio bisiesto')    