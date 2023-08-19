package Data;

public class DataProvider {
	
	@org.testng.annotations.DataProvider(name = "testData")
    public static Object[][] testData() {
        return new Object[][] {
            {1,1,0,0,"2023-08-21","2023-08-31"}, // Correct data
            {2,2,0,0,"2023-08-17","2023-08-31"}, // Form date in the past
            {2,2,0,0,"2023-08-31","2023-08-11"}, // To date greater than From date
        };
    }
	

}
