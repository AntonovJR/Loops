import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unsatisfyingScore = Integer.parseInt(scanner.nextLine());

        String problemName = "";
        String currentProblem = "";
        int score = 0;
        int currentUnsatisfyingScore = 0;
        int numberOfProblems = 0;
        double averageScore = 0;
        int totalScore = 0;
        boolean isEnough = false;

        while (unsatisfyingScore > currentUnsatisfyingScore) {
            problemName = scanner.nextLine();

            if (problemName.equals("Enough")) {
                isEnough = true;
                break;
            }

            score = Integer.parseInt(scanner.nextLine());
            if (score <= 4) {
                currentUnsatisfyingScore++;
            }
            totalScore += score;
            numberOfProblems++;
            currentProblem = problemName;
            if (currentUnsatisfyingScore == unsatisfyingScore) {
                break;
            }
        }
        averageScore = 1.0 * totalScore / numberOfProblems;

        if (isEnough) {
            System.out.printf("Average score: %.2f%n" +
                    "Number of problems: %d%n" +
                    "Last problem: %s", averageScore, numberOfProblems, currentProblem);
        } else {
            System.out.printf("You need a break, %d poor grades.", unsatisfyingScore);
        }
    }
}