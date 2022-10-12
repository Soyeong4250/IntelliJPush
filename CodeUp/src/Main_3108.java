import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Info implements Comparator<Info> {
    private int num;
    private String name;

    public Info(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compare(Info o1, Info o2) {
        return o1.getNum() - o2.getNum();
    }
}

public class Main_3108 {  // 정올 참여 학생 리스트 만들기 1
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        List<Info> list = new ArrayList<>();
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String code = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            Info info = new Info(num, name);
            if (code.equals("I")) {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getNum() == info.getNum()) {
                        list.remove(i);
                        list.add(info);
                    } else {
                        list.add(info);
                    }
                }
                System.out.println("I 입니다");
                System.out.println(list);
            } else {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getNum() == info.getNum()) {
                        list.remove(i);
                    }
                }
            }

            System.out.println(list);
        }
    }

}
