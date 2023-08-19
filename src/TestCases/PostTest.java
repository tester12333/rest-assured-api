package TestCases;
import Data.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import Request.*;
import io.restassured.response.Response;
public class PostTest extends Base {
	
	@Test(dataProvider = "testData", dataProviderClass = DataProvider.class)
	public void TestPost(int i , int y , int x , int z , String s1 , String s2) {
		
		Response js = PostRequest.Postreq(i,y,x,z,s1,s2);
//		System.out.println(js.prettyPrint());
		Assert.assertEquals(js.getStatusCode(), 200);
	}
}
