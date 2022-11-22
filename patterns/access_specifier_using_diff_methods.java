//using local variables
public class access_specifier_using_diff_methods
{
        static String staticField;
        int instanceField;
        public static void main(String args[]) {
            access_specifier_using_diff_methods obj = new access_specifier_using_diff_methods();
            System.out.println(obj.instanceField);
            System.out.println(obj.staticField);
            System.out.println(access_specifier_using_diff_methods.staticField);
        }

        public void method() {
            final String localVariable = "Initial Value";
            System.out.println(localVariable);
        }
    }
    class UserController {
        private String outsideVariable;
        public void setLength() {
            String localVariable = "0";
            System.out.println("Value of the localVariable is-" + localVariable);
        }
}

//using anonymous block
class Demo{

    public Demo(){
        System.out.println("default constructor");
    }
    public Demo(int i){
        System.out.println("parameterized constructor");
        System.out.print("Object is created by the ");
    }

    public static void main(String arr[]){
        Demo b1 = new Demo();
        Demo b2 = new Demo(1);
    }

}

//using static variables
class Demo1{

    static {
        System.out.println("First static block is initialized");
    }

    static {
        System.out.println("Second static block is initialized");
    }

    public static void main(String arr[]){
    }

}

//using instance variables
 class Studentsrecords
{
    public String name; //public instance
    String division;    //default instance
    private int age;    //private instance
    public Studentsrecords(String sname)
    {
        name = sname;
    }
    public void setDiv(String sdiv)
    {
        division = sdiv;
    }
    public void setAge(int sage)
    {
        age = sage;
    }
    public void printstud()
    {
        System.out.println("Student Name: " + name );
        System.out.println("Student Division: " + division);
        System.out.println("Student Age: " + age);
    }

    public static void main(String args[])
    {
        Studentsrecords s = new Studentsrecords("Monica");
        s.setAge(14);
        s.setDiv("B");
        s.printstud();
    }
}