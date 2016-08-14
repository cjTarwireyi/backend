package busbooking.services.impl;

import busbooking.domain.Account;
import busbooking.repository.AccountRepository;
import busbooking.services.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Cornelious on 7/31/2016.
 */
@Service
public class AccountService implements IAccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account create(Account entity) {
        return accountRepository.save(entity);
    }

    @Override
    public Account readById(Long id) {
        return accountRepository.findOne(id);
    }

    @Override
    public Set<Account> readAll() {
        Iterable<Account>accounts=accountRepository.findAll();
        Set accountSet = new HashSet();

        for (Account account:accounts){
            accountSet.add(account);
        }
        return accountSet;
    }

    @Override
    public Account update(Account entity) {
        return accountRepository.save(entity);
    }

    @Override
    public void delete(Account entity) {
            accountRepository.delete(entity);
    }
}
