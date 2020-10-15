import java.util.Scanner;

public class MaxNumberLoops2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        int max = Integer.MIN_VALUE;

        while (input > counter) {
            counter++;
            int income =  Integer.parseInt(scanner.nextLine());
            if (income > max) {

                max = income;
            }


        }
        System.out.println(max);
    }
}