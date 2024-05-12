SELECT orderID, ProductID, (SELECT MAX(UnitPrice*Quantity)
FROM OrderDetails)-(UnitPrice*Quantity)
FROM OrderDetails;

SELECT MAX(UnitPrice*Quantity)
FROM OrderDetails;

SELECT EmployeeID, LastName, FirstName
FROM Employees;

SELECT * FROM Orders WHERE EmployeeID=1;

SELECT EmplyeeID idEmpleado, LastName, FirstName, (SELECT MIN(OrderDate) FROM Orders WHERE EmployeeID=idEmpleado)
FROM Employees;



