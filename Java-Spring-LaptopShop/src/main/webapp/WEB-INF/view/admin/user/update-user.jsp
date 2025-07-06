<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Update User</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet"
                    integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr"
                    crossorigin="anonymous">
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"
                    integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q"
                    crossorigin="anonymous"></script>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.min.js"
                    integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q"
                    crossorigin="anonymous"></script>
                <link rel="stylesheet" href="/css/demo.css">
            </head>

            <body>
                <div class="container mt-5">
                    <h1 class="text-center mb-4">Create User</h1>
                    <form:form action="/admin/user/update/${id}" method="POST" modelAttribute="user">
                        <div class="mb-3" disabled="true" style="display:none">
                            <form:label path="id" cssClass="form-label" disabled="true" style="display:none">ID
                            </form:label>
                            <form:input path="id" cssClass="form-control" />
                        </div>
                        <div class="mb-3">
                            <form:label path="email" cssClass="form-label">Email</form:label>
                            <form:input path="email" cssClass="form-control" />
                        </div>
                        <div class="mb-3">
                            <form:label path="fullname" cssClass="form-label">Full Name</form:label>
                            <form:input path="fullname" cssClass="form-control" />
                        </div>
                        <div class="mb-3">
                            <form:label path="phone" cssClass="form-label">Phone number</form:label>
                            <form:input path="phone" cssClass="form-control" />
                        </div>
                        <div class="mb-3">
                            <form:label path="address" cssClass="form-label">Address</form:label>
                            <form:input path="address" cssClass="form-control" />
                        </div>
                        <button type="submit" class="btn btn-primary">update user</button>
                    </form:form>
                </div>

            </body>

            </html>