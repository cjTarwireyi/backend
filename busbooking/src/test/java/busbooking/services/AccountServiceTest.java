package busbooking.services;

import busbooking.App;
import busbooking.domain.Account;
import busbooking.factory.AccountFactory;
import busbooking.services.impl.AccountService;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;
import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by Cornelious on 8/7/2016.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class AccountServiceTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private AccountService accountService;

    @Test
    public void testCreateAccount() throws Exception {
        //repository.deleteAll();
        Account account = AccountFactory.createAcount("service","password");
         Account savedAccount=accountService.create(account);

        assertNotNull("CREATE TEST",savedAccount);
    }

    @Test(dependsOnMethods = "testCreateAccount")
    public void testReadAll() throws Exception {
        Iterable<Account> accoounts =  accountService.readAll();

        assertNotNull("READ TEST",accoounts);
    }

    @Test(dependsOnMethods = "testReadAll")
    public void testUpdateAccount() throws Exception {
        Account accountFound= accountService.readById(20L);
        Account updateAccount = new Account.AccountBuilder()
                .copy(accountFound)
                .username("serviceTest")
                .build();
        Account updatedAccount=accountService.update(updateAccount);
        Assert.assertEquals("UPDATE TEST",updatedAccount.getUsername(),updateAccount.getUsername());
    }

    @Test(dependsOnMethods = "testUpdateAccount")
    public void testDelete() throws Exception {
        Account foundAccount = accountService.readById(22L);
        if(foundAccount !=null) {
            assertNotNull("BEFORE DELETE TEST",foundAccount);
            accountService.delete(foundAccount);
            Account deletedAccount = accountService.readById(22L);

            assertNull("DELETE TEST",deletedAccount);
        }

    }
}
