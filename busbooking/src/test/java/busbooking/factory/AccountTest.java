package busbooking.factory;

import busbooking.domain.Account;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Cornelious on 7/31/2016.
 */
public class AccountTest {
    @Test
    public void testCreate(){
        Account account = AccountFactory.createAcount("Cj","12345678");

        Assert.assertEquals(account.getUsername(),"Cj");
        Assert.assertEquals(account.getPassword(),"12345678");
    }
}
