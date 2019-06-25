package allianz.spring.data.c_jpa_repository;

import allianz.spring.data.entities.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepository extends CrudRepository<Author, Long> {

}
