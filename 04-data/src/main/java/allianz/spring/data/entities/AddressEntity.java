package allianz.spring.data.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "ADDRESSES")
@Entity(name = "Address")
@Getter @Setter
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String location;

    @OneToOne(mappedBy = "address")
    private LibraryEntity library;


}
