package Problem.Sloving;

public class FibonacciSeries {

    public static void main(String[] args) {
        int next = 0;
        int perv = 1;
        for(int i=0; i<10; i++){ // we can go up to 100 = over flow.
            System.out.println(next);
            next = next + perv;
            prev = next - perv;
        }
    }



}
