import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );

        int age = Integer.parseInt( scanner.nextLine() );
        double wash = Double.parseDouble( scanner.nextLine() );
        int price = Integer.parseInt( scanner.nextLine() );

        int even = age / 2;
        int toys = age - even;

        int maxEven = age - age % 2;
        int cash = 5 * (int)(maxEven * ((maxEven / 4.00) + 0.5));

        int c = cash + (toys * price) - even;

        if (c >= wash) System.out.printf( "Yes! %.2f", (double) (c - wash) );
        else System.out.printf( "No! %.2f", (double) (wash - c) );


    }
}