package allianz.spring.data.c_jpa_repository;

import allianz.spring.data.entities.Library;
import org.springframework.data.repository.CrudRepository;


public interface LibraryRepository extends CrudRepository<Library, Long> {

}
