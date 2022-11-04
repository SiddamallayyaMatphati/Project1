package CRUDOperationsusingTDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoclass.ProjectLibrary;

import static io.restassured.RestAssured.*;

public class Put_clubRequestTest {

	@Test
		public void putRequestTest() {
			 
		     baseURI = "http://localhost:8080";
		    
		    ProjectLibrary pojo = new ProjectLibrary("37","12","pencil","stopped",300);
		    
		    given()
		    .body(pojo)
		    .contentType(ContentType.JSON)
		    
		    .when()
		    .put("/packages")
		    
		    .then()
		    .assertThat().statusCode(200)
		    .log().all();
		}

}
