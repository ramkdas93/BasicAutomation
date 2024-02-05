package base;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAPIwithTestng {
Response response;
	
	
	@BeforeTest
	public void preSetup() {
	response = RestAssured.get("https://dummy.restapiexample.com/api/v1/employees");
		
	}
	@Test
	public void getStatusCode() {
	System.out.println("Status code" + response.getStatusCode());
	Assert.assertEquals(response.getStatusCode(), 200);	
	}
	
@Test
	public void getContenType() {
	System.out.println("data format " + response.getContentType());
	Assert.assertEquals(response.getContentType(), "application/json");
	}

@Test
	public void getPrint() {
	response.prettyPrint();
	
	}


}
