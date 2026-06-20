package com.singleton;

public class Logger {
	
	private static Logger instance;
	private String status;
	
	private Logger() {
	}
	
	public static Logger get_instance() {
		if(instance==null) {
			instance = new Logger();
			instance.status ="Created Not Used";
		}
		return instance;
	}
	
	void changeStatus(String string) {
		status = string;
	}
	
	 String getStatus() {
		return status;
	}
	
	
}
