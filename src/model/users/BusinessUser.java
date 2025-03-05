package model.users;

import java.util.ArrayList;

import model.Page;
import model.PostType;

public class BusinessUser extends RegisteredUser{
	// variables, getters, setters, both constructors, toString + other functions(if necessary)

	//id, username and password will be inherited from base classes
	private String businessName;
	private ArrayList<Page> pages = new ArrayList<Page>();
	
	public String getBusinessName() {
		return businessName;
	}

	public ArrayList<Page> getPages() {
		return pages;
	}

	public void setBussinesName(String inputBusinessName)
	{
		if(inputBusinessName != null && inputBusinessName.matches("[A-Z]{1}[a-z]{2,20}"))
		{
			businessName = inputBusinessName;
		}
		else
		{
			businessName = "No business name";
		}
	}

	
	public BusinessUser() {
		super();//it will call base class no argument constructor
		setBussinesName("Test business name");
	}
	
	public BusinessUser(String inputUsername, String inputPassword, String inpuBusinessName) {
		super(inputUsername, inputPassword);//it call argument constructor from the base class
		setBussinesName(inpuBusinessName);
	}
	
	public String toString() {
		return super.toString() + " " + businessName;
	}
	
	
	

	@Override
	public void createPost(PostType postType, String... params) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
