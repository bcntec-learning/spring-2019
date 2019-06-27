package allianz.spring.data.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Getter
@Setter
@Table(name = "USERS")
@Entity(name = "User")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;
    @NotNull
    private String email;

    @Version
    private Long version;

    @JsonIgnore
    @Transient
    private String trace;

    public UserEntity(String name) {
        this.name = name;
    }

    public UserEntity(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
