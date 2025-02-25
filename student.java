class student {
    private static int rollCounter = 0;
    private int rollNo;
    private String name;
    private String address;
    private String phoneNumber;
    private double cgpa;

    public student(String name, String address, String phoneNumber, double cgpa) {
        rollNo = rollCounter++;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.cgpa = cgpa;
    }

    public void display() {
        System.out.printf("Roll No: %03d \n ", rollNo);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("CGPA: " + cgpa);
    }



  }