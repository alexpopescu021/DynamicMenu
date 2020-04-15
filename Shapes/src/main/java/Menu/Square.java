/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Square implements IShapes{
    public int Ax;
    public int Ay;
    public int Cx;
    public int Cy;
    public Square(){};
    public Square(int X,int Y,int x,int y)
    {
        this.Ax = X;
        this.Ay = Y;
        this.Cx = x;
        this.Cy = y;
    }

   
    @Override
    public void Draw() {
        System.out.println("Square Ax = "+Ax+" Ay = "+Ay+" Cx = "+Cx+" Cy = "+Cy);
        
    }

    @Override
    public void ModifyShape() {
Scanner scanner = new Scanner(System.in);
        System.out.print("Ax = ");
        int X = scanner.nextInt();
        System.out.print("Ay = ");
        int Y = scanner.nextInt();
        System.out.print("Cx = ");
        int x = scanner.nextInt();
        System.out.print("Cy = ");
        int y = scanner.nextInt();
        this.Ax = X;
        this.Ay = Y;
        this.Cx = x;
        this.Cy = y;
       }

    @Override
    public IShapes CreateShape() {
 Scanner scanner = new Scanner(System.in);
         System.out.print("Ax = ");
        int X = scanner.nextInt();
        System.out.print("Ay = ");
        int Y = scanner.nextInt();
        System.out.print("Cx = ");
        int x = scanner.nextInt();
        System.out.print("Cy = ");
        int y = scanner.nextInt();
        Square square = new Square(X,Y,x,y);
        return square;    
    }
}
