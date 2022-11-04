package authentication;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class BearerToken {
	
	@Test
	public void bearerToken() {
		
		
		
		baseURI="https://api.github.com";
		
		JSONObject obj=new JSONObject();
		
		obj.put("name", "BasicAuth");
		
		given().auth().oauth2("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")
		.body(obj).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().log().all();
		
	}

}
