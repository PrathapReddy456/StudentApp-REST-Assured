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

public class Post {


	@BeforeClass
	public static void init() {
		RestAssured.baseURI ="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath="/student";
	}


	@Test
	public void Createnewstudent()
	{
		ArrayList<String> courses = new ArrayList<>();
		courses.add("java");
		courses.add("C++");

		Student student = new Student();
		student.setid(101);
		student.setFirstname("Praveen");
		student.setLastname("Reddy");
		student.setEmail("prathap456@gmail.com");
		student.setProgramme("Computer");
		student.setCourses(courses);


		given()
		.header("Content-Type", "application/json")
		.when()
		.body(student)
		.post()
		.then()
		.statusCode(201);


	}
}
