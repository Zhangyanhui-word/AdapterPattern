package adapterpattern;

/**
 * �����������ڽ�Adaptee��usb��ת����Target��Ҫ��type-c��
 * ����������ʵ�ַ�ʽ������̳з�ʽ��extends��
 * 
 */
 
public class Adapter extends Adaptee implements Target{
    @Override
    public void charge() {
        super.charging();
    }
}
