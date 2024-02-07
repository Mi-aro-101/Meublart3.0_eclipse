<%--
    Document   : NewStyle
    Created on : 12 d�c. 2023, 15:37:46
    Author     : pc
--%>
<%@page import="java.util.List"%>
<%@page import="org.meublart.model.StatistiqueGenre"%>
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
			<h1>liste statistique</h1>
		</center>
	</div>
	<%List<StatistiqueGenre> liste = (List<StatistiqueGenre>)request.getAttribute("listeStat");%>
	<div class="text-start">
		<center>
			<h3></h3>
		</center>
	</div>
	<div class="p-lg-5 pe-lg-0">
		<table border="1" class="table">
			<thead>
				<tr>
					<th>Nombre clients</th>
					<th style="text-align: right">Genre</th>
					<th style="text-align: right">Meuble</th>

				</tr>
			</thead>
			<tbody>
				<%
                        for(StatistiqueGenre s: liste){%>
				<tr>
					<td><%=s.getNombre()%></td>
					<td style="text-align: right"><%=s.getIdGenre().getNom()%></td>
					<td style="text-align: right"><%=s.getIdMeuble().getIdStyle().getDesignation()%><%=s.getIdMeuble().getIdCategorie().getDesignation()%></td>

				</tr>
				<%}
                    %>

			</tbody>
		</table>

	</div>
</div>

<%@include file="templates/footer.html"%>
