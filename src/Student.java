public class Student {
    String firstName;
    String lastName;
    int gradYear;
    double GPA;
    String major;

    public Student(String firstName,
                    String lastName,
                    int gradYear,
                    double GPA,
                    String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        this.GPA = GPA;
        this.major = major;
    }

    public int incrementGradYear() {
        gradYear += 1;
        return gradYear;
    }

}