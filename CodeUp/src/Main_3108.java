import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_3108 {  // 정올 참여 학생 리스트 만들기 1

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, String>infoHash = new HashMap<>();
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String code = st.nextToken();
            int no = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            if(code.equals("I")) {
                infoHash.put(no, name);
            } else if (code.equals("D")) {
                infoHash.remove(no);
            }
            System.out.println(infoHash);
        }

        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            System.out.println(Integer.parseInt(st.nextToken()));
            System.out.println(infoHash.get(Integer.parseInt(st.nextToken())-1));
        }
    }

}
