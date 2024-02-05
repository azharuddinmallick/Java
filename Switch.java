import java.util.Scanner;
public class Switch {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int ch=in.nextInt();
        switch (ch) {
            case 1:
                System.out.println("First Case");
                break;
            case 2:
                System.out.println("Second Case");
                break;
            default:
            System.out.println("Invalid Input");
                break;
        }
        in.close();
    }
}
