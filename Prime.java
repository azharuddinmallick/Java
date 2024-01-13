import java.util.Scanner;
public class Prime {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
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
        in.close();
    }    
}
