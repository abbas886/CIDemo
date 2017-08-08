package com.abs;

public class UserService {
	
	
	public boolean isValidCredentials(String id, String name)
	{
		if(id.equals("niit") && name.equals("niit"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
