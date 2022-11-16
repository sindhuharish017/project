<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<html>
<head>
<style>
body {
	background-image:
		url('https://images.pexels.com/photos/12795531/pexels-photo-12795531.jpeg?cs=srgb&dl=pexels-ahmed-%E3%83%84-12795531.jpg&fm=jpg&_gl=1*1k6myib*_ga*Nzg3MjA1MDE1LjE2NjgxNjE3NTI.*_ga_8JE65Q40S6*MTY2ODE2MTc1My4xLjEuMTY2ODE2MTgxMi4wLjAuMA..');
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-position: center;
	background-size: cover;
}
</style>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CreateDL</title>
</head>
<body>



	<form:form action="/createdl" method="post"
		background-colour="transparent">
		<section class="vh-100 gradient-custom">
		<div class="container py-5 h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-12 col-md-8 col-lg-6 col-xl-5">
					<center>
						<h2 class="head">ADD DL Information</h2>
					</center>
					<div class="card bg-transparent text-dark">


						<div class="form-outline form-white mb-1">
							<input type="text" class="form-control form-control-lg"
								placeholder="DL_Number" name="dlno" /> <label
								class="form-label" for="typedlno"></label>
						</div>

						<div class="form-outline form-white mb-1">
							<input type="text" class="form-control form-control-lg"
								placeholder="Name" name="name" /> <label class="form-label"
								for="typename"></label>
						</div>

						<div class="form-outline form-white mb-1">
							<input type="text" class="form-control form-control-lg"
								placeholder="Date Of Birth" name="dateofBirth" /> <label
								class="form-label" for="typeDateofBirth"></label>
						</div>

						<div class="form-outline form-white mb-1">
							<input type="text" class="form-control form-control-lg"
								placeholder="Address" name="address" /> <label
								class="form-label" for="typeAddress"></label>
						</div>

						<div class="form-outline form-white mb-1">
							<input type="text" class="form-control form-control-lg"
								placeholder="From Date" name="fromDate" /> <label
								class="form-label" for="typefromDate"></label>
						</div>

						<div class="form-outline form-white mb-1">
							<input type="text" class="form-control form-control-lg"
								placeholder="To Date" name="toDate" /> <label
								class="form-label" for="typetoDate"></label>
						</div>

						<div class="form-outline form-white mb-1">
							<input type="text" class="form-control form-control-lg"
								placeholder="Age" name="age" /> <label class="form-label"
								for="typeage"></label>
						</div>

						<div class="form-outline form-white mb-1">
							<input type="text" class="form-control form-control-lg"
								placeholder="Mobile Number" name="mobNo" /> <label
								class="form-label" for="typemobNo"></label>
						</div>
						<div class="form-outline form-white mb-1">
						
							<input type="checkbox" name="vehicle" value="2Wheeler">2Wheeler
							<input type="checkbox" name="vehicle" value="3Wheeler"> 3Wheeler
							<input type="checkbox" name="vehicle" value="4Wheeler"> 4Wheeler
						</div>
						<table align="center">
							<tr>
								<td>
									<button class="btn btn-outline-light btn-lg px-500"
										type="submit" name="submit" value="Save">SAVE</button>
								</td>

								<td>
									<button class="btn btn-outline-light btn-lg px-90"
										type="submit" name="submit" value="Cancel">CANCEL</button>
								</td>
							</tr>
						</table>
					</div>
				</div>
			</div>
		</div>
		</div>
		</div>
		</section>
	</form:form>

</body>
</html>