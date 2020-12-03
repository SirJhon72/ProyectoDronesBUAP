
package dronesgrapfinal;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;


public class DroneGraphic extends JPanel{
    protected CoorX X;
    protected CoorY Y;
    protected int Num;
    protected final int tam = 25;
    
    public DroneGraphic(CoorX x, CoorY y, int Num){
        this.X = x;
        this.Y = y;
        this.Num = Num;
    }


    public void setX(CoorX X) {
        this.X = X;
    }

    public void setY(CoorY Y) {
        this.Y = Y;
    }
    
    
    
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        
        g2.setColor(Color.black);  
        g2.fill(new Ellipse2D.Double(X.getX(),Y.getY(),tam,tam));
        g2.setColor(Color.white);
        g2.drawString(String.valueOf(Num), X.getX()+(tam/2), Y.getY()+(tam/2));
              
    }
    
}