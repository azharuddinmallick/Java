import java.util.Scanner;
public class Switch3 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Press 1 for Armstrong Program");
        System.out.println("Press 2 for Palindrome Program");
        int ch=in.nextInt(),x,y,z=0;
        switch (ch) {
            case 1:
                System.out.print("Enter a number :: ");
                x=in.nextInt();
                y=x;
                while(y!=0){
                    int r=y%10;
                    z+=(r*r*r);
                    y/=10;
                }
                if(z==x)
                System.out.println("Armstrong Number");
                else
                System.out.println("Not Armstrong Number");
                break;
            case 2:
                System.out.print("Enter a number :: ");
                x=in.nextInt();
                y=x;
                while(y!=0){
                    z=z*10+(y%10);
                    y/=10;
                }
                if(z==x)
                System.out.println("Palindrome Number");
                else
                System.out.println("Not Palindrome Number");
                break;
                default:
                System.out.println("Invalid Input");
        }
        in.close();
    }
}
