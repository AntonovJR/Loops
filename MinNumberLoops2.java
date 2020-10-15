import java.util.Scanner;

public class MinNumberLoops2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int input = Integer.parseInt(scanner.nextLine());
            int counter = 0;

            int min = Integer.MAX_VALUE;

            while (input > counter) {
                counter++;
                int income =  Integer.parseInt(scanner.nextLine());
                if (income < min) {

                    min = income;
                }


            }
            System.out.println(min);
        }
    }

