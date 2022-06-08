package com.restapiexample.dummy.reqresin;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetEmployeeGivenById extends TestBase {
    @Test
    public void getSingleEmployeeRecord(){
        Response response = given()
                .pathParam("id",2)
                .when()
                .get("/employee/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
