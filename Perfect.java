import java.util.Scanner;
public class Perfect {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int n=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
            n+=i;
        }
        if(num==n)
        System.out.println("Perfect Number");
        else
        System.out.println("Not Perfect Number");
        in.close();
    }
}
