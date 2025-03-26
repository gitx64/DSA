public class linearsearch{
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,77};

        System.out.println(Evencheck(arr));
    }

    static int Evencheck(int[] arr){
        int count = 0;
        for (int i : arr) {
            if (Integer.toString(i).length() % 2 == 0) {
                count ++;
            }
        }
        return count;
    }
}