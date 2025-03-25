class Principal extends Persons {
    private int experience; // Years of experience

    public Principal(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return super.toString() + ", Experience: " + experience + " years";
    }
}
