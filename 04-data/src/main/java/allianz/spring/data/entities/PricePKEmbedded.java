package allianz.spring.data.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author francisco.philip@gmail.com
 */

@Getter
@Setter
public class PricePKEmbedded implements Serializable {
    @Id
    @ManyToOne
    private BookEntity book;


    @Id
    @ManyToOne
    private LibraryEntity library;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PricePKEmbedded pricePK = (PricePKEmbedded) o;
        return Objects.equals(book, pricePK.book) &&
                Objects.equals(library, pricePK.library);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, library);
    }
}
