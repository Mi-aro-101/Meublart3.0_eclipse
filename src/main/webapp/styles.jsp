<%--
    Document   : NewStyle
    Created on : 12 d�c. 2023, 15:37:46
    Author     : pc
--%>
<%@page import="java.util.List"%>
<%@page import="org.meublart.model.StyleMeuble"%>
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
			<h1>Liste style</h1>
			<p>Selectioner un style pour afficher les matieres premieres</p>
		</center>
	</div>
	<div class="p-lg-5 pe-lg-0">
		<form action="stylematieres.do" method="post">
			<div class="row g-3">
				<div class="col-12">
					<select name="styles" class="form-control"
						id="exampleFormControlSelect1">
						<%
                            List<StyleMeuble> list = (List<StyleMeuble>)request.getAttribute("style");
                            for (StyleMeuble elem : list) { %>
						<option value="<%= elem.getIdStyleMeuble()%>"><%= elem.getDesignation()%></option>
						<% }
                        %>
					</select>
				</div>
				<div class="col-12">
					<button class="btn btn-primary w-100 py-3" type="submit">Voir</button>
				</div>
			</div>

		</form>
	</div>
</div>

<%@include file="templates/footer.html"%>
