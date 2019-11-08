/**
 * @program: usermanagerment
 * @Description: Encapsulate user name and password
 * @author: chun
 * @date: 2019/10/30
 */
package com.google.user;

/**
 * @author Administrator
 * @date   2019-10-30
 */
public class User {

	//封装用户名
	private String username;
	//封装用户密码
	private String userpassword;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUserpassword() {
		return userpassword;
	}
	
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	
}
