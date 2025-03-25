class Teacher extends Person {
    private String subject;
    private int teacherID;

    public Teacher(String name, int age, String subject, int teacherID) {
        super(name, age);
        this.subject = subject;
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject + ", ID: " + teacherID;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Teacher teacher = (Teacher) obj;
        return teacherID == teacher.teacherID;
    }
}
