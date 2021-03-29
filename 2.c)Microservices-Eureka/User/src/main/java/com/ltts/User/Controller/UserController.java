package com.ltts.User.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.User.dao.UserDao;
import com.ltts.User.model.User;

@RestController
public class UserController {
	@Autowired
	UserDao pd;
	
	@GetMapping("/users")
	public List<User>getUser()
	{
		return pd.getAllUser();
	}

}

