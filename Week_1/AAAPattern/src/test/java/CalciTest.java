
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalciTest {
	static AAAPattern obj;
	
	@BeforeEach
	public void setup() {
	obj=new AAAPattern();
	}
	
	@AfterEach
	public void TestCase() {
		System.out.println("TestCase Completed");
	}
	
	@Test
	public void t1() {
		
		//Arrange
		int a=10;
		int b=20;
		
		//Act
		int result = obj.add(a,b);
		
		//Asset
		assertEquals(30,result);
	}
	@Test
	public void t2() {
		int a=10;
		int b=20;
		int result = obj.add(a,b);
		assertNotEquals(3,result);
	}
}
