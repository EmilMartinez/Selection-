public class Selsction {

    public static void main(String[] args) {

    int [] arr = {9,5,6,1,4,10,2,3};
    int min;
    for (int j = 0; j <array.length; j++){
        min = j; // assigning j to the minimum.
        for(int i=j+1; i=array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
        }
            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }
        for (int n=0; n<array.length; n++){
            System.out.println(array[n]);

        }

    }

}
