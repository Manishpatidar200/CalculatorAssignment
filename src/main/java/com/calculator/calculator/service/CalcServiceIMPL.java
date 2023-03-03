package com.calculator.calculator.service;

import org.apache.logging.log4j.Logger;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.calculator.calculator.bean.Calculator;

@Service
public class CalcServiceIMPL implements CalcService {

	
	java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());
	@Override
	@Cacheable(cacheNames="Calculator", key="#x")
	public Calculator add(double x, double y) {
		// TODO Auto-generated method stub
		logger.info("data fatching from method");
		return new Calculator(x,y,x+y) ;
	}

	@Override
	@Cacheable(cacheNames="Calculator", key="#x")
	public Calculator subtract(double x, double y) {
		// TODO Auto-generated method stub
		logger.info("data fatching from method");
		return new Calculator(x,y,x-y);
	}

	@Override
	@Cacheable(cacheNames="Calculator", key="#x")
	public Calculator multiply(double x, double y) {
		// TODO Auto-generated method stub
		logger.info("data fatching from method");
		return new Calculator(x,y,x*y);
	}

	@Override
	@Cacheable(cacheNames="Calculator", key="#x")
	public Calculator divide(double x, double y) {
		// TODO Auto-generated method stub
		logger.info("data fatching from method");
		return new Calculator(x,y,x/y);
	}
	}


