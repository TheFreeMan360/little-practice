SELECT
    s.machine_id, 
    ROUND(SUM(e.timestamp - s.timestamp) / COUNT(*), 3) AS processing_time
FROM 
    (SELECT * 
     FROM Activity 
     WHERE activity_type 
     LIKE "start") AS s 
JOIN
    (SELECT * 
     FROM Activity 
     WHERE activity_type 
     LIKE "end") AS e 
    ON s.machine_id = e.machine_id AND s.process_id = e.process_id
GROUP BY s.machine_id