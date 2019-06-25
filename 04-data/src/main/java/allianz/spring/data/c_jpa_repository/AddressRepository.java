package allianz.spring.data.c_jpa_repository;

import org.springframework.data.repository.CrudRepository;

import allianz.spring.data.entities.AddressEntity;

public interface AddressRepository extends CrudRepository<AddressEntity, Long> {

}
