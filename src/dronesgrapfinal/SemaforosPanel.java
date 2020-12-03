
package dronesgrapfinal;

import java.awt.BasicStroke;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Semaphore;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.DefaultXYDataset;


public class SemaforosPanel extends javax.swing.JPanel {
    //Variables para nuestros drones 
    protected DroneGraphic DroneG1, DroneG2, DroneG3, DroneG4, DroneG5, DroneG6
            , DroneG7, DroneG8, DroneG9, DroneG10;
    
    //Variables para nuestros hilos
    protected Semaforo DroneSemp1, DroneSemp2, DroneSemp3 , DroneSemp4, DroneSemp5,
            DroneSemp6, DroneSemp7, DroneSemp8, DroneSemp9, DroneSemp10;
    
    //Variables para nuestras coordenas
    protected CoorX DroneX1, DroneX2, DroneX3, DroneX4, DroneX5, DroneX6, DroneX7, 
            DroneX8, DroneX9, DroneX10;
    protected CoorY DroneY1, DroneY2, DroneY3, DroneY4, DroneY5, DroneY6, DroneY7,
            DroneY8, DroneY9, DroneY10;
    
    
    
    //Variables para el ancho y alto 
    protected int ancho, alto;
 
    public SemaforosPanel() {
        initComponents();
      
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
    //Funcion para inicializar todas nuestras variables
    protected void InicializacionSemaforos(){
        //Variable para el semaforo
        Semaphore Semaforo = new Semaphore(1, true);
        //Inicializacion para el drone 1
        DroneX1 = new CoorX(0);
        DroneY1 = new CoorY(0);
        DroneG1 = new DroneGraphic(DroneX1, DroneY1, 1);
        this.add(DroneG1);
        DroneG1.setBounds(0, 0, 0, 0);
        DroneG1.setOpaque(false);
        DroneG1.setVisible(false);
        DroneSemp1 = new Semaforo(DroneX1, DroneY1, DroneG1, this, Semaforo);
        DroneSemp1.setName("Drone 1");
        
        //Inicializacion para el drone 2
        DroneX2 = new CoorX(0);
        DroneY2 = new CoorY(0);
        DroneG2 = new DroneGraphic(DroneX1, DroneY1, 2);
        this.add(DroneG2);
        DroneG2.setBounds(0, 0, 0, 0);
        DroneG2.setOpaque(false);
        DroneG2.setVisible(false);
        DroneSemp2 = new Semaforo(DroneX1, DroneY1, DroneG2, this, Semaforo);
        DroneSemp2.setName("Drone 2");
        
        //Inicializacion para el drone 3
        DroneX3 = new CoorX(0);
        DroneY3 = new CoorY(0);
        DroneG3 = new DroneGraphic(DroneX1, DroneY1, 3);
        this.add(DroneG3);
        DroneG3.setBounds(0, 0, 0, 0);
        DroneG3.setOpaque(false);
        DroneG3.setVisible(false);
        DroneSemp3 = new Semaforo(DroneX1, DroneY1, DroneG3, this, Semaforo);
        DroneSemp3.setName("Drone 3");
        
        //Inicializacion para el drone 4
        DroneX4 = new CoorX(0);
        DroneY4 = new CoorY(0);
        DroneG4 = new DroneGraphic(DroneX1, DroneY1, 4);
        this.add(DroneG4);
        DroneG4.setBounds(0, 0, 0, 0);
        DroneG4.setOpaque(false);
        DroneG4.setVisible(false);
        DroneSemp4 = new Semaforo(DroneX1, DroneY1, DroneG4, this, Semaforo);
        DroneSemp4.setName("Drone 4");
        
        
        //Inicializacion para el drone 5
        DroneX5 = new CoorX(0);
        DroneY5 = new CoorY(0);
        DroneG5 = new DroneGraphic(DroneX1, DroneY1, 5);
        this.add(DroneG5);
        DroneG5.setBounds(0, 0, 0, 0);
        DroneG5.setOpaque(false);
        DroneG5.setVisible(false);
        DroneSemp5 = new Semaforo(DroneX1, DroneY1, DroneG5, this, Semaforo);
        DroneSemp5.setName("Drone 5");
        
        //Inicializacion para el drone 6
        DroneX6 = new CoorX(0);
        DroneY6 = new CoorY(0);
        DroneG6 = new DroneGraphic(DroneX1, DroneY1, 6);
        this.add(DroneG6);
        DroneG6.setBounds(0, 0, 0, 0);
        DroneG6.setOpaque(false);
        DroneG6.setVisible(false);
        DroneSemp6 = new Semaforo(DroneX1, DroneY1, DroneG6, this, Semaforo);
        DroneSemp6.setName("Drone 6");
        
        //Inicializacion para el drone 7
        DroneX7 = new CoorX(0);
        DroneY7 = new CoorY(0);
        DroneG7 = new DroneGraphic(DroneX1, DroneY1, 7);
        this.add(DroneG7);
        DroneG7.setBounds(0, 0, 0, 0);
        DroneG7.setOpaque(false);
        DroneG7.setVisible(false);
        DroneSemp7 = new Semaforo(DroneX1, DroneY1, DroneG7, this, Semaforo);
        DroneSemp7.setName("Drone 7");
        
        //Inicializacion para el drone 8
        DroneX8 = new CoorX(0);
        DroneY8 = new CoorY(0);
        DroneG8 = new DroneGraphic(DroneX1, DroneY1, 8);
        this.add(DroneG8);
        DroneG8.setBounds(0, 0, 0, 0);
        DroneG8.setOpaque(false);
        DroneG8.setVisible(false);
        DroneSemp8 = new Semaforo(DroneX1, DroneY1, DroneG8, this, Semaforo);
        DroneSemp8.setName("Drone 8");
        
        //Inicializacion para el drone 9
        DroneX9 = new CoorX(0);
        DroneY9 = new CoorY(0);
        DroneG9 = new DroneGraphic(DroneX1, DroneY1, 9);
        this.add(DroneG9);
        DroneG9.setBounds(0, 0, 0, 0);
        DroneG9.setOpaque(false);
        DroneG9.setVisible(false);
        DroneSemp9 = new Semaforo(DroneX1, DroneY1, DroneG9, this, Semaforo);
        DroneSemp9.setName("Drone 9");
        
        //Inicializacion para el drone 10
        DroneX10 = new CoorX(0);
        DroneY10 = new CoorY(0);
        DroneG10 = new DroneGraphic(DroneX1, DroneY1, 10);
        this.add(DroneG10);
        DroneG10.setBounds(0, 0, 0, 0);
        DroneG10.setOpaque(false);
        DroneG10.setVisible(false);
        DroneSemp10 = new Semaforo(DroneX1, DroneY1, DroneG10, this, Semaforo);
        DroneSemp10.setName("Drone 10");
        
        
    }
    
    
    //Funcion para hacer correr los drones
    protected void InicializarDronesSemaforo(int NoDrones){
        switch(NoDrones){
            //PARA 1 DRONE
            case 1:
                Reinicializar();
                
                //Caso para el drone 1
                DroneG1.setBounds(0, 0, this.getWidth(), this.getHeight());
                DroneG1.setVisible(true);
                DroneX1.setX(this.getWidth()/2);
                DroneY1.setY(this.getHeight()/2);
                
                //Hilo
                DroneSemp1.setX(DroneX1);
                DroneSemp1.setY(DroneY1);
                
                if(!DroneSemp1.isAlive()){
                    DroneSemp1.start();
                }
                
            break;
            
            //PARA 2 DRONES
            case 2:
                ancho = this.getWidth()/2;
                alto = this.getHeight();
                
                Reinicializar();
                
                //Caso para el drone 1
                DroneG1.setBounds(0, 0, ancho, alto);
                DroneG1.setVisible(true);
                DroneX1.setX(DroneG1.getWidth()/2);
                DroneY1.setY(DroneG1.getHeight()/2);
                
                //Hilo
                DroneSemp1.setX(DroneX1);
                DroneSemp1.setY(DroneY1);
         
                //Caso para el drone 2
                DroneG2.setBounds(ancho, 0, ancho, alto);
                DroneG2.setVisible(true);
                DroneX2.setX(DroneG2.getWidth()/2);
                DroneY2.setY(DroneG2.getHeight()/2);
         
                //Hilo
                DroneSemp2.setX(DroneX2);
                DroneSemp2.setY(DroneY2);
               
                if(!DroneSemp2.isAlive()){
                    DroneSemp2.start();
                }
                
                if(!DroneSemp1.isAlive()){
                    DroneSemp1.start();
                }
                
               
                 
            break;
            
            //PARA 4 DRONES
            case 3:
                ancho = this.getWidth()/2;
                alto = this.getHeight()/2;
                        
                Reinicializar();
                     
                //Caso para el drone 1
                DroneG1.setBounds(0, 0, ancho, alto);
                DroneG1.setVisible(true);
                DroneX1.setX(DroneG1.getWidth()/2);
                DroneY1.setY(DroneG1.getHeight()/2);
                
                //Hilo
                DroneSemp1.setX(DroneX1);
                DroneSemp1.setY(DroneY1);
                DroneSemp1.setAnguloX(1);
                DroneSemp1.setAnguloX(1);
                         
                 //Caso para el drone 2
                DroneG2.setBounds(ancho, 0, ancho, alto);
                DroneG2.setVisible(true);
                DroneX2.setX(DroneG2.getWidth()/2);
                DroneY2.setY(DroneG2.getHeight()/2);
                
                //Hilo
                DroneSemp2.setX(DroneX2);
                DroneSemp2.setY(DroneY2);
                DroneSemp2.setAnguloX(1);
                DroneSemp2.setAnguloX(1);
               
                //Caso para el drone 3
                DroneG3.setBounds(0, alto, ancho, alto);
                DroneG3.setVisible(true);
                DroneX3.setX(DroneG3.getWidth()/2);
                DroneY3.setY(DroneG3.getHeight()/2);
    
                //Hilo
                DroneSemp3.setX(DroneX3);
                DroneSemp3.setY(DroneY3);
                DroneSemp3.setAnguloX(1);
                DroneSemp3.setAnguloX(1);
                   
                //Caso para el drone 4
                DroneG4.setBounds(ancho, alto, ancho, alto);
                DroneG4.setVisible(true);
                DroneX4.setX(DroneG4.getWidth()/2);
                DroneY4.setY(DroneG4.getHeight()/2);
                
                //Hilo
                DroneSemp4.setX(DroneX4);
                DroneSemp4.setY(DroneY4);
                DroneSemp4.setAnguloX(1);
                DroneSemp4.setAnguloX(1);

                if(!DroneSemp4.isAlive()){
                    DroneSemp4.start();
                }
                if(!DroneSemp3.isAlive()){
                    DroneSemp3.start();
                }               

                if(!DroneSemp1.isAlive()){
                    DroneSemp1.start();
                }
                
                if(!DroneSemp2.isAlive()){
                    DroneSemp2.start();
                }
                
            break;
            
            case 4:
                ancho = this.getWidth()/2;
                alto = this.getHeight()/3;
                
                Reinicializar();
                                     
                //Caso para el drone 1
                DroneG1.setBounds(0, 0, ancho, alto);
                DroneG1.setVisible(true);
                DroneX1.setX(DroneG1.getWidth()/2);
                DroneY1.setY(DroneG1.getHeight()/2);
                
                //Hilo
                DroneSemp1.setX(DroneX1);
                DroneSemp1.setY(DroneY1);
                DroneSemp1.setAnguloX(1);
                DroneSemp1.setAnguloX(1);
                                                           
                //Caso para el drone 2
                DroneG2.setBounds(ancho, 0, ancho, alto);
                DroneG2.setVisible(true);
                DroneX2.setX(DroneG2.getWidth()/2);
                DroneY2.setY(DroneG2.getHeight()/2);
                
                //Hilo
                DroneSemp2.setX(DroneX2);
                DroneSemp2.setY(DroneY2);
                DroneSemp2.setAnguloX(1);
                DroneSemp2.setAnguloX(1);
              
                
                //Caso para el drone 3
                DroneG3.setBounds(0, alto, ancho, alto);
                DroneG3.setVisible(true);
                DroneX3.setX(DroneG3.getWidth()/2);
                DroneY3.setY(DroneG3.getHeight()/2);
                
                //Hilo
                DroneSemp3.setX(DroneX3);
                DroneSemp3.setY(DroneY3);
                DroneSemp3.setAnguloX(1);
                DroneSemp3.setAnguloX(1);
                                
                //Caso para el drone 4
                DroneG4.setBounds(ancho, alto, ancho, alto);
                DroneG4.setVisible(true);
                DroneX4.setX(DroneG4.getWidth()/2);
                DroneY4.setY(DroneG4.getHeight()/2);
                
                //Hilo
                DroneSemp4.setX(DroneX4);
                DroneSemp4.setY(DroneY4);
                DroneSemp4.setAnguloX(1);
                DroneSemp4.setAnguloX(1);
                
                //Caso para el drone 5
                DroneG5.setBounds(0, alto*2, ancho, alto);
                DroneG5.setVisible(true);
                DroneX5.setX(DroneG5.getWidth()/2);
                DroneY5.setY(DroneG5.getHeight()/2);
                
                //Hilo
                DroneSemp5.setX(DroneX5);
                DroneSemp5.setY(DroneY5);
                DroneSemp5.setAnguloX(1);
                DroneSemp5.setAnguloX(1);
               
                
                //Caso para el drone 6
                DroneG6.setBounds(ancho, alto*2, ancho, alto);
                DroneG6.setVisible(true);
                DroneX6.setX(DroneG6.getWidth()/2);
                DroneY6.setY(DroneG6.getHeight()/2);
                
                //Hilo
                DroneSemp6.setX(DroneX6);
                DroneSemp6.setY(DroneY6);
                DroneSemp6.setAnguloX(1);
                DroneSemp6.setAnguloX(1);

                
                if(!DroneSemp6.isAlive()){
                    DroneSemp6.start();
                }
                if(!DroneSemp5.isAlive()){
                    DroneSemp5.start();
                }
                if(!DroneSemp4.isAlive()){
                    DroneSemp4.start();
                }

                if(!DroneSemp3.isAlive()){
                    DroneSemp3.start();
                }

                if(!DroneSemp1.isAlive()){
                    DroneSemp1.start();
                }                
                if(!DroneSemp2.isAlive()){
                    DroneSemp2.start();
                }


                
            break;
            
            case 5:
                ancho = this.getWidth()/2;
                alto = this.getHeight()/4;
                
                Reinicializar();
                                     
                //Caso para el drone 1
                DroneG1.setBounds(0, 0, ancho, alto);
                DroneG1.setVisible(true);
                DroneX1.setX(DroneG1.getWidth()/2);
                DroneY1.setY(DroneG1.getHeight()/2);
                
                //Hilo
                DroneSemp1.setX(DroneX1);
                DroneSemp1.setY(DroneY1);
                DroneSemp1.setAnguloX(1);
                DroneSemp1.setAnguloY(1);
                                             
                //Caso para el drone 2
                DroneG2.setBounds(ancho, 0, ancho, alto);
                DroneG2.setVisible(true);
                DroneX2.setX(DroneG2.getWidth()/2);
                DroneY2.setY(DroneG2.getHeight()/2);
                
                //Hilo
                DroneSemp2.setX(DroneX2);
                DroneSemp2.setY(DroneY2);
                DroneSemp2.setAnguloX(1);
                DroneSemp2.setAnguloY(1);

                
                //Caso para el drone 3
                DroneG3.setBounds(0, alto, ancho, alto);
                DroneG3.setVisible(true);
                DroneX3.setX(DroneG3.getWidth()/2);
                DroneY3.setY(DroneG3.getHeight()/2);
                
                //Hilo
                DroneSemp3.setX(DroneX3);
                DroneSemp3.setY(DroneY3);
                DroneSemp3.setAnguloX(1);
                DroneSemp3.setAnguloY(1);
               
                
                //Caso para el drone 4
                DroneG4.setBounds(ancho, alto, ancho, alto);
                DroneG4.setVisible(true);
                DroneX4.setX(DroneG4.getWidth()/2);
                DroneY4.setY(DroneG4.getHeight()/2);
                
                //Hilo
                DroneSemp4.setX(DroneX4);
                DroneSemp4.setY(DroneY4);
                DroneSemp4.setAnguloX(1);
                DroneSemp4.setAnguloY(1);
                
                
                //Caso para el drone 5
                DroneG5.setBounds(0, alto*2, ancho, alto);
                DroneG5.setVisible(true);
                DroneX5.setX(DroneG5.getWidth()/2);
                DroneY5.setY(DroneG5.getHeight()/2);
                
                //Hilo
                DroneSemp5.setX(DroneX5);
                DroneSemp5.setY(DroneY5);
                DroneSemp5.setAnguloX(1);
                DroneSemp5.setAnguloY(1);
                
                
                //Caso para el drone 6
                DroneG6.setBounds(ancho, alto*2, ancho, alto);
                DroneG6.setVisible(true);
                DroneX6.setX(DroneG6.getWidth()/2);
                DroneY6.setY(DroneG6.getHeight()/2);
                
                //Hilo
                DroneSemp6.setX(DroneX6);
                DroneSemp6.setY(DroneY6);
                DroneSemp6.setAnguloX(1);
                DroneSemp6.setAnguloY(1);
                
                //Caso para el drone 7
                DroneG7.setBounds(0, alto*3, ancho, alto);
                DroneG7.setVisible(true);
                DroneX7.setX(DroneG7.getWidth()/2);
                DroneY7.setY(DroneG7.getHeight()/2);
                
                //Hilo
                DroneSemp7.setX(DroneX7);
                DroneSemp7.setY(DroneY7);
                DroneSemp7.setAnguloX(1);
                DroneSemp7.setAnguloY(1);

                //Caso para el drone 8
                DroneG8.setBounds(ancho, alto*3, ancho, alto);
                DroneG8.setVisible(true);
                DroneX8.setX(DroneG8.getWidth()/2);
                DroneY8.setY(DroneG8.getHeight()/2);
                
                //Hilo
                DroneSemp8.setX(DroneX8);
                DroneSemp8.setY(DroneY8);
                DroneSemp8.setAnguloX(1);
                DroneSemp8.setAnguloY(1);
                
                if(!DroneSemp8.isAlive()){
                    DroneSemp8.start();
                }
                
                if(!DroneSemp7.isAlive()){
                    DroneSemp7.start();
                }
                
                if(!DroneSemp6.isAlive()){
                    DroneSemp6.start();
                }
                
                if(!DroneSemp5.isAlive()){
                    DroneSemp5.start();
                }
                
                if(!DroneSemp4.isAlive()){
                    DroneSemp4.start();
                }
                
                if(!DroneSemp3.isAlive()){
                    DroneSemp3.start();
                }
                
                if(!DroneSemp1.isAlive()){
                    DroneSemp1.start();
                }
                   
                if(!DroneSemp2.isAlive()){
                    DroneSemp2.start();
                }                
            break;
            
            case 6:
                ancho = this.getWidth()/2;
                alto = this.getHeight()/5;
                
                Reinicializar();
                                     
                //Caso para el drone 1
                DroneG1.setBounds(0, 0, ancho, alto);
                DroneG1.setVisible(true);
                DroneX1.setX(DroneG1.getWidth()/2);
                DroneY1.setY(DroneG1.getHeight()/2);
                
                //Hilo
                DroneSemp1.setX(DroneX1);
                DroneSemp1.setY(DroneY1);
                DroneSemp1.setAnguloX(1);
                DroneSemp1.setAnguloY(1);
                            
                //Caso para el drone 2
                DroneG2.setBounds(ancho, 0, ancho, alto);
                DroneG2.setVisible(true);
                DroneX2.setX(DroneG2.getWidth()/2);
                DroneY2.setY(DroneG2.getHeight()/2);
                
                //Hilo
                DroneSemp2.setX(DroneX2);
                DroneSemp2.setY(DroneY2);
                DroneSemp2.setAnguloX(1);
                DroneSemp2.setAnguloY(1);
                
                //Caso para el drone 3
                DroneG3.setBounds(0, alto, ancho, alto);
                DroneG3.setVisible(true);
                DroneX3.setX(DroneG3.getWidth()/2);
                DroneY3.setY(DroneG3.getHeight()/2);
                
                //Hilo
                DroneSemp3.setX(DroneX3);
                DroneSemp3.setY(DroneY3);
                DroneSemp3.setAnguloX(1);
                DroneSemp3.setAnguloY(1);
                
                //Caso para el drone 4
                DroneG4.setBounds(ancho, alto, ancho, alto);
                DroneG4.setVisible(true);
                DroneX4.setX(DroneG4.getWidth()/2);
                DroneY4.setY(DroneG4.getHeight()/2);
                
                //Hilo
                DroneSemp4.setX(DroneX4);
                DroneSemp4.setY(DroneY4);
                DroneSemp4.setAnguloX(1);
                DroneSemp4.setAnguloY(1);
               
                
                //Caso para el drone 5
                DroneG5.setBounds(0, alto*2, ancho, alto);
                DroneG5.setVisible(true);
                DroneX5.setX(DroneG5.getWidth()/2);
                DroneY5.setY(DroneG5.getHeight()/2);
                
                //Hilo
                DroneSemp5.setX(DroneX5);
                DroneSemp5.setY(DroneY5);
                DroneSemp5.setAnguloX(1);
                DroneSemp5.setAnguloY(1);
                
                //Caso para el drone 6
                DroneG6.setBounds(ancho, alto*2, ancho, alto);
                DroneG6.setVisible(true);
                DroneX6.setX(DroneG6.getWidth()/2);
                DroneY6.setY(DroneG6.getHeight()/2);
                
                //Hilo
                DroneSemp6.setX(DroneX6);
                DroneSemp6.setY(DroneY6);
                DroneSemp6.setAnguloX(1);
                DroneSemp6.setAnguloY(1);
               
                
                //Caso para el drone 7
                DroneG7.setBounds(0, alto*3, ancho, alto);
                DroneG7.setVisible(true);
                DroneX7.setX(DroneG7.getWidth()/2);
                DroneY7.setY(DroneG7.getHeight()/2);
                
                //Hilo
                DroneSemp7.setX(DroneX7);
                DroneSemp7.setY(DroneY7);
                DroneSemp7.setAnguloX(1);
                DroneSemp7.setAnguloY(1);
                
                //Caso para el drone 8
                DroneG8.setBounds(ancho, alto*3, ancho, alto);
                DroneG8.setVisible(true);
                DroneX8.setX(DroneG8.getWidth()/2);
                DroneY8.setY(DroneG8.getHeight()/2);
                
                //Hilo
                DroneSemp8.setX(DroneX8);
                DroneSemp8.setY(DroneY8);
                DroneSemp8.setAnguloX(1);
                DroneSemp8.setAnguloY(1);

                
                //Caso para el drone 9
                DroneG9.setBounds(0, alto*4, ancho, alto);
                DroneG9.setVisible(true);
                DroneX9.setX(DroneG9.getWidth()/2);
                DroneY9.setY(DroneG9.getHeight()/2);
                
                //Hilo
                DroneSemp9.setX(DroneX9);
                DroneSemp9.setY(DroneY9);
                DroneSemp9.setAnguloX(1);
                DroneSemp9.setAnguloY(1);
                
                //Caso para el drone 10
                DroneG10.setBounds(ancho, alto*4, ancho, alto);
                DroneG10.setVisible(true);
                DroneX10.setX(DroneG10.getWidth()/2);
                DroneY10.setY(DroneG10.getHeight()/2);
                
                //Hilo
                DroneSemp10.setX(DroneX10);
                DroneSemp10.setY(DroneY10);
                DroneSemp10.setAnguloX(1);
                DroneSemp10.setAnguloY(1);

                if(!DroneSemp10.isAlive()){
                    DroneSemp10.start();
                }
                
                if(!DroneSemp9.isAlive()){
                    DroneSemp9.start();
                }
                
                if(!DroneSemp8.isAlive()){
                    DroneSemp8.start();
                }
                
                if(!DroneSemp7.isAlive()){
                    DroneSemp7.start();
                }
                
                if(!DroneSemp6.isAlive()){
                    DroneSemp6.start();
                }
                
                if(!DroneSemp5.isAlive()){
                    DroneSemp5.start();
                }
                
                if(!DroneSemp4.isAlive()){
                    DroneSemp4.start();
                }
                
                if(!DroneSemp3.isAlive()){
                    DroneSemp3.start();
                }
                
                if(!DroneSemp2.isAlive()){
                    DroneSemp2.start();
                }
                    
                if(!DroneSemp1.isAlive()){
                    DroneSemp1.start();
                }
                
                //Comenzamos a contar sus datos
                DroneSemp1.CargarDatos();
                DroneSemp2.CargarDatos();
                DroneSemp3.CargarDatos();
                DroneSemp4.CargarDatos();
                DroneSemp5.CargarDatos();
                DroneSemp6.CargarDatos();
                DroneSemp7.CargarDatos();
                DroneSemp8.CargarDatos();
                DroneSemp9.CargarDatos();
                DroneSemp10.CargarDatos();

                
            break;
            
        }
    }
    
    //Funcion para detener a los hilos
    protected ChartPanel GenerarGraficaSemaforos(){
        //Detenemos los hilos
        DroneSemp1.Detener();
        DroneSemp2.Detener();
        DroneSemp3.Detener();
        DroneSemp4.Detener();
        DroneSemp4.Detener();
        DroneSemp5.Detener();
        DroneSemp6.Detener();
        DroneSemp7.Detener();
        DroneSemp8.Detener();
        DroneSemp9.Detener();
        DroneSemp10.Detener();        
        
        //Sacado de datos del drone 1
        double[] TiempoDrone1 = DroneSemp1.getTiempo().stream().mapToDouble(Double::doubleValue).toArray();
        double[] Iteraciones = GenerarInteraciones(TiempoDrone1.length);
        
        //Tiempo para el drone 2
        double[] TiempoDrone2 = DroneSemp2.getTiempo().stream().mapToDouble(Double::doubleValue).toArray();
        
        //Tiempo para el drone 3
        double[] TiempoDrone3 = DroneSemp3.getTiempo().stream().mapToDouble(Double::doubleValue).toArray();
        
        //Tiempo para el drone 4
        double[] TiempoDrone4 = DroneSemp4.getTiempo().stream().mapToDouble(Double::doubleValue).toArray();
        
        //Tiempo para el drone 5
        double[] TiempoDrone5 = DroneSemp5.getTiempo().stream().mapToDouble(Double::doubleValue).toArray();
        
        //Tiempo para el drone 6
        double[] TiempoDrone6 = DroneSemp6.getTiempo().stream().mapToDouble(Double::doubleValue).toArray();
        
        //Tiempo para el drone 7
        double[] TiempoDrone7 = DroneSemp7.getTiempo().stream().mapToDouble(Double::doubleValue).toArray();
        
        //Tiempo para el drone 8
        double[] TiempoDrone8 = DroneSemp8.getTiempo().stream().mapToDouble(Double::doubleValue).toArray();
        
        //Tiempo para el drone 9
        double[] TiempoDrone9 = DroneSemp9.getTiempo().stream().mapToDouble(Double::doubleValue).toArray();
        
        //Tiempo para el drone 5
        double[] TiempoDrone10 = DroneSemp10.getTiempo().stream().mapToDouble(Double::doubleValue).toArray();
        
        
        //Creamos el contenedor de la informacion
        DefaultXYDataset temporal = new DefaultXYDataset();
        temporal.addSeries("Hilo 1", new double[][]{Iteraciones,TiempoDrone1});
        temporal.addSeries("Hilo 2", new double[][]{Iteraciones,TiempoDrone2});
        temporal.addSeries("Hilo 3", new double[][]{Iteraciones,TiempoDrone3});
        temporal.addSeries("Hilo 4", new double[][]{Iteraciones,TiempoDrone4});
        temporal.addSeries("Hilo 5", new double[][]{Iteraciones,TiempoDrone5});
        temporal.addSeries("Hilo 6", new double[][]{Iteraciones,TiempoDrone6});
        temporal.addSeries("Hilo 7", new double[][]{Iteraciones,TiempoDrone7});
        temporal.addSeries("Hilo 8", new double[][]{Iteraciones,TiempoDrone8});
        temporal.addSeries("Hilo 9", new double[][]{Iteraciones,TiempoDrone9});
        temporal.addSeries("Hilo 10", new double[][]{Iteraciones,TiempoDrone10});
        
        
        //Creamos el estilo de la informacion
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        
        //Colores para la informacion
        for(int i = 0; i < 10; i++){
            renderer.setSeriesPaint(i, Generarcolor());
            renderer.setSeriesShapesVisible(i, false); 
            renderer.setSeriesStroke(i, new BasicStroke(1));
        }
        
          
        JFreeChart chart = ChartFactory.createXYLineChart("Tiempo Espera Semaforos", "Iteraciones", "Tiempo", temporal);
        //Colocamos los rangos de nuestros valores
        chart.getXYPlot().getRangeAxis().setRange(0.5, 6.5);
        //((NumberAxis) chart.getXYPlot().getRangeAxis()).setNumberFormatOverride(new DecimalFormat("#'%'"));
        chart.getXYPlot().setRenderer(renderer);
        chart.getXYPlot().setBackgroundPaint(Color.black);
        
        //Cargamos el grafico a al panel 
        ChartPanel pp = new ChartPanel(chart);
        return pp;                
    }
    
      //Conversion de arrayList a Array Double
    protected double[] ConversionArrayListToArray(ArrayList<Double> Base){
        double[] aux = new double[Base.size()];
        for(int i = 0; i < Base.size(); i++){
            aux[i] = Base.get(i);
        }
        
        return aux;
    }

    //Para generar Iteraciones 
    protected double[] GenerarInteraciones(int limit){
        double[] temp = new double[limit];
        for(int i = 0; i < limit; i++){
            temp[i] = i;
        }
        return temp;
    }

    //Funcion para generar un color aleatorio 
    protected Color Generarcolor(){
        Color color;
            Random rand = new Random();
            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();
            
            color = new Color(r,g,b);
        return color;
    }
    
    //Funcion para Reinicializar todos los drones
    protected void Reinicializar(){
        //Drone 1
        DroneG1.setBounds(0,0,0,0);
        DroneG1.setVisible(false);

        
        //Drone 2
        DroneG2.setBounds(0,0,0,0);
        DroneG2.setVisible(false);

        
        //Drone 3
        DroneG3.setBounds(0, 0, 0,0);
        DroneG3.setVisible(false);

        
        //Drone 4
        DroneG4.setBounds(0,0,0,0);
        DroneG4.setVisible(false);

        
        //Drone 5
        DroneG5.setBounds(0, 0, 0, 0);
        DroneG5.setVisible(false);

        
        //Drone 6
        DroneG6.setBounds(0,0,0,0);
        DroneG6.setVisible(false);

        
        //Drone 7
        DroneG7.setBounds(0,0,0,0);
        DroneG7.setVisible(false);

        
        //Drone 8 
        DroneG8.setBounds(0,0,0,0);
        DroneG8.setVisible(false);

        
        //Drone 9 
        DroneG9.setBounds(0,0,0,0);
        DroneG9.setVisible(false);

        //Drone 10 
        DroneG10.setBounds(0,0,0,0);
        DroneG10.setVisible(false);

    }
    
    //Funcion para ocultar los drones 
    protected void Ocultar(){
        DroneG1.setVisible(false);
        DroneG2.setVisible(false);
        DroneG3.setVisible(false);
        DroneG4.setVisible(false);
        DroneG5.setVisible(false);
        DroneG6.setVisible(false);
        DroneG7.setVisible(false);
        DroneG8.setVisible(false);
        DroneG9.setVisible(false);
        DroneG10.setVisible(false);
     
    }
    
}
