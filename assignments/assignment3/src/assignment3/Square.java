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
public class Square extends Shape{
  protected float mSide;
  
  public Square(Color color, String name, float side){
    super(color, name);
    this.mSide =side;
    
  }
  public float computeArea(){
    return this.mSide*this.mSide;
  }
  public float computePerimeter(){
    return this.mSide * 4;
  }
  
  @Override
  public void print(){
    System.out.println("Square ("+ this.mName +") side: " + this.mSide+
            " and color: java.awt.Color[r="+this.mColor.getRed()+",g="
            +this.mColor.getGreen()+",b="+this.mColor.getBlue()+"]");
    //System.out.println("  Area: " + computeArea());
    //System.out.println("  Perimiter: " + computePerimeter());
    
    
  }
  
}
