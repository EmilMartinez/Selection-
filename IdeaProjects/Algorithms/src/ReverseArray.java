public class ReverseArray {

    public static void main(String[] args) {

        int arr[] = {3,9,2,3,11,4};

        reverse (arr, start:0, end: arr.length-1);

    for(int i = 0; i<arr.length; i++) {
        System.out.println(arr[i])
    }

    }


    public static int [] reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }









}
