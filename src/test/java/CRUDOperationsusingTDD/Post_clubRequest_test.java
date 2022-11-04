package CRUDOperationsusingTDD;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import pojoclass.ProjectLibrary;




public class Post_clubRequest_test {

	@Test
	public void postRequestTest() {
		 
	     baseURI = "http://localhost:8080";
	    
	    ProjectLibrary pojo = new ProjectLibrary("25","56","pencil","success",700);
	    
	    given()
	    .body(pojo)
	    .contentType(ContentType.JSON)
	    
	    .when()
	    .post("/packages")
	    
	    .then()
	    .assertThat().statusCode(201)
	    .log().all();
	}

}
