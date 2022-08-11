package ResponseValidation;

import static io.restassured.RestAssured.*;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DynamicResponseValidation {
	@Test
	public void dynamicResponseValidation()
	
	{
		//send the request and validate the response
		baseURI="http://localhost:8084";
		String expData="TY_PROJ_1202";
		
		Response resp = when().get("/projects");
		List<String> list = resp.jsonPath().get("projectId");
		boolean flag=false;
		for(String actData:list)
		{
			if(expData.equalsIgnoreCase(actData))
			{
				flag=true;
				System.out.println(expData);
				break;
			}
			Assert.assertTrue(flag);
			resp.then().log().all();
		}
		
	}

}
