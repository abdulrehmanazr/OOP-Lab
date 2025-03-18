import java.util.ArrayList;

public class Department {
    private String deptName;
    private Employee headOfDepartment;
    private ArrayList<Lab> labs;

    public Department(String deptName, Employee headOfDepartment) {
        this.deptName = deptName;
        this.headOfDepartment = headOfDepartment;
        this.labs = new ArrayList<>();
    }

    public void addLab(Lab lab) {
        labs.add(lab);
    }

    public void removeLab(Lab lab) {
        labs.remove(lab);
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setHeadOfDepartment(Employee headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    public String getDeptName() {
        return deptName;
    }

    public Employee getHeadOfDepartment() {
        return headOfDepartment;
    }

    public ArrayList<Lab> getLabs() {
        return labs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nDepartment Details:\n");
        sb.append("Department Name: ").append(deptName).append("\n");
        sb.append("Head of Department: ").append(headOfDepartment.getName())
          .append(" (").append(headOfDepartment.getDesignation()).append(")\n");
        sb.append("Number of Labs: ").append(labs.size()).append("\n");

        if (!labs.isEmpty()) {
            sb.append("Labs in Department:\n");
            for (Lab lab : labs) {
                sb.append(lab.toString()).append("\n");
            }
        } else {
            sb.append("No labs available in this department.\n");
        }

        return sb.toString();
    }
}
