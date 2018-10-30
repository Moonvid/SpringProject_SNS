package com.team.springsns;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.team.springsns.model.FriendRequestInfo;
import com.team.springsns.model.MemberInfo;
import com.team.springsns.service.FriendRequestService;
import com.team.springsns.service.FriendsViewService;

@Controller
public class FriendsPageController {
	
	@Autowired
	private FriendsViewService viewService;
	
	@Autowired
	private FriendRequestService requestService;
	
	@RequestMapping(value="/team/friendsPage/{userNo}")
	public String viewFriendsPage(@PathVariable("userNo") int userNo, Model model) {
		
		System.out.println(userNo);
		System.out.println(viewService.viewFriendPage(userNo));
		
		MemberInfo friendInfo = viewService.viewFriendPage(userNo);
		
		model.addAttribute("friendInfo", friendInfo);
		
		return "team/friendsPage";
	
	}
	
}