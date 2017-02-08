import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.Rectangle;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        //g.setColor(Color.DARK_GRAY);
                        //g.fillRect(x1, y1, width + 1, height + 1);
                        
                        //Draw a border
                        //g.setColor(Color.YELLOW);
                        //g.drawRect(x1, y1, width, height);
                        
                        //Draw a second border
                        //g.setColor(Color.BLACK);
                        //g.drawRect(x1+5, y1 + 5, width - 10, height - 10);
                        
                        //g.setColor(Color.WHITE);
                        //g.drawLine(x1, y1, x2, y2);
                        
                        //g.setColor(Color.BLUE);
                        //g.drawLine(x1 + width, y1, x2 - width, y2);
                     
                        //g.setColor(Color.LIGHT_GRAY);
                        //g.fillOval(width/2 - 55/2, height/2 - 55/2, 55, 55);
                        
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                        
                        //Polygon p2 = new Polygon();
                        //p2.addPoint(x1 + 25, y1 + 73);
                       // p2.addPoint(x1 + 41, y1 + 73);
                       // p2.addPoint(x1 + 47, y1 + 58);
                       // p2.addPoint(x1 + 53, y1 + 73);
                       // p2.addPoint(x1 + 69, y1 + 73);
                       // p2.addPoint(x1 + 56, y1 + 83);
                       // p2.addPoint(x1 + 61, y1 + 98);
                        //p2.addPoint(x1 + 47, y1 + 88);
                        //p2.addPoint(x1 + 34, y1 + 98);
                        //p2.addPoint(x1 + 38, y1 + 83);
                        //g.setColor(Color.WHITE);
                        //g.drawPolygon(p2);
                        
                        //For Rectangles
                        Graphics2D g2 = (Graphics2D) g;
                        
                        Rectangle.Double redStripes = new Rectangle.Double(x1 + 10, y1 + 10, 230, 140);
                        g2.setColor(Color.RED);
                        g2.fill(redStripes);
                        
                        Rectangle.Double firstWhiteStripe = new Rectangle.Double(x1 + 10, y1 + 38, 230, 28);
                        g2.setColor(Color.WHITE);
                        g2.fill(firstWhiteStripe);
                        
                        Rectangle.Double secondWhiteStripe = new Rectangle.Double(x1 + 10, y1 +94, 230, 28);
                        g2.setColor(Color.WHITE);
                        g2.fill(secondWhiteStripe);
                        
                        Polygon triangle = new Polygon();
                        triangle.addPoint(x1 + 10, y1 + 10);
                        triangle.addPoint(x1 + 115, y1 + 80);
                        triangle.addPoint(x1 + 10, y1 + 150);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(triangle);
                        
                        Polygon star = new Polygon();
                        star.addPoint(x1 + 25, y1 + 73);
                        star.addPoint(x1 + 41, y1 + 73);
                        star.addPoint(x1 + 47, y1 + 58);
                        star.addPoint(x1 + 53, y1 + 73);
                        star.addPoint(x1 + 69, y1 + 73);
                        star.addPoint(x1 + 56, y1 + 83);
                        star.addPoint(x1 + 61, y1 + 98);
                        star.addPoint(x1 + 47, y1 + 88);
                        star.addPoint(x1 + 34, y1 + 98);
                        star.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(star);
                        
                        
                        
            }
}