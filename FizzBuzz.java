package demo;

import java.util.Scanner;

public class FizzBuzz {
	/*public static void main(String[] args) {
		for(int i=0; i++; i<100) {
			print()
		}
	}*/
	public String of(int i){
		String str_i = String.valueOf(i);
		if(i%3==0||str_i.contains("3")) {
			if(i%5==0||str_i.contains("5")) {
				return "FizzBuzz";
			}
			return "Fizz";
		}
		else if(i%5==0||str_i.contains("5")) {
			if(i%3==0||str_i.contains("3")) {
				return "FizzBuzz";
			}
			return "Buzz";
		}
		else {
			return String.valueOf(i);
		}
	}
}
