public class FaangBinary {
    public static void main(String[] args) {
        int[] arr = {11,14,16,17,19,23};
        int target = 15;

        System.out.println(ceiling(target,arr));
    }

    static int ceiling(int target,int[] arr){
        
        

            int start = 0;
            int end = arr.length - 1;
    
            while (start <= end) {
                int mid = start + (end - start)/2; // for long index purpose.
                
                if (target > arr[mid]) {
                    
                    start = mid + 1 ;
    
                }
                else if (target < arr[mid]) {
                    
                    end = mid - 1;
                }
                else if (target == arr[mid]) {
                    
                    return arr[mid];
                }
            }

            return arr[end];
        }    
    
    }

