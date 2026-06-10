public class FindMinimumElement {
    public static void main(String[] args) {
        
        int[] arr = {12, 5, 18, 2, 9, 7};

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The minimum element is : " + min);
    }
}
