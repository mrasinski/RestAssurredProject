import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITests {
    @Test
    public void testAllUsers(){
        Response response = get("https://reqres.in/api/users?page=2");

        System.out.println("Status code: " + response.getStatusCode());
        System.out.println("Headers: " + response.getHeaders().asList());
        System.out.println("Response: " + response.asString());

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    public void testAllUsers2(){
        given()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200);
    }
}
