public class Pattern3 {
    public static void main(String[] args) {
        int n=9;
        int trows=n;
        int stars=1;

        for(int row=1;row<=trows;row++) {
            //working

            for (int cst=1;cst<=stars;cst++){
                System.out.print("* ");
            }
            //prepping to next row
            System.out.println();

            if (row<=trows/2){
                stars++;
            }else {
                stars--;
            }
        }

    }
}
