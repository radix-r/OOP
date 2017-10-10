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
public class Circle extends Shape{
  
  protected float mRadius;
  
  public Circle(Color color,String name, float radius){
    super(color,name);
    this.mRadius = radius;
  }
  
  public float computeArea(){
    return this.mRadius*this.mRadius*3.14f;
  }
  public float computePerimeter(){
    return this.mRadius * 3.14f *2.0f;
  }
  
  @Override
  public void print(){
    System.out.println("Circle ("+ this.mName +") radius: " + this.mRadius+
            " and color: java.awt.Color[r="+this.mColor.getRed()+",g="
            +this.mColor.getGreen()+",b="+this.mColor.getBlue()+"]");
    //System.out.println("  Area: " + computeArea());
    //System.out.println("  Perimiter: " + computePerimeter());
    
  }
  
}
