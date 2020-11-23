/*Codigo Hecho por Juan Angel Gonzalez Flores 201655221*/
package dronesbuap;

import java.awt.Color;


public class Hilo extends Thread{
    protected CoorX X;
    protected CoorY Y;
    protected DroneGraphics Drone;
    protected int AnguloX;
    protected int AnguloY;
    protected final int tam = 25;
    
    //Constructor
    public Hilo(CoorX X, CoorY Y, DroneGraphics Drone){
        this.X = X;
        this.Y = Y;
        this.Drone = Drone;
        this.AnguloX = 1;
        this.AnguloY = 1;
    }

    //Metodo para mover la pelota
    public void run(){
                while(true){
            try { 
                
                //Parte del codigo que averiguara la direccion de la pelota y como es que debe de moverse 
                if(X.getX() + AnguloX < 0){
                    AnguloX = 1;
                }else if(X.getX() + AnguloX > Drone.getWidth() - tam){
                    AnguloX = -1;
                }else if(Y.getY() - AnguloY < 0){
                    AnguloY = 1;
                }else if(Y.getY() - AnguloY > Drone.getHeight()- tam){
                    AnguloY = -1;
                }
        
                X.setX(X.getX() + AnguloX);
                Y.setY(Y.getY() + AnguloY);
                
                sleep(10);
                Drone.repaint();
                
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    
    //Parte que controla los puntos de coordenadas
    public CoorX getX() {
        return X;
    }

    public void setX(CoorX X) {
        this.X = X;
    }

    public CoorY getY() {
        return Y;
    }

    public void setY(CoorY Y) {
        this.Y = Y;
    }
    
    
}
