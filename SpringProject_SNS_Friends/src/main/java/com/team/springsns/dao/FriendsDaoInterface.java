package com.team.springsns.dao;

import java.util.List;

import com.team.springsns.model.FriendRequestInfo;
import com.team.springsns.model.MemberInfo;

public interface FriendsDaoInterface {
	
	// 친구 목록 가져오는 메서드
	public List getFriendsList();
	
	// 친구 페이지를 보여주는 메서드
	public MemberInfo getFriendPage(int userNo);

	// 친구 요청 시 친구 요청 리스트에 추가(등록)하는 메서드
	public int setFriendRequest(FriendRequestInfo requestInfo);

}