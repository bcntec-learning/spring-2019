package allianz.spring.data.projections;

import java.util.List;

import allianz.spring.data.entities.Author;
import allianz.spring.data.entities.Book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;


@Projection(name = "customBook", types = { Book.class })
public interface CustomBook {
    @Value("#{target.id}")
    long getId();

    String getTitle();

    List<Author> getAuthors();

    @Value("#{target.getAuthors().size()}")
    int getAuthorCount();
}
