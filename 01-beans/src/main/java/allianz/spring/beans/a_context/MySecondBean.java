package allianz.spring.beans.a_context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MySecondBean {
    //@Autowired que es igual a @Inject
    private  MyFirstBean myFirstBean;



    @Autowired
    public MySecondBean(MyFirstBean myFirstBean) {
        this.myFirstBean = myFirstBean;
    }

    public void hello(){
        myFirstBean.hello();
    }
    //@Autowired
    public void setMyFirstBean(MyFirstBean myFirstBean) {
        this.myFirstBean = myFirstBean;

    }
}
