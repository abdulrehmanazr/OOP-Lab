public class SystemUnit{

private String cpuNam;
private int RamSize;
private int DiskSize;
private String SystemId;

SystemUnit(String cpuNam, int RamSize,int DiskSize, String SystemId){
this.cpuNam=cpuNam; 
this.RamSize=RamSize;
this.DiskSize=DiskSize; 
this.SystemId=SystemId;
}


public void setcpuNam(String cpuNam){
this.cpuNam=cpuNam;
}

public void setRamSize(int RamSize){
this.RamSize=RamSize;
}


public void setDiskSize(int DiskSize){
this.DiskSize=DiskSize;
}

public void setSystemId(String SystemId){
this.SystemId=SystemId;
}

public String getcpuNam(){
return cpuNam;
}

public int getRamSize(){
return RamSize;
}


public int getDiskSize(){
return DiskSize;
}

public String getSystemId(){
return SystemId;
}




}