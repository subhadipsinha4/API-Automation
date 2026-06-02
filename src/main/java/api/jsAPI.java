package api;

import io.restassured.response.Response;
import model.Pice_RequestBody;
import model.RequestBody;
import speces.RequestSpecs;

import static io.restassured.RestAssured.given;

public class jsAPI {
    public static Response getjsonPlaceHolder(){
        return given()
                .spec(RequestSpecs.getRequestSpec())
                .log().all()
                .pathParam("id",2)
                .when()
                .get("/posts/{id}");
    }

    public static Response getJsonPlaceHolderPost(String title, String message,int userId){

        RequestBody requestBody=new RequestBody();
        requestBody.setTitle(title);
        requestBody.setBody(message);
        requestBody.setUserId(userId);

        return given()
                .spec(RequestSpecs.getRequestSpec())
                .log().all()
                .body(requestBody)
                .when()
                .post("/posts");
    }

    public static Response getPicePostAPI(String countryCode, String number, String otp, String referralCode, String campaignSource){
        Pice_RequestBody piceRequestBody=new Pice_RequestBody();
        piceRequestBody.setCountryCode(countryCode);
        piceRequestBody.setNumber(number);
        piceRequestBody.setOtp(otp);
        piceRequestBody.setReferralCode(referralCode);
        piceRequestBody.setCampaignSource(campaignSource);

        return given()
                .spec(RequestSpecs.getRequestSpecPice())
                .log().all()
                .header("device-id","uuid")
                .header("country-code","IN")
                .header("CLIENT-VERSION","1")
                .header("CLIENT-TYPE","ANDROID")
                .body(piceRequestBody)
                .when()
                .post("/vk/v1/login/otp");
    }
}
