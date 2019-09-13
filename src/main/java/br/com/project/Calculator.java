package br.com.project;

public class Calculator {

	private float number1 = 0;
	private float number2 = 0;
	private float result = 0;

	public Calculator(float number1, float number2, float result) {
		this.number1 = number1;
		this.number2 = number2;
		this.result = result;
	}
	
	public float getNum1() {
		return number1;
	}
	
	public float getNum2() {
		return number2;
	}
	
	public float getResult() {
		return result;
	}
}
