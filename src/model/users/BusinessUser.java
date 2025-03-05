package model.users;

import java.util.ArrayList;

import model.Page;
import model.Post;
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
	
	
	
	//params[0] - text message for the post
	//params[1] - title of the first page where to publish the post
	//params[2] - title of the second page where to publish the post
	//params[3] - title of the third page where to publish the post
	@Override
	public void createPost(PostType postType, String... params) throws Exception {
		if(postType == null || params == null) {
			throw new Exception("Params should be not null");
		}
		if(params.length < 2)
		{
			throw new Exception("There is no msg and page as input params");
		}
		
		
		Post newPost = new Post(params[0]);
		
		for(Page tempP : pages) {
			for(int i = 1; i < params.length; i++) {
				if(tempP.getTitle().equals(params[i]))
				{
					tempP.getPosts().add(newPost);
				}
			}
		}
		
		
	}

}
