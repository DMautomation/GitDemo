package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void sum()
	{
		System.out.println("SUM");
		int a=20;
		int b=10;
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void sub()
	{
		System.out.println("SUB");
		int a=20;
		int b=10;
		Assert.assertEquals(10, a-b);
	}
	
	@Test
	public void div()
	{
		System.out.println("DIV");
		int a=20;
		int b=10;
		Assert.assertEquals(2, a/b);
	}
	
	@Test
	public void mul()
	{
		System.out.println("MUL");
		int a=20;
		int b=10;
		Assert.assertEquals(200, a*b);
	}

}
