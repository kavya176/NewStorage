package com.myproject.controller;

import java.util.ArrayList;

import org.hibernate.validator.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myproject.domain.Employee;
import com.myproject.domain.ORMLogicWork;
import com.myproject.domain.UserDetailsDomain;
import com.myproject.domain.UserDetailsDomain2;

@Controller
public class MyActionController {

	@Autowired

	@Qualifier("sample")
	ORMLogicWork template;
	ModelAndView mav = new ModelAndView();

	@RequestMapping("/home")
	public ModelAndView homeAction() {
		return new ModelAndView("home");
	}

	@RequestMapping("/home2")
	public ModelAndView home2Action() {
		return new ModelAndView("home2");
	}
	@RequestMapping("/helloagain")
	public String submitForm(@ModelAttribute("emp") Employee e, BindingResult br) {
		if (br.hasErrors()) {
			return "success1";
		} else {
			return "fail";
		}
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)

	public ModelAndView loginAction(@ModelAttribute("user") UserDetailsDomain udd) {
		if (template.insertNewUser(udd))

			mav.setViewName("success");
		else
			mav.setViewName("fail");
		return mav;

	}

	@RequestMapping(value = "/mydetails", method = RequestMethod.POST)

	public ModelAndView registerAction(@ModelAttribute("user") UserDetailsDomain2 udd1) {
		if (template.insertNewUser2(udd1))

			mav.setViewName("success1");
		else
			mav.setViewName("fail");
		return mav;

	}

	@RequestMapping("/fetch")
	public ModelAndView viewMembers() {
		ModelAndView mv = new ModelAndView();
		ArrayList al1 = new ArrayList();
		ArrayList al = template.viewRecords();
		if (al.isEmpty()) {

		} else {
			for (Object a : al) {
				al1.add(a);
			}
			mv.addObject("data", al);
			mv.setViewName("table");
		}
		return mv;
	}

}
