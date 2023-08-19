package Request;

import static io.restassured.RestAssured.given;

import Data.JsonReuse;
import io.restassured.path.json.JsonPath;

public class GetRequest {
	
	public static JsonPath getres() {
		String responseString = given()
		.when().get("/api/system/currency/list")
		.then().assertThat().statusCode(200).extract().asString();
		
		JsonPath jsonResponse = JsonReuse.jsonRow(responseString);
		return jsonResponse;
	
	}
}
