package BasicCRUDoperationsPratice;


import java.util.Random;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectByUsingFormParameter {
@Test
public void createProjectByUsingFormParameter()
{
	/*Random r=new Random();
	int random = r.nextInt(500);
	RequestSpecification req = RestAssured.given();
	req.formParam("createdBy", "Brigit");
	req.formParam("ProjectName", "Cognizant"+random);
	req.formParam("Status", "Completed");
	req.formParam("TeamSize", 8);
	
	Response resp = req.post("http://localhost:8084/addProject");
	resp.then().log().all();*/
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
