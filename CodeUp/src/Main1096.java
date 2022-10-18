import java.util.Scanner;

public class Main1096 {  // [기초-2차원배열] 바둑판에 흰 돌 놓기
    private void play(int[][] board, int x, int y) {
        board[x][y] = 1;
    }

    private void print(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            } System.out.println();
        }
    }

    public static void main(String[] args) {
        Main1096 main = new Main1096();
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[19][19];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            main.play(board, x-1, y-1);
        }

        main.print(board);
    }


}
