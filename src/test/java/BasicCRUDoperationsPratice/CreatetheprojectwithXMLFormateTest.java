package BasicCRUDoperationsPratice;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreatetheprojectwithXMLFormateTest {
	@Test
	public void createtheprojectwithXMLFormate()

	{
	Random r=new Random();
	int random = r.nextInt(500);
	JSONObject jObj=new JSONObject();
	jObj.put("createdBy", "Brigit");
	jObj.put("projectName", "Cognizant"+random);
	jObj.put("status", "On Going");
	jObj.put("teamSize", 16);
	
	
	
	RequestSpecification request = RestAssured.given();
	request.body(jObj);
	request.contentType(ContentType.XML);
	Response resp = request.post("http://localhost:8084/addProject");
	resp.then().log().all();
	int code = resp.statusCode();
	System.out.println(code);
	boolean status = resp.statusLine().startsWith("HTTP");
	System.out.println(status);
}
}
