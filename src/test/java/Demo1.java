import org.testng.annotations.Test;

public class Demo1 {
	
	
	@Test(priority=0)
	public void abc()
	{
		System.out.println("Test1");
	}
	
	@Test
	public void xyz()
	{
		System.out.println("Test2");
	}
	
	@Test
	public void acb()
	{
		System.out.println("Test3");
	}
	
	@Test
	public void Test4()
	{
		System.out.println("Test4");
	}
	
	@Test
	public void Test5()
	{
		System.out.println("Test5");
	}

}
