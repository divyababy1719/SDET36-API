package BasicCRUDoperationsPratice;

import java.net.URI;
import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetProjectByUsingPathParameterTest {

	@Test
	public void getProjectByUsingPathParameterTest()
	{
		RequestSpecification req = RestAssured.given();
		req.pathParam("pId", "TY_PROJ_207");
        Response resp = req.get("http://localhost:8084/projects/{pId}");
		int statusCode = resp.getStatusCode();
	    resp.then().assertThat().statusCode(200);
		resp.then().log().all();
		
		
	}
	
}
