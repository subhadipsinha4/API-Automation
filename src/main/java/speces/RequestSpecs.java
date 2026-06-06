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

   public static RequestSpecification getPiceAPI(){
       return new RequestSpecBuilder()
               .setBaseUri("https://vk.pice.one")
               .addHeader("Content-Type","application/json")
               .build();
   }

   public static RequestSpecification getReqresAPI(){
       return new RequestSpecBuilder()
               .setBaseUri("https://reqres.in")
               .addHeader("Content-Type","application/json")
               .build();
   }

   public static RequestSpecification getHttpBin(){
       return new RequestSpecBuilder()
               .setBaseUri("https://httpbin.org")
               .addHeader("Content-Type","application/json")
               .build();
   }
}
