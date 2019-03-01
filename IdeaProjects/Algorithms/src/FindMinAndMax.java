import java.sql.SQLOutput;

public class FindMinAndMax {

    int arr[] = {21, 4, 1, 2, 9, 6, 3, 5, 8, 11, 13};
    // 1. find the smallest number of the array
    int smallestNumber = findMin(arr);
    System.out.println("The smallest number from the array is" + smallestNumber);

    // 2. Find the largest number of the array:
    int lasgestNumber = findMax(arr);

}
public static int findMin(int arr[]) {
    int smallestNum = arr[0]; //21
    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] < smallestNum) {
            smallestNum = arr[i];
        }
    }
    return smallestNum;
}






}
