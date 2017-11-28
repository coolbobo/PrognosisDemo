package prognosis.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
/**
 * 控制器
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import prognosis.model.UserAccount;
import prognosis.service.UserServiceI;

@Controller
@RequestMapping("/userController")
public class UserController
{
	private UserServiceI userServ;

	public UserServiceI getUserServ()
	{
		return userServ;
	}

	@Autowired
	public void setUserServ(UserServiceI userServ)
	{
		this.userServ = userServ;
	}

	@RequestMapping("/showUser")
	public String showUser(String id, HttpServletRequest request)
	{
		Byte i = Byte.valueOf(id);
		UserAccount user = userServ.getUserById(i);
		request.setAttribute("user", user);
		return "showUser";
	}

}
