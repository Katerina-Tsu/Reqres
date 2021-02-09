package tests;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class OnlinerTest {

    @Test
    public void getCurrencyRateUSD() {
        given()
                .log().all()
        .when()
                .get("https://www.onliner.by/sdapi/kurs/api/bestrate?currency=USD&type=nbrb")
        .then()
                .log().all()
                .statusCode(200)
                .body("amount", equalTo("2,6150"));
    }


    @Test
    public void getCurrencyRateEUR() {
        //https://www.onliner.by/sdapi/kurs/api/bestrate?currency=USD&type=nbrb
        given()
                .when()
                .get("https://www.onliner.by/sdapi/kurs/api/bestrate?currency=USD&type=nbrb")
                .then()
                .statusCode(200);
    }

}

