class School {
    private String name;
    private String address;
    private Principal principal;
    private ClassRoom[] classes;
    private int classCount = 0;

    public School(String name, String address, Principal principal) {
        this.name = name;
        this.address = address;
        this.principal = principal;
        this.classes = new ClassRoom[10]; // Max 10 classes
    }

    public void addClass(ClassRoom c) {
        if (classCount < 10) {
            classes[classCount++] = c;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("School: ").append(name).append("\n");
        sb.append("Address: ").append(address).append("\n");
        sb.append("Principal: ").append(principal.toString()).append("\n");
        sb.append("Classes:\n");
        for (int i = 0; i < classCount; i++) {
            sb.append(classes[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
