import java.util.Scanner;
public class Switch4 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter two numbers :: ");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Substraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        int ch=in.nextInt();
        switch (ch) {
            case 1:
                System.out.print(a+b);
                break;
            case 2:
                System.out.print(a-b);
                break;
            case 3:
                System.out.print(a*b);
                break;
            case 4:
                System.out.print(a/b);
                break;
            default:
                System.out.println("Invalid Input");
        }
        in.close();
    }
}
