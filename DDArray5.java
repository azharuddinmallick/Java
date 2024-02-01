public class DDArray5 {
    public static void main(String args[]){
        int arr[][]={{3,-5,9},{-1,2,7},{-8,-7,1}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<0)
                System.out.print("   ");
                else
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
