public class WaveArray {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        //agr col ka value col.no%2=0 hai matlab upar se niche lenge and if col.no % 2!=0 toh niche se upar

        for(int c=0;c<arr[0].length;c++){
            if(c%2==0){
               for (int r=0;r< arr.length;r++){
                   System.out.println(""+arr[r][c]);
               }
            }else {
                for (int r=arr.length-1;r>=0 ;r--){
                    System.out.println(""+arr[r][c]);
                }
            }
            System.out.println();
        }
    }
}
