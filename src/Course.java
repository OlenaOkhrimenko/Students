public class Course {
    private String courseName;
    private int courseCode;
    private String students;

    public Course (String courseNameOfCourse, String studentsOfCourse, int courseCodeOfCourse) {
        this.courseName = courseNameOfCourse;
        this.courseCode = courseCodeOfCourse;
        this.students = studentsOfCourse;
    }

    public void addStudent () {
        System.out.println(students + " were added to course " + courseName + "(code: " +  courseCode + ")" );
    }

    public void removeStudent () {
        System.out.println(students + " were removed from course " + courseName + "(code: " +  courseCode + ")" );
    }

}
