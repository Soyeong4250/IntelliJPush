package likelion;

import java.util.Scanner;

public class Pyramid {
    private String letter = "*";

    public Pyramid() {
    }

    public Pyramid(String letter) {
        this.letter = letter;
    }

    private void printStar(int n) {
        /*
             *
            * *
           * * *
          * * * *
         * * * * *
         */
        //  피라미드 모양으로 별 찍기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print(this.letter + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pyramid.printStar(n);
    }

}
