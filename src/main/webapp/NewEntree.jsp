
<%@page import="java.util.List"%>
<%@page import="org.meublart.model.MeubleParam"%>
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
			<h1>Inserer une entree</h1>
		</center>
	</div>
	<div class="p-lg-5 pe-lg-0">
		<form action="nouveauentree.do" method="post">
			<div class="row g-3">

				<div class="col-12">
					<select name="idMeubleParam" class="form-control">
						<%
                            List<MeubleParam> list = (List<MeubleParam>)request.getAttribute("liste");
                            for (MeubleParam elem : list) { %>

						<option value=<%=elem.getIdMeubleParam()%>>
							<%=elem.getIdMeuble().getIdCategorie().getDesignation()%>
							<%=elem.getIdMeuble().getIdStyle().getDesignation()%>
							<%=elem.getIdTaille().getDesignation()%>


						</option>

						<% }
                        %>
					</select>
				</div>
				<div class="col-12">
					<input type="text" class="form-control border-0"
						placeholder="quantite" name="quantite" style="height: 55px;">
				</div>
				<div class="col-12">
					<input type="date" class="form-control border-0"
						placeholder="dateEntree" name="dateEntree" style="height: 55px;">
				</div>
				<div class="col-12">
					<button class="btn btn-primary w-100 py-3" type="submit">Inserer</button>
				</div>
			</div>
		</form>
	</div>
</div>

<%@include file="templates/footer.html"%>
