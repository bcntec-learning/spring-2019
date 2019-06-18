package allianz.spring2018.aop.proxy;

public class MyThirdBean implements FirstBean {
    private final String name;

    public MyThirdBean(String name) {
        this.name = name;
    }


    @Override
    public void hello() {

        System.err.println("hello " + name + "!!!!!!");
    }
}
