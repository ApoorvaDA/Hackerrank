/*
The dot (.) matches anything (except for a newline).
Task:
You have a test string . 
Your task is to match the pattern abc.def.ghi.jkx, where each variable a,b,c,d,e,f,g,h,i,j,k,x can be any single character except the newline.

Note:
If you want to match (.) in the test string, you need to escape the dot by using a slash \..
In Java, use \\. instead of \.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MatchingAnythingButANewLine{
	public static void main(String[] args) {
		Tester tester = new Tester();
		tester.check("...\\....\\....\\....");
	}
}

class Tester{
	public void check(String pattern){
		Scanner Input = new Scanner(System.in);
		String testString = Input.nextLine();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(testString);
		boolean match = m.matches();

		System.out.format("%s",match);
	}
}