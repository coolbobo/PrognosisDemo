package prognosis.dao;

import prognosis.model.UserAccount;

public interface UserAccountMapper
{
	int deleteByPrimaryKey(Byte id);

	int insert(UserAccount record);

	int insertSelective(UserAccount record);

	UserAccount selectByPrimaryKey(Byte id);

	int updateByPrimaryKeySelective(UserAccount record);

	int updateByPrimaryKey(UserAccount record);
}