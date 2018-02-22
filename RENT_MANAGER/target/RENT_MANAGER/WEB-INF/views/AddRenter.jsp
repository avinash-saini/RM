<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


</head>
<body>
 
 <c:import  url="headreFooter.jsp" />
 


        <br>
        <br>
        <br>
        

    <h class="text-left" >ADD NEW RENTER</h>
    
  	<hr>
	  
        <h3>Personal Details</h3>
        
        <form class="form-horizontal" role="form" ModelAttribute="addRenterDetails" action="saveRenter" method="post">
          
    <div class="row">
	
	
	<div class="col-md-1">
	
	
	</div>
	
      <!-- left column -->
      <div class="col-md-3">
        <div class="text-center">
          <img src="//placehold.it/100" class="avatar img-circle" alt="avatar">
          <h6>Upload a different photo...</h6>
          
          <input type="file" name="image1 " class="form-control">
        </div>
        
        <br>
        <br>
        <br>
        
        <div class="text-center">
          <img src="//placehold.it/100" class="avatar img-circle" alt="avatar">
          <h6>Upload a different photo...</h6>
          
          <input type="file" name="image2 " class="form-control">
        </div>
        
        
      </div>
      
      <!-- edit form column -->
      <div class="col-md-8 personal-info">
    
    
          
          
          <div class="form-group">
            <label class="col-lg-3 control-label">Date:</label>
            <div class="col-lg-8">
              <input class="form-control" type="date" name="datetime" >
            </div>
          </div>
          
           <div class="form-group">
            
          </div> 
          
          <div class="form-group">
            <label class="col-lg-3 control-label">Room Num.id:</label>
            <div class="col-lg-8">
              <input class="form-control" type="text" name="roomnoid" >
            </div>
          </div>
          
          <div class="form-group">
            <label class="col-lg-3 control-label">First name:</label>
            <div class="col-lg-3">
              <input class="form-control" type="text" id="firstName" name="frname" >
            </div>
             <label class="col-lg-2 control-label">Last name:</label>
            <div class="col-lg-3">
              <input class="form-control" type="text" id="LastName" name="lrname" >
            </div>
            
            
          </div>
          
          <div class="form-group">
            <label class="col-lg-3 control-label">Company:</label>
            <div class="col-lg-8">
              <input class="form-control" type="text" name="company" >
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-3 control-label">Email:</label>
            <div class="col-lg-8">
              <input class="form-control" type="text" name="email" >
            </div>
          </div>
  

            <div class="form-group">
            <label class="col-lg-3 control-label">Address:</label>
            <div class="col-lg-8">
              <input class="form-control" type="text" name="address" >
            </div>
          </div>
          
          <div class="form-group">
            <label class="col-lg-3 control-label">State:</label>
            <div class="col-lg-3">
              <input class="form-control" type="text" name="state" >
            </div>
            <label class="col-lg-2 control-label">Pin Code:</label>
            <div class="col-lg-3">
              <input class="form-control" type="text" name="pincode" >
            </div>
          </div>
          
  
            <div class="form-group">
            <label class="col-md-3 control-label">Room Amount:</label>
            <div class="col-md-8">
              <input class="form-control" type="text" name="roomamount" >
            </div>
             </div>
 
           <div class="form-group">
            <label class="col-md-3 control-label"></label>
            <div class="col-md-8">
              <input type="submit" class="btn btn-primary" value="Save Details">
              <span></span>
              <input type="reset" class="btn btn-default" value="Cancel">
            </div>
          </div>
      </div>
  </div>

        </form>

<hr>











</body>
</html>