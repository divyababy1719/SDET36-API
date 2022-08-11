package Authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BasicAuth {

	@Test
	public void basicAuth()
	{
		baseURI="http://localhost:8084";
		given()
		   .auth().basic("rmgyantra", "rmgy@9999").get("/login").then().log().all();
		/*req.auth().basic("rmgyantra", "rmgy@9999");
		Response response = req.get("http://localhost:8084/login");
		response.then().log().all();
		response.then().assertThat().statusCode(202);*/
	}

	@Test
	public void preEmptiveAuth()
	{
		baseURI="http://localhost:8084";
		given()
		   .auth().preemptive().basic("rmgyantra", "rmgy@9999")
		.when()
		    .get("/login")
		.then()
		   .assertThat().statusCode(202).log().all();
	}
	@Test
	public void digestAuth()
	{
		baseURI="http://localhost:8084";
		given()
		   .auth().digest("rmgyantra", "rmgy@9999")
		.when()
		    .get("/login")
		.then()
		   .assertThat().statusCode(202).log().all();
		
	}
}


