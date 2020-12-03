package com.org;
import java.util.ArrayList;
import java.util.List;

public class Main {



	
	public static void main(String[] args) {
		
	List<User> list = new ArrayList<User>();
	
	User user1  =new User("1", "Sumukh", "101");
	User user2  =new User("2", "Vishnu", "102");
	User user3  =new User("3", "tharun", "103");
	User user4  =new User("4", "Sanju", "104");
	User user5  =new User("5", "Shamy", "105");
	
	
	
	list.add(user1);
	list.add(user2);
	list.add(user3);
	list.add(user4);
	list.add(user5);
	
	

	for(int i =0 ;i<list.size();i++)
	{
		if(list.get(i).getName().length()>5) {
			
			System.out.println("Id: "+list.get(i).getId()+" Name: "+list
					.get(i).getName());
			
		}
		
		
	}
	
	}
}