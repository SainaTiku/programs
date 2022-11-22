//private modifier
public class access_specifier
{
    private int data=40;
    private void msg(){System.out.println("Hello java");}
}

public class Simple{
    public static void main(String args[]){
        access_specifier obj=new access_specifier();
        System.out.println(obj.data);//Compile Time Error
        obj.msg();//Compile Time Error
    }
}

//protected modifier
package pack;
import pack.*;
public class A{
    protected void msg(){System.out.println("Hello");}
}
class B extends A{
    public static void main(String args[]){
        B obj = new B();
        obj.msg();
    }
}

//public modifier
public class C{
    public void msg(){System.out.println("Hello");}
}

class D{
    public static void main(String args[]){
        A obj = new A();
        obj.msg();
    }
}