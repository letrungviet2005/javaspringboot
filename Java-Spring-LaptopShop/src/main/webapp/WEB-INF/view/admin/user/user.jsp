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
                <link href="css/styles.css" rel="stylesheet" />
                <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
            </head>

            <body class="sb-nav-fixed">
                <jsp:include page="../layout/header.jsp" />
                <div id="layoutSidenav">
                    <jsp:include page="../layout/sidebar.jsp" />
                    <div id="layoutSidenav_content">
                        <main>
                            <div> Thông tin User</div>
                            <div class="d-flex justify-content-end mt-3 me-3">
                                <button class="btn btn-primary" onclick="location.href='/admin/user'">
                                    Create User
                                </button>
                            </div>
                            <div class="container mt-5">
                                <h2 class="text-center mb-4">Table</h2>
                                <table class="table table-striped">
                                    <thead>
                                        <tr>
                                            <th>Id</th>
                                            <th>Email</th>
                                            <th>Full Name</th>
                                            <th>Password</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>${user.id}</td>
                                            <td>${user.email}</td>
                                            <td>${user.fullname}</td>
                                            <td>${user.password}</td>
                                        </tr>
                                    </tbody>
                                </table>
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