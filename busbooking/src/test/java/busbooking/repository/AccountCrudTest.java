package busbooking.repository;

import busbooking.App;
import busbooking.domain.Account;
import busbooking.factory.AccountFactory;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;

import org.testng.annotations.Test;


import java.util.HashSet;
import java.util.Set;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Cornelious on 7/31/2016.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class AccountCrudTest extends AbstractTestNGSpringContextTests{
   /* @Autowired
   private AccountRepository repository;

    @Test
    public void testCreateAccount() throws Exception {
        //repository.deleteAll();
        Account account = AccountFactory.createAcount("cj","12345678");
        Account savedAccount=repository.save(account);

        assertNotNull("CREATE TEST",savedAccount);
    }

    @Test(dependsOnMethods = "testCreateAccount")
    public void testReadAll() throws Exception {
        Iterable<Account> accoounts =  repository.findAll();

        assertNotNull("READ TEST",accoounts);
    }

    @Test(dependsOnMethods = "testReadAll")
    public void testUpdateAccount() throws Exception {
        Account accountFound= repository.findOne(20L);
        Account updateAccount = new Account.AccountBuilder()
                .copy(accountFound)
                .username("admin")
                .build();
        Account updatedAccount=repository.save(updateAccount);
       Assert.assertEquals("UPDATE TEST",updatedAccount.getUsername(),updateAccount.getUsername());
    }

    @Test(dependsOnMethods = "testUpdateAccount")
    public void testDelete() throws Exception {
        Account foundAccount = repository.findOne(21L);
        if(foundAccount !=null) {
            assertNotNull("BEFORE DELETE TEST",foundAccount);
            repository.delete(21L);
            Account deletedAccount = repository.findOne(21L);

            assertNull("DELETE TEST",deletedAccount);
        }

    }
*/

}
