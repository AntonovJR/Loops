import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String password = scanner.nextLine().toLowerCase();
        String input = scanner.nextLine().toLowerCase();
        while (!input.equals(password)){
            input = scanner.nextLine().toLowerCase();
        }
        System.out.printf("Welcome %s!",name);
    }
}
