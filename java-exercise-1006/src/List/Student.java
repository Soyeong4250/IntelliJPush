package List;

public class Student {
    private int classNo;
    private String name;
    private String gitRepositoryAddress;

    public Student(int classNo, String name, String gitRepositoryAddress) {
        this.classNo = classNo;
        this.name = name;
        this.gitRepositoryAddress = gitRepositoryAddress;
    }

    @Override
    public String toString() {
        String result = String.format("%d, %4s,%-80s",this.classNo,this.name,this.gitRepositoryAddress);
        return result;
    }
}
