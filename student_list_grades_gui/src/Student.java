public class Student {

    private final String name;
    private final int age;

    private final int grade;

    /**
     * Constructor initiziales Student with their name, age and grade
     *
     * @param name  gives back the name of the student
     * @param age   gives back the students name
     * @param grade shows the students grade
     */
    public Student(String name, int age, int grade) {
        if (grade < 1 || grade > 5) throw new IllegalArgumentException("Grade cannot be smaller than 1 or greater 5");
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    /**
     * Age of student
     *
     * @return age of student
     */
    public int getAge() {
        return age;
    }

    /**
     * Grade of student
     *
     * @return students grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * Name of student
     *
     * @return students name
     */
    public String getName() {
        return name;
    }

}