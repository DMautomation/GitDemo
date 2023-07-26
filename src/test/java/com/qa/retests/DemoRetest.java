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
	
	@Test(priority=5)
	public void mod()
	{
		System.out.println("MOD");
		int a=20;
		int b=10;
		Assert.assertTrue(b%a==0);
		//Change1
		//Change2
		//Change3 
	}
	
	@Test(priority=6)
	public void bool() 
	{
		System.out.println("BOOL");
		Boolean bool=true;
		Assert.assertTrue(bool);
	}
	
	@Test(priority=7)
	public void bool_1() 
	{
		System.out.println("BOOL");
		Boolean bool=true;
		Assert.assertTrue(bool);
	}
	
	@Test(priority=8)
	public void bool_2() 
	{
		System.out.println("BOOL");
		Boolean bool=true;
		Assert.assertTrue(bool);
	}
	
	@Test(priority=9)
	public void bool_3() 
	{
		System.out.println("BOOL");
		Boolean bool=true;
		Assert.assertTrue(bool);
	}

}
