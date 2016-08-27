package busbooking.api;

import busbooking.App;
import busbooking.domain.Account;
import busbooking.factory.AccountFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

//import org.springframework.http.*;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.aspectj.lang.reflect.DeclareAnnotation.Kind.Type;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 * Created by Cornelious on 8/9/2016.
 */
@RunWith( SpringJUnit4ClassRunner.class )
@SpringApplicationConfiguration(classes = App.class)

@WebAppConfiguration
public class AccountControllerTest extends AbstractTestNGSpringContextTests {
/*

@Test
public void testCreate(){
    String URI =  "http://localhost:8080/acc";
    RestTemplate restTemplate = new RestTemplate();
    Account account = AccountFactory.createAcount("testApi","tetApi");
     restTemplate.postForObject(URI,account, Account.class );
}
    @Test
    public void testFindById() {
        String URI =  "http://localhost:8080/acc/{id}";
        RestTemplate restTemplate = new RestTemplate();
        Account account= restTemplate.getForObject(URI, Account.class, "20");
        Assert.assertNotNull(account);
        Assert.assertEquals(new Long(20), account.getId());

        Assert.assertEquals("admin", account.getUsername());
    }
    @Test
    public void testUpdate(){
        String URI =  "http://localhost:8080/acc/{id}";
        RestTemplate restTemplate = new RestTemplate();
        Account account= restTemplate.getForObject(URI, Account.class, "23");
        if(account!=null) {
            String UPDATE_URI = "http://localhost:8080/acc";
            Account updateAccount = new Account.AccountBuilder()
                    .copy(account)
                    .username("successApi")
                    .build();
            restTemplate.put(UPDATE_URI,updateAccount);
            Account UpdatedAccount= restTemplate.getForObject(URI, Account.class, "23");

            Assert.assertEquals(UpdatedAccount.getUsername(),"successApi");
        }
    }
    @Test
    public void testFindAll(){
        String URI =  "http://localhost:8080/acc";
        RestTemplate restTemplate = new RestTemplate();
      Set accountList = restTemplate.getForObject(URI,Set.class);
        Assert.assertTrue(accountList.size()>0);
    }
    @Test
    public void testDelete(){
        String URI =  "http://localhost:8080/acc/{id}";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(URI,"28");
        Account account= restTemplate.getForObject(URI, Account.class, "28");

        Assert.assertNull(account);


    }
*/


}
