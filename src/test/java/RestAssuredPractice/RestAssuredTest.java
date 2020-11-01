package RestAssuredPractice;

import com.google.gson.Gson;
import io.restassured.response.Response;
import org.junit.Test;

/**
 *This is a Class holding all CRUD Methods to validate the RESTful API
 */
public class RestAssuredTest {


    private Response response ;
    private RestAssuredClient restassured ;
    private RegexCreateUser regexCreateUser ;


    /**
     * GET Resource Method
     */
    @Test
    public void testRegexGetResource()
    {
        String getRegexusersurl = "api/users" ;
        restassured = new RestAssuredClient() ;
        response = restassured.getResource(getRegexusersurl) ;
        System.out.println(response.getBody().asString()) ;

    }

    /**
     * Create Resource Method
     */
    @Test
    public void testRegexCreateResource()
    {
        String getRegexuCreateUserurl = "api/users" ;
        restassured = new RestAssuredClient() ;
        regexCreateUser = RegexCreateUser.builder().name("Artist").job("painting").build();
        Gson gson = new Gson() ;
        String createUserJson = gson.toJson(regexCreateUser) ;
        response = restassured.createResource(getRegexuCreateUserurl ,createUserJson) ;
        System.out.println(response.getBody().asString()) ;

    }




}
