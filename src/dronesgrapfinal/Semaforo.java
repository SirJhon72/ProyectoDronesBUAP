/*Codigo Hecho por Juan Angel Gonzalez Flores 201655221*/
package dronesgrapfinal;
import java.awt.Color;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JPanel;


public class Semaforo extends Thread{
    protected CoorX X;
    protected CoorY Y;
    protected DroneGraphic Drone;
    protected JPanel InnerPanel;
    protected int AnguloX;
    protected int AnguloY;
    protected final int tam = 25;
    protected int noHilos;
    protected boolean Pausa;
    protected Semaphore Semp;
    protected ArrayList<Double> Tiempo = new ArrayList<>();
    protected ArrayList<Double> EjeX = new ArrayList<>();
    protected static double TiempoEspera;
    protected boolean Stop;
    protected boolean CargarDatos;

    //Constructor
    public Semaforo(CoorX X, CoorY Y, DroneGraphic Drone, JPanel InnerPanel, Semaphore Semp){
        this.X = X;
        this.Y = Y;
        this.Drone = Drone;
        this.AnguloX = 1;
        this.AnguloY = 1;
        this.InnerPanel = InnerPanel;
        this.Pausa = false;
        this.Stop = false;
        this.CargarDatos = false;
        this.Semp = Semp;
    }

    //Metodo para mover la pelota

   
    @Override
    public void run(){
                
        while(true){
             
                try{
                    //Para matar al hilo
                    if(Stop == true){
                        break;
                    }
                                                     
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
                    //Drone.repaint();
                    InnerPanel.repaint();  
                    
                    Semp.acquire(); 
                    TiempoEspera = Math.random() * 5 + 1;
                    sleep((long)TiempoEspera); 
                    if(Tiempo.size() < 150){
                        Tiempo.add(TiempoEspera);
                    }       
                }              
                catch (Exception e) {
                    e.printStackTrace();
                }finally{
                    Semp.release();
                }  
        
    }
    }
    
    //Funcion para matar al hilo
    synchronized void Detener(){
        Stop = true;
    }
    
    synchronized void CargarDatos(){
        CargarDatos = true;
    }
 
    //Setter Y Getter de los ArrayList 
    
    //ArrayList de tiempo
    public ArrayList<Double> getTiempo() {
        return Tiempo;
    }

    public void setTiempo(ArrayList<Double> Tiempo) {
        this.Tiempo = Tiempo;
    }
      
    //ArrayList del ejeX
    public ArrayList<Double> getEjeX() {
        return EjeX;
    }

    public void setEjeX(ArrayList<Double> EjeX) {
        this.EjeX = EjeX;
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
