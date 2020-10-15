import java.util.Scanner;

public class SumNumbersLoop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sum = 0;
        while(!input.equals("Stop")){
            int currentNum = Integer.parseInt(input);
            sum+=currentNum;
            input = scanner.nextLine();
        }
        System.out.println(sum);
    }
}
