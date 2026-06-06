package API_testCases;

import api.jsAPI;
import io.restassured.response.Response;
import model.HttpBinRequest;
import model.reqresRequestBody;
import org.testng.Assert;
import org.testng.annotations.Test;
import unit.Groups;

import java.util.ArrayList;
import java.util.List;

public class testCases {

    @Test
    public void verifyGetAPI(){
        Response response= jsAPI.getjsonPlaceHolder();
        response.prettyPrint();
        Assert.assertEquals(response.statusCode(),200);
        Assert.assertNotNull(response.jsonPath().get("id"));
    }

    @Test(groups = Groups.SMOKE)
    public void verifyPOSTAPI(){
        Response response=jsAPI.getJsonPlaceHolderPost("QA Engineer","HI jack",2);
        response.prettyPrint();
        Assert.assertEquals(response.statusCode(),201);
        Assert.assertNotNull(response.jsonPath().get("id"));
        Assert.assertEquals(response.jsonPath().get("title"),"QA Engineer");

    }

    @Test(groups = Groups.SMOKE)
    public void verifyPicePostResponse(){
        Response response=jsAPI.getPicePostAPI("+91","8618254172","1234","qaz","aqa");
        response.prettyPrint();

        Assert.assertEquals(response.jsonPath().get("success"),false);
        Assert.assertEquals(response.jsonPath().get("message"),"Validation Errors");
    }

    @Test(groups = Groups.SMOKE)
    public void verifyPiceGetResponse(){
        Response response=jsAPI.getPiceOTP();
        response.prettyPrint();
        Assert.assertEquals(response.statusCode(),200);
        Assert.assertEquals(response.jsonPath().get("success"),true);
    }


    @Test(groups =Groups.SMOKE)
    public void verify401StatusCode(){
        reqresRequestBody rb=new reqresRequestBody();
        reqresRequestBody.Employee employee=new reqresRequestBody.Employee();
        employee.setId(001);
        employee.setName("Jack");
        employee.setDesignation("Director");
        employee.setSalary(100000);
        rb.setEmployee(employee);

        reqresRequestBody.Address address=new reqresRequestBody.Address();
        address.setCity("Tokey");
        address.setCountry("USA");
        address.setState("Punjab");
        rb.setAddress(address);

        reqresRequestBody.Project project1=new reqresRequestBody.Project();
        project1.setProjectName("TimePass");
        project1.setProjectId(123);

        reqresRequestBody.Project project2=new reqresRequestBody.Project();
        project2.setProjectName("TimePass2");
        project2.setProjectId(124);

        List<reqresRequestBody.Project> project=new ArrayList<>();
        project.add(project1);
        project.add(project2);
        rb.setProjects(project);

        List<String> skill=new ArrayList<>();
        skill.add("Appium");
        skill.add("Java");
        skill.add("API");
        rb.setSkills(skill);

        Response response=jsAPI.getReqresAPI(rb);
        response.prettyPrint();

        Assert.assertEquals(response.statusCode(),401);
    }

    @Test(groups = Groups.SINGLE)
    public void getHttpBinPost(){
        HttpBinRequest httpBinRequest=new HttpBinRequest();

        HttpBinRequest.Customer customer=new HttpBinRequest.Customer();
        customer.setCustomerId(1001);
        customer.setEmail("test@gmail.com");
        customer.setName("jack");
        httpBinRequest.setCustomer(customer);

        HttpBinRequest.Payment payment=new HttpBinRequest.Payment();
        payment.setAmount(500);
        payment.setMethod("UPI");
        httpBinRequest.setPayment(payment);

        HttpBinRequest.ShippingAddress shippingAddress=new HttpBinRequest.ShippingAddress();
        shippingAddress.setCity("BLR");
        shippingAddress.setCountry("IND");
        shippingAddress.setState("KA");
        httpBinRequest.setShippingAddress(shippingAddress);

        HttpBinRequest.Item item1=new HttpBinRequest.Item();
        item1.setPrice(100);
        item1.setProductId(10023);
        item1.setProductName("OIL");
        item1.setQuantity(10);

        HttpBinRequest.Item item2=new HttpBinRequest.Item();
        item2.setPrice(200);
        item2.setProductId(10024);
        item2.setProductName("RICE");
        item2.setQuantity(5);

        List<HttpBinRequest.Item> items=new ArrayList<>();
        items.add(item1);
        items.add(item2);
        httpBinRequest.setItems(items);

        Response response=jsAPI.getHttpBin(httpBinRequest);
        response.prettyPrint();

        Assert.assertEquals(response.statusCode(),200);
        //Assert.assertNotNull(response.jsonPath().getString("header.Postman-Token"));
        Assert.assertEquals(response.jsonPath().getString("json.customer.customerId"),"1001");
    }
}
