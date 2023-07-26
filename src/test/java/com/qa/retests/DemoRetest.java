package com.qa.retests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoRetest {
	
	@Test(priority=1)
	public void sum()
	{
		System.out.println("RE-SUM");
		int a=20;
		int b=10;
		Assert.assertEquals(30, a+b);
	}
	
	@Test(priority=2)
	public void sub()
	{
		System.out.println("RE-SUB");
		int a=20;
		int b=10;
		Assert.assertEquals(10, a-b);
	}
	
	@Test(priority=3)
	public void div()
	{
		System.out.println("RE-DIV");
		int a=20;
		int b=10;
		Assert.assertEquals(2, a/b);
	}
	
	@Test(priority=4)
	public void mul()
	{
		System.out.println("RE-MUL");
		int a=20;
		int b=10;
		Assert.assertEquals(200, a*b);
	}

}
