package API_testCases;

import api.jsAPI;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import unit.Groups;

public class testCases {

    @Test
    public void verifyGetAPI(){
        Response response= jsAPI.getjsonPlaceHolder();
        response.prettyPrint();
        Assert.assertEquals(response.statusCode(),200);
        Assert.assertNotNull(response.jsonPath().get("id"));
    }

    @Test(groups = Groups.SINGLE)
    public void verifyPOSTAPI(){
        Response response=jsAPI.getJsonPlaceHolderPost("QA Engineer","HI jack",2);
        response.prettyPrint();
        Assert.assertEquals(response.statusCode(),201);
        Assert.assertNotNull(response.jsonPath().get("id"));
        Assert.assertEquals(response.jsonPath().get("title"),"QA Engineer");

    }

    @Test(groups = Groups.SINGLE)
    public void verifyPicePostResponse(){
        Response response=jsAPI.getPicePostAPI("+91","8618254172","1234","qaz","aqa");
        response.prettyPrint();

        Assert.assertEquals(response.jsonPath().get("success"),false);
        Assert.assertEquals(response.jsonPath().get("message"),"Validation Errors");
    }
}
