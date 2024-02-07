<%--
    Document   : NewStyle
    Created on : 12 d�c. 2023, 15:37:46
    Author     : pc
--%>
<%@page import="java.util.List"%>
<%@page import="org.meublart.model.StyleMatierePremiere"%>
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
	<div class="text-start">
		<center>
			<h1>Liste style matiere premiere</h1>
		</center>
	</div>
	<%List<StyleMatierePremiere> listeMatieres = (List<StyleMatierePremiere>)request.getAttribute("listeMatieres");%>
	<div class="text-start">
		<center>
			<h3>
				Style:
				<strong><%= listeMatieres.get(0).getIdStyleMeuble().getDesignation()%></strong></h3>
		</center>
	</div>
	<div class="p-lg-5 pe-lg-0">
		<table border="1" class="table">
			<thead>
				<tr>
					<th>Designation</th>
					<th style="text-align: right">Prix</th>
				</tr>
			</thead>
			<tbody>
				<%
                        for(StyleMatierePremiere s: listeMatieres){%>
				<tr>
					<td><%=s.getIdMatierePremiere().getDesignation()%></td>
					<td style="text-align: right"><%=s.getIdMatierePremiere().getPrixUnitaire()%></td>
				</tr>
				<%}
                    %>

			</tbody>
		</table>

	</div>
</div>

<%@include file="templates/footer.html"%>
