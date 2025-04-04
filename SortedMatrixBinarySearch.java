import java.util.Arrays;

public class SortedMatrixBinarySearch {
    public static void main(String[] args) {
        int[][] mat = {
            {10,20,30,40},
            {11,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };

        int target = 37;

        int[] ans = binarySorted(mat,target);

        if (Arrays.equals(ans,new int[]{-1,-1})) {
            System.out.println("Item not found");
        }else{
            System.out.println(Arrays.toString(ans));
        }
    }

    static int[] binarySorted(int[][] mat, int target){

       int row = 0;
       int col = mat.length -1;

       while (row < mat.length && col >= 0) {

            if (target == mat[row][col]) {
                return new int[]{row,col};
            }else if (target > mat[row][col] ) {
                row ++;
            }else {
                col --;
            }
       }

       return new int[]{-1,-1};
    }

}
