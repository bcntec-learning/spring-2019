package allianz.spring.data.entities;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author francisco.philip@gmail.com
 */

@Getter
@Setter
public class PricePK implements Serializable {

    private BookEntity book;

    private LibraryEntity library;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PricePK pricePK = (PricePK) o;
        return Objects.equals(book, pricePK.book) &&
                Objects.equals(library, pricePK.library);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, library);
    }
}