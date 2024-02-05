package base;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class GetApiMethod {
	
	
	public static void getMethod() {
		
		Response response = RestAssured.get("https://dummy.restapiexample.com/api/v1/employees");
		System.out.println("Status code " + response.getStatusCode());
		
		Assert.assertEquals(response.getStatusCode(), 200);
		System.out.println("data format " + response.getContentType());
		
		Assert.assertEquals(response.getContentType(), "application/json");
		
		//response.print();
		response.prettyPrint();
		
	}

	public static void main(String[] args) {
		
		GetApiMethod.getMethod();
		
		
	}
	
	
}
