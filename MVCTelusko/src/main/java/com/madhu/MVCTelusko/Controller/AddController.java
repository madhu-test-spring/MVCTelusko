package com.madhu.MVCTelusko.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.madhu.MVCTelusko.Entity.AddEntity;
import com.madhu.MVCTelusko.Repository.MyRepository;

@Controller
public class AddController {
	
	
	@Autowired
	MyRepository repo;
	
	@RequestMapping("/")
	public ModelAndView begin(HttpServletRequest request,HttpServletRequest response)
	{
		//int i=Integer.parseInt(request.getParameter("t1"));
		//int j=Integer.parseInt(request.getParameter("t2"));
		
		//int k=i+j;
		
		ModelAndView mv=new ModelAndView();
		//mv.addObject("answer", k);
		mv.setViewName("index.jsp");
		
		return mv;
		
		
	}
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletRequest response)
	{
		int i=Integer.parseInt(request.getParameter("t1"));
		int j=Integer.parseInt(request.getParameter("t2"));
		
		int k=i+j;
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("answer", k);
		mv.setViewName("display.jsp");
		
		return mv;
		
		
	}
	
	@RequestMapping("/welcome")
	public ModelAndView welcome()
	{
		
		
		ModelAndView mv=new ModelAndView();
		//mv.addObject("answer", k);
		mv.setViewName("welcome.jsp");
		
		return mv;
		
		
	}
	
	@RequestMapping("/select")
	public String addData(AddEntity ent)
	{	
		repo.save(ent);
		
		return "thanks.jsp";
				
	}
	
	@RequestMapping("/fetch")
	public ModelAndView fetchData(@RequestParam int id_no)
	{	
		AddEntity ent=repo.findById(id_no).orElse(new AddEntity());
		ModelAndView mv=new ModelAndView();
		mv.addObject("fantasy",ent);
		mv.setViewName("fetch.jsp");
		
		return mv;
				
	}
	
	public String resMessage()
	{
		return "hello hoe are you";
	}



}
