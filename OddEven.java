import java.util.Scanner;
public class OddEven {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        if(a%2==1)
            System.out.println("Odd");
        else
            System.out.println("Even");
        in.close();
    }
}
