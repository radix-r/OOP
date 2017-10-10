/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.awt.Color;
/**
 *
 * @author rwagner
 */
public class Shape {
  protected Color mColor;
  protected String mName;
  
  public Shape(Color color, String name){
    this.mColor = color;
    this.mName = name;
  }
  
  public String getName(){
    return this.mName;
  }
  
  public Color getColor(){
    return this.mColor;
  }
  
  public void setName(String name){
    this.mName = name;
  }
  
  public void setColor(Color color){
    this.mColor = color;
  }
  /**
   * prints type, the name, and the quantitative parameter of the shape
   */
  public void print(){
    System.out.print("Shape ");
    System.out.print("("+ this.mName+") ");
    // no peramiter to print
    System.out.println("and color: java.awt.Color[r="+this.mColor.getRed()+",g="
            +this.mColor.getGreen()+",b="+this.mColor.getBlue()+"]");
  }
  
}
