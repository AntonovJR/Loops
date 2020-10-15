import java.util.Scanner;

public class SequenceLoops2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;
        System.out.println(num);;
        while (2*num+1<=n)
        {
            num = num * 2 + 1;
            System.out.println(num);;
    }
}
}