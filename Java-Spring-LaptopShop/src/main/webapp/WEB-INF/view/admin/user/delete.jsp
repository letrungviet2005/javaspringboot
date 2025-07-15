<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
            <html lang="en">

            <head>
                <meta charset="utf-8" />
                <meta http-equiv="X-UA-Compatible" content="IE=edge" />
                <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
                <meta name="description" content="" />
                <meta name="author" content="" />
                <title>Dashboard - SB Admin</title>
                <link href="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/style.min.css" rel="stylesheet" />
                <link href="${pageContext.request.contextPath}/css/styles.css" rel="stylesheet" />
                <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
            </head>

            <body class="sb-nav-fixed">
                <jsp:include page="../layout/header.jsp" />
                <div id="layoutSidenav">
                    <jsp:include page="../layout/sidebar.jsp" />
                    <div id="layoutSidenav_content">
                        <main>
                            <!-- Thông tin của trang layout -->
                            <div class="container mt-5">
                                <h1 class="text-center mb-4">Delete User</h1>
                                <form:form action="/admin/user/delete" method="POST" modelAttribute="user">
                                    <div class="mb-3" disabled="true" style="display:none">
                                        <form:label path="id" cssClass="form-label">ID</form:label>
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
                                    <button type="submit" class="btn btn-primary">Delete User</button>
                                </form:form>
                            </div>
                        </main>
                        <jsp:include page="../layout/footer.jsp" />
                    </div>
                </div>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
                    crossorigin="anonymous"></script>
                <script src="js/scripts.js"></script>
                <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js"
                    crossorigin="anonymous"></script>
                <script src="assets/demo/chart-area-demo.js"></script>
                <script src="assets/demo/chart-bar-demo.js"></script>
                <script src="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/umd/simple-datatables.min.js"
                    crossorigin="anonymous"></script>
                <script src="js/datatables-simple-demo.js"></script>
            </body>

            </html>