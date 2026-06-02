package speces;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecs {
   public static RequestSpecification  getRequestSpec(){
       return new RequestSpecBuilder()
               .setBaseUri("https://jsonplaceholder.typicode.com")
               .addHeader("Content-Type","application/json")
               .build();
   }

    public static RequestSpecification  getRequestSpecPice(){
        return new RequestSpecBuilder()
                .setBaseUri("https://vk.pice.one")
                .addHeader("Content-Type","application/json")
                .build();
    }
}
