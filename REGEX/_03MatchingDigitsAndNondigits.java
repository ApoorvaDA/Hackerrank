/*
The expression \d matches any digit [0 - 9].
The expression \D matches any character that is not a digit.

Task

You have a test string . Your task is to match the pattern  xxXxxXxxxx
Here x denotes a digit character, and X denotes a non-digit character.
*/
import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;
import java.util.regex.*;

public class MatchingDigitsAndNondigits{
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("\\d\\d\\D\\d\\d\\D\\d\\d\\d\\d");
	}
}

class Regex_Test{
	public void checker(String pattern){
		Scanner Input = new Scanner(System.in);
		String testString = Input.nextLine();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(testString);
		System.out.println(m.find());
	}
}