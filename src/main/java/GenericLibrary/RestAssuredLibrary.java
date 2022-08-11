package GenericLibrary;


import io.restassured.response.Response;


/**
 * This class conains restassured specific reusable methods
 * @author divya
 *
 */

public class RestAssuredLibrary {
/**
 * This method ill get JSON data through path from response body
 * @param response
 * @param path
 * @return
 */
	public String getJSONData(Response response,String path)
	{
		String JsonData = response.jsonPath().get(path);
		return JsonData;
	}
}
