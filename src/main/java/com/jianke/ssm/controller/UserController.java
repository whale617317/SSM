package com.jianke.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jianke.ssm.po.UserCustom;
import com.jianke.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/queryUser")
	public ModelAndView queryuser(HttpServletRequest request) throws Exception {
		
		System.out.println(request.getParameter("id"));

		List<UserCustom> userList = userService.findUserList(null);
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("userList", userList);

		modelAndView.setViewName("user/userList");

		return modelAndView;

	}


	
	@RequestMapping(value="/editUser",method={RequestMethod.POST,RequestMethod.GET})
	public String edituser(Model model,@RequestParam(value="id",required=true) Integer user_id)throws Exception {
		
		UserCustom userCustom = userService.findUserById(user_id);
		
		model.addAttribute("userCustom", userCustom);
		
		return "user/editUser";
	}
	
	@RequestMapping("/editUserSubmit")
	public String edituserSubmit(HttpServletRequest request,Integer id,UserCustom userCustom)throws Exception {
		
		userService.updateUser(id, userCustom);
		
		return "successs";
	}


}
