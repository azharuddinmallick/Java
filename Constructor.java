// Create a Java program to model a simple car rental system. The system should allow users to rent a car and display the details of rented cars.

// Your task is to implement a Car class with the following specifications:

// The Car class should have private instance variables for color, model, year, and rentalStatus.
// It should have a constructor that initializes color, model, and year when a new Car object is created, and sets rentalStatus to false initially.
// Implement getter methods to retrieve the values of the instance variables.
class Car{
    private String color,model;
    private int year;
    private boolean status = false;
    Car(String color,String model,int year,boolean status){
        this.color=color;
        this.model=model;
        this.year=year;
        this.status=status;
    }
    public void getter(){
        System.out.println("Color : "+color);
        System.out.println("Model : "+model);
        System.out.println("Year : "+year);
        System.out.println("Status : "+status);
    }

}
public class Constructor {
    public static void main(String args[]){
        Car cr=new Car("Red","Mustang",1999,true);
        Car cr1=new Car("Blue","Bugatti",2000,true);
        Car cr2=new Car("Green","Porsche",2001,true);
        Car cr3=new Car("Yellow","Lambo",2002,true);
        cr.getter();
        cr1.getter();
        cr2.getter();
        cr3.getter();
    }
}
