SELECT Count(*) AS "Total_Pedidos"
FROM Orders
WHERE EmployeeID LIKE (SELECT EmployeeID FROM Employees WHERE FirstName="Nancy" AND LastName="Davolio");

SELECT OrderID,SUM(quantity*UnitPrice)
FROM OrderDetails
WHERE OrderID IN (Select OrderID FROM Orders 
WHERE EmployeeID=(SELECT EmployeeID FROM Employees WHERE FirstName="Nancy" AND LastName="Davolio")) GROUP BY OrderID;