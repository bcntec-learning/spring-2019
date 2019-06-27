package allianz.spring.templates.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class User {
    private Long id;
    @JsonProperty("name")
    private String name2;
    private String email;

}
