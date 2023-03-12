package get_requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;


public class RequestResponse {

    /**
     *1) Postman manuel API testi için kullanılır
     *2)API otomasynu için Rest Assured Library
     *3) Otomasyon kodlarının yazımı için şu adımları izliyoruz
     *     a)Gereksinimleri anlama
     *     b)Test case'i yazma:
     *        - Test case yazmak için "Gherkin Language" kullanıyoruz.
     *          + Given: Ön koşullar --> Endpoint,body
     *          + When:  işlemler --> Get,Put,Delete...
     *          + Then:  Dönütler --> Assert
     *          + And:   Çoklu işlemlerin art arda yazılacagı yerlerde kullanılır.
     *     c) Test kodunu yazarken bu adımları izleriz:
     *           + Set the URL
     *           + Set the expected data
     *           + Send the request and get the response
     *           + Do assertion
     *
     *
     *
     */

    public static void main(String[] args) {

         String url = "https://restful-booker.herokuapp.com/booking/55";
        //Get request nasıl yapılır ?

        Response response = given().when().get(url);

      //  Response response=get(url);

        response.prettyPrint(); // prettyPrint() metodu response datayı yazdırır.

        // Status Code nasıl yazdırılır? ilk yapılması gereken 200 ü gör
        System.out.println("Status Code = " + response.statusCode());

        // Content Type nasıl yazdırılır?
        System.out.println("Content Type = " + response.contentType());

        // Status Line  nasıl yazdırılır? basarı kodu
        System.out.println("Status Line = " + response.statusLine());

        // Header nasıl yazdırılır?
        System.out.println("Connection = " + response.header("Connection"));
        System.out.println("Server = " + response.header("Server"));

        //Headers nasıl yazdırılır ?
        System.out.println(response.headers());

        // Time nasıl yazdırılır?
        System.out.println("Get Time = " + response.getTime());

    }
}
