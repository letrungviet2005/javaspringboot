<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
            <html lang="en">

            <head>
                <meta charset="utf-8">
                <title>Fruitables - Vegetable Website Template</title>
                <meta content="width=device-width, initial-scale=1.0" name="viewport">
                <meta content="" name="keywords">
                <meta content="" name="description">

                <!-- Google Web Fonts -->
                <link rel="preconnect" href="https://fonts.googleapis.com">
                <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
                <link
                    href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600&family=Raleway:wght@600;800&display=swap"
                    rel="stylesheet">

                <!-- Icon Font Stylesheet -->
                <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css" />
                <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css"
                    rel="stylesheet">

                <!-- Libraries Stylesheet -->
                <link href="/client/lib/lightbox/css/lightbox.min.css" rel="stylesheet">
                <link href="/client/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">


                <!-- Customized Bootstrap Stylesheet -->
                <link href="/client/css/bootstrap.min.css" rel="stylesheet">

                <!-- Template Stylesheet -->
                <link href="/client/css/style.css" rel="stylesheet">
            </head>

            <body>


                <!-- Navbar start -->
                <div class="container-fluid fixed-top">
                    <div class="container topbar bg-primary d-none d-lg-block">
                        <div class="d-flex justify-content-between">
                            <div class="top-info ps-2">
                                <small class="me-3"><i class="fas fa-map-marker-alt me-2 text-secondary"></i> <a
                                        href="#" class="text-white">123 Street, New York</a></small>
                                <small class="me-3"><i class="fas fa-envelope me-2 text-secondary"></i><a href="#"
                                        class="text-white">Email@Example.com</a></small>
                            </div>
                            <div class="top-link pe-2">
                                <a href="#" class="text-white"><small class="text-white mx-2">Privacy
                                        Policy</small>/</a>
                                <a href="#" class="text-white"><small class="text-white mx-2">Terms of Use</small>/</a>
                                <a href="#" class="text-white"><small class="text-white ms-2">Sales and
                                        Refunds</small></a>
                            </div>
                        </div>
                    </div>
                    <div class="container px-0">
                        <nav class="navbar navbar-light bg-white navbar-expand-xl">
                            <a href="index.html" class="navbar-brand">
                                <h1 class="text-primary display-6">Fruitables</h1>
                            </a>
                            <button class="navbar-toggler py-2 px-3" type="button" data-bs-toggle="collapse"
                                data-bs-target="#navbarCollapse">
                                <span class="fa fa-bars text-primary"></span>
                            </button>
                            <div class="collapse navbar-collapse bg-white" id="navbarCollapse">
                                <div class="navbar-nav mx-auto">
                                    <a href="index.html" class="nav-item nav-link active">Home</a>
                                    <a href="shop.html" class="nav-item nav-link">Shop</a>
                                    <a href="shop-detail.html" class="nav-item nav-link">Shop Detail</a>
                                    <div class="nav-item dropdown">
                                        <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Pages</a>
                                        <div class="dropdown-menu m-0 bg-secondary rounded-0">
                                            <a href="cart.html" class="dropdown-item">Cart</a>
                                            <a href="chackout.html" class="dropdown-item">Chackout</a>
                                            <a href="testimonial.html" class="dropdown-item">Testimonial</a>
                                            <a href="404.html" class="dropdown-item">404 Page</a>
                                        </div>
                                    </div>
                                    <a href="contact.html" class="nav-item nav-link">Contact</a>
                                </div>
                                <div class="d-flex m-3 me-0">
                                    <button
                                        class="btn-search btn border border-secondary btn-md-square rounded-circle bg-white me-4"
                                        data-bs-toggle="modal" data-bs-target="#searchModal"><i
                                            class="fas fa-search text-primary"></i></button>
                                    <a href="#" class="position-relative me-4 my-auto">
                                        <i class="fa fa-shopping-bag fa-2x"></i>
                                        <span
                                            class="position-absolute bg-secondary rounded-circle d-flex align-items-center justify-content-center text-dark px-1"
                                            style="top: -5px; left: 15px; height: 20px; min-width: 20px;">3</span>
                                    </a>
                                    <a href="#" class="my-auto">
                                        <i class="fas fa-user fa-2x"></i>
                                    </a>
                                </div>
                            </div>
                        </nav>
                    </div>
                </div>
                <!-- Navbar End -->


                <!-- JavaScript Libraries -->
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
                <script src="/client/lib/easing/easing.min.js"></script>
                <script src="/client/lib/waypoints/waypoints.min.js"></script>
                <script src="/client/lib/lightbox/js/lightbox.min.js"></script>
                <script src="/client/lib/owlcarousel/owl.carousel.min.js"></script>

                <!-- Template Javascript -->
                <script src="/client/js/main.js"></script>
            </body>

            </html>