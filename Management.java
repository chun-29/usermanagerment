/**
 * @program: usermanagerment
 * @Description: Login by selecting
 * @author: chun
 * @date: 2019/10/30
 */
package com.google.main;

import java.util.Scanner;

import com.google.user.User;
import com.google.user.UserServiceImplement;

/**
 * @author Administrator
 * @date   2019-10-30
 */
public class Management {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 10;

		//通过选择进行登录、注册、忘记密码、退出等操作
		System.out.println("Please make the choose below:1 login, 2 register, 3 forget password, 4 exit");
		Scanner scanner = new Scanner(System.in);
		int choose = scanner.nextInt();
		switch (choose) {
		case 1:
			UserServiceImplement userServiceImplement = new UserServiceImplement();
			User user = new User();
			//输入用户名
			System.out.println("Plesae input username:");
			user.setUsername(scanner.next());
			//输入用户密码
			System.out.println("Please input password:");
			user.setUserpassword(scanner.next());
			result = userServiceImplement.login(user);
			break;
			
		default:
			System.out.println(result);
			break;
		}

	}

}
