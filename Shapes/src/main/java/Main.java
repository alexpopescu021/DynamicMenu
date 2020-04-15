/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Menu.Canvas;
import Menu.Circle;
import Menu.IMenuItem;
import Menu.Menu;
import Menu.MenuItem;
import Menu.Square;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author catalin
 */
public class Main {

   
 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(" === Encode/Decode utility ====");
        Menu mainMenu = initializeMainMenu();           
        mainMenu.execute();
        
    }
    
    private static Menu initializeMainMenu()
    {
        ArrayList<IMenuItem> mainMenuItems = new ArrayList();
        ArrayList<IMenuItem> AddMenuItems = new ArrayList();
        
        Canvas canvas = new Canvas();
        
        Scanner scanner = new Scanner(System.in);
        AddMenuItems.add(new MenuItem("Circle", 
                                            1, 
                                            (parameters)->{
                                                
                                                canvas.AddShape(new Circle());
                                                System.out.println("Shape created");
                                            }));
                
        AddMenuItems.add(new MenuItem("Square", 
                                            2, 
                                            (parameters)->{
                                              canvas.AddShape(new Square());
                                              System.out.println("Shape created");
                                            }));
          
        mainMenuItems.add(new Menu("Add", 1, AddMenuItems));
        mainMenuItems.add(new MenuItem("Delete", 2, (parameters)->{
        System.out.println("Please enter the index of the shape to be deleted");
           int i=scanner.nextInt();
            canvas.RemoveShapes(i);}));        
        mainMenuItems.add(new MenuItem("Modify", 3, (parameters)->{
        System.out.println("Please enter the index of the shape to be Modified");
           int i=scanner.nextInt();
            canvas.Shapes.get(i).ModifyShape();}));        
        mainMenuItems.add(new MenuItem("Show Canvas", 4,(parameters)->{canvas.DrawShapes();} ));        
        
        return new Menu("Main Menu", 0, mainMenuItems); 
        
        
    }
    
   
    
}
