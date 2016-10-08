/*
Alternations ( | ), matches single regular expression out of several possible regexes. It matches either everything to the left or everything to the right of the vertical bar. 
We need to use parenthesis to limit the use of alternations.


For example :

(Bob|Kevin|Stuart) : It will match either Bob or Kevin or Stuart. 
([a-f]|[A-F]) : It will match a, b, c, d, e, f, A, B, C, D, E or F.

Task

You have a test String S. 
Your task is to write a regex which will match S with following conditions:

S must start with Mr., Mrs., Ms., Dr. or Er..
And after that it must be followed by one or more letters (lowercase and uppercase both) only.

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("(Mr|Mrs|Ms|Dr|Er)\\.[A-Za-z]+$"); // Use \\ instead of using \ 
    
    }
}

class Regex_Test {

    public void checker(String Regex_Pattern){
    
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }   
    
}