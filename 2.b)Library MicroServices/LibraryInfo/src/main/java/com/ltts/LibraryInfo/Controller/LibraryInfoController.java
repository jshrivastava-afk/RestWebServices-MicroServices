package com.ltts.LibraryInfo.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ltts.LibraryInfo.model.Books;
import com.ltts.LibraryInfo.model.User;

@RestController
public class LibraryInfoController {

	@Autowired
     RestTemplate rt;
	@Autowired
    RestTemplate pt;

     @RequestMapping("/booksdetail")
     public List<Books> getExternalTeam(){

    	 ResponseEntity<Books[]> response = rt.getForEntity("http://localhost:8084/books", Books[].class);
    	 Books[] book =response.getBody();
    	 List<Books> lt = Arrays.asList(book);
    	 return lt;
	 
     }
    	 
     @RequestMapping("/userdetails")
     public List<User> getExternalPlayer(){

    	 ResponseEntity<User[]> response = pt.getForEntity("http://localhost:8086/users", User[].class);
    	 User[] user =response.getBody();
    	 List<User> lt1 = Arrays.asList(user);
    	 return lt1;
	 
     }
}
