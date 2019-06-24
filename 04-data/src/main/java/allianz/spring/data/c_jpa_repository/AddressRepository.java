package allianz.spring.data.c_jpa_repository;

import org.springframework.data.repository.CrudRepository;

import allianz.spring.data.entities.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
