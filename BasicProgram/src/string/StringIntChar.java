package string;

import java.util.Scanner;

public class StringIntChar {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		String st = "abdc";
		st = st+"xyz";
		st = st+'r';
		st = st+123;
		System.out.println(st);
	}
	

}
