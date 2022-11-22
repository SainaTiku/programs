//single inheritance
public class animal {
        void eat(){System.out.println("eating...");}
    }
    class Dog extends animal{
        void bark(){System.out.println("barking...");}
    }
    class TestInheritance{
        public static void main(String args[]){
            Dog d=new Dog();
            d.bark();
            d.eat();
        }
}

//hierarichal inheritance
class Animal1{
    void eat(){System.out.println("eating...");}
}
class Dog1 extends Animal1{
    void bark(){System.out.println("barking...");}
}
class Cat extends Animal1{
    void meow(){System.out.println("meowing...");}
}
class TestInheritance1{
    public static void main(String args[]){
        Cat c=new Cat();
        c.meow();
        c.eat();
//c.bark();//C.T.Error
    }}
//multilevel inheritance
class Animal2{
    void eat(){System.out.println("eating...");}
}
class Dog2 extends Animal2{
    void bark(){System.out.println("barking...");}
}
class BabyDog extends Dog2{
    void weep(){System.out.println("weeping...");}
}
class TestInheritance3{
    public static void main(String args[]){
        BabyDog d=new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }}

//multiple inheritance
interface AnimalEat {
    void eat();
}
interface AnimalTravel {
    void travel();
}
class Animal implements AnimalEat, AnimalTravel {
    public void eat() {
        System.out.println("Animal is eating");
    }
    public void travel() {
        System.out.println("Animal is travelling");
    }
}
class Demo {
    public static void main(String args[]) {
        Animal a = new Animal();
        a.eat();
        a.travel();
    }
}