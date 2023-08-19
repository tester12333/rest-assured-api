package TestCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import Request.*;
import Request.Base;
import io.restassured.path.json.JsonPath;

public class GetTest extends Base {
	@Test
	public void testGet() {
		
		JsonPath s = GetRequest.getres();
		Assert.assertEquals(s.getString("base.symbol"), "SAR", " \nCorect first\n" ); 
	}
}
