import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1098 {  // [기초-2차원배열] 설탕과자 뽑기
    private int[][] solution(int[][] map, int l, int d, int x, int y) {
        if(d == 0) {  // 가로 방향
            for (int i = 0; i < l; i++) {
                map[x][y+i] = 1;
            }
        }else {  // 세로 방향
            for (int i = 0; i < l; i++) {
                map[x+i][y] = 1;
            }
        }
        return map;
    }

    public static void main(String[] args) throws IOException {
        Main1098 main = new Main1098();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int height = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());
        int[][] map = new int[height][width];

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken())-1;
            int y = Integer.parseInt(st.nextToken())-1;
            map = main.solution(map, l, d, x, y);
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        br.close();
    }
}
