package NamVuEntertainment.TaxiProject.Domain.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import NamVuEntertainment.TaxiProject.Domain.Entity.TaxiUser;

@Repository
public interface TaxiUserRepository extends CrudRepository<TaxiUser, Integer> {

}
