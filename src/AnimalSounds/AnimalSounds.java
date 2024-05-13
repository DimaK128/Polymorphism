import java.util.ArrayList;

// 1.2.1 Create an abstract class Animal with abstract method makeSound()
abstract class Animal {
    public abstract void makeSound();
}
// 1.2.2 Create subclasses of Animal: Cat, Dog, Cow, Pig.
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo");
    }
}

class Pig extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Oink");
    }
}

// 1.2.4 In main create ArrayList<Animal> and add there different objects of Cat, Dog, Cow, Pig:
public class AnimalSounds {
    public static void main(String[] args) {
        // Create an ArrayList to store various Animal objects
        ArrayList<Animal> list = new ArrayList<>();
        // Add different instances of Animal subclasses to the list
        list.add(new Cat());
        list.add(new Dog());
        list.add(new Cow());
        list.add(new Pig());

        // 1.2.5 Iterate through ArrayList and call for every element makeSound();
        for (Animal animal : list) {
            animal.makeSound();
        }
    }
}
