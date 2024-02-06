import java.util.Scanner;
public class Switch2 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Press 1 for Odd Even Program");
        System.out.println("Press 2 for Prime Number Program");
        int ch=in.nextInt();
        switch (ch) {
            case 1:
                System.out.print("Enter a number :: ");
                int b=in.nextInt();
                if(b%2==1)
                    System.out.println("Odd");
                else
                    System.out.println("Even");
                break;
            case 2:
                System.out.print("Enter a number :: ");
                int a=in.nextInt();
                int ctr=0;
                for(int i=1;i<=a;i++){
                    if(a%i==0)
                    ctr+=1;
                }
                if(ctr==2)
                System.out.println("Prine Number");
                else
                System.out.println("Not Prine Number");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        in.close();
    }
}
