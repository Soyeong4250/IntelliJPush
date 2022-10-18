package likelion;

import java.util.Scanner;

public class Diamond {
    private String letter = "*";

    public Diamond() {
    }

    public Diamond(String letter) {
        this.letter = letter;
    }

    private void printStar(int n) {
        /*
                *
               * *
              * * *
               * *
                *
         */
        //  마름모 모양으로 별 찍기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print(this.letter + " ");
            }
            System.out.println();
        }
        for (int i = n-1; i > 0; i--) {
            for (int j = n-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(this.letter + " ");
            }
            System.out.println();
        }

    }
    private void printStart2(int n) {
        /*
           *
          ***
         *****
          ***
           *
        */

        // 마름모 모양으로 별 찍기 (홀수)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print(this.letter);
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*(n-i)-1; j++) {
                System.out.print(this.letter);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Diamond diamond = new Diamond();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        diamond.printStar(n);
        System.out.println("------------------");
        diamond.printStart2(n);
    }


}
