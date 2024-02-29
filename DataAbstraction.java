public // Abstract class Animal
abstract class Animal {
    // Abstract methods eat() and sleep()
    public abstract void eat();
    public abstract void sleep();
}

// Subclass Lion
class Lion extends Animal {
    // Implementing eat() method for Lion
    @Override
    public void eat() {
        System.out.println("Lion eats meat");
    }

    // Implementing sleep() method for Lion
    @Override
    public void sleep() {
        System.out.println("Lion sleeps on rocky terrain");
    }
}

// Subclass Tiger
class Tiger extends Animal {
    // Implementing eat() method for Tiger
    @Override
    public void eat() {
        System.out.println("Tiger eats meat and occasionally fruits");
    }

    // Implementing sleep() method for Tiger
    @Override
    public void sleep() {
        System.out.println("Tiger sleeps in dense forests");
    }
}

// Subclass Deer
class Deer extends Animal {
    // Implementing eat() method for Deer
    @Override
    public void eat() {
        System.out.println("Deer eats grass and leaves");
    }

    // Implementing sleep() method for Deer
    @Override
    public void sleep() {
        System.out.println("Deer sleeps under trees");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects of Lion, Tiger, and Deer
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Deer deer = new Deer();

        // Calling eat() and sleep() methods for each object
        System.out.println("Lion:");
        lion.eat();
        lion.sleep();
        
        System.out.println("\nTiger:");
        tiger.eat();
        tiger.sleep();
        
        System.out.println("\nDeer:");
        deer.eat();
        deer.sleep();
    }
}
 {
    
}
