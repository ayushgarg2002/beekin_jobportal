<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Job Application</title>
</head>
<body>
    <h1>Apply for Job</h1>
    <form action="submitApplication" method="post">
        <input type="hidden" name="jobId" value="${jobId}" />
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required /><br />
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required /><br />
        <input type="submit" value="Submit Application" />
    </form>
</body>
</html>
