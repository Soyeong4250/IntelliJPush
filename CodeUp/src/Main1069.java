import java.util.Scanner;

public class Main1069 {
    private String solution(String grade) {
        switch (grade) {
            case "A" :
                return "best!!!";
            case "B" :
                return "good!!";
            case "C" :
                return "run!";
            case "D" :
                return "slowly~";
            default :
                return "what?";
        }
    }

    public static void main(String[] args) {
        Main1069 main = new Main1069();
        Scanner sc = new Scanner(System.in);
        String grade = sc.next();

        String result = main.solution(grade);
        System.out.println(result);
        sc.close();
    }

}
