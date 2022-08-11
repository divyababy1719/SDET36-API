package BasicCRUDoperationsPratice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginRMGYantrawithAuthentication {

	@Test
	public void loginRMGYantrawithAuthentication()
	{
		RequestSpecification req = RestAssured.given();
		req.auth().basic("rmgyantra", "rmgy@9999").get("http://localhost:8084/login").then().log().all();
		/*req.auth().basic("rmgyantra", "rmgy@9999");
		Response response = req.get("http://localhost:8084/login");
		response.then().log().all();
		response.then().assertThat().statusCode(202);*/


	}

}
