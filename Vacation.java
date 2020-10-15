import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double needMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());

        int daysCounter = 0;
        int spendingCounter = 0;

        while (ownedMoney < needMoney && spendingCounter < 5) {
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            daysCounter++;

            if ("save".equals(command)) {
                ownedMoney += money;
                spendingCounter = 0;
            } else if ("spend".equals(command)) {
                ownedMoney -= money;
                spendingCounter++;
                if (ownedMoney < 0) {
                    ownedMoney = 0;
                }
            }
        }
        if (spendingCounter == 5) {
            System.out.println("You can't save the money.");
            System.out.println(daysCounter);
        }
        if (ownedMoney >= needMoney) {
            System.out.printf("You saved the money for %d days.", daysCounter);
        }

    }
}
