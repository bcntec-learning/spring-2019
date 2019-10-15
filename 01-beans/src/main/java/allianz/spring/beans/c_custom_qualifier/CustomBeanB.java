package allianz.spring.beans.c_custom_qualifier;

import org.springframework.stereotype.Component;

@Component
@CustomQualifier(status = StatusType.B)
public class CustomBeanB extends CustomBean{

}