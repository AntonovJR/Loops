import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stepsGoal = 10000;

        String input = scanner.nextLine();
        int steps = 0;

        while(!input.equals("Going home")) {
            steps += Integer.parseInt(input);
            if(steps >= stepsGoal) {
                break;
            }
            input = scanner.nextLine();
        }

        if(input.equals("Going home")) {
            input = scanner.nextLine();
            steps += Integer.parseInt(input);
        }

        if(steps >= stepsGoal) {
            System.out.println("Goal reached! Good job!");
        } else {
            System.out.printf("%d more steps to reach goal.", stepsGoal - steps);
        }
    }
}