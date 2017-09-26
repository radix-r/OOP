/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;

import java.util.HashMap;


/**
 *
 * @author rwagner
 */
public class Histogram {
  
  private HashMap<String, Integer> mHistogram;
  
  public Histogram(){
    // initalize mHistogram
    this.mHistogram = new HashMap<>();
  }
  
  /*
  This function count the number of occurences of each letter group
  input: letter groups
  output: histogram
  
  ex:
  input: ["an","an","or","or","or"]
  output: [<"an",2>,<"or",3>]
  */
  public void generateHistogram(ArrayList<String> letterGroups){
    // for each group in LetterGroups
    for(String group:letterGroups){
      //if letter group is not in map add it to the map
      //else incrment the value associate with the letter group
      if(this.mHistogram.containsKey(group)){
        //increment
        this.mHistogram.put(group,this.mHistogram.get(group)+1);
      }
      else{
        // add to map
        this.mHistogram.put(group,1);
      }
    }
  }
  
  /*
  This function prints the histogram 
  input: histogram
  output: historam printed on the display
  
  ex:
  input: [<"an",2>, <"or", 3>]
  output:
  
  an: **
  or: ***
  
  */
  public void printHistogram(){
    for (HashMap.Entry<String, Integer> pair : this.mHistogram.entrySet()) {
      int intVal = pair.getValue();
      System.out.print(pair.getKey() + ": ");
      printNtimes('*',intVal);
      System.out.println('\n');
    }
    
  }
  /*
    A helper function that will print a given char n times
  */
    private void printNtimes(char ch, int n){
        for(int i = 0; i < n; i++){
            System.out.print(ch);
        }   
    }
    
    /**
     * unit testing
   * @param args command line arguements 
     */
    public static void main(String[] args){
      
      
    }
}
