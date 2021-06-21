package adapterpattern;

/**
 * Client模拟手机，拥有type-c母接口，需要type-c连接才能充电
 * 
 *
 * Client需要Adaptee的功能支持，但是二者接口不一致，无法直接连接
 * 因此，
 * 1、新建一个接口Target
 * 2、再建一个类Adapter实现Target，并可使用两种方式得到Adaptee的功能：
 *    2.1、继承Adaptee
 *    2.2、组合Adaptee
 * 3、使用Target类所指向的Adapter类完成功能调用
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
        //使用Adapter实现，使用的是类适配器方式
        Client client = new Client("iphone");     //手机
        Target target = new Adapter();           //转接线usb to type-c
        System.out.print(client.deviceName);
        client.needCharge(target);               //手机充电，交由继承Adaptee类和实现target接口的Adapter去调用
 
        //使用Adapter02实现，使用的是对象适配器方式
        Client client02 = new Client("HONOR");     //手机
        Adaptee adaptee = new Adaptee();         //充电宝
        Target target02 = new Adapter02(adaptee);//转接线usb to type-c
        System.out.print(client02.deviceName);
        client02.needCharge(target02);           //手机充电，交由继承Adaptee类和实现target接口的Adapter去调用
    }
}
