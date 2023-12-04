import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GradeList {

    private ArrayList<Student> students;

    public GradeList() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int index) {
        students.remove(index);
    }

    public Student getStudent(int index) {
        return students.get(index);
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public void printStudents() {
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Grade: " + student.getGrade());
            System.out.println();
        }
    }

    /**
     * @param grade input of grade which students are filtered by
     * @return list of students who have @param grade
     */
    public List<String> filterStudentsByGrade(int grade) {
        if (grade < 1 || grade > 5) throw new IllegalArgumentException();
        return students.stream()
                .filter(student -> student.getGrade() == grade)
                .map(Student::getName)
                .collect(Collectors.toList());
    }
}
