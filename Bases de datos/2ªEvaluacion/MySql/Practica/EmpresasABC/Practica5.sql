#ordenar sueldo y sueldo mas comun
SELECT sueldo,COUNT(*), GROUP_CONCAT(nombre) 
FROM Empleados 
GROUP BY Sueldo 
ORDER BY 2 DESC;
