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
public class Main {
  public static void main(String[] args) {

        // TODO code application logic here
        Circle circle = new Circle(Color.RED, "myCircle", 2.f);

        circle.print();

        System.out.println("  Area : "+circle.computeArea());

        System.out.println("  Perimeter : "+circle.computePerimeter());

       

        Square square = new Square(Color.BLUE, "mySquare", 3.5f);

        square.print();

        System.out.println("  Area : "+square.computeArea());

        System.out.println("  Perimeter : "+square.computePerimeter());

       

        Cube cube = new Cube(Color.CYAN, "myCube", 2.3f);

        cube.print();

        System.out.println("  Volume : "+cube.computeVolume());

    }
}
