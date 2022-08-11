package EndToEndScenarios;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseAPIClass;
import GenericLibrary.DatabaseLibrary;
import GenericLibrary.EndPointsLibrary;
import GenericLibrary.IConstants;
import GenericLibrary.JavaLibrary;
import GenericLibrary.RestAssuredLibrary;
import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

public class CreateProjectAndVerifyinDB extends  BaseAPIClass {
	@Test
	public void createProjectAndVerifyinDB() throws SQLException
	{

		ProjectLibrary pLib=new ProjectLibrary("Vineetha","IBM"+jLib.getRandomNumber(),"Created",12);
		Response response = given()
				.body(pLib)
				.contentType(ContentType.JSON)
				.when()
				.post(EndPointsLibrary.addProject);
		response.then().assertThat().statusCode(201).log().all();

		//capture the project id

		String expData = rLib.getJSONData(response, "projectId");
		Reporter.log(expData,true);

		//validate the id in db
		String query = "select * from project;";
		String actData = dLib.readDataFromDBAndValidate(query, 1, expData);
		Assert.assertEquals(actData, expData);
	}

}
