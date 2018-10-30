package com.team.springsns.model;

import lombok.Data;

@Data
public class FriendRequestInfo {

	private int requestNo;
	private int requestUser;
	private int responseUser;
	private boolean requestAccept;
	private boolean requestCancel;
	
	public int getRequestNo() {
		return requestNo;
	}
	public void setRequestNo(int requestNo) {
		this.requestNo = requestNo;
	}
	public int getRequestUser() {
		return requestUser;
	}
	public void setRequestUser(int requestUser) {
		this.requestUser = requestUser;
	}
	public int getResponseUser() {
		return responseUser;
	}
	public void setResponseUser(int responseUser) {
		this.responseUser = responseUser;
	}
	public boolean isRequestAccept() {
		return requestAccept;
	}
	public void setRequestAccept(boolean requestAccept) {
		this.requestAccept = requestAccept;
	}
	public boolean isRequestCancel() {
		return requestCancel;
	}
	public void setRequestCancel(boolean requestCancel) {
		this.requestCancel = requestCancel;
	}
	@Override
	public String toString() {
		return "FriendRequestInfo [requestNo=" + requestNo + ", requestUser=" + requestUser + ", responseUser="
				+ responseUser + ", requestAccept=" + requestAccept + ", requestCancel=" + requestCancel + "]";
	}
	
	
}
