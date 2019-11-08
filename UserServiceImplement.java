/**
 * @program: usermanagerment
 * @Description: Calling interface to realize user login
 * @author: chun
 * @date: 2019/10/30
 */
package com.google.user;

/**
 * @author Administrator
 * @date   2019-10-30
 */
//调用UserService接口
public class UserServiceImplement implements UserService {

	/* (non-Javadoc)
	 * @see com.google.user.UserService#login(com.google.user.User)
	 */
	@Override
	//实现用户登录
	public int login(User user) {
		// TODO Auto-generated method stub
		//输入3显示用户异常
		int result = 3;
		if(DefaultValue.USERNAME.equals(user.getUsername())) {
			if(DefaultValue.USERPASSWORD.equals(user.getUserpassword())){
				//输入1登录成功
				result = 1;
				System.out.println("welcome" + user.getUsername());
			}else {
				//输入2注册新用户
				result = 2;
				System.out.println("password incorrect");
			}
		}else {
			//输入0退出登录注册界面
			result = 0;
			System.out.println("username incorrect");
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see com.google.user.UserService#register(com.google.user.User)
	 */
	@Override
	//用户注册
	public int register(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
