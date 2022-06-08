package com.restapiexample.dummy.reqresin;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetAllEmployees extends TestBase {
    @Test
    public void getAllEmployeesRecord(){
        Response response = given()
                .when()
                .get("/employees");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
