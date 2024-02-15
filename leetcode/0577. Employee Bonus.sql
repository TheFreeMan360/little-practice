SELECT 
    e.name, 
    b.bonus
FROM 
    Employee AS e 
LEFT JOIN 
    Bonus AS b 
    ON e.empId = b.empId
WHERE IFNULL(b.bonus, 0) < 1000