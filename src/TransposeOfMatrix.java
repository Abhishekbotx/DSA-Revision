public class TransposeOfMatrix {
    public static void main(String[] args) {
        int [][] matrix={
                {2,4,-1,11},
                {-10,5,12,14},
                {18,-7,6,8}
        };
        int r=matrix.length;
        int c=matrix[0].length;

        int [][] matrix2=new int[c][r];

        for (int row=0;row<matrix.length;row++){
            for (int col=0;col<matrix[0].length;col++){
                matrix2[col][row]=matrix[row][col];
                System.out.println(matrix[row][col]);
            }
            System.out.println();
        }

        for (int row=0;row<matrix2.length;row++){
            for (int col=0;col<matrix2[0].length;col++){
                System.out.print(matrix2[row][col]);
            }
            System.out.println();
        }
    }
}
