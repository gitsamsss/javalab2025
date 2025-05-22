class Animal {
    void sleep() {
        System.out.println("The animal is sleeping.");
    }
}
class Mammal extends Animal {
    void feedMilk() {
        System.out.println("The mammal feeds milk.");
    }
}
class Cat extends Mammal {
    void meow() {
        System.out.println("The cat meows.");
    }
}
public class multilevel_inheritance3 {
    public static void main(String[] args) {
        Cat myCat = new Cat();

        myCat.sleep();     
        myCat.feedMilk();  
        myCat.meow();      
    }
}


