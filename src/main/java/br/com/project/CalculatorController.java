package br.com.project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	@RequestMapping(value={"", "/", "/home" , "/index"})
	public String get() {
		
		return "Hello, let's calculate!";
	}
	
	@RequestMapping("/addition")
	public Calculator addition(@RequestParam(value="number1", defaultValue="0") float number1, @RequestParam(value="number2", defaultValue="0") float number2) {
		return new Calculator(number1, number2, number1 + number2);
	}
	
	@RequestMapping("/division")
	public Calculator division(@RequestParam(value="number1", defaultValue="0") float number1, @RequestParam(value="number2", defaultValue="0") float number2) {
		return new Calculator(number1, number2, number1 / number2);
	}
	
	@RequestMapping("/subtraction")
	public Calculator subtraction(@RequestParam(value="number1", defaultValue="0") float number1, @RequestParam(value="number2", defaultValue="0") float number2) {
		return new Calculator(number1, number2, number1 - number2);
	}
	
	@RequestMapping("/multiplication")
	public Calculator multiplication(@RequestParam(value="number1", defaultValue="0") float number1, @RequestParam(value="number2", defaultValue="0") float number2) {
		return new Calculator(number1, number2, number1 * number2);
	}
}
