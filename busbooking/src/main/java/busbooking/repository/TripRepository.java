package busbooking.repository;

import busbooking.domain.Trip;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Cornelious on 7/31/2016.
 */
@Repository
public interface TripRepository extends CrudRepository<Trip,Long> {
}
