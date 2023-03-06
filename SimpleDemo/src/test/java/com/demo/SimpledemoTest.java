package com.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpledemoTest {

	@Test
	public void test() 
	{
		Simpledemo s1 = new Simpledemo();
		assertEquals("Hello World", s1.printhello());
	}

}
