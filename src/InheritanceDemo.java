public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d1 = new Dog();

        Cat c1 = new Cat();
        c1.eat();
        d1.breathe();
    }
}
interface Animal{
     void breathe();

    void eat();

    void sleep();


}

class Dog implements Animal {
    @Override
    public void breathe() {
        System.out.println("Dog is breathing");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

class Cat implements Animal {
    @Override
    public void breathe() {
        System.out.println("Cat is breathing");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}

class mouse implements Animal{

    @Override
    public void breathe() {
        System.out.println("Mouse is breathing");
    }

    @Override
    public void eat() {
        System.out.println("Mouse is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Mouse is sleeping");
    }
}