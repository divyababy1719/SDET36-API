package ResponseValidation;

import static org.junit.Assert.assertThat;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;

import org.hamcrest.Matchers;
import org.junit.experimental.theories.Theories;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ResponseTimeValidation {
	@Test
	public void responseTimeValidation()
	{
		baseURI="http://localhost";
		port=8084;
		
		when().get("/projects").then().assertThat().time(Matchers.lessThan(2000l),TimeUnit.MILLISECONDS);
		
		
	}

}
