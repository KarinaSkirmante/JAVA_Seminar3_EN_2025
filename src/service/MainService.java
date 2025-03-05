package service;

import java.util.ArrayList;
import java.util.Arrays;

import model.PostType;
import model.users.BusinessUser;
import model.users.PrivateUser;
import model.users.User;

public class MainService {

	private static ArrayList<User> allUsers = new ArrayList<User>();
	
	
	public static void main(String[] args) {
		User u1 = new User();//Guest User
		User u2 = new User();//Guest User
		PrivateUser u3 = new PrivateUser("karina.skirmante", "123abc??", "Karina", "Skirmante");
		BusinessUser u4 = new BusinessUser("my.microsoft", "1234poiu??", "My microsoft");
		
		allUsers.addAll(Arrays.asList(u1, u2, u3, u4));
		
		
		for(User tempU: allUsers) {
			System.out.println(tempU.getClass().getName()+ "->" + tempU);
		}
		
		try {
			u3.createPost(PostType.privatePost, "I want to go home!");
			u3.createPost(PostType.publicPost, "I like JAVA!");
			
			System.out.println("Karina private posts: " + u3.getPrivatePosts());
			System.out.println("Karina public posts: " + u3.getPublicPosts());
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
