/*Codigo Hecho por Juan Angel Gonzalez Flores 201655221*/
package dronesgrapfinal;

import java.awt.Color;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JPanel;


public class Hilo extends Thread{
    protected CoorX X;
    protected CoorY Y;
    protected DroneGraphic Drone;
    protected JPanel InnerPanel;
    protected int AnguloX;
    protected int AnguloY;
    protected final int tam = 25;
    protected int noHilos;
    protected boolean Pausa;
    
  
    private final int TIME = 10;
    //Constructor
    public Hilo(CoorX X, CoorY Y, DroneGraphic Drone, JPanel InnerPanel){
        this.X = X;
        this.Y = Y;
        this.Drone = Drone;
        this.AnguloX = 1;
        this.AnguloY = 1;
        this.InnerPanel = InnerPanel;
        this.Pausa = false;
    }

    //Metodo para mover la pelota

    public void run(){
                
        while(true){

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
                    Drone.setX(X);
                    Drone.setY(Y);
                    Drone.repaint();
            try { 
                this.sleep( (long)(Math.random()*25) + 1 );
  
            
            }catch (Exception e) {
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

    public int getAnguloX() {
        return AnguloX;
    }

    public void setAnguloX(int AnguloX) {
        this.AnguloX = AnguloX;
    }

    public int getAnguloY() {
        return AnguloY;
    }

    public void setAnguloY(int AnguloY) {
        this.AnguloY = AnguloY;
    }
    
    public void setAngulos(){
        this.AnguloX = 1;
        this.AnguloY = 1;
    }

    synchronized void pausar(){
        this.Pausa = true;
        notify();
    }

    public DroneGraphic getDrone() {
        return Drone;
    }

    public void setDrone(DroneGraphic Drone) {
        this.Drone = Drone;
    }

    public JPanel getInnerPanel() {
        return InnerPanel;
    }

    public void setInnerPanel(JPanel InnerPanel) {
        this.InnerPanel = InnerPanel;
    }
    
    
}
