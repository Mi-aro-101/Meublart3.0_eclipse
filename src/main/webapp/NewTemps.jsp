
<%@page import="java.util.List"%>
<%@page import="org.meublart.model.StyleMeuble"%>
<%@page import="org.meublart.model.CategorieMeuble"%>

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
			<h1>Inserer un temps confection</h1>
		</center>
	</div>
	<div class="p-lg-5 pe-lg-0">
		<form action="nouveautemps.do" method="post">
			<div class="row g-3">
				<div class="col-12">
					<input type="time" class="form-control border-0"
						placeholder="temps" name="temps" style="height: 55px;">
				</div>
				<div class="col-12">
					<select name="idStyleMeuble" class="form-control">
						<%
                            List<StyleMeuble> list = (List<StyleMeuble>)request.getAttribute("styles");
                            for (StyleMeuble elem : list) { %>

						<option value=<%=elem.getIdStyleMeuble()%>><%=elem.getDesignation()%></option>

						<% }
                        %>
					</select>
				</div>
				<div class="col-12">
					<select name="idCategorieMeuble" class="form-control">
						<%
                            List<CategorieMeuble> liste = (List<CategorieMeuble>)request.getAttribute("categories");
                            for (CategorieMeuble element : liste) { %>

						<option value=<%=element.getIdCategorieMeuble()%>><%=element.getDesignation()%></option>

						<% }
                        %>
					</select>
				</div>
				<div class="col-12">
					<button class="btn btn-primary w-100 py-3" type="submit">Inserer</button>
				</div>
			</div>
		</form>
	</div>
</div>

<%@include file="templates/footer.html"%>
