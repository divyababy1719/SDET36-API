package Parameterization;

import  static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public  class PathParameter {
	@Test
	public void pathParameter()
	{
		baseURI="http://localhost:8084";
		
		given()
		   .pathParam("pId", "TY_PROJ_1814")
		.when()
		    .get("/projects/{pId}")
		.then().assertThat().statusCode(200).log().all();
	}

}
