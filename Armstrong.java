public class Armstrong {
    public static void main(String args[]){
        int x=153;
        int y=x,z=0;
        while(y!=0){
            int r=y%10;
            z+=(r*r*r);
            y/=10;
        }
        if(z==x)
        System.out.println("Armstrong Number");
        else
        System.out.println("Not Armstrong Number");
    }
}
