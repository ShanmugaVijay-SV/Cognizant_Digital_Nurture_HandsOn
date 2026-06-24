package com.mockito2;

public class MyService {

	ExternalApi exapi;
	
	MyService(ExternalApi mapi){
		exapi=mapi;
	}
	
	public String fetchData() {
		return exapi.getData();
	}
}
