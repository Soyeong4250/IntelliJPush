import java.io.*;
import java.util.StringTokenizer;

public class Main3014 {  // 정렬을 빠르게!
    private void solution(int[] arr, int maxIdx) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= maxIdx; i++) {
            if(arr[i] > 0) {
                for (int j = 0; j < arr[i]; j++) {
                    sb.append(i + " ");
                }
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        Main3014 main = new Main3014();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[100000];

        int maxIdx = -1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int idx = Integer.parseInt(st.nextToken())-1;
            arr[idx]++;
            maxIdx = Math.max(maxIdx, idx);
        }
        br.close();

        main.solution(arr, maxIdx);

    }
}
