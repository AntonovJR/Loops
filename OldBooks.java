import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine().toLowerCase();
        int libraryCapacity = (int) Double.parseDouble(scanner.nextLine());

        String currentBook = "";
        double count = 0;
        boolean isFound = false;

        while (!isFound && libraryCapacity > count) {
            currentBook = scanner.nextLine().toLowerCase();
            if (currentBook.equals(bookName)) {
                isFound = true;
                break;
            } else {
                count++;
            }
        }if (isFound){
            System.out.printf("You checked %.0f books and found it.",count);
        }else{
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %.0f books.",count);

        }

    }
}

