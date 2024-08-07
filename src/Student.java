import com.sun.org.apache.xpath.internal.objects.XString;

public class Student {
    private final String firstName;
    private final String lastName;
    private final int studentId;
    private final String courses;


    public Student(String firstNameOfStudent, String lastNameOfStudent, int studentIdOfStudent, String coursesOfStudent) {
        this.firstName = firstNameOfStudent;
        this.lastName = lastNameOfStudent;
        this.studentId = studentIdOfStudent;
        this.courses = coursesOfStudent;
    }

        public void enrollInCourse () {
            System.out.println(firstName + " " + lastName + " (сode: " + studentId + ")" + " enrolled to " + "course: " + courses);
        }

    public void withdrawFromCourse () {
        System.out.println(firstName + " " + lastName + " (сode: " + studentId + ")" + " withdraw from course "  + courses);
    }
    }


