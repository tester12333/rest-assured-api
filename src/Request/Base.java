package Request;

import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;

public class Base {
	
	@BeforeTest
	public void SetUp() {
		RestAssured.baseURI= "https://www.almosafer.com";
		
	}
}
