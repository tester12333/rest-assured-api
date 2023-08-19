package Request;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import Data.JsonReuse;
import Data.PayLoad;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostRequest {
	public static Response  Postreq(int i , int y , int x , int z , String s1 , String s2) {
		 return given().header("Content-Type","application/json")
	    .body(PayLoad.PostBody(i,y,x,z,s1,s2))
		.when().post("/api/v3/flights/flight/async-search-result");
//		.then().statusCode(200);
		
//		JsonPath responseJson = JsonReuse.jsonRow(responseString);
		
		
		
	}
}
