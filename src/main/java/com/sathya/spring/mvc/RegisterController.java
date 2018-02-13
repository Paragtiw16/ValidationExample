package com.sathya.spring.mvc;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController 
{
 @InitBinder
 public void initBinder(WebDataBinder binder)
 {
	 CustomDateEditor editor=new CustomDateEditor(new SimpleDateFormat("MM/dd/yyyy"),true);
	 binder.registerCustomEditor(Date.class, editor);
	 
 }
 @RequestMapping(value="registerpage",method=RequestMethod.GET)
 public ModelAndView getRegisterPage()
 {
	 return new ModelAndView("register","reg",new Register());
	 
 }
 @RequestMapping(value="registerUser",method=RequestMethod.POST)
 public ModelAndView registerUser(@Valid @ModelAttribute("reg") Register regis,BindingResult result)
 {
	 if(result.hasErrors())
	 {
		 return new ModelAndView("register");
	 }
	 else
	 {
		 return new ModelAndView("ok");
	 }
 }
 
}
