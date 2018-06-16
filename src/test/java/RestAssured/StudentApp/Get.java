package RestAssured.StudentApp;

import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.Assert;
import static org.hamcrest.Matcher.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;



public class Get {

	@BeforeClass

	public static void init() {
		RestAssured.baseURI ="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath="/student";
	}


	@Test

	public void getStudentinfo()
	{

		/**
		 * given()
		 * 	Initialization
		 * when()
		 * 	All actions
		 * then()
		 * 	Responses
		 */

		Response response =given()
				.when()
				.get("/list");

		System.out.println(response.body().prettyPrint());

		//Validate Status Code

		given()
		.when()
		.get("/list")
		.then()
		.statusCode(200);
	}



	@Test

	public void getStudent1()

	{
		Response response1 =given()
				.when()
				.get("/5");
		// System.out.println(response1.body().prettyPrint());


	}

	@Test

	public void getStuentfromFA()
	{

		Response response2 = given()
				.when()
				.get("/list?programme=Law&limit=2");

		// System.out.println(response2.prettyPrint());
	}


	@Test

	public void getstudentfrommed()
	{

		Response response3= given()
				.param("programme", "Medicine")
				.param("limit",1)
				.when()
				.get("/list");

		System.out.println(response3.prettyPrint());


	}
}
