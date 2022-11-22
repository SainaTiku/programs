public class diff_prototypes_of_main {
    public static void main(String[] args)

    {

        System.out.println("Main Method");

    }
}

class Gfg{



    final public static void main(String[] args){



        System.out.println("final main method");


    }
}

class Test
{

    public strictfp static void main(String[] args)

    {

        System.out.println("Main Method");

    }
}

class A
{

    public static void main(String[] args)

    {

        System.out.println("Main Method Parent");

    }
}


class B extends A
{

}

class A
{

    public static void main(String[] args)

    {

        System.out.println("Main Method Parent");

    }
}

class B extends A
{

    public static void main(String[] args)

    {

        System.out.println("Main Method Child");

    }
}

