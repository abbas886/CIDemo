package com.abs;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class UserServiceTestCase {

	//declaring UserService object - new commit
	
	private static UserService userService;
	
	@BeforeClass
	public static void init()
	{
		userService = new UserService();
	}
	
	@Test
	public void testCredentials()
	{
		boolean flag =userService.isValidCredentials("niit", "niit");
		
		assertEquals(true, flag);
		
		
	}
	
	
}
