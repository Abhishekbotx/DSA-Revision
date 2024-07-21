public class RotateArrayKTimes {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 0, 1};
        int n=arr.length;
        int k=2;
        k=k%n;

        for (int i=0;i<=n;i++){
            if(i<k){
                System.out.println(arr[n+i-k]);
            }else{
                System.out.println(arr[i-k]);
            }
        }
    }
}
