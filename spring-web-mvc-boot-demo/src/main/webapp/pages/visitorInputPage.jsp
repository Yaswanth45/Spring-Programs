
<jsp:include page="/header" />
<section style="padding: 10px; min-height:400px;">
	
	<h3>Visitors Registration</h3>
	<form method="post">
		<label>Name :
			<input type="text" name="firstName" placeholder="First Name" required/>
			<input type="text" name="lastName" placeholder="Last Name" required/>
		</label>
		<br/><br/>
		<label>Date Of Birth:
			<input type="date" name="dateOfBirth" required/>
		</label>
		<br/><br/>
		<button>Register</button>
	</form>
	
	
</section>
<jsp:include page="/footer" />