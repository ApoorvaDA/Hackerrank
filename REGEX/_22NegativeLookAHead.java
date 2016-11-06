/*
regex_1(?!regex_2)
The negative lookahead (?!) asserts regex_1 not to be immediately followed by regex_2. 
Lookahead is excluded from the match (do not consume matches of regex_2), but only assert whether a match is possible or not.

Task

You have a test String S. 
Write a regex which can match all characters which are not immediately followed by that same character.

Example

If S = goooo, then regex should match goooo. 
Because the first g is not followed by g and the last o is not followed by o.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("(.)(?!\\1)"); //Use '\\' instead of '\'.
    
    }
}

class Regex_Test {

    public void checker(String Regex_Pattern){
    
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        int Count = 0;
        while(m.find()){
            Count += 1;
        }
        System.out.format("Number of matches : %d",Count);
    }   
    
}