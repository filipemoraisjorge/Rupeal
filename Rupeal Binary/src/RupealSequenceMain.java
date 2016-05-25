import java.util.Scanner;



public class RupealSequenceMain {

    private static int calcSequence(int n) {

        if (n % 2 == 0) {

            n /= 2;

        } else {

            n = n * 2 + 2;

        }

        return n;

    }


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Input a number: ");

        int n = keyboard.nextInt();


        System.out.print("Sequence: " + n + " ");


        int count = 1;

        while (n != 1) {

            n = calcSequence(n);

            System.out.print(n + " ");

            count++;

        }


        keyboard.close();


        System.out.println();

        System.out.println("Counter: " + count);

        System.out.println("Please send the solution and your cv to jobs@rupeal.com");

    }

 

    /*

     * Examples

     * 

     * Number: 140 

     * Sequence: 140 70 35 72 36 18 9 20 10 5 12 6 3 8 4 2 1

     * Counter: 17

     * 

     * Number: 180 

     * Sequence: 180 90 45 92 46 23 48 24 12 6 3 8 4 2 1 

     * Counter: 15

     * 

     * Number: 300 

     * Sequence: 300 150 75 152 76 38 19 40 20 10 5 12 6 3 8 4 2 1

     * Counter: 18

     * 

     */



}