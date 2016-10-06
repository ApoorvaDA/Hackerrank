import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner sc = new Scanner(System.in);
      StringBuilder sb = new StringBuilder();
      boolean eos = false; 
      
      List<String> sentenceList = new ArrayList<String>();
      
      while(sc.hasNext()){
        String thisWord = sc.next();
       
        if (thisWord.endsWith("!") || thisWord.endsWith("?") || thisWord.endsWith(":") || thisWord.endsWith(".")){
         sb.append(thisWord);
         eos=true; 
        } else {
         sb.append(thisWord+" ");
        }  
        
        if(eos){
         String sentence = sb.toString();
         sb = new StringBuilder(); 
         sentenceList.add(sentence);
         eos=false; 
        }
       
      }
      
      for(String s:sentenceList){
        System.out.println(s);
      }
     
    }
}