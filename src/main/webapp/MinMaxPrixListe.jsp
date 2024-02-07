<%--
    Document   : NewStyle
    Created on : 12 d�c. 2023, 15:37:46
    Author     : pc
--%>
<%@page import="org.meublart.view.VMeublePrixConfection"%>
<%@page import="java.util.List"%>
<%@include file="templates/header.jsp"%>
<style>
.myform {
	background-color: rgb(231, 219, 219);
	margin-left: auto;
	margin-right: auto;
}

h3 {
	font-family: fantasy;
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
	<%VMeublePrixConfection[] confection = (VMeublePrixConfection[]) request.getAttribute("prixConfection"); %>
	<div class="text-start">
		<center>
			<h1>Liste des meubles</h1>
		</center>
	</div>
	<div class="text-start">
		<center>
			<h3></h3>
		</center>
	</div>
	<div class="p-lg-5 pe-lg-0">
		<table border="1" class="table">
			<thead>
				<tr>
					<th>Categorie</th>
					<th>Style</th>
					<th>Taille</th>
					<th style="text-align: right">Prix de confection</th>
				</tr>
			</thead>
			<tbody>
				<%
                        for(VMeublePrixConfection s: confection){%>
				<tr>
					<td><%=s.getCategorieMeuble().getDesignation()%></td>
					<td><%=s.getStyleMeuble().getDesignation() %></td>
					<td><%=s.getTaille().getDesignation() %></td>
					<td style="text-align: right"><%=s.getPrixConfection()%></td>
				</tr>
				<%}
                    %>

			</tbody>
		</table>

	</div>
</div>

<%@include file="templates/footer.html"%>
