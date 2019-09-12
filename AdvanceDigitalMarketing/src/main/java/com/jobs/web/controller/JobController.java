package com.jobs.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.jobs.web.DAO.StudentDAO;
import com.jobs.web.beans.AdminBeans;
import com.jobs.web.beans.StudentBean;

@Controller
public class JobController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView printWelcome(ModelAndView model) {

		model.addObject("name", "test");
		model.addObject("url", "http://www.google.com");
		model.setViewName("index");
		return model;

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String hello(@RequestParam("name")String name,@RequestParam("password") String password,RedirectAttributes reAttributes) {
System.out.println("in post");
		ModelAndView model = new ModelAndView();
		reAttributes.addFlashAttribute("loggedin",true);
		AdminBeans admin=new AdminBeans();
		admin.setName(name);
		admin.setPassword(password);
		String view=null;
	if(admin.getName().equals("deepak")&&admin.getPassword().equals("deepak")) {
		view="ViewStudent";
		
	}
	else
	{
		
		//model.setViewName("index.jsp");
		model.addObject("login","failed");
		view="redirect:failed";
		model.addObject("message", "Authentucation Failed");
		
	}

		return view;

	}
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView printFailed(ModelAndView model) {

		model.addObject("message", "Authentucation Failed");
		//model.addObject("url", "http://www.google.com");
		model.setViewName("index");
		return model;

	}
	@RequestMapping(value = "/ViewStudent", method = RequestMethod.GET)
	public ModelAndView printSuccess(ModelAndView model) {

		model.addObject("message", "Success");
		//model.addObject("url", "http://www.google.com");
		model.setViewName("ViewStudent");
		return model;

	}
	
	@RequestMapping(value = "/Student", method = RequestMethod.GET)
	public ModelAndView viewStudent(ModelAndView model) {

		//model.addObject("message", "Success");
		//model.addObject("url", "http://www.google.com");
		model.setViewName("Student");
		return model;

	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("student") StudentBean bean) {

		//model.addObject("message", "Success");
		//model.addObject("url", "http://www.google.com");
		StudentDAO dao=new StudentDAO();
		System.out.println(bean.getStudentName());
		dao.addStudent(bean);
		return "hello";

	}
	@RequestMapping(value = "/addStudentPage", method = RequestMethod.GET)
	public String addStudent() {
		return "AddStudent";
	}
	

}