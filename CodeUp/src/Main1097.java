import java.util.Scanner;

public class Main1097 {  // [기초-2차원배열] 바둑알 십자 뒤집기
    private int[][] solution(int[][] map, int x, int y) {
        for (int i = 0; i < 19; i++) {
            if(map[x][i] == 1){
                map[x][i] = 0;
            }else {
                map[x][i] = 1;
            }
            if(map[i][y] == 1) {
                map[i][y] = 0;
            } else {
                map[i][y] = 1;
            }
        }

        return map;
    }

    private void print(int[][] result) {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main1097 main = new Main1097();
        Scanner sc = new Scanner(System.in);

        int[][] map = new int[19][19];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int T = sc.nextInt();
        int[][] result = null;
        for (int t = 0; t < T; t++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            result = main.solution(map, x-1, y-1);
        }

        main.print(result);
        sc.close();
    }

}
