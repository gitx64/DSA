public class SortedPartiallyMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        int target = 11;
    }
    static int[] sorted(int[][] arr, int target){

        // because matrix is sorted we can take middle col

        int row = 0;
        int col = arr.length - 1;

        while (row < arr.length && col >= 0) {
            int mid = row + (col - row)/2;

            
        }

    }   

}
