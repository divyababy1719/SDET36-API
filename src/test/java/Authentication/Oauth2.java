package Authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;

public class Oauth2 {
	
	@Test
	public void oauth2()
	{
		baseURI="http://coop.apps.symfonycasts.com";
	//generate the access tocken	
		Response response = given()
		  .formParam("client_id", "SDET36-RestPractice")
		  .formParam("client_secret", "abaea445c1b95f7400e988c7ec73cf04")
		  .formParam("grant_type", "client_credentials")
		  .formParam("redirect_uri", "http://practice.com")
		  .formParam("code", "authorization_code")
		  
		  .when()
		     .post("/token");
		
	//capture the access tocken using json path'
		
		
		String token = response.jsonPath().get("access_token");
		System.out.println(token);
		
		//utilise the token
		
		given()
		   .auth().oauth2(token)
		   .pathParam("USER_ID", 3678)
		.when()
		    .post("/api/{USER_ID}/toiletseat-down")
		 .then().log().all();
		 
	}

}
