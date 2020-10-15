
import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double EvenSum = 0;
        double OddSum = 0;
        double OddMin = Double.MAX_VALUE;
        double OddMax = Double.MIN_VALUE;
        double EvenMin = 1000000000.0;
        double EvenMax = -1000000000.0;

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n ; i++) {

            double num = Double.parseDouble(scan.nextLine());

            if (i % 2 == 0) {
                EvenSum += num;

                if (num > EvenMax) {
                    EvenMax = num;
                }
                if (num < EvenMin) {
                    EvenMin = num;
                }
            } else {
                OddSum += num;

                if ( num > OddMax) {
                    OddMax = num;
                }
                if ( num < OddMin) {
                    OddMin = num ;
                }
            }
        }
        if (n == 0) {
            System.out.printf("OddSum=%.2f,%n",OddSum);
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
            System.out.printf("EvenSum=%.2f,%n", EvenSum);
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else if ( (EvenMin == Double.MAX_VALUE) || (EvenMax == Double.MIN_VALUE) ) {
            System.out.printf("OddSum=%.2f,%n",OddSum);
            System.out.printf("OddMin=%.2f,%n", OddMin);
            System.out.printf("OddMax=%.2f,%n", OddMax);
            System.out.printf("EvenSum=%.2f,%n",EvenSum);
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("OddSum=%.2f,%n",OddSum);
            System.out.printf("OddMin=%.2f,%n", OddMin);
            System.out.printf("OddMax=%.2f,%n", OddMax);
            System.out.printf("EvenSum=%.2f,%n", EvenSum);
            System.out.printf("EvenMin=%.2f,%n", EvenMin);
            System.out.printf("EvenMax=%.2f %n", EvenMax);
        }
    }
}