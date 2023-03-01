package com.calculator.calculator.service;

import com.calculator.calculator.bean.Calculator;

public interface CalcService {

	Calculator add(double x, double y);

	Calculator subtract(double x, double y);

	Calculator multiply(double x, double y);

	Calculator divide(double x, double y);
	

}
