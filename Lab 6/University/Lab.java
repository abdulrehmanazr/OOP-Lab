package University.Lab;
import University.*;

public class Lab {
private String name;
private Employe labStaff;
private SystemUnit[] system;
private boolean hasMultimedia;

Lab(String name, Employe labStaff, SystemUnit[] system, Boolean hasMultimedia){
this.name=name;
this.labStaff=labStaff;
this.system=system;
this.hasMultimedia=hasMultimedia;
}

public void setname(String name){
this.name=name;
}

public void setlabStaff(Employe labStaff){
this.labStaff=labStaff;
}


public void setsystem(SystemUnit[] system){
this.system=system;
}

public void sethasMultimedia(Boolean hasMultimedia){
this.hasMultimedia=hasMultimedia;
}

public String getname(){
return name;
}

public Employe getlabStaff(){
return labStaff;
}


public SystemUnit[] getsystem(){
return system;
}

public boolean hasMultimedia(){
return hasMultimedia;
}

@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nLab Details:\n");
        sb.append("Lab Name: ").append(name).append("\n");
        sb.append("Lab Staff: ").append(labStaff.getname()).append(" (").append(labStaff.getDesignation()).append(")\n");
        sb.append("Multimedia Available: ").append(hasMultimedia ? "Yes" : "No").append("\n");
        sb.append("Number of Systems: ").append(systems != null ? systems.length : 0).append("\n");

        if (systems != null && systems.length > 0) {
            sb.append("Systems in Lab:\n");
            for (SystemUnit system : systems) {
                sb.append(system.toString()).append("\n");
            }
        } else {
            sb.append("No systems available in this lab.\n");
        }

        return sb.toString();
    }
}

}