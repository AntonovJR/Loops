import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int widthOfCake = Integer.parseInt(scanner.nextLine());
        int lengthOfCake = Integer.parseInt(scanner.nextLine());

        int leftPieces = widthOfCake * lengthOfCake;
        String input = scanner.nextLine();

        while(!input.equals("STOP")) {
            leftPieces -= Integer.parseInt(input);

            if (leftPieces <= 0) {
                break;
            }

            input = scanner.nextLine();
        }

        if(leftPieces >= 0) {
            System.out.printf("%d pieces are left.", leftPieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(leftPieces));
        }
    }
}