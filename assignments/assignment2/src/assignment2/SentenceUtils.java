/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;
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
      //String test = "the quick brown fox jumps over the lazy dog";
      String test = "object oriented";
      SentenceUtils sentence = new SentenceUtils(4);
      // number of letter groups
      int size;
      // array that the letter groups will be put into
      String[] letterGroups;
              
      String[] words = sentence.getTokens(test);
      sentence.splitTokenstoLetterGroups(words);
      size = sentence.getLetterGroups().size();
      letterGroups = new String[size];
      sentence.getLetterGroups().toArray(letterGroups);
      
      for(String group:letterGroups){
          System.out.println(group);
      }
    }
}
