package collection;

import java.util.List;
import java.util.ArrayList;

// Rename 단축키 : Shift+F6
// 생성자 단축키 : Alt + Ins / Ctrl + a

public class LikeLion2th {
    private List<String> students = new ArrayList<>();

    public LikeLion2th() {
        Names names = new Names();
        this.students = names.getNames();
    }

    // 멋사자 2기 학생의 이름이 들어있는 list를 return 하는 method
    public List<String> getStudentList() {
        return this.students;
    }
}
