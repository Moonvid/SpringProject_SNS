package com.team.springsns.model;

public class Friends {

	int userno;
	int following_userno;

	public int getUserno() {
		return userno;
	}

	public void setUserno(int userno) {
		this.userno = userno;
	}

	public int getFollowing_userno() {
		return following_userno;
	}

	public void setFollowing_userno(int following_userno) {
		this.following_userno = following_userno;
	}

	@Override
	public String toString() {
		return "Friends [userno=" + userno + ", following_userno=" + following_userno + "]";
	}
	
	
	
	
}