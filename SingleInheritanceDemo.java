// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Access methods from both parent and child
        myDog.eat();  // from Animal class
        myDog.bark(); // from Dog class
    }
}
