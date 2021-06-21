package adapterpattern;

/**
 * �����������ڽ�Adaptee��usb��ת����Target��Ҫ��type-c��
 * ������������ʵ�ַ�ʽ�������������Ҫ�Ķ�����Ϸ�ʽ��
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
