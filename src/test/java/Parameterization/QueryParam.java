package Parameterization;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class QueryParam {

	@Test
	public void queryParam()
	{
	baseURI="https://reqres.in/";
	
	given()
	   .queryParam("page", 2)
	.when()
	    .get("/api/users")
	 .then().log().all();
	}
}
