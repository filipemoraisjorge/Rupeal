import java.util.InputMismatchException;
import java.util.Scanner;

public class Rupeal {


    private long fx(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        if (n < 0) {
            //negafibonacci
            return fx(-n) * (int) Math.pow(-1, n + 1);
        }

        //fib
        return fx(n - 2) + fx(n - 1);


    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        try {

            System.out.print("Input a number: ");

            int n = keyboard.nextInt();

            Rupeal r = new Rupeal();

            System.out.println("F(" + n + ") " + r.fx(n) + " ");

            System.out.println();

            System.out.println("Please send the solution, sequence name and your cv to jobsatrupeal.com");

        } catch (InputMismatchException ex) {

            System.out.println("Please insert an Integer.");

            main(args);

            keyboard.close();

        }

    }
}