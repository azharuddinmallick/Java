import java.util.Scanner;
public class Neon {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int sq=num*num,n=0;
        while (sq!=0) {
            n+=(sq%10);
            sq/=10;
        }
        if(num==n)
        System.out.println("Neon Number");
        else
        System.out.println("Not Neon Number");
        in.close();
    }
}
