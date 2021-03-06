package prognosis.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import prognosis.model.UserAccount;
import prognosis.service.UserServiceI;

public class Testcase
{
	private UserServiceI userService;
	private ApplicationContext ac;

	@Before
	public void before()
	{
		ac = new ClassPathXmlApplicationContext(new String[]
		{ "spring.xml", "spring-mybatis.xml" });
		userService = (UserServiceI) ac.getBean("userService");
	}

	public UserServiceI getUserService()
	{
		return userService;
	}

	@Autowired
	public void setUserService(UserServiceI userService)
	{
		this.userService = userService;
	}

	@Test
	public void test1()
	{
		Byte i = 1;
		UserAccount u = userService.getUserById(i);
		System.out.println(u.getNickname());

	}
}
