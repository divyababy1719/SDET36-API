package BasicCRUDoperationsPratice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Oauth2_get {
@Test
public void oauth2()
{
	RequestSpecification request = RestAssured.given();
	request.auth().oauth2("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");
	Response resp = request.get("https://api.github.com/user/repos");
	resp.then().log().all();
}
}
