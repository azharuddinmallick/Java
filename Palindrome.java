public class Palindrome {
    public static void main(String args[]){
        int x=121;
        int y=x,z=0;
        while(y!=0){
            z=z*10+(y%10);
            y/=10;
        }
        if(z==x)
        System.out.println("Palindrome Number");
        else
        System.out.println("Not Palindrome Number");
    }
}
