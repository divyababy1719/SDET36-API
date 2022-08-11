package DifferentWaysToPOSTaRequest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.Random;

import org.testng.annotations.Test;

public class CreateProjectWithFormParameter {
		@Test
		public void createProjectByUsingFormParameter()
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

