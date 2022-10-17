import java.io.*;
public class Main1084 {  // [기초-종합] 빛 섞어 색 만들기
    private void solution(String rgb) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = rgb.split(" ");
        int cnt = 0;
        for (int i = 0; i < Integer.parseInt(arr[0]); i++) {
            for (int j = 0; j < Integer.parseInt(arr[1]); j++) {
                for (int k = 0; k < Integer.parseInt(arr[2]); k++) {
                    bw.write(i  + " " + j + " " + k + "\n");
                    cnt++;
                }
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
    }

    public static void main(String[] args) throws IOException {
        Main1084 main = new Main1084();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String rgb = br.readLine();

        main.solution(rgb);
        br.close();
    }


}
