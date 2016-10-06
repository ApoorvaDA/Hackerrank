/*Task :
You have a test string . Your task is to match the string hackerrank. This is case sensitive.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MatchingSpecificString{
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("hackerrank");
	}
}

class Regex_Test{
	public void checker(String RegexPattern){
		Scanner Input = new Scanner(System.in);
		String TestString = Input.nextLine();
		Pattern p = Pattern.compile(RegexPattern);
		Matcher m = p.Matcher(TestString);
		int Count=0;
		while(m.find()){
			Count+=1;
		}
		System.out.format("Number of matches : %d",Count);
	}

}
