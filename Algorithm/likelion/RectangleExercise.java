package likelion;

import java.util.Scanner;

public class RectangleExercise {
    private void printRectangle(int x, int y) {
        for (int i = 0; i < x; i++) {
            System.out.println("*".repeat(y));
        }
    }

    public static void main(String[] args) {
        RectangleExercise rectangleExercise = new RectangleExercise();
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        rectangleExercise.printRectangle(x, y);
        sc.close();
    }
}
