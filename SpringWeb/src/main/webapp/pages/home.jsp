<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<section style="padding:10px; min-height:400px;">
	<h1>${pageTitle}</h1>
	
	<h3>Developers</h3>
	<ol>
		<c:forEach var="d" items="${developers}">
			<li>${d}</li>
		</c:forEach>
	</ol>
</section>