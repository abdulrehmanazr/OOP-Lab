class ClassRoom {
    private String className;
    private String classCode;
    private Teacher teacher;
    private Student[] students;
    private int studentCount = 0;

    public ClassRoom(String className, String classCode, Teacher teacher) {
        this.className = className;
        this.classCode = classCode;
        this.teacher = teacher;
        this.students = new Student[5]; // Maximum 5 students
    }

    public boolean addStudent(Student s) {
        if (studentCount < 5) {
            students[studentCount++] = s;
            return true;
        } else {
            System.out.println("Class " + className + " is full. Cannot add student " + s.name);
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Class: ").append(className).append(" (").append(classCode).append(")\n");
        sb.append("Teacher: ").append(teacher.toString()).append("\n");
        sb.append("Students: \n");
        for (int i = 0; i < studentCount; i++) {
            sb.append(students[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
