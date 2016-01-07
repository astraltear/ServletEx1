package com.young.jee;

import com.google.gson.annotations.Expose;

public class UserDTO {
	
	@Expose
	private String userId;
	
	@Expose
	private String userName;
	
	@Expose(serialize=false)
	private String userPw;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public UserDTO(String userId, String userName, String userPw) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPw = userPw;
	}
	
	

	
}
