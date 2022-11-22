import java.io.*;
//default constructor
public class constructor {
    int num;
    String name;
    constructor() { System.out.println("Constructor called"); }
}
class test {
    public static void main(String[] args)
    {
        constructor geek1 = new constructor();
        System.out.println(geek1.name);
        System.out.println(geek1.num);

    }
}

//parameterized constructor
class constructor1{String name;

    int id;

    constructor1(String name, int id)

    {
        this.name = name;
        this.id = id;

    }
}
class test1 {
    public static void main(String[] args) {
        constructor1 c = new constructor1("adam", 1);
        System.out.println("GeekName :" + c.name
                + " and GeekId :" + c.id);

    }
}
