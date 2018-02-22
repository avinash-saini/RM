$(function() {
	console.log( "ready!" );
	$(".navbar-default").hide();
	$("#homePage").hide();
	$("#tenantDetailTable").hide();
	$("#tenantRgtsn").hide();
	var userN;
	var pass;
	$(".btn-lg").click(function() {
		console.log( "Handler for called." );
		userN = $("#email").val();
		pass = $("#password").val();
//		var loginData= {'userId':$("#email").val(), 'password':$("#password").val()}
		var loginData= userN+","+pass;
		$.ajax({
			type : "GET",
			url : 'validateLogin.do',
			data : {
		        "userN" : loginData
		    },
			success : function(data) {
				console.log("SUCCESS: ", data);
				$(".login").hide();
				$(".navbar-default").show();
				$("#homePage").show();
				$("#tenantDetailTable").hide();
				$("#tenantRgtsn").hide();
			},
			error : function(e) {
				console.log("ERROR: ", e);
				$(".login").show();
				$(".navbar-default").hide();
				$("#homePage").hide();
				$("#tenantDetailTable").hide();
				$("#tenantRgtsn").hide();
			},
			done : function(e) {
				console.log("DONE");
			}
		});

	}); 

	$("#tenantDtl").click(function() {
		console.log( "Student Details called." );
		$(".login").hide();
		$(".navbar-default").show();
		$("#homePage").hide();
		$("#tenantDetailTable").show();
		$("#tenantRgtsn").hide();
	}); 

	$("#tenantRgst").click(function() {
		$(".login").hide();
		$(".navbar-default").show();
		$("#homePage").hide();
		$("#tenantDetailTable").hide();
		$("#tenantRgtsn").show();

	}); 
});