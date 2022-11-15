package tests.ui.um.backend;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import um.response.user.Profile;
import um.response.user.Splits;
import um.response.user.User;

import static org.hamcrest.Matchers.*;

public class UMBackendTest {
    @Test
    public void testRestAssured() {
        RequestSpecification specification = new RequestSpecBuilder()
                .setBaseUri("http://bodyfit2.loc/api/v4.0/user/2977e0d2-aace-4ec1-9092-77428c077328/")
                .addHeader("Authorization", "Bearer V4UsILt9kW0F6kxcFzfkxmfRea1nSe3S6qbJvdDdylMAe0CYy1")
                .setContentType(ContentType.JSON)
                .addFilter(new AllureRestAssured())
                .build();

        Object profile = RestAssured
                .given()
                .spec(specification)
                .when()
                .log().all()
                .get()
                .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .and()
                .body("splits.price", nullValue())
                .extract().jsonPath().getObject("profile", Profile.class);

        System.out.println();
    }
}
