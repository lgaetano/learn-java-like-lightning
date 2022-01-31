

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Lia", "Bobia", 2022, 3.65, "Classics");

        System.out.println(student1.firstName);
        System.out.println(student1.gradYear);
        student1.incrementGradYear();
        System.out.println(student1.gradYear);
    }

}
