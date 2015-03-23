<%-- 
    Document   : registration
    Author     : ayprograms
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Registration</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<!--[if lte IE 8]><script src="js/html5shiv.js"></script><![endif]-->
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
		
                <!-- CSS registration specific -->
               
                <link rel="stylesheet" href="css/registration.css" />

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

    <form name="registration-form" id="registration-form" class="registration-form" action="/databank/regController" method="post">
	
		<div class="registration-header">
		<h1>Registration Form</h1>
		<span>Register to Databank and have an Account</span>
		</div>
	
		<div class="registrationcontent">
                    
                    <input name="firstname" id="firstname" type="text" size="20" maxlength="20" min="3" class="input username" placeholder="firstname" required="true" />
                
                <div class="user-icon"></div>
                
                <input name="lastname" id="lastname" type="text" size="20" maxlength="20" min="3" class="input password" placeholder="lastname" required="true" />
                
                <div class="user-icon"></div>
                
                <input name="email" id="email" type="email" class="input password" placeholder="enter your email" required="true" size="25" maxlength="25" />
                <div class="user-icon"></div>
                <input name="username" id="username" type="text" class="input password" placeholder="Username" required="true" maxlength="20" />
		
                <input name="password1" id="password1" type="password" class="input password" placeholder="Password" required="true" size="10" maxlength="10" />
               	
                <input name="password2" id="password2" type="password" class="input password" size="10" maxlength="10" required="true" oninput="check(this)" 
                     
                       placeholder="Confirm Password" />
		<div class="user-icon"></div>
                <input name="location" id="location" type="text" class="input password" placeholder="location" required="true" size="20" maxlength="20" />
		</div>

		<div class="registrationfooter">
		<input type="submit" name="submit" value="Register" class="button" />
                <a href="index.jsp" class="register">Login</a>
		</div>
	
	</form>

</div>
<div class="gradient"></div>
            
               
              
               
                                                    

       
						</section>

					</div>
				</div>
			</div>



		</div>
            <script language='javascript' type='text/javascript'>
            function check(input) {
            if (input.value !== document.getElementById('password').value) {
            input.setCustomValidity('Password Must be Matching.');
            } else {
            // input is valid -- reset the error message
            input.setCustomValidity('');
            }
            }
            </script>

		<div class="container" id="copyright">
			&copy; Databank 2014
		</div>

            
            
	</body>
</html>
