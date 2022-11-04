package CRUDOperationsusingTDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Get_clubRequest1Test {
	@Test
	public void getRequestTest() {
		
		baseURI="http://localhost:8080";
		
		when()
		.get("/packages/all")
		
		
		.then()
		.assertThat().statusCode(204)
		.log().all();
		
	}

}

