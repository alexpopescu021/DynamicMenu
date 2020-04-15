/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex
 */
public class Canvas {
    public List<IShapes> Shapes = new ArrayList<IShapes>();
    private int Index=0;
    public void DrawShapes()
        {
            for(int i=0;i<Shapes.size();i++)
            {
                Shapes.get(i).Draw();
            }
              
        }
    public void AddShape(IShapes shape)
    {
        Shapes.add(shape.CreateShape());
        Index++;
        
    }
    public void RemoveShapes(int index)
    {
        Shapes.remove(index);
    }
  
    
}
