public class DDArray9 {
    public static void main(String args[]){
        int arr[][]={{3,-5,9},{-1,2,7},{-8,-7,1}};
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max)
                max=arr[i][j];
            }
        }
        System.out.println(max);
    }
}
