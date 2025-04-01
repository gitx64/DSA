import java.util.Arrays;
// import java.util.Scanner;

public class Binary2dArray {
    public static void main(String[] args) {

        // Scanner s = new Scanner(System.in);
        int[][] arr = { {1,2,3},
                        {4,5,6},
                        {7,8,9} };

        // for (int row = 0; row < arr.length; row++) {
        //     for (int col = 0; col < arr.length; col++) {
        //         arr[row][col] = s.nextInt();
        //     }
        // }

        int target = 8;
        // s.close();

        
        if (binary2d(arr,target) == new int[]{-1,-1}) {
            System.out.println("Item not found");
        }

        
        System.out.println("answer found at "+Arrays.toString(binary2d(arr,target)));
    }

    static int[] binary2d(int[][] arr, int target){
        
        int row = 0;
        int col = arr.length - 1;


        while (row < arr.length && col >= 0) {

            if (target == arr[row][col]) {
                return new int[]{row,col};
            }

            else if (arr[row][col] < target) {
                row++;
            }
            else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
