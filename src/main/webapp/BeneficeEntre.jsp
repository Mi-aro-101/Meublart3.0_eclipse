
<%@include file="templates/header.jsp"%>
<style>
.myform {
	background-color: rgb(231, 219, 219);
	margin-left: auto;
	margin-right: auto;
}
</style>

<!-- <h1>Insertion de matiere premiere</h1>
    <form action="nouveaumatiere.do">
        <input type="text" name="designation">
        <button type="submit">Inserer</button>
    </form> -->
<div class="col-lg-6 quote-text py-5 wow fadeIn myform"
	data-wow-delay="0.5s"
	style="visibility: visible; animation-delay: 0.5s; animation-name: fadeIn;">
	<div class="text-start">
		<center>
			<h1>Obtenir</h1>
			<p>Benefice d'un meuble entre</p>
		</center>
	</div>
	<div class="p-lg-5 pe-lg-0">
		<form action="beneficeBetween.do" method="get">
			<div class="row g-3">
				<div class="col-12">
					<input type="text" class="form-control border-0"
						placeholder="min" name="min" style="height: 55px;"> et 
						<input type="text" class="form-control border-0"
						placeholder="max" name="max" style="height: 55px;">
				</div>
				<div class="col-12">
					<button class="btn btn-primary w-100 py-3" type="submit">Voir</button>
				</div>
			</div>
		</form>
	</div>
</div>

<%@include file="templates/footer.html"%>
