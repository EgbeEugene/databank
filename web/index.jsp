<%-- 
    Document   : index
    Author     : ayprograms
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>DATABANK</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800" rel="stylesheet" type="text/css" />
                <link  href="css/login.css" rel="stylesheet" type="text/css" />
		<!--[if lte IE 8]><script src="js/html5shiv.js"></script><![endif]-->
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
		<script src="js/skel.min.js"></script>
		<script src="js/skel-panels.min.js"></script>
		<script src="js/init.js"></script>
		<noscript>
			<link rel="stylesheet" href="css/skel-noscript.css" />
			<link rel="stylesheet" href="css/style.css" />
			<link rel="stylesheet" href="css/style-desktop.css" />
                        
		</noscript>
                
	</head>





	<body>

		<div id="header-wrapper">
			<div class="container">
				<div id="header">
					<div id="logo">
						<h1><a href="#">DATABANK</a></h1>
						<p>Archive and Share Data</p>
					</div>
					<nav id="nav">
						<ul>
							<li class="current_page_item"><a href="index.jsp">Application</a></li>
							<li><a href="home.jsp">Home</a></li>

						</ul>
					</nav>
				</div>
			</div>
		</div>



		<div id="wrapper">
			<div class="container" id="welcome">
				<div class="row">
					<div class="12u">

						<section class="content">


                            
                                                    
       <div id="logginwrapper">

	<form name="login-form" class="login-form" action="" method="post">
	
		<div class="login-header">
		<h1>Login Form</h1>
		<span>Fill out the form below to login to your account</span>
		</div>
	
		<div class="logincontent">
		<input name="username" type="text" class="input username" placeholder="Username" />
		<div class="user-icon"></div>
		<input name="password" type="password" class="input password" placeholder="Password" />
		<div class="pass-icon"></div>		
		</div>

		<div class="loginfooter">
		<input type="submit" name="submit" value="Login" class="button" />
                <a href="registration.jsp" class="register">Register</a>
		</div>
	
	</form>

</div>
<div class="gradient"></div>
                                                    
                                                    
                                                    
						</section>

					</div>
				</div>
			</div>



		</div>


		<div class="container" id="copyright">
			&copy; Databank 2014
		</div>

	</body>
</html>
