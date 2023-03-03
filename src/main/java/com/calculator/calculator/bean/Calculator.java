package com.calculator.calculator.bean;

public class Calculator {
	
	double num1;
	//String operation;
	double num2;
	double result;
	public Calculator(double num1, double num2, double result) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.result = result;
	}
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Calculator [num1=" + num1 + ", num2=" + num2 + ", result=" + result + "]";
	}
	
}
