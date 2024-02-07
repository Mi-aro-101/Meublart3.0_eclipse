
<!DOCTYPE html>
<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
<html lang="en">

<head>
<meta charset="utf-8">
    <title>Woody - Carpenter Website Template</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="keywords">
    <meta content="" name="description">

    <!-- Favicon -->
    <link href="img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;500&family=Roboto:wght@500;700;900&display=swap" rel="stylesheet"> 

    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="lib/animate/animate.min.css" rel="stylesheet">
    <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
    <link href="lib/lightbox/css/lightbox.min.css" rel="stylesheet">

    <!-- Customized Bootstrap Stylesheet -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Template Stylesheet -->
    <link href="css/style.css" rel="stylesheet">
</head>

<body>
	<!-- Spinner Start -->
    <div id="spinner" class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
        <div class="spinner-grow text-primary" style="width: 3rem; height: 3rem;" role="status">
            <span class="sr-only">Loading...</span>
        </div>
    </div>
    <!-- Spinner End -->


	<!-- Topbar Start -->
	<div class="container-fluid bg-light p-0">
		<div class="row gx-0 d-none d-lg-flex">
			<div class="col-lg-7 px-5 text-start">
				<div class="h-100 d-inline-flex align-items-center py-3 me-4">
					<small class="fa fa-map-marker-alt text-primary me-2"></small> <small>Antananarivo
						Andoharanofotsy</small>
				</div>
				<div class="h-100 d-inline-flex align-items-center py-3">
					<small class="far fa-clock text-primary me-2"></small> 
					<small><%=LocalTime.now().getHour() %>h : <%=LocalTime.now().getMinute() %>m le <%=LocalDate.now() %></small>
				</div>
			</div>
			<div class="col-lg-5 px-5 text-end">
				<div class="h-100 d-inline-flex align-items-center py-3 me-4">
					<small class="fa fa-phone-alt text-primary me-2"></small> <small>+261
						38 11 111 11</small>
				</div>
				<div class="h-100 d-inline-flex align-items-center">
					<a class="btn btn-sm-square bg-white text-primary me-1" href="#"><i
						class="fab fa-facebook-f"></i></a> <a
						class="btn btn-sm-square bg-white text-primary me-1" href="#"><i
						class="fab fa-twitter"></i></a> <a
						class="btn btn-sm-square bg-white text-primary me-1" href="#"><i
						class="fab fa-linkedin-in"></i></a> <a
						class="btn btn-sm-square bg-white text-primary me-0" href="#"><i
						class="fab fa-instagram"></i></a>
				</div>
			</div>
		</div>
	</div>
	<!-- Topbar End -->


	<!-- Navbar Start -->
	<nav
		class="navbar navbar-expand-lg bg-white navbar-light sticky-top p-0">
		<a href="index.html"
			class="navbar-brand d-flex align-items-center px-4 px-lg-5">
			<h2 class="m-0 text-primary">Meubl'art</h2>
		</a>
		<button type="button" class="navbar-toggler me-4"
			data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarCollapse">
			<div class="navbar-nav ms-auto p-4 p-lg-0">
			
				
			
				<a href="index.jsp" class="nav-item nav-link active">Home</a>
				
				<!--
				<div class="nav-item dropdown">
					<a href="#" class="nav-link dropdown-toggle"
						data-bs-toggle="dropdown">Matieres premieres</a>
					<div class="dropdown-menu fade-up m-0">
						<a href="NewMatierePremiere.jsp" class="dropdown-item">Nouveau</a>
						<a href="#" class="dropdown-item">Voir</a>
					</div>
				</div>
				-->
				 
				<div class="nav-item dropdown">
					<a href="#" class="nav-link dropdown-toggle"
						data-bs-toggle="dropdown">Insertion Parametre</a>
					<div class="dropdown-menu fade-up m-0">
						<a href="NewMatierePremiere.jsp" class="dropdown-item">Matiere premiere</a>
						<a href="Newcategorie.jsp" class="dropdown-item">Categorie</a>
						<a href="nouveaustyle.do" class="dropdown-item">Style</a>
						<a href="NewPoste.jsp" class="dropdown-item">Poste</a>
						<a href="nouveauouvrierforme.do" class="dropdown-item">Employee</a>
						<a href="NewFormMeuble.do" class="dropdown-item">Meuble</a>
						<a href="NewFormMeubleParam.do" class="dropdown-item">Meuble parametres</a>
					</div>
				</div>
				
				<div class="nav-item dropdown">
					<a href="#" class="nav-link dropdown-toggle"
						data-bs-toggle="dropdown">Employee</a>
					<div class="dropdown-menu fade-up m-0">
						<a href="nouveauouvrierforme.do" class="dropdown-item">Employee</a>
					</div>
				</div>
				
				<!--
				<div class="nav-item dropdown">
					<a href="#" class="nav-link dropdown-toggle"
						data-bs-toggle="dropdown">Entree en stock</a>
					<div class="dropdown-menu fade-up m-0">
						<a href="nouveauentreeforme.do" class="dropdown-item">Nouveau</a>
					</div>
				</div>
				
				<div class="nav-item dropdown">
					<a href="#" class="nav-link dropdown-toggle"
						data-bs-toggle="dropdown">Sortie en stock</a>
					<div class="dropdown-menu fade-up m-0">
						<a href="nouveauclientforme.do" class="dropdown-item">Nouveau client</a>
						<a href="nouveauventeforme.do" class="dropdown-item">Ventes</a>
					</div>
				</div>
				-->
				
				<div class="nav-item dropdown">
					<a href="#" class="nav-link dropdown-toggle"
						data-bs-toggle="dropdown">Stock</a>
					<div class="dropdown-menu fade-up m-0">
						<a href="nouveauclientforme.do" class="dropdown-item">Nouveau client</a>
						<a href="nouveauventeforme.do" class="dropdown-item">Sortie</a>
						<a href="nouveauentreeforme.do" class="dropdown-item">Entree</a>
					</div>
				</div>
			<!--
				<div class="nav-item dropdown">
					<a href="#" class="nav-link dropdown-toggle"
						data-bs-toggle="dropdown">Style</a>
					<div class="dropdown-menu fade-up m-0">
						<a href="nouveaustyle.do" class="dropdown-item">Nouveau</a>
						<a href="#" class="dropdown-item">Voir</a>
					</div>
				</div>
			-->
			<!--
				<div class="nav-item dropdown">
					<a href="#" class="nav-link dropdown-toggle"
						data-bs-toggle="dropdown">Poste</a>
					<div class="dropdown-menu fade-up m-0">
						<a href="NewPoste.jsp" class="dropdown-item">Nouveau</a>
						<a href="#" class="dropdown-item">Voir</a>
					</div>
				</div>
			-->
				
			<!--
				<div class="nav-item dropdown">
					<a href="#" class="nav-link dropdown-toggle"
						data-bs-toggle="dropdown">Ouvrier</a>
					<div class="dropdown-menu fade-up m-0">
						<a href="nouveauouvrierforme.do" class="dropdown-item">Nouveau</a>
						<a href="#" class="dropdown-item">Voir</a>
					</div>
				</div>
			-->
			
				<div class="nav-item dropdown">
					<a href="#" class="nav-link dropdown-toggle"
						data-bs-toggle="dropdown">Temps Confection</a>
					<div class="dropdown-menu fade-up m-0">
						<a href="nouveautempsforme.do" class="dropdown-item">Nouveau</a> <a
							href="#" class="dropdown-item">Voir</a>
					</div>
				</div>
				<div class="nav-item dropdown">
					<a href="#" class="nav-link dropdown-toggle"
						data-bs-toggle="dropdown">Genre </a>
					<div class="dropdown-menu fade-up m-0">
						<a href="NewGenre.jsp" class="dropdown-item">Nouveau</a> <a
							href="#" class="dropdown-item">Voir</a>
					</div>
				</div>
				
				<!--
				<div class="nav-item dropdown">
					<a href="#" class="nav-link dropdown-toggle"
						data-bs-toggle="dropdown">Client</a>
					<div class="dropdown-menu fade-up m-0">
						<a href="nouveauclientforme.do" class="dropdown-item">Nouveau</a>
						<a href="#" class="dropdown-item">Voir</a>
					</div>
				</div>
				-->
				
				<!--
				<div class="nav-item dropdown">
					<a href="#" class="nav-link dropdown-toggle"
						data-bs-toggle="dropdown">Vente</a>
					<div class="dropdown-menu fade-up m-0">
						<a href="nouveauventeforme.do" class="dropdown-item">Nouveau</a> <a
							href="#" class="dropdown-item">Voir</a>
					</div>
				</div>
				-->
				<!--
				<div class="nav-item dropdown">
					<a href="#" class="nav-link dropdown-toggle"
						data-bs-toggle="dropdown">Entree</a>
					<div class="dropdown-menu fade-up m-0">
						<a href="nouveauentreeforme.do" class="dropdown-item">Nouveau</a>
						<a href="#" class="dropdown-item">Voir</a>
					</div>
				</div>
				-->
				
			<!--
				<a href="about.html" class="nav-item nav-link">About</a> <a
					href="project.html" class="nav-item nav-link">Project</a>
				<div class="nav-item dropdown">
					<a href="#" class="nav-link dropdown-toggle"
						data-bs-toggle="dropdown">Pages</a>
					<div class="dropdown-menu fade-up m-0">
						<a href="feature.html" class="dropdown-item">Feature</a> <a
							href="quote.html" class="dropdown-item">Free Quote</a> <a
							href="team.html" class="dropdown-item">Our Team</a> <a
							href="testimonial.html" class="dropdown-item">Testimonial</a> <a
							href="404.html" class="dropdown-item">404 Page</a>
					</div>
				</div>
				<a href="contact.html" class="nav-item nav-link">Contact</a>
			</div>
			-->
			<div class="nav-item dropdown">
				<a href="#" class="btn btn-primary py-4 px-lg-5 d-none d-lg-block nav-link dropdown-toggle">
					Voir<i class="fa fa-arrow-down ms-3"></i>
				</a>
				<div class="dropdown-menu fade-up m-0">
					<a href="styles.do" class="dropdown-item">Styles</a>
					<a href="listerMatierePremiere.do" class="dropdown-item">Meuble par matiere</a>
					<a href="PrixConfectionEntre.jsp" class="dropdown-item">Prix de confection</a>
					<a href="BeneficeEntre.jsp" class="dropdown-item">Benefice entre</a>
					<a href="etatSalariale.do" class="dropdown-item">Etat salariale</a>
				</div>
			</div>
			
		</div>
	</nav>
	<!-- Navbar End -->