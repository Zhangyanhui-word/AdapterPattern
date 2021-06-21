package adapterpattern;

/**
 * 适配器，用于将Adaptee的usb口转换成Target需要的type-c口
 * 类适配器的实现方式，即类继承方式（extends）
 * 
 */
 
public class Adapter extends Adaptee implements Target{
    @Override
    public void charge() {
        super.charging();
    }
}
