package adapterpattern;

/**
 * 适配器，用于将Adaptee的usb口转换成Target需要的type-c口
 * 对象适配器的实现方式，即类中组合需要的对象（组合方式）
 * liyang 2020-07-15
 */
 
public class Adapter02 implements Target{
    private Adaptee adaptee;
    public Adapter02(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void charge() {
        adaptee.charging();
    }
}
