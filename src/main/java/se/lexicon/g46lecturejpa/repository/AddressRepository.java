package se.lexicon.g46lecturejpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.g46lecturejpa.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
  // add more methods...
}
