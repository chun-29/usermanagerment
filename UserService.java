/**
 * @program: usermanagerment
 * @Description: Establish user login and registration page
 * @author: chun
 * @date: 2019/10/30
 */
package com.google.user;

/**
 * @author Administrator
 * @date   2019-10-30
 */
//用户接口
public interface UserService {
	
	//0-用户不存在，1-登录成功，2-密码错误，3-登陆异常
	public int login(User user);
	
	//注册
	public int register(User user);
}
