package allianz.spring.data.c_jpa_repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.baeldung.models.Book;
import com.baeldung.projections.CustomBook;

@RepositoryRestResource(excerptProjection = CustomBook.class)
public interface BookRepository extends CrudRepository<Book, Long> {
}
