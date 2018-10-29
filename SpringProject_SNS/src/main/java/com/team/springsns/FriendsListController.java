package com.team.springsns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.team.springsns.service.FriendsListService;

@Controller
public class FriendsListController {
	
	@Autowired
	private FriendsListService ListService;
	
	@RequestMapping("/team/friendsList")
	public ModelAndView getFriendsList() {
		
		ModelAndView mav = new ModelAndView();
		
		if(!ListService.viewFriendsList().isEmpty()) {
				mav.addObject("friendsList", ListService.viewFriendsList());
		}
		
		mav.setViewName("team/friendsList");
		
		return mav;
		
	}

}
