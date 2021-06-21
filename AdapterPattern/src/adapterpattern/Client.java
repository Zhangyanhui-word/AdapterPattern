package adapterpattern;

/**
 * Clientģ���ֻ���ӵ��type-cĸ�ӿڣ���Ҫtype-c���Ӳ��ܳ��
 * 
 *
 * Client��ҪAdaptee�Ĺ���֧�֣����Ƕ��߽ӿڲ�һ�£��޷�ֱ������
 * ��ˣ�
 * 1���½�һ���ӿ�Target
 * 2���ٽ�һ����Adapterʵ��Target������ʹ�����ַ�ʽ�õ�Adaptee�Ĺ��ܣ�
 *    2.1���̳�Adaptee
 *    2.2�����Adaptee
 * 3��ʹ��Target����ָ���Adapter����ɹ��ܵ���
 *
 */
 
public class Client {
 
    private String deviceName;
 
    public Client(String deviceName) {
        this.deviceName = deviceName;
    }
 
    public void needCharge(Target t){
        t.charge();
    }
 
    public static void main(String[] args) {
        //ʹ��Adapterʵ�֣�ʹ�õ�������������ʽ
        Client client = new Client("iphone");     //�ֻ�
        Target target = new Adapter();           //ת����usb to type-c
        System.out.print(client.deviceName);
        client.needCharge(target);               //�ֻ���磬���ɼ̳�Adaptee���ʵ��target�ӿڵ�Adapterȥ����
 
        //ʹ��Adapter02ʵ�֣�ʹ�õ��Ƕ�����������ʽ
        Client client02 = new Client("HONOR");     //�ֻ�
        Adaptee adaptee = new Adaptee();         //��籦
        Target target02 = new Adapter02(adaptee);//ת����usb to type-c
        System.out.print(client02.deviceName);
        client02.needCharge(target02);           //�ֻ���磬���ɼ̳�Adaptee���ʵ��target�ӿڵ�Adapterȥ����
    }
}
