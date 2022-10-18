package likelion;

import java.util.Scanner;

public class RepeatExercise {
    private void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*".repeat(n));
        }
    }

    public static void main(String[] args) {
        RepeatExercise repeatExercise = new RepeatExercise();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        repeatExercise.printSquare(n);
    }

}
