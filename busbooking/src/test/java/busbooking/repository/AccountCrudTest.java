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

/**
 * Created by Cornelious on 7/31/2016.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class AccountCrudTest extends AbstractTestNGSpringContextTests{

    private Long id;

    @Autowired
    AccountRepository repository;

    @Test
    public void testCreate() throws Exception {
        repository.deleteAll();
        Account account = AccountFactory.createAcount("cj","12345678");
        repository.save(account);
        id=account.getId();
        Assert.assertNotNull(id);
    }
}
