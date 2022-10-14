import java.util.Arrays;
import java.util.Scanner;

public class Main1099 { // [기초-2차원배열] 성실한 개미
    private int[][] solution(int[][] map, int sr, int sc) {
        int[] dr = {0, 1};  // → ↓
        int[] dc = {1, 0};  // → ↓

        while(true){
            if(map[sr][sc] == 2) {  // 먹이가 있다면
                map[sr][sc] = 9;
                break;
            }

            map[sr][sc] = 9;

            int nr = sr + dr[0];
            int nc = sc + dc[0];

            if(map[nr][nc] == 1) {  // 벽이라면 아래로 이동
                nr = sr + dr[1];
                nc = sc + dc[1];
            }

            if(map[nr][nc] == 1) {  // 아래쪽도 벽이라면
                break;
            }

            sr = nr;
            sc = nc;
        }

        return map;
    }

    public static void main(String[] args) {
        Main1099 main = new Main1099();
        Scanner input = new Scanner(System.in);

        int[][] map = new int[10][10];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = input.nextInt();
            }
        }

        int[][] result = main.solution(map, 1, 1);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }

}
