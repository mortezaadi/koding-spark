package ir.cafebabe.koding.models;

public class Status {
	private String osName;
	private String jvmDetails;
	private String freeMemory;
	private String cpu;
	public String getOsName() {
		return osName;
	}
	public void setOsName(String osName) {
		this.osName = osName;
	}
	public String getJvmDetails() {
		return jvmDetails;
	}
	public void setJvmDetails(String jvmDetails) {
		this.jvmDetails = jvmDetails;
	}
	
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getFreeMemory() {
		return freeMemory;
	}
	public void setFreeMemory(String freeMemory) {
		this.freeMemory = freeMemory;
	}
	
}
