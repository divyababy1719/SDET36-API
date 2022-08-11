package Parameterization;

import static io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.annotations.Test;

public class FormParameter {
	@Test
	public void formParameter()
	{
		baseURI="http://localhost";
		port=8084;
		Random r=new Random();
		int random = r.nextInt(500);
		
		given()
		   .formParam("createdBy", "Brigit")
		   .formParam("ProjectName", "Cognizant"+random)
		   .formParam("Status", "Completed")
		   .formParam("TeamSize", 8)
		.when()
		   .post("/addProject")
		.then()
		   .assertThat().statusCode(201).log().all();
	
	}

}
