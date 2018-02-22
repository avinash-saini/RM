<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>



</head>
<body>
 <c:import  url="headreFooter.jsp" />
 


        <br>
        <br>
        <br>
        

    <h class="text-left" >ROOM PAYMENT</h>
    
  	<hr>
	<div class="row">
	
	
	<div class="col-md-1">
	
	
	</div>
	
      <!-- left column -->
      <div class="col-md-3">
        <div class="text-center">
          <img src="//placehold.it/100" class="avatar img-circle" alt="avatar">
          <h6>Upload a different photo...</h6>
          
          <!-- <input type="file" class="form-control"> -->
        </div>
        
        <br>
        <br>
        <br>
        
        <!-- <div class="text-center">
          <img src="//placehold.it/100" class="avatar img-circle" alt="avatar">
          <h6>Upload a different photo...</h6>
          
          <input type="file" class="form-control">
        </div> -->
        
        
      </div>
      
      <!-- edit form column -->
      <div class="col-md-8 personal-info">
      
        <h3>Payment Details</h3>
        
        <form class="form-horizontal" role="form">
          
          <div class="form-group">
            <label class="col-lg-3 control-label">Date:</label>
            <div class="col-lg-8">
              <input class="form-control" type="text" value="">
            </div>
          </div>
          
          
          <div class="form-group">
            <label class="col-lg-3 control-label">Room Number:</label>
            <div class="col-lg-8">
              <input class="form-control" type="text" value="">
            </div>
          </div>
          
          <div class="form-group">
            <label class="col-lg-3 control-label">First name:</label>
            <div class="col-lg-8">
              <input class="form-control" type="text" id="firstName" name="firstName" value="">
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-3 control-label">Last name:</label>
            <div class="col-lg-8">
              <input class="form-control" type="text" value="">
            </div>
          </div>
          
          
            <div class="form-group">
            <label class="col-md-3 control-label">Room Amount:</label>
            <div class="col-md-3">
              <input class="form-control" type="text" value="">
            </div>
            
               <label class="col-md-3 control-label">Reading Amount:</label>
            <div class="col-md-2">
              <input class="form-control" type="text" value="">
            </div>
             </div>
 
       
            <div class="form-group">
            <label class="col-lg-3 control-label">Total Amount:</label>
            <div class="col-lg-8">
              <input class="form-control" type="text" value="">
            </div>
          </div>
  
        
        
 
           <div class="form-group">
            <label class="col-md-3 control-label"></label>
            <div class="col-md-8">
              <input type="button" class="btn btn-primary" value="Payment">
              <span></span>
              <input type="reset" class="btn btn-default" value="Cancel">
            </div>
          </div>
        </form>
      </div>
  </div>

<hr>











</body>
</html>