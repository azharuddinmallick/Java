
abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
}

class Lion extends Animal {
    public void eat() {
        System.out.println("Lion eats meat");
    }
    public void sleep() {
        System.out.println("Lion sleeps on rocky terrain");
    }
}

class Tiger extends Animal {
    public void eat() {
        System.out.println("Tiger eats meat and occasionally fruits");
    }
    public void sleep() {
        System.out.println("Tiger sleeps in dense forests");
    }
}

class Deer extends Animal {
    public void eat() {
        System.out.println("Deer eats grass and leaves");
    }
    public void sleep() {
        System.out.println("Deer sleeps under trees");
    }
}

public class DataAbstraction {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Deer deer = new Deer();

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
