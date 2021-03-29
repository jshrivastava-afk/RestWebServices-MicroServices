package com.ltts.User.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ltts.User.model.User;


@Repository
public class UserDao {

	public List<User> getAllUser(){
		List<User> li =new ArrayList<User>();
		li.add(new User("vishal",101,"vishal@gmail.com","1234"));
		li.add(new User("pallavi",102,"pallavi@gmail.com","5678"));
		li.add(new User("vaibhav",103,"vaibhav@gmail.com","4321"));
		li.add(new User("Jaiiii",104,"jai@gmail.com","4200"));
		li.add(new User("Pavitra",105,"pavitra@gmail.com","0070"));
		return li;
	}
}
