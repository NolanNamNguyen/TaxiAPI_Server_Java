package NamVuEntertainment.TaxiProject.Domain.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import NamVuEntertainment.TaxiProject.Domain.Entity.TaxiUser;

@Repository
public interface TaxiUserRepository extends JpaRepository<TaxiUser, Integer> {
//	@Query(value = "SELECT * FROM taxiuser WHERE name = 'Nam'")
//	List<TaxiUser> fuckthislah();
}
