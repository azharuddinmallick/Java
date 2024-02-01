public class DDArray6 {
    public static void main(String args[]){
        int arr[][]={{3,-5,9},{-1,2,7},{-8,-7,1}};
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            System.out.println(sum);
        }
    }
}
