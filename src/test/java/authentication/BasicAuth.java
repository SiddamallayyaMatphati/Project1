package authentication;


import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class BasicAuth {
	
	@Test
	public void baseAuth() {
		 
		
		baseURI = "https://github.com/";
		
		given().auth().basic("SiddamallayyaMatphati", "Abhi@6969")
		.when().get("/login")
		.then().log().all();
		
	}
}
