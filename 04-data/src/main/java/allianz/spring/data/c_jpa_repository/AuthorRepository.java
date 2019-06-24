package allianz.spring.data.c_jpa_repository;

import org.springframework.data.repository.CrudRepository;

import com.baeldung.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
