/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Alex
 */
public class Circle implements IShapes{
    public int x;
    public int y;
    public int diam;
    public Circle(){};
    public void setX(int X)
            {
                this.x=X;
            }
     public void setY(int Y)
            {
                this.y=Y;
            }
      public void setDiam(int Diam)
            {
                this.diam=Diam;
            }
    public Circle(int X,int Y,int Diam)
    {
        this.x = X;
        this.y = Y;
        this.diam  = Diam;
    }
    @Override
    public void Draw() {
        System.out.println("Circle x = "+x+" y = "+y+" Diam = "+diam);
        
    }

    @Override
    public void ModifyShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        int X = scanner.nextInt();
        System.out.print("y = ");
        int Y = scanner.nextInt();
        System.out.print("diam = ");
        int Diam = scanner.nextInt();
        
        this.diam = Diam;
        this.x = X;
        this.y = Y;
        
    }

    @Override
    public IShapes CreateShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        int X = scanner.nextInt();
        System.out.print("y = ");
        int Y = scanner.nextInt();
        System.out.print("diam = ");
        int Diam = scanner.nextInt();
        Circle circle = new Circle(X,Y,Diam);
        return circle;
    }

    

}
