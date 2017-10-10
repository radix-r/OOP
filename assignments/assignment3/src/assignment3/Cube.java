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
public class Cube extends Square{
  
  public Cube(Color color, String name, float side){
    super(color,name,side);
  }
  
  public float computeVolume(){
    return this.mSide * this.mSide * this.mSide;
  }
  
  @Override
  public void print(){
    System.out.println("Cube ("+ this.mName +") side: " + this.mSide+
            " and color: java.awt.Color[r="+this.mColor.getRed()+",g="
            +this.mColor.getGreen()+",b="+this.mColor.getBlue()+"]");
    //System.out.println("  Volume: " + computeVolume());
    
    
  }
}
