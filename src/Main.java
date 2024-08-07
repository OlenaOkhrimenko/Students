public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Olena", "Okhrimenko", 1, "QA tester");
        Student student2 = new Student("Olha", "Ivanova", 2, "Java");
        Student student3 = new Student("Kateryna", "Gusar", 3, "Python");
        Student student4 = new Student("Oleh", "Nikolayev", 4, "c++");
        Student student5 = new Student("Volodymyr", "Okhrimenko", 5, "QA tester");
        Student student6 = new Student("Nik", "Jerson", 6, "QA tester");

        Course course1 = new Course("QA tester", "Olena Okhrimenko, Volodymyr Okhrimenko, Nik Jerson", 10);
        Course course2 = new Course("Java", "Olha Ivanova", 20);

        University university = new University("Olena Okhrimenko", "QA tester", "State University");

        student1.enrollInCourse();
        student2.enrollInCourse();
        student3.enrollInCourse();
        student4.enrollInCourse();
        student5.enrollInCourse();
        student6.enrollInCourse();
        student1.withdrawFromCourse();
        student2.withdrawFromCourse();
        student3.withdrawFromCourse();
        course1.addStudent();
        course2.removeStudent();
        university.addStudent();
        university.removeStudent();
        university.addCourse();
        university.removeCourse();

    }
}

