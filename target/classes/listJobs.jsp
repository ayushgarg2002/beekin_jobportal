<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Job Listings</title>
</head>
<body>
    <h1>Available Jobs</h1>
    <ul>
        <c:forEach items="${jobs}" var="job">
            <li>
                ${job.title} - ${job.description}
                <form action="apply" method="post">
                    <input type="hidden" name="jobId" value="${job.id}" />
                    <input type="submit" value="Apply" />
                </form>
            </li>
        </c:forEach>
    </ul>
</body>
</html>
