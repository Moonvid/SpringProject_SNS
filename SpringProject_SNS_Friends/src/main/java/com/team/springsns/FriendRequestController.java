package com.team.springsns;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.team.springsns.model.FriendRequestInfo;
import com.team.springsns.model.MemberInfo;
import com.team.springsns.service.FriendRequestService;
import com.team.springsns.service.FriendsViewService;

@Controller
public class FriendRequestController {

	@Autowired
	private FriendsViewService viewService;

	@Autowired
	private FriendRequestService requestService;

	@RequestMapping(value = "/team/friendsPage/{userNo}", method = RequestMethod.POST)
	public ModelAndView friendRequest(@PathVariable("userNo") int friendNo, MemberInfo memberInfo) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("team/friendRequestOk");
		MemberInfo requestUserInfo = memberInfo;
		MemberInfo responseUserInfo = viewService.viewFriendPage(friendNo);

		FriendRequestInfo requestInfo = new FriendRequestInfo();

		requestInfo.setRequestUser(requestUserInfo.getUserNo());
		requestInfo.setResponseUser(responseUserInfo.getUserNo());

		System.out.println(requestInfo);

		mav.addObject("requestInfo", requestInfo);

		try {
			int resultCnt = requestService.friendRequest(requestInfo);

			if (resultCnt == 0) {
				mav.setViewName("team/requestFail");
			}

		} catch (IllegalStateException e) {
			e.printStackTrace();
			mav.setViewName("team/requestFail");
		}

		return mav;
	}

}
