import java.util.Scanner;

public class OrderAgnoBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] arr = new int[5];

        System.out.print("Enter the elements of the array: ");

        for (int j = 0; j < arr.length; j++) {
            arr[j] = s.nextInt(); 
        }
        s.close();

        int target = arr[3];

        if (OrdBinary(arr, target) == -1) {
            System.out.println("Item not found");
        }else System.out.println(OrdBinary(arr,target));

    }

    static int OrdBinary(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] < arr[end]) {//incremental array

            while (start <= end) {
                int mid = start + (end - start)/2; // for long index purpose.
                
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

       else { //decremental array

        while (start <= end) {
            int mid = start + (end - start)/2; // for long index purpose.
            
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
}
