package com.team.springsns.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.team.springsns.dao.FriendsDaoInterface;
import com.team.springsns.model.Friends;

public class FriendsListService {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	private FriendsDaoInterface friendsDao;
	
	
	public List viewFriendsList() {
		
		friendsDao = sqlSessionTemplate.getMapper(FriendsDaoInterface.class);
		
		List<Friends> friendsList = friendsDao.getFriendsList();
		
		return friendsList;
	}

}