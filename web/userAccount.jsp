<%-- 
    Document   : userAccount
    Created on : Aug 7, 2014, 4:48:49 AM
    Author     : ayprograms
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<title></title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<!--[if lte IE 8]><script src="js/html5shiv.js"></script><![endif]-->
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
		
                <!-- CSS account specific -->
               
               <link rel="stylesheet" href="css/accountstyle.css" />

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

						


          
        <div id="welcomebar">
            
            <div id="welcome-box">
                <div id="welcome-message">Welcome name to Databank</div> 
                <div id="search-bar">
                    
                    
                    <form class="form-wrapper">
                    <input type="text" id="search" placeholder="what do you want?" required>
                    <input type="submit" value="go" id="submit">
                </form>
                    
                </div>
                
                    
              
            </div>
            
           
        </div>
            
        <div id="sidebar">
           
            <div id="photobox">
                <p>
                    
                </p>
            </div>
            
            <div id="generaltask">
                <br />
                <a href="#"><img id="logout" src="images/logoutimage.jpg"/></a>
                
            </div>
            
        </div>
        
        <div id="taskbox">
            <div id="databox"></div>

            <div id="coinbox"></div>
            
            <div id="badgebox"></div>
            
           
        </div>
        
       
    
              
               
                                                    

       
						

					</div>
				</div>
			</div>



		</div>


		<div class="container" id="copyright">
			&copy; Databank 2014
		</div>

          
            
	</body>
</html>
