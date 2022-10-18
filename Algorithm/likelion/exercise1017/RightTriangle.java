package likelion.exercise1017;

import java.util.Scanner;

public class RightTriangle {
//    private String letter = "*";
    private String letter = "#";

    public RightTriangle() {
    }

    public RightTriangle(String letter) {
        this.letter = letter;
    }

    private void printStar(int n) {
        // 직각 삼각형
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(letter);
            } System.out.println();
        }
    }

    public static void main(String[] args) {
        /*
        *           i = 0 별이 1개
        * *         i = 1 별이 2개
        * * *       i = 2 별이 3개
        * * * *     i = 3 별이 4개
         */

        // for문을 한개 더 사용하여
        // println 말고 print, printf 등을 써서 한 줄로 출력
        RightTriangle rt = new RightTriangle();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rt.printStar(n);
    }

}