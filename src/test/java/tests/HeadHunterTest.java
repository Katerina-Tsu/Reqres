package tests;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import objects.VacanciesList;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class HeadHunterTest {

    @Test
    public void qaSearch() {
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

        //https://api.hh.ru/vacancies?text=QA
        String wordToSearch = "Lead";
        String body = given()
                .when()
                .get("https://api.hh.ru/vacancies?text=" + wordToSearch)
                .then()
//               .log().all()
                .statusCode(200)
                .extract().body().asString();

//        System.out.println(body);

        VacanciesList list1 = new Gson().fromJson(body, VacanciesList.class);
        list1.getItems().get(0).getSalary().getTo();


//        VacanciesList list2 = gson.fromJson(body, VacanciesList.class);
//        body = gson.toJson(list2);
//        System.out.println(body);

//        System.out.println(list);
    }

}
