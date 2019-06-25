package allianz.spring.data.c_jpa_repository;

import allianz.spring.data.entities.BookEntity;
import allianz.spring.data.projections.CustomBook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(excerptProjection = CustomBook.class)
public interface BookRepository extends CrudRepository<BookEntity, Long> {
}
