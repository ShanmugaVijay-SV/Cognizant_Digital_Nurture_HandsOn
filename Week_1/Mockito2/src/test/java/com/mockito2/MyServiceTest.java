package com.mockito2;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {
	@Test
	public void testVerifyInteraction() {
	ExternalApi mockapi=Mockito.mock(ExternalApi.class);
	MyService service=new MyService(mockapi);
	service.fetchData();
	verify(mockapi).getData();
	}
}
