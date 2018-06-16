package RestAssured.StudentApp;

import static io.restassured.RestAssured.given;

import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.Assert;
import com.student.model.Student;
import static org.hamcrest.Matcher.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;


import java.util.ArrayList;

public class Delete {


	@BeforeClass
	public static void init() {
		RestAssured.baseURI ="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath="/student";
	}


	@Test
	public void Createnewstudent()
	{
		given()
		.when()
		.header("Content-Type", "application/json")
		.delete("/101");
		
		//.statusCode(204);
	}
}
