package List;

import java.util.List;

public class ListExerciseMain {

    public static void main(String[] args) {
        ListExercise listExercise = new ListExercise();

        /*List<String> students = listExercise.getStudents();

        System.out.println("List에 있는 학생 이름을 출력합니다.");
        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("총 인원은 " + students.size()); */


       List<Student> studentObjs = listExercise.getStudentObjs();
        System.out.println("List에 있는 학생 정보를 출력합니다.");
        for (Student student : studentObjs) {
            System.out.println(student.toString());
        }

    }

}

