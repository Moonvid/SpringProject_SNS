package com.team.springsns.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.team.springsns.dao.FriendsDaoInterface;
import com.team.springsns.model.FriendRequestInfo;

public class FriendRequestService {

		@Autowired
		private SqlSessionTemplate sqlSessionTemplate;
		
		private FriendsDaoInterface friendsDao;
		
		public int friendRequest(FriendRequestInfo requestInfo) {
			
			friendsDao = sqlSessionTemplate.getMapper(FriendsDaoInterface.class);
			
			int resultCnt = 0;
			
			resultCnt = friendsDao.setFriendRequest(requestInfo);
			
			return resultCnt;
		}
	
}
