# Write your MySQL query statement below

select i.unique_id,e.name from Employees as e left join EmployeeUNI as i on e.id = i.id
