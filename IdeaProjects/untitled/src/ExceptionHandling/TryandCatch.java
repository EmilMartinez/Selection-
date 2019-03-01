package ExceptionHandling;

import java.util.Scanner;

public class TryandCatch {
    public static void main(String[] args) throws Exception {
        Scanner big = new Scanner(System.in);
        try {
            System.out.println("How is the weather outside?");
            String answer = big.next();
            big.close();
            System.out.println("It is:" + answer);
        } catch (Exception e) {
            System.out.println("change it.");
            System.out.println("What company is the highest earning company in the world?");
            String corp = big.next();
            big.close();
            System.out.println("The highest earning company is:" + corp);
        }


    }












}
