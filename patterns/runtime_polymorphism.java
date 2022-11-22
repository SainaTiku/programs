public class runtime_polymorphism {
    void feature() {
        System.out.println("This is Operating System");
    }
}
class DOS extends runtime_polymorphism{
    void feature(){
        System.out.println("This is DOS");
    }
}
class Windows extends DOS{
    void feature(){
        System.out.println("This is Windows");
    }
}
class WindowsMobile extends Windows{
    void feature(){
        System.out.println("This is Windows Mobile");
    }
}
 class test {
    public static void main(String args[]){
        runtime_polymorphism superObject=new runtime_polymorphism();
        runtime_polymorphism subObject=new DOS();
        runtime_polymorphism sub2Object=new Windows();
        runtime_polymorphism sub3Object=new WindowsMobile();
        superObject.feature();
        subObject.feature();
        sub2Object.feature();
        sub3Object.feature();
    }
}
