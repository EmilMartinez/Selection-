public class FibonacciTest1 {

    public static void main(String[] args) {
// 01135813

        int maximum = 10;
        int num1 = 0;
        int num2 = 1;
        {
            for (int i = 0; i < maximum; i++) {
                System.out.println(num1);
                int total = num1 + num2;
                num1 = num2;
                num2 = total;

            }
        }


    }
}