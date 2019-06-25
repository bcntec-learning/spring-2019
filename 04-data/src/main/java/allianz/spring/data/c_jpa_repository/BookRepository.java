package allianz.spring.data.c_jpa_repository;

import allianz.spring.data.entities.Book;
import allianz.spring.data.projections.CustomBook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(excerptProjection = CustomBook.class)
public interface BookRepository extends CrudRepository<Book, Long> {
}
