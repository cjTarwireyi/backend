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

    @Test
    public void testUpdate() throws Exception {
        Account account = AccountFactory.createAcount("Cj","12345678");
        Account copyAccount = new Account.AccountBuilder()
                .copy(account)
                .password("password")
                .build();
        Assert.assertEquals( copyAccount.getPassword(),"password");
        Assert.assertEquals(copyAccount.getUsername(),"Cj");
    }
}
