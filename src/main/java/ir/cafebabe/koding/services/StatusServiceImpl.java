package ir.cafebabe.koding.services;

import ir.cafebabe.koding.models.Status;
import ir.cafebabe.koding.services.spi.StatusService;

public class StatusServiceImpl implements StatusService {
	
	@Override
	public Status getSystemInformation() {
		Status status = new Status();
		status.setCpu("Available processors (cores): "
				+ Runtime.getRuntime().availableProcessors());
		status.setFreeMemory("Free memory (bytes): "
				+ Runtime.getRuntime().freeMemory());
		status.setOsName(System.getProperty("os.name"));
		status.setJvmDetails(System.getProperty("java.runtime.name") + "/"
				+ System.getProperty("java.vm.version"));
		return status;
	}
}
