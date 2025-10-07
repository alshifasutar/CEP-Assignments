// Grandparent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Parent class
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal is walking");
    }
}

// Child class
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Access methods from all ancestor classes
        myDog.eat();   // from Animal class
        myDog.walk();  // from Mammal class
        myDog.bark();  // from Dog class
    }
}
