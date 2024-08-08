package testcase;

import org.testng.annotations.Test;


public class TestCase {
	
	@Test(priority = 1, invocationCount = 5)
	public void loginTest()
	{
		System.out.println("Login test case");
	}
	
	
	@Test(priority = 2)
	public void home()
	{
		System.out.println("Home test case");
	}
	
	
	@Test
	public void dashboard()
	{
		System.out.println("dashbord test case");
	}

	
	

}
