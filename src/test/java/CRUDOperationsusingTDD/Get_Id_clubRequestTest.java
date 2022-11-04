package CRUDOperationsusingTDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Get_Id_clubRequestTest {
	
	@Test
	public void getRequestTest() {
		
		baseURI="http://localhost:8080";
		
		when()
		.get("/packages/1")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
	}

}