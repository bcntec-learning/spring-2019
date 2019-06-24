package allianz.spring.data.c_jpa_repository;

import org.springframework.data.repository.CrudRepository;

import com.baeldung.models.Library;

public interface LibraryRepository extends CrudRepository<Library, Long> {

}
