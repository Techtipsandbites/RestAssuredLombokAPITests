package RestAssuredPractice;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static io.restassured.config.EncoderConfig.encoderConfig;
import static io.restassured.config.RestAssuredConfig.config;

public class RestAssuredClient {

    Response response ;
    private String appUrl = "https://reqres.in/" ;

    public Response getResource(String serviceUrl)
    {
        RestAssured.baseURI = appUrl;
        response  = given()
                    .when()
                    .get(appUrl + serviceUrl);
        return response ;
    }

    /**
    * * POST Method
      * @param serviceUrl
      * @param jsonReqBody
      * @return
    **/

    public Response createResource(String serviceUrl , String jsonReqBody )
    {
        System.out.println(jsonReqBody) ;
        RestAssured.baseURI = appUrl;
        Response response  =     given()
                //.config(config().encoderConfig(encoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false)))
                .contentType(ContentType.JSON)
                .body(jsonReqBody)
                .when()
                .post(appUrl + serviceUrl);
        return response ;
    }

}
