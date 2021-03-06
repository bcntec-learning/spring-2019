package allianz.spring.beans.c_custom_qualifier;

import org.springframework.stereotype.Component;

@Component
@CustomQualifier(status = StatusType.A)
public class CustomBean implements Custom {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}