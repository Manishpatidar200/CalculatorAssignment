package com.calculator.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.calculator.calculator.bean.Calculator;
import com.calculator.calculator.service.CalcService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CalculatorController {
	
	@Autowired(required = true)
    private CalcService service;
	
	Calculator c=new Calculator();

	@GetMapping("/iii")
	public ModelAndView calc(){
		ModelAndView mv= new ModelAndView();
		mv.setViewName("index");
		return mv;
		
	}
	
  @GetMapping("/sum/{x}/{y}")
  public double add(@PathVariable double x , @PathVariable double y) {
	  c= service.add(x,y);
	  return c.getResult();  
  }
  
  @GetMapping("/sub/{x}/{y}")
  public double subtract(@PathVariable double x , @PathVariable double y) {
	  c= service.subtract(x,y);
	return c.getResult();
  
  }
  
  @GetMapping("/mul/{x}/{y}")
  public double multiply(@PathVariable double x , @PathVariable double y) {
	  c= service.multiply(x,y);
	  return c.getResult();
  
  }
  @GetMapping("/div/{x}/{y}")
  public double divide(@PathVariable double x , @PathVariable double y) {
	  c=service.divide(x,y);
	  return c.getResult();
  
  }
}
