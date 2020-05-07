package com.springcore;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.controller.UserController;
import com.springcore.vo.UserVO;

public class SpringCoreApplication {

	public static void main(String[] args) {
		
	    //creating object to IOC container with i/p as Classes to which objects are to be created using annotation
		ApplicationContext ac = new AnnotationConfigApplicationContext("com.springcore");
	    System.out.println(ac);
	       
	    UserController controller = ac.getBean(UserController.class);
	    UserVO user1 = new UserVO(123, "sai", "vnm");
	    System.out.println("no. of users added:"+controller.addUser(user1));
	    UserVO user2 = new UserVO(566, "ramesh", "hyd");
	    System.out.println("no. of users added:"+controller.addUser(user2));
	    UserVO user3 = new UserVO(128, "ram", "vzg");
	    System.out.println("no. of users added:"+controller.addUser(user3));
	    
	    UserVO user = controller.getUser(123);
	    user.setCity("vnk"); // update the city name vnm---> vnk
	    System.out.println("no. of users updated:"+controller.updateUser(user));
	    
	    
	    Set<UserVO> allusers = controller.getAllUsers();
	    System.out.println(allusers);
	    
	    
	    
	}

}
