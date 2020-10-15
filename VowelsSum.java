import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int sume = 0;
        int sumi = 0;
        int sumo = 0;
        int sumu = 0;
        String s = scanner.nextLine().toLowerCase();
        for (int i = 0; i <= s.length() - 1; i++)
        {
            if (s.charAt(i) == 'a')
                suma++;
            else if (s.charAt(i) == 'e')
                sume += 2;
            else if (s.charAt(i) == 'i')
                sumi += 3;
            else if (s.charAt(i) == 'o')
                sumo += 4;
            else if (s.charAt(i) == 'u')
                sumu += 5;
        }
        int resultSum = suma + sume + sumi + sumo + sumu;
        System.out.println(resultSum);
    }
}
