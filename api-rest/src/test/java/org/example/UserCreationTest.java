package org.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import org.testng.Assert;
import org.json.JSONObject;

public class UserCreationTest {

    @Test
    public void createUserTest() {
        // Step 1: Create a JSON object containing user data
        JSONObject requestData = new JSONObject();
        requestData.put("name", "ziad");
        requestData.put("job", "Software Tester");

        // Step 2: Send POST Request to create a new user
        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(requestData.toString())
                .post("https://reqres.in/api/users")
                .then()
                .extract().response();
        // Step 3: Assert that the response status code is 201 (Created)
        Assert.assertEquals(response.getStatusCode(), 201, "Status code is not 201");

        // Step 4: Validate that the response body contains the expected data
        int id = response.jsonPath().getInt("id");
        String name = response.jsonPath().getString("name");
        String job = response.jsonPath().getString("job");

        // Assertions to validate the data
        Assert.assertTrue(id > 0, "ID should be a positive number");
        Assert.assertEquals(name, "ziad", "Name does not match");
        Assert.assertEquals(job, "Software Tester", "Job does not match");
    }
}
