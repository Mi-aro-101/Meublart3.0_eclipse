<!DOCTYPE html>
<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
<html lang="en">
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
					<small class="fa fa-map-marker-alt text-primary me-2"></small>
					<small>Antananarivo Andoharanofotsy</small>
				</div>
				<div class="h-100 d-inline-flex align-items-center py-3">
					<small class="far fa-clock text-primary me-2"></small>
					<small><%=LocalTime.now().getHour() %>h : <%=LocalTime.now().getMinute() %>m le <%=LocalDate.now() %></small>
				</div>
			</div>
			<div class="col-lg-5 px-5 text-end">
				<div class="h-100 d-inline-flex align-items-center py-3 me-4">
					<small class="fa fa-phone-alt text-primary me-2"></small>
					<small>+261 38 11 111 11</small>
				</div>
				<div class="h-100 d-inline-flex align-items-center">
					<a class="btn btn-sm-square bg-white text-primary me-1" href="#"><i
							class="fab fa-facebook-f"></i></a>
					<a class="btn btn-sm-square bg-white text-primary me-1" href="#"><i class="fab fa-twitter"></i></a>
					<a class="btn btn-sm-square bg-white text-primary me-1" href="#"><i
							class="fab fa-linkedin-in"></i></a>
					<a class="btn btn-sm-square bg-white text-primary me-0" href="#"><i
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


	<!-- Carousel Start -->
	<div class="container-fluid p-0 pb-5">
		<div class="owl-carousel header-carousel position-relative">
			<div class="owl-carousel-item position-relative">
				<img class="img-fluid" src="img/carousel-2.jpg" alt="">
				<div class="position-absolute top-0 start-0 w-100 h-100 d-flex align-items-center"
					style="background: rgba(53, 53, 53, .7);">
					<div class="container">
						<div class="row justify-content-center">
							<div class="col-12 col-lg-8 text-center">
								<h5 class="text-white text-uppercase mb-3 animated slideInDown">Bienvenue a Meubl'art
								</h5>
								<h1 class="display-3 text-white animated slideInDown mb-4">Meilleur menuisier & Service
									concernant les meubles</h1>
								<p class="fs-5 fw-medium text-white mb-4 pb-2">Nous vous vendons les meubles selon votre
									commande, que se soit en luxe, en simple bois, ou encore royale.</p>
								<a href="" class="btn btn-primary py-md-3 px-md-5 me-3 animated slideInLeft">En savoir
									plus</a>
								<a href="" class="btn btn-light py-md-3 px-md-5 animated slideInRight">Free Quote</a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="owl-carousel-item position-relative">
				<img class="img-fluid" src="img/carousel-3.jpg" alt="">
				<div class="position-absolute top-0 start-0 w-100 h-100 d-flex align-items-center"
					style="background: rgba(53, 53, 53, .7);">
					<div class="container">
						<div class="row justify-content-center">
							<div class="col-12 col-lg-8 text-center">
								<h5 class="text-white text-uppercase mb-3 animated slideInDown">Welcome To Meubl'art
								</h5>
								<h1 class="display-3 text-white animated slideInDown mb-4">Best Carpenter & Craftsman
									Services</h1>
								<p class="fs-5 fw-medium text-white mb-4 pb-2">Here we only do what the client desire,
									whatever it is, a furniture with a style with your choice, royal or just simple.</p>
								<a href="" class="btn btn-primary py-md-3 px-md-5 me-3 animated slideInLeft">Read
									More</a>
								<a href="" class="btn btn-light py-md-3 px-md-5 animated slideInRight">Free Quote</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Carousel End -->


	<!-- Feature Start -->
	<div class="container-xxl py-5">
		<div class="container">
			<div class="row g-5">
				<div class="col-md-6 col-lg-3 wow fadeIn" data-wow-delay="0.1s">
					<div class="d-flex align-items-center justify-content-between mb-2">
						<div class="d-flex align-items-center justify-content-center bg-light"
							style="width: 60px; height: 60px;">
							<i class="fa fa-user-check fa-2x text-primary"></i>
						</div>
						<h1 class="display-1 text-light mb-0">01</h1>
					</div>
					<h5>Design creatif</h5>
				</div>
				<div class="col-md-6 col-lg-3 wow fadeIn" data-wow-delay="0.3s">
					<div class="d-flex align-items-center justify-content-between mb-2">
						<div class="d-flex align-items-center justify-content-center bg-light"
							style="width: 60px; height: 60px;">
							<i class="fa fa-check fa-2x text-primary"></i>
						</div>
						<h1 class="display-1 text-light mb-0">02</h1>
					</div>
					<h5>Produit de qualite</h5>
				</div>
				<div class="col-md-6 col-lg-3 wow fadeIn" data-wow-delay="0.5s">
					<div class="d-flex align-items-center justify-content-between mb-2">
						<div class="d-flex align-items-center justify-content-center bg-light"
							style="width: 60px; height: 60px;">
							<i class="fa fa-drafting-compass fa-2x text-primary"></i>
						</div>
						<h1 class="display-1 text-light mb-0">03</h1>
					</div>
					<h5>Consultation libre et sans cout</h5>
				</div>
				<div class="col-md-6 col-lg-3 wow fadeIn" data-wow-delay="0.7s">
					<div class="d-flex align-items-center justify-content-between mb-2">
						<div class="d-flex align-items-center justify-content-center bg-light"
							style="width: 60px; height: 60px;">
							<i class="fa fa-headphones fa-2x text-primary"></i>
						</div>
						<h1 class="display-1 text-light mb-0">04</h1>
					</div>
					<h5>Support de la clientele</h5>
				</div>
			</div>
		</div>
	</div>
	<!-- Feature Start -->



	<!-- About Start -->
	<div class="container-fluid bg-light overflow-hidden my-5 px-lg-0">
		<div class="container about px-lg-0">
			<div class="row g-0 mx-lg-0">
				<div class="col-lg-6 ps-lg-0" style="min-height: 400px;">
					<div class="position-relative h-100">
						<img class="position-absolute img-fluid w-100 h-100" src="img/about.jpg"
							style="object-fit: cover;" alt="">
					</div>
				</div>
				<div class="col-lg-6 about-text py-5 wow fadeIn" data-wow-delay="0.5s">
					<div class="p-lg-5 pe-lg-0">
						<div class="section-title text-start">
							<h1 class="display-5 mb-4">A propos</h1>
						</div>
						<p class="mb-4 pb-2">Nous construisons les meubles selon votre gout, que ce soit une table, une
							chaise ou une armoire, dites-nous ce que vous pensez et nous ferons notre travail pour
							eblouir vos sens et vous satisfaire</p>
						<div class="row g-4 mb-4 pb-2">
							<div class="col-sm-6 wow fadeIn" data-wow-delay="0.1s">
								<div class="d-flex align-items-center">
									<div class="d-flex flex-shrink-0 align-items-center justify-content-center bg-white"
										style="width: 60px; height: 60px;">
										<i class="fa fa-users fa-2x text-primary"></i>
									</div>
									<div class="ms-3">
										<h2 class="text-primary mb-1" data-toggle="counter-up">1234</h2>
										<p class="fw-medium mb-0">Happy client</p>
									</div>
								</div>
							</div>
							<div class="col-sm-6 wow fadeIn" data-wow-delay="0.3s">
								<div class="d-flex align-items-center">
									<div class="d-flex flex-shrink-0 align-items-center justify-content-center bg-white"
										style="width: 60px; height: 60px;">
										<i class="fa fa-check fa-2x text-primary"></i>
									</div>
									<div class="ms-3">
										<h2 class="text-primary mb-1" data-toggle="counter-up">1234</h2>
										<p class="fw-medium mb-0">Projets aboutis</p>
									</div>
								</div>
							</div>
						</div>
						<a href="" class="btn btn-primary py-3 px-5">Plus</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- About End -->


	<!-- Service Start -->
	<div class="container-xxl py-5">
		<div class="container">
			<div class="section-title text-center">
				<h1 class="display-5 mb-5">Nos Services</h1>
			</div>
			<div class="row g-4">
				<div class="col-md-6 col-lg-4 wow fadeInUp" data-wow-delay="0.1s">
					<div class="service-item">
						<div class="overflow-hidden">
							<img class="img-fluid" src="img/service-1.jpg" alt="">
						</div>
						<div class="p-4 text-center border border-5 border-light border-top-0">
							<h4 class="mb-3">Menuiserie generale</h4>
							<p>Prise en main des commandes et realisation.</p>
						</div>
					</div>
				</div>
				<div class="col-md-6 col-lg-4 wow fadeInUp" data-wow-delay="0.3s">
					<div class="service-item">
						<div class="overflow-hidden">
							<img class="img-fluid" src="img/service-2.jpg" alt="">
						</div>
						<div class="p-4 text-center border border-5 border-light border-top-0">
							<h4 class="mb-3">Personalisation</h4>
							<p>Retouche selon vos preferences.</p>
						</div>
					</div>
				</div>
				<div class="col-md-6 col-lg-4 wow fadeInUp" data-wow-delay="0.5s">
					<div class="service-item">
						<div class="overflow-hidden">
							<img class="img-fluid" src="img/service-3.jpg" alt="">
						</div>
						<div class="p-4 text-center border border-5 border-light border-top-0">
							<h4 class="mb-3">Remodelisation</h4>
							<p>Faconner de nouveau votre meuble pour un renouveau.</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Service End -->


	<!-- Feature Start -->
	<div class="container-fluid bg-light overflow-hidden my-5 px-lg-0">
		<div class="container feature px-lg-0">
			<div class="row g-0 mx-lg-0">
				<div class="col-lg-6 feature-text py-5 wow fadeIn" data-wow-delay="0.5s">
					<div class="p-lg-5 ps-lg-0">
						<div class="section-title text-start">
							<h1 class="display-5 mb-4">Pourquoi nous choisir</h1>
						</div>
						<p class="mb-4 pb-2">Notre systeme mis a part les contructions sont totalement informatises, ce
							qui rend les ventes et commandes personnaliisables a distances et vous laisses le temps de
							consulter nos meubles en ligne</p>
						<div class="row g-4">
							<div class="col-6">
								<div class="d-flex align-items-center">
									<div class="d-flex flex-shrink-0 align-items-center justify-content-center bg-white"
										style="width: 60px; height: 60px;">
										<i class="fa fa-check fa-2x text-primary"></i>
									</div>
									<div class="ms-4">
										<p class="mb-2">Qualites</p>
										<h5 class="mb-0">Services</h5>
									</div>
								</div>
							</div>
							<div class="col-6">
								<div class="d-flex align-items-center">
									<div class="d-flex flex-shrink-0 align-items-center justify-content-center bg-white"
										style="width: 60px; height: 60px;">
										<i class="fa fa-user-check fa-2x text-primary"></i>
									</div>
									<div class="ms-4">
										<p class="mb-2">Creativite</p>
										<h5 class="mb-0">Designers</h5>
									</div>
								</div>
							</div>
							<div class="col-6">
								<div class="d-flex align-items-center">
									<div class="d-flex flex-shrink-0 align-items-center justify-content-center bg-white"
										style="width: 60px; height: 60px;">
										<i class="fa fa-drafting-compass fa-2x text-primary"></i>
									</div>
									<div class="ms-4">
										<p class="mb-2">Gratuite</p>
										<h5 class="mb-0">Consultation</h5>
									</div>
								</div>
							</div>
							<div class="col-6">
								<div class="d-flex align-items-center">
									<div class="d-flex flex-shrink-0 align-items-center justify-content-center bg-white"
										style="width: 60px; height: 60px;">
										<i class="fa fa-headphones fa-2x text-primary"></i>
									</div>
									<div class="ms-4">
										<p class="mb-2">Client</p>
										<h5 class="mb-0">Support</h5>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-6 pe-lg-0" style="min-height: 400px;">
					<div class="position-relative h-100">
						<img class="position-absolute img-fluid w-100 h-100" src="img/feature.jpg"
							style="object-fit: cover;" alt="">
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Feature End -->


	<!-- Projects Start -->
	<!-- Projects End -->


	<!-- Quote Start -->
	<!-- Quote End -->


	<!-- Team Start -->

	<!-- Team End -->


	<!-- Testimonial Start -->

	<!-- Testimonial End -->


	<!-- Footer Start -->
	<div class="container-fluid bg-dark text-light footer mt-5 pt-5 wow fadeIn" data-wow-delay="0.1s">
		<div class="container py-5">
			<div class="row g-5">
				<div class="col-lg-3 col-md-6">
					<h4 class="text-light mb-4">Addresse</h4>
					<p class="mb-2"><i class="fa fa-map-marker-alt me-3"></i>Antananarivo Andoharanofotsy</p>
					<p class="mb-2"><i class="fa fa-phone-alt me-3"></i>+261 38 11 111 11</p>
					<p class="mb-2"><i class="fa fa-envelope me-3"></i>meublart@example.com</p>
					<div class="d-flex pt-2">
						<a class="btn btn-outline-light btn-social" href=""><i class="fab fa-twitter"></i></a>
						<a class="btn btn-outline-light btn-social" href=""><i class="fab fa-facebook-f"></i></a>
						<a class="btn btn-outline-light btn-social" href=""><i class="fab fa-youtube"></i></a>
						<a class="btn btn-outline-light btn-social" href=""><i class="fab fa-linkedin-in"></i></a>
					</div>
				</div>
				<div class="col-lg-3 col-md-6">
					<h4 class="text-light mb-4">Services</h4>
					<a class="btn btn-link" href="">General Carpentry</a>
					<a class="btn btn-link" href="">Furniture Remodeling</a>
					<a class="btn btn-link" href="">Wooden Floor</a>
					<a class="btn btn-link" href="">Wooden Furniture</a>
					<a class="btn btn-link" href="">Custom Carpentry</a>
				</div>
				<div class="col-lg-3 col-md-6">
					<h4 class="text-light mb-4">Quick Links</h4>
					<a class="btn btn-link" href="">About Us</a>
					<a class="btn btn-link" href="">Contact Us</a>
					<a class="btn btn-link" href="">Our Services</a>
					<a class="btn btn-link" href="">Terms & Condition</a>
					<a class="btn btn-link" href="">Support</a>
				</div>
				<div class="col-lg-3 col-md-6">
					<h4 class="text-light mb-4">Newsletter</h4>
					<p>Dolor amet sit justo amet elitr clita ipsum elitr est.</p>
					<div class="position-relative mx-auto" style="max-width: 400px;">
						<input class="form-control border-0 w-100 py-3 ps-4 pe-5" type="text" placeholder="Your email">
						<button type="button"
							class="btn btn-primary py-2 position-absolute top-0 end-0 mt-2 me-2">SignUp</button>
					</div>
				</div>
			</div>
		</div>
		<div class="container">
			<div class="copyright">
				<div class="row">
					<div class="col-md-6 text-center text-md-start mb-3 mb-md-0">
						&copy; <a class="border-bottom" href="#">Meubl'art</a>, All Right Reserved.
					</div>
					<div class="col-md-6 text-center text-md-end">
						<!--/*** This template is free as long as you keep the footer author’s credit link/attribution link/backlink. If you'd like to use the template without the footer author’s credit link/attribution link/backlink, you can purchase the Credit Removal License from "https://htmlcodex.com/credit-removal". Thank you for your support. ***/-->
						Designed By <a class="border-bottom" href="https://htmlcodex.com">HTML Codex</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Footer End -->


	<!-- Back to Top -->
	<a href="#" class="btn btn-lg btn-primary btn-lg-square rounded-0 back-to-top"><i class="bi bi-arrow-up"></i></a>


	<!-- JavaScript Libraries -->
	<script src="js/jquery-3.4.1.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
	<script src="lib/wow/wow.min.js"></script>
	<script src="lib/easing/easing.min.js"></script>
	<script src="lib/waypoints/waypoints.min.js"></script>
	<script src="lib/counterup/counterup.min.js"></script>
	<script src="lib/owlcarousel/owl.carousel.min.js"></script>
	<script src="lib/isotope/isotope.pkgd.min.js"></script>
	<script src="lib/lightbox/js/lightbox.min.js"></script>

	<!-- Template Javascript -->
	<script src="js/main.js"></script>
</body>

</html>