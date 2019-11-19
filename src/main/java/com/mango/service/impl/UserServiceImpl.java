package com.mango.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mango.bean.User;
import com.mango.bean.UserExample;
import com.mango.bean.UserExample.Criteria;
import com.mango.mapper.UserMapper;
import com.mango.service.UserService;
import com.mango.utils.OAResult;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper usermapper;
	
	@Override
	public OAResult getDataByUserData(String username, String password) {
		
		UserExample userExample = new UserExample();
		
		Criteria criteria = userExample.createCriteria();
		
		criteria.andUsernameEqualTo(username);
		criteria.andPasswordEqualTo(password);
		
		List<User> list = usermapper.selectByExample(userExample);
		
		if (list!=null && list.size()==1) {
			
			return OAResult.build(200, "��½�ɹ�", list.get(0));
			
		}
		
		return OAResult.build(400, "�û��������벻��ȷ");
	}

}
