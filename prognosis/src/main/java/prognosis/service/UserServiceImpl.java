package prognosis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prognosis.dao.UserAccountMapper;
import prognosis.model.UserAccount;
import prognosis.service.UserServiceI;

@Service("userService")
public class UserServiceImpl implements UserServiceI {

	private UserAccountMapper userMapper;

	public UserAccountMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	public void setUserMapper(UserAccountMapper userMapper) {
		this.userMapper = userMapper;
	}

	public UserAccount getUserById(Byte id)
	{
		return userMapper.selectByPrimaryKey(id);
	}


}
