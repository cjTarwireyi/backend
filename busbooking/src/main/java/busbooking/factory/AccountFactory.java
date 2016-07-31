package busbooking.factory;

import busbooking.domain.Account;

/**
 * Created by Cornelious on 7/31/2016.
 */
public class AccountFactory {
    public static Account createAcount (String username, String password){
        return new Account.AccountBuilder()
                .username(username)
                .password(password)
                .build();
    }
}
