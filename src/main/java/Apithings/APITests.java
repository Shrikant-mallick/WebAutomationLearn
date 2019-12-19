package Apithings;

import javax.swing.text.AbstractDocument.Content;

import org.testng.annotations.Test;

import io.restassured.*;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APITests {
	
	@Test
	public void gettest()
	{
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification Httprequest = RestAssured.given();
//		Response response = Httprequest.request(Method.GET, arg1)
		
		
		
	}


}
