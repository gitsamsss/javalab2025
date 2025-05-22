class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}
public class single_inheritance3 {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.eat();   
        myCat.meow();  
    }
}

