public class DDArray8 {
    public static void main(String args[]){
        int arr[][]={{3,-5,9},{-1,2,7},{-8,-7,1}};
        for(int i=0;i<arr.length;i++){
            int min=arr[i][0];
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<min)
                min=arr[i][j];
            }
            System.out.println(min);
        }
    }
}
