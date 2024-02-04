import java.util.Scanner;
public class Spy {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int sum=0,pro=1;
        while(num!=0){
            int l=num%10;
            sum+=l;
            pro*=l;
            num/=10;
        }
        if(sum==pro)
            System.out.println("Spy Number");
        else
            System.out.println("Not Spy Number");
        in.close();
    }
}
