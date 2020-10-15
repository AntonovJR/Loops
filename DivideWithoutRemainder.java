import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counterP2 = 0;
        int counterP3 = 0;
        int counterP4 = 0;


        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num % 4 == 0) {
                counterP4++;
            } if (num % 3==0){
                counterP3++;
            } if(num % 2 == 0)
            counterP2++;


        }
        System.out.printf("%.2f%%%n", (double) counterP2 / n * 100);
        System.out.printf("%.2f%%%n", (double) counterP3 / n * 100);
        System.out.printf("%.2f%%%n", (double) counterP4 / n * 100);


    }
}
