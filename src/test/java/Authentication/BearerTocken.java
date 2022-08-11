package Authentication;

import org.apache.http.auth.AUTH;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class BearerTocken {

	@Test
	public void bearerTocken()
	{
		baseURI="https://api.github.com";
		HashMap map=new HashMap();
		map.put("name", "SDET36-Rest");
		map.put("description", "API RestAssure Framework");
		
		given()
		   .auth().oauth2("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")
		   .body(map)
		   .contentType(ContentType.JSON)
		.when()
		  .post("/user/repos")
		 .then().assertThat().statusCode(201).log().all();
	
	}
}
