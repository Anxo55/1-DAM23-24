SELECT *
FROM clientes;

#primera practica
SELECT SMAX(Sueldo) 'Maximo', 
	   MIN(Sueldo) 'Minimo', 
	   ROUND(AVG(Sueldo),2) 'MediaSueldo',
		STDDEV(Sueldo) 'Desviacion Tipica'
FROM Empleados;

#segunda practica
SELECT SQRT(SUM(Pow(Sueldo-AVG(Sueldo),2)/COUNT(*))), STDDEV(sueldo)
FROM Empleados;

#EJEMPLO EXTERNO
SELECT SQRT((SUM(POW(sub.resta,2))/COUNT(*)))
FROM(SELECT (sueldo-(SELECT AVG(e.sueldo) resta FROM empleados e)) resta FROM empleados)sub
UNION
(SELECT STDDEV(sueldo) FROM empleados)



