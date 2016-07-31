package busbooking.repository;

import busbooking.domain.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Cornelious on 7/31/2016.
 */
@Repository
public interface AccountRepository extends CrudRepository<Account,Long> {
}
