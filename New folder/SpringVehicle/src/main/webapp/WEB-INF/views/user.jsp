
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	
		<style>
			.gradient-custom{
				background: #6a11cb;
	
	
	background: -webkit-linear-gradient(to right, rgba(106, 17, 203, 1), rgba(37, 117, 252, 1));
	
	
	background: linear-gradient(to right, rgba(106, 17, 203, 1), rgba(37, 117, 252, 1))
			}
	
	
	
	
		</style>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"> 
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>User</title>
</head>
<body  class="gradient-custom">
<form action="/userlogin" method="post">
	 
	<section class="vh-100 gradient-custom">
		<div class="container py-5 h-100">
		  <div class="row d-flex justify-content-center align-items-center h-100">
			<div class="col-12 col-md-8 col-lg-6 col-xl-5">
			  <div class="card bg-dark text-white" style="border-radius: 1rem;">
				<div class="card-body p-5 text-center">
	  
				  <div class="mb-md-5 mt-md-4 pb-5">
	  
					<h2 class="fw-bold mb-2 text-uppercase">User Login</h2>
					<p class="text-white-50 mb-5">Please enter your DL Number and password!</p>
					<br>
					
	  
					<div class="form-outline form-white mb-4">
					  <input type="text" class="form-control form-control-lg" name="dlno" placeholder="DL_Number" />
					  <!-- <label class="form-label" for="typeEmailX" ></label> -->
					</div>
	  
					<div class="form-outline form-white mb-4">
					  <input type="password" id="typePasswordX" class="form-control form-control-lg" name="pass" placeholder="Password" />
					  <!-- <label class="form-label" for="typePasswordX"></label> -->
					</div><br>
					<br>
					<br>
					 
	  
			
	   ${enter}
	   ${fail}
	   <br>
					<button class="btn btn-outline-light btn-lg px-5" type="submit" value="LOGIN" >Login</button><br>
					<br>
					
					

					<form action="register" method="get">
						<!-- <a href="register">newuser</a> -->
						<a href="register" class="btn btn-outline-light btn-lg px-5">New User</a>
				   </form>
	  
					<div class="d-flex justify-content-center text-center mt-4 pt-1">
					  <a href="#!" class="text-white"><i class="fab fa-facebook-f fa-lg"></i></a>
					  <a href="#!" class="text-white"><i class="fab fa-twitter fa-lg mx-4 px-2"></i></a>
					  <a href="#!" class="text-white"><i class="fab fa-google fa-lg"></i></a>
					</div>
	  
				  </div>
	  
				 
	  
				</div>
			  </div>
			</div>
		  </div>
		</div>
	  </section>
	</form>
	
</body>
</html>