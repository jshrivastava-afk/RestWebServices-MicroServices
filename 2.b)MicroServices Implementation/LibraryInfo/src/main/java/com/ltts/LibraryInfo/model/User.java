package com.ltts.LibraryInfo.model;

public class User {
	
private String userName;
private int uId;
private String userEmail;
private String Pass;



public User(String userName, int uId, String userEmail, String pass) {
	super();
	this.userName = userName;
	this.uId = uId;
	this.userEmail = userEmail;
	Pass = pass;
}

public User() {
	super();
}

public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public int getuId() {
	return uId;
}
public void setuId(int uId) {
	this.uId = uId;
}
public String getUserEmail() {
	return userEmail;
}
public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}
public String getPass() {
	return Pass;
}
public void setPass(String pass) {
	Pass = pass;
}

@Override
public String toString() {
	return "User [userName=" + userName + ", uId=" + uId + ", userEmail=" + userEmail + ", Pass=" + Pass + "]";
}

}
