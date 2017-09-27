/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author Ross Wanger
 * pid: 3301656
 * nid: ro520462
 * 
 */



public class SentenceUtils {
    private ArrayList<String> mLetterGroups;
    private int mLetterGroupLen;
    
    // constructor 
    public SentenceUtils(int letterGroupLen){
        // declare list of letter groupings
        this.mLetterGroups = new ArrayList<>();
        this.mLetterGroupLen = letterGroupLen;
    }
    
    /**
     * 
     * @param line
     */
    public void addWords(String line){
        String[] tokens = this.getTokens(line);
        this.splitTokenstoLetterGroups(tokens);
    }
    
    /**
     * 
     * @return 
     */
    public ArrayList<String> getLetterGroups(){
        return (this.mLetterGroups);
    }
     
    /*
    This Function splits a string into array of strings seperated by space character
    input: a string
    output: array of words seperated by space character
    
    example: input: "object oriented"
    output: ["object", "oriented"]
    */
    private String[] getTokens(String line){
        String[] words = line.split("\\s");
        return words;
    }
    /*
    This function splits the tokens into letter groups according to
    this.mLetterGroupLen
    input: array of tokens
    output: letterGroups of size this.mLetterGroupLen appended to 
    this.mLetterGroups
    
    ex:
    input: ["object","oriented"] 
    output: this.mLetterGroups (of size 4) = this.mLetterGroups + 
    ["obje","bjec","ject","orie","rien","ient","ente","nted"]
    */
    private void splitTokenstoLetterGroups(String[] tokens){
        //List<String> tokensList = new ArrayList
        for (String token : tokens) {
            int length = token.length();
            for(int j = 0; (j+ this.mLetterGroupLen) <= length ;j++ ){
                String subStr = token.substring(j,j+this.mLetterGroupLen);
                // convert to lower case
                subStr = subStr.toLowerCase();
                boolean add = this.mLetterGroups.add(subStr);
                if(!add){
                    // throw an error?
                }
            }
        }
    }
    
    /**
     * unit tests
     * 
     * @param args string to be tokenized
     */
    public static void main(String[] args){
      
      // get user input from command line
      // must be two command line arguements 
      if (args.length != 2){
        System.out.println("Usage: java -jar assignment2.jar <Text.txt> <letter group size(int)>");
        // prevent the program from going further
        return;
      }
      /*How should I order these?*/
      // args[0] should be the name of the text file
      String fileName = args[0];
      //args[1] should be an int, the number of letters per group
      int letterGroupLen;
      // string to put the text file into
      String text = "";
      // object for creating letter groups
      SentenceUtils sentence;
      // histogram object for generating the histogram
      Histogram hist;
      // array that the letter groups will be put into
      String[] letterGroups;
      // array of words tokenized form the text file bases on spaces
      String[] words; 
      
      try{
        letterGroupLen = Integer.parseInt(args[1]);
        
      }catch(NumberFormatException numEx){
        System.out.println("Usage: java -jar assignment2.jar <Text.txt> <letter group size(int)>");
        return;
      }
      
      try {
        File file = new File(fileName);
        Scanner sc = new Scanner(new FileInputStream(file));
        
        // read from text file
        while(sc.hasNext()){
          text += sc.nextLine() + " ";
        }
      }catch (FileNotFoundException ex) {
        Logger.getLogger(SentenceUtils.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println("File: "+fileName+" not found");
        return;
      }
      
      sentence = new SentenceUtils(letterGroupLen);
      hist = new Histogram();
      words = sentence.getTokens(text);
      // split words into letter groups
      sentence.splitTokenstoLetterGroups(words);
      // generate the histogram
      hist.generateHistogram(sentence.getLetterGroups());
      // print the histogram
      hist.printHistogram();
    }
}
