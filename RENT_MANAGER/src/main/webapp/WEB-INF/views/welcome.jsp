<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html  >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Optional theme -->
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/bootstrap-select.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> 
<script src="resources/vendor/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<script src="resources/js/bootstrap-select.js"></script>
 <!--  <script src="resources/utility/welcome.js"></script>  -->
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.25/angular.min.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.25/angular-route.js"></script>
<script src = "https://ajax.googleapis.com/ajax/libs/angularjs/1.3.3/angular.min.js"></script>
   

</head>


<title>Login</title>
</head>

<script type="text/javascript">





var validationApp = angular.module('validationApp', []);

validationApp.controller('mainController', function($scope) {
	$scope.submitForm = function() {
		if ($scope.userForm.$valid) {
			alert('our form is amazing');
		}

		/*  var username = $scope.userForm.name;
		 alert("sssa==="+username);
	        var password = $scope.userForm.password;
	        if (username == "admin" && password == "admin") {
	        	alert("sssa===");
	        	$location.path("/view/homePage" ); 
	             alert("weloce to home pagge");
	           
	        } else {
	            alert('invalid username and password');
	        }
		
 */		
	};

});
 

</script>


<body>
	
	<!-- Another login page -->
	
	
	
	
	<div ng-app="validationApp" ng-controller="mainController">
	    <div class="container">    
    
        <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
            <div class="panel panel-info" >
                    <div class="panel-heading">
                        <div class="panel-title">Sign In</div>
                       <!--  <div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="#"></a></div> -->
                    </div>     

                    <div style="padding-top:30px" class="panel-body" >

                        <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>
                            
                            
                            
                        <form id="loginform"  name="userForm" ng-submit="submitForm()" novalidate    class="form-horizontal" role="form"  action="login.do" method="POST" >
                                    
                                    <div style="margin-bottom: 25px" class="input-group"  ng-class="{ 'has-error' : userForm.name.$invalid && !userForm.name.$pristine }" >
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                     
                                        <input id="login-username" class="form-control" name="name" ng-model="user.name"   placeholder="username "  required >                                        
                                   <p ng-show="userForm.name.$invalid && !userForm.name.$pristine" class="help-block">You name is required.</p>
                                    </div>
                                  
                                  
                                
                                
                            <div style="margin-bottom: 25px" class="input-group" ng-class="{ 'has-error' : userForm.password.$invalid && !userForm.password.$pristine }" >
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                        <input id="login-password" type="password" class="form-control" name="password"  ng-model="user.password" required placeholder="password" >
                                   <p ng-show="userForm.password.$invalid && !userForm.password.$pristine" class="help-block">Please Enter The Password.</p>
                                    </div>
                                    

                                
                            <div class="input-group">
                                      <div class="checkbox">
                                        <label>
                                          <input id="login-remember" type="checkbox" name="remember" value="1"> Remember me
                                        </label>
                                      </div>
                                    </div>


                                <div style="margin-top:10px" class="form-group">
                                    <!-- Button -->

                                    <div class="col-sm-12 controls">
                                      <a id="btn-login" href="login" class="btn btn-success" ng-disabled="userForm.$invalid"  type='submit'>Login  </a>
                                      

                                    </div>
                                </div>


                                <div class="form-group">
                                    <div class="col-md-12 control">
                                        <div style="border-top: 1px solid#888; padding-top:15px; font-size:85%" >
                                            Don't have an account! 
                                        <a id="signuplink" href="#" onClick="$('#loginbox').hide(); $('#signupbox').show()">
                                            Sign Up Here
                                        </a>
                                        </div>
                                    </div>
                                </div>    
                            </form>     




                        </div>                     
                    </div>  
        </div>
        <div id="signupbox" style="display:none; margin-top:50px" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            <div class="panel-title">Sign Up</div>
                            <div style="float:right; font-size: 85%; position: relative; top:-10px"><a id="signinlink" href="#" onclick="$('#signupbox').hide(); $('#loginbox').show()">Sign In</a></div>
                        </div>  
                        <div class="panel-body" >
                            <form id="signupform" ModelAttribute="singupPeson" class="form-horizontal" role="form" action="saveAdmin" method="post">
                                
                                <div id="signupalert" style="display:none" class="alert alert-danger">
                                    <p>Error:</p>
                                    <span></span>
                                </div>
                                    
                                <div class="form-group">
                                    <label for="email" class="col-md-3 control-label">Admin Id</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" name="adminid" placeholder="Email Address">
                                    </div>
                                </div>
                                
                                  
                                <div class="form-group">
                                    <label for="email" class="col-md-3 control-label">Email</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" name="email" placeholder="Email Address">
                                    </div>
                                </div>
                                    
                                <div class="form-group">
                                    <label for="firstname" class="col-md-3 control-label">First Name</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" name="fname" placeholder="First Name">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="lastname" class="col-md-3 control-label">Last Name</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" name="lname" placeholder="Last Name">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="password" class="col-md-3 control-label">Password</label>
                                    <div class="col-md-9">
                                        <input type="password" class="form-control" name="password" placeholder="Password">
                                    </div>
                                </div>
                                    
                                 <div class="form-group">
                                    <label for="icode" class="col-md-3 control-label">Confirm Password</label>
                                    <div class="col-md-9">
                                        <input type="password" class="form-control" name="cpassword" placeholder="Confirm Password">
                                    </div>
                                </div> 

                                <div class="form-group">
                                    <!-- Button -->                                        
                                    <div class="col-md-offset-3 col-md-9">
                                        <button id="btn-signup" type="submit" class="btn btn-info"><i class="icon-hand-right"> &nbsp Sign Up</i> </button>
                                          
                                    </div>
                                </div>
                                
                                <div style="border-top: 1px solid #999; padding-top:20px"  class="form-group">
                                    
                                    <div class="col-md-offset-3 col-md-9">
                                     </div>                                           
                                        
                                </div>
                            </form>
                         </div>
                    </div>
         </div> 
    </div>
    
	
	</div>
</body>
</html>