package com.team.springsns.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.team.springsns.dao.FriendsDaoInterface;
import com.team.springsns.model.MemberInfo;

public class FriendsViewService {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	private FriendsDaoInterface friendsDao;
	
	public MemberInfo viewFriendPage(int userNo) {
		
		friendsDao = sqlSessionTemplate.getMapper(FriendsDaoInterface.class);
		
		MemberInfo friendInfo = friendsDao.getFriendPage(userNo);
		
		return friendInfo;
		
	}
	

}