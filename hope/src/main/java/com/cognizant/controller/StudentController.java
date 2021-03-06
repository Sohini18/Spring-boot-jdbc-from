package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.model.Student;
import com.cognizant.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="display",method=RequestMethod.GET)
	public ModelAndView findAll()
	{
		ModelAndView mv=new ModelAndView("display");
		Student student=new Student();
		List<Student> list=studentService.findAll();
		mv.addObject("list",list);
		return mv;
	}
	
	@RequestMapping(value="create",method=RequestMethod.GET)
	public ModelAndView createPage()
	{
		ModelAndView mv=new ModelAndView("create");
		Student student=new Student();
		mv.addObject("student",student);
		return mv;
	}
	@RequestMapping(value="create",method=RequestMethod.POST)
	public ModelAndView create(@ModelAttribute("student")Student student)
	{
		System.out.println("Model Attribute:"+ student);
		ModelAndView mv=new ModelAndView("create");
		int res=studentService.create(student);
		if(res==1)
		 mv.addObject("msg","record inserted successfully");
		else
			mv.addObject("msg","record insertion failed");
		
		return mv;
		
	}
	@RequestMapping(value="update",method=RequestMethod.GET)
	public ModelAndView updatePage()
	{
		ModelAndView mv=new ModelAndView("update");
		Student student=new Student();
		mv.addObject("student",student);
		return mv;
	}
	@RequestMapping(value="update",method=RequestMethod.POST)
	public ModelAndView update(@ModelAttribute("student")Student student)
	{
		System.out.println("Model Attribute:"+ student);
		ModelAndView mv=new ModelAndView("update");
		int res=studentService.update(student);
		if(res==1)
		 mv.addObject("msg","record updated successfully");
		else
			mv.addObject("msg","record updation failed");
		
		return mv;
		
	}
	@RequestMapping(value="delete",method=RequestMethod.GET)
	public ModelAndView deletePage()
	{
		ModelAndView mv=new ModelAndView("delete");
		Student student=new Student();
		mv.addObject("student",student);
		return mv;
	}
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public ModelAndView delete(@ModelAttribute("student")Student student)
	{
		System.out.println("Model Attribute:"+ student);
		ModelAndView mv=new ModelAndView("delete");
		int res=studentService.delete(student.getId());
		if(res==1)
		 mv.addObject("msg","record deleted successfully");
		else
			mv.addObject("msg","record deletion failed");
		
		return mv;
		
	}
	@RequestMapping(value="count",method=RequestMethod.GET)
	public ModelAndView count()
	{
		ModelAndView mv=new ModelAndView("count");
		int res=studentService.count();
		mv.addObject("msg",res);
		return mv;
	}
	@RequestMapping(value="find",method=RequestMethod.GET)
	public ModelAndView findPage()
	{
		ModelAndView mv=new ModelAndView("find");
		Student student=new Student();
		mv.addObject("student",student);
		return mv;
	}
	@RequestMapping(value="find",method=RequestMethod.POST)
	 public ModelAndView find(@ModelAttribute("student") Student student ) {
		 System.out.println("Model Attribute:"+student);
		 List<Student> list=studentService.findByName(student);
		 ModelAndView mv = new ModelAndView("find");
			mv.addObject("msg",list);
			return mv;
	}

	
	
}
