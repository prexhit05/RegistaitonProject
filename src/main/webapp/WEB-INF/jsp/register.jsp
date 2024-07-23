<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Employee Registration</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">Register Employee</h2>
    <form th:action="@{/register}" method="post" class="form-horizontal">
        <div class="form-group">
            <label for="name" class="control-label col-sm-2">Name:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="name" name="name" required>
            </div>
        </div>
        <div class="form-group">
            <label for="dateOfBirth" class="control-label col-sm-2">Date of Birth:</label>
            <div class="col-sm-10">
                <input type="date" class="form-control" id="dateOfBirth" name="dateOfBirth" required>
            </div>
        </div>
        <div class="form-group">
            <label for="gender" class="control-label col-sm-2">Gender:</label>
            <div class="col-sm-10">
                <select class="form-control" id="gender" name="gender" required>
                    <option value="Male">Male</option>
                    <option value="Female">Female</option>
                    <option value="Other">Other</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="address" class="control-label col-sm-2">Address:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="address" name="address" required>
            </div>
        </div>
        <div class="form-group">
            <label for="city" class="control-label col-sm-2">City:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="city" name="city" required>
            </div>
        </div>
        <div class="form-group">
            <label for="state" class="control-label col-sm-2">State:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="state" name="state" required>
            </div>
        </div>
        <div class="form-group">
            <label for="loginId" class="control-label col-sm-2">Login ID:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="loginId" name="loginId" required>
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="control-label col-sm-2">Password:</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="password" name="password" required>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-primary">Register</button>
            </div>
        </div>
    </form>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
