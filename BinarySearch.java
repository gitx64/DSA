public class BinarySearch {
    public static void main(String[] args) {
        
        int[] arr = {22,33,44,55,67,89,90};

        int target = 44;

        if (binary(arr, target) == -1) {
            System.out.println("item not found");
        }

        System.out.println(binary(arr,target));
    }

    static int binary(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2; // for long index purpose.
            
            if (target > arr[mid]) {
                
                start = mid + 1;

            }
            else if (target < arr[mid]) {
                
                end = mid - 1;
            }
            else if (target == arr[mid]) {
                
                return mid;
            }
        }

        return -1;
        
    }
}
