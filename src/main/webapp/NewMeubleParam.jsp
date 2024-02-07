
<%@page import="org.meublart.model.Taille"%>
<%@page import="java.text.NumberFormat.Style"%>
<%@page import="org.meublart.model.Meuble"%>
<%@page import="org.meublart.model.StyleMeuble"%>
<%@page import="org.meublart.model.CategorieMeuble"%>
<%@page import="java.util.List"%>
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
			<h1>Inserer modele existant de meuble</h1>
		</center>
	</div>
	<div class="p-lg-5 pe-lg-0">
		<form action="MeubleParamServlet" method="post">
			<div class="row g-3">
				<div class="col-12">
					<select name="idMeuble" class="form-control">
						<%
                            List<Meuble> liste = (List<Meuble>)request.getAttribute("meubles");
                            for (Meuble elem : liste) { %>

						<option value=<%=elem.getIdMeuble() %>><%=elem.getIdCategorie().getDesignation()%> <%=elem.getIdStyle().getDesignation() %></option>

						<% }
                        %>
					</select>
				</div>
				<div class="col-12">
					<%
                            List<Taille> list = (List<Taille>)request.getAttribute("tailles");
                            for (Taille elem : list) { %>
					<input type="checkbox" id="liste" name="idTaille"
						value=<%=elem.getIdTaille()%>> <label for="liste"><%=elem.getDesignation()%></label>
					<% }
                        %>
				</div>
				<div class="col-12">
					<button class="btn btn-primary w-100 py-3" type="submit">Inserer</button>
				</div>
			</div>
		</form>
	</div>
</div>

<%@include file="templates/footer.html"%>
