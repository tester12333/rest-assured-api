package Data;

import io.restassured.path.json.JsonPath;

public class JsonReuse {
	
	public static JsonPath jsonRow(String json ) {
		JsonPath jsonPath = new JsonPath(json);
		return jsonPath;
		
	}
}
