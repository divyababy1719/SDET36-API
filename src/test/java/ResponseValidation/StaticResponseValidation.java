package ResponseValidation;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

public class StaticResponseValidation {
	@Test
	public void staticResponseValidation()
	{
		//send the request and validate the response
		baseURI="http://localhost";
		port=8084;
		String actData="TY_PROJ_005";
		Response response = when().get("/projects");
		String expData = response.jsonPath().get("[1].projectId");
		Assert.assertEquals(actData, expData);
      // response.then().log().all();		
	}

}
