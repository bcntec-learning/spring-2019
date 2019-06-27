package allianz.spring.data.c_jpa_rest_repository;

import allianz.spring.data.entities.AuthorEntity;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepository extends CrudRepository<AuthorEntity, Long> {

}
