package allianz.spring.data.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * @author francisco.philip@gmail.com
 */

@Getter
@Setter
@Entity
@Table(name = "PRICES")
public class Price2Entity {
    @EmbeddedId
    private PricePKEmbedded pk;

    @Column
    private BigDecimal value;

}
