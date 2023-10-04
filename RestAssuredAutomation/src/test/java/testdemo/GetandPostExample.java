package testdemo;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.baseURI;

import org.testng.annotations.Test;



@Test
public class GetandPostExample {
	
	public void get () {
		
		baseURI = "https://reqres.in/api";
		
		given().
		get("/users?page=2").
		then().
		statusCode(200).
		log().all();
		System.out.println("Complete");
		
		
	}

}
