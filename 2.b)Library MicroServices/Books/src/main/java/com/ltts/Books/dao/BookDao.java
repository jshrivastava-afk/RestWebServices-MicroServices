package com.ltts.Books.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ltts.Books.model.Books;

@Repository
	public class BookDao {

		public List<Books> getAllBooks(){
			List<Books> li =new ArrayList<Books>();
			li.add(new Books(101,"Mahabharat","vedvyas","epic",10));
			li.add(new Books(102,"Ramayana","TulsiDas","epic",11));
			li.add(new Books(103,"Mordern India","MK Ghandi","Period",19));
			li.add(new Books(104,"Godan","premchand","Novel",3));
			li.add(new Books(105,"Bibal","Pop francious","epic",11));
			return li;
		}
	}


