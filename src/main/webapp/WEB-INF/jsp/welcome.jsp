<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Welcome</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2>Welcome, <span th:text="${employee.name}">Employee</span></h2>
    <p class="lead">Your Details:</p>
    <ul class="list-group">
        <li class="list-group-item">Name: <span th:text="${employee.name}">Name</span></li>
        <li class="list-group-item">City: <span th:text="${employee.city}">City</span></li>
        <li class="list-group-item">State: <span th:text="${employee.state}">State</span></li>
    </ul>
    <a th:href="@{/employees}" class="btn btn-info mt-3">View All Employees</a>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>