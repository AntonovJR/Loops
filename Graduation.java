import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int counter = 1;
        double sum = 0;
        while (counter <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4.00) {
                continue;
            }
            sum+=grade;
            counter++;

        }
        double average = sum / 12;
        System.out.printf("%s graduated. Average grade: %.2f", name, average);


    }
}
