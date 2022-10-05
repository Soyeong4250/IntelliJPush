package collection;

import java.util.List;
import java.util.ArrayList;

public class LikeLion2th {
    private List<String> students = new ArrayList<>();
    private List<Student> studentObjs = new ArrayList<>();

    Names names = new Names();
    public LikeLion2th() {
        Names names = new Names();
        this.students = names.getNames();
        this.studentObjs = names.getStudentObjs();
    }

    // 멋사자 2기 학생의 이름이 들어있는 list를 return 하는 method
    public List<String> getStudentList() {
        return this.students;
    }


    // 멋사자 2기 학생들의 학급, 이름, Git 주소가 들어있는 List를 return하는 method
    public List<Student> getStudentObjsList() {
        return this.studentObjs;
    }


}
