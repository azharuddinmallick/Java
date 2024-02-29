class Shape {
    void draw() {}
    double calculateArea() { return 0; }
}

class Circle extends Shape {
    double radius;
    void draw() {
        System.out.println("Circle");
    }
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    double side;
    void draw() {
        System.out.println("Square");
    }
    double calculateArea() {
        return side * side;
    }
}

class Triangle extends Shape {
    double base;
    double height;
    void draw() {
        System.out.println("Triangle");
    }
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class DataAbstraction2 {
    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.radius = 5;
        System.out.println("Circle Area: " + cir.calculateArea());
        
        Square s = new Square();
        s.side = 4;
        System.out.println("Square Area: " + s.calculateArea());
        
        Triangle t = new Triangle();
        t.base = 3;
        t.height = 4;
        System.out.println("Triangle Area: " + t.calculateArea());
    }    
}
