/*
An Introduction to Sentence Segmentation

Sentence segmentation means, to split a given paragraph of text into sentences, by identifying the sentence boundaries. 
In many cases, a full stop is all that is required to identify the end of a sentence, but the task is not all that simple.
This is an open ended challenge to which there are no perfect solutions. 
Try to break up given paragraphs into text into individual sentences. 
Even if you don't manage to segment the text perfectly, the more sentences you identify and display correctly, the more you will score.

1. Abbreviations: Dr.W.Watson is amazing. In this case, the first and second "." occurs after Dr (Doctor) and W (initial in the person's name) and should not be confused as the end of the sentence.

2. Sentences enclosed in quotes: "What good are they? They're led about just for show!" remarked another. 
   All of this, should be identified as just one sentence.

3. Questions and exclamations: Who is it? -This is a question. 
   This should be identified as a sentence. I am tired!: Something which has been exclaimed. 
   This should also be identified as a sentence.

INPUT FORMAT

You will be given a chunk of text, containing several sentences, questions, statements and exclamations- all in 1 line.

Constraints
Number of characters in every input does not exceed 10000. 
Number of words in every input does not exceed 1000. There will be more than 1 sentence in each input and this number does not exceed 30. 
There will be more than 2 characters in every expected sentence and this number does not exceed 10000. 
There will be more than 2 characters in every test file and this number does not exceed 10000.

OUTPUT FORMAT

You will split the chunk of text into sentences, and display one sentence per line.
*/

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
        String buffer = null;
        if (thisWord.endsWith("!") || thisWord.endsWith("?") || thisWord.endsWith(":") || thisWord.contains(".")){
 
         // Check if period is in the middle of the sentence 
         if(thisWord.contains(".") && !thisWord.endsWith(".")){
           String[] dotSeparate = thisWord.split("\\.");
           //check if period is in Abbreviation
           if(dotSeparate[0].length()<=3 && Character.isUpperCase(dotSeparate[0].charAt(0)) && Character.isUpperCase(dotSeparate[1].charAt(0)) ){
             thisWord = dotSeparate[0]+"."+dotSeparate[1];
             eos=false;
           } else {
             thisWord = dotSeparate[0]+".";
             eos=true;
             buffer = dotSeparate[1]+" ";
           }
         } else {
           eos=true;
         }
         sb.append(thisWord); 
        } else {
         sb.append(thisWord+" ");
        }  
        
        if(eos){
         String sentence = sb.toString();
         sb = new StringBuilder(); 
         if(buffer != null){
           sb.append(buffer);
           buffer = null;
         } 
         sentenceList.add(sentence);
         eos=false; 
        }
       
      }
      
      for(String s:sentenceList){
        System.out.println(s);
      }
    }
}