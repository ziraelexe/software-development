import java.util.List;

public class StudentController {

    private static GradeList gradeList;
    private static StudentGUIView guiView;

    public static void main(String[] args) {

        gradeList = new GradeList();

        Student student1 = new Student("John", 12, 3);
        Student student2 = new Student("Emily", 11, 2);
        Student student3 = new Student("Michael", 13, 4);
        Student student4 = new Student("Sarah", 12, 3);
        Student student5 = new Student("David", 11, 1);
        Student student6 = new Student("Jessica", 13, 4);
        Student student7 = new Student("Ryan", 12, 2);
        Student student8 = new Student("Olivia", 11, 1);
        Student student9 = new Student("Matthew", 13, 3);
        Student student10 = new Student("Emma", 12, 2);
        Student student11 = new Student("Daniel", 11, 4);
        Student student12 = new Student("Ava", 13, 5);
        Student student13 = new Student("William", 12, 1);
        Student student14 = new Student("Sophia", 11, 3);
        Student student15 = new Student("James", 13, 4);
        Student student16 = new Student("Isabella", 12, 2);
        Student student17 = new Student("Alexander", 11, 5);
        Student student18 = new Student("Mia", 13, 1);
        Student student19 = new Student("Benjamin", 12, 3);
        Student student20 = new Student("Charlotte", 11, 2);

        // Add students to the grade list
        gradeList.addStudent(student1);
        gradeList.addStudent(student2);
        gradeList.addStudent(student3);
        gradeList.addStudent(student4);
        gradeList.addStudent(student5);
        gradeList.addStudent(student6);
        gradeList.addStudent(student7);
        gradeList.addStudent(student8);
        gradeList.addStudent(student9);
        gradeList.addStudent(student10);
        gradeList.addStudent(student11);
        gradeList.addStudent(student12);
        gradeList.addStudent(student13);
        gradeList.addStudent(student14);
        gradeList.addStudent(student15);
        gradeList.addStudent(student16);
        gradeList.addStudent(student17);
        gradeList.addStudent(student18);
        gradeList.addStudent(student19);
        gradeList.addStudent(student20);

        guiView = new StudentGUIView();

        guiView.display();
    }

    public static void filterStudentsByGrade(int grade) {
        List<String> filteredStudents = gradeList.filterStudentsByGrade(grade);
        guiView.updateTextArea(filteredStudents);
    }
}
