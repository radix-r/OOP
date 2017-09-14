/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1; //program fails to run when this isnt commented out

/**
 *
 * @author Ross Wagner
 * 3301656
 * Programming Assignment 1
 * 
 * This program will print 5 different triangles depending on user input
 */
public class Assignment1 {

    private final int HEIGHT = 11;
    
    public enum Patterns{
        bottomLeftTriangle, 
        bottomRightTriangle, 
        topLeftTriangle, 
        topRightTriangle,
        centerTriangle,
    };
    
    // prints a centered isosceles triangle with a height of HEIGHT
    // and a base width of 1+2*height
    void printCenter(char ch){
        //total chars in each line = 1+2*height
        
        int numSpaces = HEIGHT-1;
        int numChars = 1;
        for(int i = 0; i < HEIGHT; i++){
            printNtimes(' ',numSpaces);
            printNtimes(ch,numChars);
            printNtimes(' ',numSpaces);
            numSpaces--;
            numChars += 2;
            System.out.println();
        }
    }
    
    // prints a bottem left justified right triangle 
    void printBottomLeft(char ch){
        for (int i = 0; i < HEIGHT; i++){
            printNtimes(ch, i+1);
            System.out.println();
            
        }
        
    
    }
    
    // prints a top left justified right triangle
    void printTopLeft(char ch){
        for(int i = HEIGHT; i > 0; i--){
            printNtimes(ch,i);
            System.out.println();
        }
        
    }
    
    // prints bottom right justified right triangle
    void printBottomRight(char ch){
        // print HEIGHT spaces then print 1 char
        // decrement number of spaces and increment the number of chars
        int numSpaces = HEIGHT;
        int numChars = 1;
        for(int i = 0; i < HEIGHT; i++){
            printNtimes(' ',numSpaces--);
            printNtimes(ch,numChars++);
            System.out.println();
        }
       
    }
    
    // prints top right justified right triangle
    void printTopRight(char ch){
        int numChars = HEIGHT;
        int numSpaces = 0;
        // print 0 spaces then print HEIGHT chars
        // increment nuber of spaced, decriment number of chars
        for(int i = 0; i < HEIGHT; i++){
            printNtimes(' ',numSpaces++);
            printNtimes(ch,numChars--);
            
            System.out.println();
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
    
    /* 
     *  This function according to the pattenId calls the appropriate print function 
     *  with the input ch. Default printTopLeft is called.
     *
     */
    public void printPattern(Patterns patternId, char ch){
        
        switch (patternId){
            case bottomLeftTriangle:
                this.printBottomLeft(ch);
                break;
            case bottomRightTriangle:
                this.printBottomRight(ch);
                break;
            case topLeftTriangle:
                this.printTopLeft(ch);
                break;
            case topRightTriangle:
                this.printTopRight(ch);
                break;
            case centerTriangle:
                this.printCenter(ch);
                break;
            default:
                this.printTopLeft(ch);
                break;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Assignment1 ass1 = new Assignment1();
        ass1.printPattern(Assignment1.Patterns.bottomLeftTriangle, '*');
        ass1.printPattern(Assignment1.Patterns.bottomRightTriangle, '#');
        ass1.printPattern(Assignment1.Patterns.topLeftTriangle, '@');
        ass1.printPattern(Assignment1.Patterns.topRightTriangle, '%');
        ass1.printPattern(Assignment1.Patterns.centerTriangle, '^');
    }
    
}
