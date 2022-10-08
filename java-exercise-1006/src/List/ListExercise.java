package List;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

    private List<String> students;
    private List<Student> studentObjs;

    public ListExercise() {
        this.students = new ArrayList<>();
        this.students.add("권하준");
        this.students.add("조성윤");
        this.students.add("안예은");
        this.students.add("남우빈");
        this.students.add("최경민");

        this.studentObjs = new ArrayList<>();
        this.studentObjs.add(new Student(1,"권하준","https://github.com/dongyeon-0822/java-project-exercise"));
        this.studentObjs.add(new Student(1,"조성윤","https://github.com/kang-subin/Java"));
        this.studentObjs.add(new Student(3,"안예은","https://github.com/KoKwanwun/LikeLion.git"));
        this.studentObjs.add(new Student(1,"남우빈","https://github.com/lcomment/Algorithm_Solution--Java/tree/main/LikeLion"));
        this.studentObjs.add(new Student(2,"최경민","https://github.com/cmkxak/likelion-java-course"));
    }

    public List<String> getStudents() {
        return students;
    }
    public List<Student> getStudentObjs() {
        return studentObjs;
    }

}
