// GraphicsLab02st.java
// Student version of the GraphicsLab02st assignment.

import java.awt.*;
import java.applet.*;

public class GraphicsLab02_Matthew_Pearce extends Applet
{
    public void paint(Graphics g)
    {
        int width = 980;
        int height = 630;
        g.drawRect(10,10,width,height);
        
        // Draw bottom-left corner
           
          // g.setColor(Color.orange);
            {
        int x1=10;
        int y1=630;
        int x2=980;
        int y2=640;
        
        for (int r=1;r <62; r++)
          {
          g.drawLine(x1,y1,x2,y2);
          
          y1-=10;
          
         
         x2-= 15.55555 ;
          
         } 
         }
 
        // Draw bottom-right corner
      //   g.setColor(Color.red);
         {
        int x1=990;
        int y1=630;
        int x2=10;
        int y2=640;
        
        for (int r=1;r <62; r++)
          {
          g.drawLine(x1,y1,x2,y2);
          
          y1-=10;
          
         
         x2+= 16.7 ;
          
         } 
         }

        // Draw top-right corner
       //  g.setColor(Color.green);
      {
        int x1=990;
        int y1=10;
        int x2=10;
        int y2=10;
        
        for (int r=1;r <62; r++)
          {
          g.drawLine(x1,y1,x2,y2);
          
          y1+=10;
          
         
         x2+= 16.7 ;
          
         } 
         }    
        // Draw top-left corner
              
         // g.setColor(Color.blue);
         {
        int x1=10;
        int y1=10;
        int x2=980;
        int y2=10;
        
        for (int r=1;r <62; r++)
          {
          g.drawLine(x1,y1,x2,y2);
          
          y1+=10;
          
         
         x2-= 15.55555 ;
          
         } 
         }
         
         
         
         //draw second border
         
         g.drawRect(197,200,600,245);       
         
         //2nd bottom right
         // g.setColor(Color.blue);
          {
        int x1=197;
        int y1=440;
        int x2=797;
        int y2=445;
        
        for (int r=1;r <62; r++)
          {
          g.drawLine(x1,y1,x2,y2);
          
          y1-=3.951;
          
         
         x2-= 9.677 ;
          
         } 
         }
         
         //2nd bottom left
         
         //g.setColor(Color.green);
          {
        int x1=797;
        int y1=440;
        int x2=197;
        int y2=445;
        
        for (int r=1;r <62; r++)
          {
          g.drawLine(x1,y1,x2,y2);
          
          y1-=3.951;
          
         
         x2+= 10.38 ;
          
         } 
         }
         
         //2nd top left
        // g.setColor(Color.red);
          {
        int x1=797;
        int y1=200;
        int x2=197;
        int y2=200;
        
        for (int r=1;r <61; r++)
          {
          g.drawLine(x1,y1,x2,y2);
          
          y1+=4.2;
          
         
         x2+= 10.38 ;
          
         } 
         }
         
         //second top left
       //  g.setColor(Color.orange);
            {
        int x1=197;
        int y1=200;
        int x2=797;
        int y2=200;
        
        for (int r=1;r <62; r++)
          {
          g.drawLine(x1,y1,x2,y2);
          
          y1+=4.2;
          
         
         x2-= 9.677 ;
          
         } 
         }

             }
}
 