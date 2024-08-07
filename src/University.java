public class University {

    private final String student;
    private final String course;
    private final String universityName;


    public University (String studentOfUniversity, String courseOfUniversity, String universityNameOfUniversity) {
        this.student = studentOfUniversity;
        this.course = courseOfUniversity;
        this.universityName = universityNameOfUniversity;
    }
    public void addStudent() {
        System.out.println("Student " + student + " added to " + universityName);
    }
    public void removeStudent () {
        System.out.println("Student " + student + " removed from " + universityName);
    }
    public void addCourse () {
        System.out.println("Course " + course + " added to " + universityName);
    }
    public void removeCourse () {
        System.out.println("Course " + course + " removed from " + universityName);
    }
}
