package com.qa.retests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoRetest2 {
	
	@Test(priority=5)
	public void sum()
	{
		System.out.println("RE-SUM");
		int a=20;
		int b=10;
		Assert.assertEquals(30, a+b);
	}
	
	@Test(priority=6)
	public void sub()
	{
		System.out.println("RE-SUB");
		int a=20;
		int b=10;
		Assert.assertEquals(10, a-b);
	}
	
	@Test(priority=7)
	public void div()
	{
		System.out.println("RE-DIV");
		int a=20;
		int b=10;
		Assert.assertEquals(2, a/b);
	}
	
	@Test(priority=8)
	public void mul()
	{
		System.out.println("RE-MUL");
		int a=20;
		int b=10;
		Assert.assertEquals(200, a*b);
	}

}
