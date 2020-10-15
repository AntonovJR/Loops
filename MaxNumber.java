import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.println("Enter the numbers: ");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            int num = scanner.nextInt();
            if(num>max){
                max=num;
            }

        }
        System.out.println("max = " +max);

    }
}
