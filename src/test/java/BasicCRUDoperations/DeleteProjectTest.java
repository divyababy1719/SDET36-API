package BasicCRUDoperations;

import org.testng.annotations.Test;


import static  io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class DeleteProjectTest {
	@Test
	public void deleteProjectTest()
	{
	/*	//provide all necessary details
		
		//send the request
		Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_433");
		
		//validate the response
		resp.then().log().all();*/
		
		baseURI="http://localhost";
		port=8084;
		
		when()
		   .delete("/projects/TY_PROJ_427")
		.then().assertThat().statusCode(204).log().all();
	}

}
