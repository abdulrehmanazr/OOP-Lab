public class Main {
    public static void main(String[] args) {
        Principal principal = new Principal("Dr. Smith", 50, 20);
        School school = new School("Springfield High", "123 Main St", principal);

        Teacher teacher1 = new Teacher("Mr. Johnson", 35, "Math", 101);
        Teacher teacher2 = new Teacher("Ms. Alice", 40, "English", 102);

        ClassRoom class1 = new ClassRoom("Grade 10", "G10", teacher1);
        ClassRoom class2 = new ClassRoom("Grade 11", "G11", teacher2);

        class1.addStudent(new Student("John Doe", 16, 1001));
        class1.addStudent(new Student("Jane Doe", 15, 1002));

        school.addClass(class1);
        school.addClass(class2);

        System.out.println(school.toString());
    }
}
