package br.com.project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	private static final String template = "Total: %s";
	

	@RequestMapping(value={"", "/", "/home" , "/index"})
	public String get() {
		
		return "Hello, let's calculate!";
	}
	
	@RequestMapping("/sum")
	public String sum(@RequestParam(value="number1", defaultValue="0") float number1, @RequestParam(value="number2", defaultValue="0") float number2) {
		
		return String.format(template, number1 + number2);
	}
	
	@RequestMapping("/division")
	public String division(@RequestParam(value="number1", defaultValue="0") float number1, @RequestParam(value="number2", defaultValue="0") float number2) {
		
		return String.format(template, number1 / number2);
	}
	
	@RequestMapping("/subtraction")
	public String subtraction(@RequestParam(value="number1", defaultValue="0") float number1, @RequestParam(value="number2", defaultValue="0") float number2) {
		
		return String.format(template, number1 - number2);
	}
	
	@RequestMapping("/multiplication")
	public String multiplication(@RequestParam(value="number1", defaultValue="0") float number1, @RequestParam(value="number2", defaultValue="0") float number2) {
		
		return String.format(template, number1 * number2);
	}
}
