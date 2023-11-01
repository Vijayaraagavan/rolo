package com.example.demo.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static int userCount;
	private static ArrayList<User> users = new ArrayList<>();
	
	static {
		userCount = 5;
		users.add(new User(1, "boruto", "12456", new Date()));
		users.add(new User(2, "naruto", "4646", new Date()));
		users.add(new User(3, "one piece", "64646", new Date()));
		users.add(new User(4, "bleach", "37385473", new Date()));
		users.add(new User(5, "jjk", "78674523", new Date()));
	}
	
	public List<User> allUsers() {
		return users;
	}
	
	public User getUser(int id) {
		for (int i = 0; i < users.size(); i++) {
			User a = users.get(i);
			if (a.getId() == id) {
				return a;
			}
		}
		throw new UserNotFoundException("id " + id);
	}
	
	public User addUser(User a) {
		if (validate(a)) {
			a.setId(++userCount);
			users.add(a);
			return a;
		} else {
			return null;
		}
	}
	
	private boolean validate(User a) {
		if (a.getPhoneNo() == null || a.getName() == null || getUser(a.getId()) != null) {
			return false;
		} else {
			return true;
		}
	}
}
