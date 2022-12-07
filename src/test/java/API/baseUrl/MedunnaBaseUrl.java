package API.baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class MedunnaBaseUrl {
  public static RequestSpecification spec;

    @Before
    public static void setup(){

        spec=new RequestSpecBuilder().setBaseUri("https://medunna.com/").build();
    }
}

