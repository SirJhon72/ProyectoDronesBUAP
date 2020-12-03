
package dronesgrapfinal;

import java.awt.Color;


public class DronesSimple extends javax.swing.JPanel {
    
    
    //Variables para nuestros drones
    private DroneGraphic drnG1, drnG2, drnG3, drnG4, drnG5, drnG6, 
            drnG7, drnG8, drnG9, drnG10;
    
    
    //Variables para nuestros hilos
    private Hilo drnH1, drnH2, drnH3, drnH4, drnH5, drnH6, drnH7, drnH8,
            drnH9, drnH10;    
    
    //Variables para el control de las coordenas
    private CoorX drn1X, drn2X, drn3X, drn4X, drn5X, drn6X, drn7X, 
            drn8X, drn9X, drn10X;
    private CoorY drn1Y, drn2Y, drn3Y, drn4Y, drn5Y, drn6Y, drn7Y, drn8Y
            ,drn9Y, drn10Y;
    
 
    public DronesSimple() {
        initComponents();
        this.setOpaque(false);
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 809, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

     //Funcion que inicializa todas las variables y las deja en 0 
    protected void Inicializar(){
        //Inicializacion de las coordenadas
        
        
        //Inicializacion de los drones
        
        /*- Drone 1 -*/
        drn1X = new CoorX(0);
        drn1Y = new CoorY(0);
        drnG1 = new DroneGraphic(drn1X, drn1Y, 1);
        this.add(drnG1);
        drnG1.setBounds(0, 0, 0, 0);
        drnG1.setOpaque(false);
        drnG1.setVisible(false);
        drnH1 = new Hilo(drn1X, drn1Y, drnG1, this);
       
        
        /*- Drone 2 -*/
        drn2X = new CoorX(0);
        drn2Y = new CoorY(0);
        drnG2 = new DroneGraphic(drn1X, drn1Y, 2);
        this.add(drnG2);
        drnG2.setBounds(0, 0, 0, 0);
        drnG2.setOpaque(false);
        drnG2.setVisible(false);
        drnH2 = new Hilo(drn1X, drn1Y, drnG2, this);
        
        /*- Drone 3 -*/
        drn3X = new CoorX(0);
        drn3Y = new CoorY(0);
        drnG3 = new DroneGraphic(drn1X, drn1Y, 3);
        this.add(drnG3);
        drnG3.setBounds(0, 0, 0, 0);
        drnG3.setOpaque(false);
        drnG3.setVisible(false);
        drnH3 = new Hilo(drn1X, drn1Y, drnG3, this);
        
        /*- Drone 4 -*/
        drn4X = new CoorX(0);
        drn4Y = new CoorY(0);
        drnG4 = new DroneGraphic(drn1X, drn1Y, 4);
        this.add(drnG4);
        drnG4.setBounds(0, 0, 0, 0);
        drnG4.setOpaque(false);
        drnG4.setVisible(false);
        drnH4 = new Hilo(drn1X, drn1Y, drnG4, this);
        
        /*- Drone 5 -*/
        drn5X = new CoorX(0);
        drn5Y = new CoorY(0);
        drnG5 = new DroneGraphic(drn1X, drn1Y, 5);
        this.add(drnG5);
        drnG5.setBounds(0, 0, 0, 0);
        drnG5.setOpaque(false);
        drnG5.setVisible(false);
        drnH5 = new Hilo(drn1X, drn1Y, drnG5, this);
        
        /*- Drone 6 -*/
        drn6X = new CoorX(0);
        drn6Y = new CoorY(0);
        drnG6 = new DroneGraphic(drn1X, drn1Y, 6);
        this.add(drnG6);
        drnG6.setBounds(0, 0, 0, 0);
        drnG6.setOpaque(false);
        drnG6.setVisible(false);        
        drnH6 = new Hilo(drn1X, drn1Y, drnG6, this);
        
        /*- Drone 7 -*/
        drn7X = new CoorX(0);
        drn7Y = new CoorY(0);
        drnG7 = new DroneGraphic(drn1X, drn1Y, 7);
        this.add(drnG7);
        drnG7.setBounds(0, 0, 0, 0);
        drnG7.setOpaque(false);
        drnG7.setVisible(false);        
        drnH7 = new Hilo(drn1X, drn1Y, drnG7, this);
        
        /*- Drone 8 -*/
        drn8X = new CoorX(0);
        drn8Y = new CoorY(0);
        drnG8 = new DroneGraphic(drn1X, drn1Y, 8);
        this.add(drnG8);
        drnG8.setBounds(0, 0, 0, 0);
        drnG8.setOpaque(false);
        drnG8.setVisible(false);        
        drnH8 = new Hilo(drn1X, drn1Y, drnG8, this);
        
        /*- Drone 9 -*/
        drn9X = new CoorX(0);
        drn9Y = new CoorY(0);
        drnG9 = new DroneGraphic(drn1X, drn1Y, 9);
        this.add(drnG9);
        drnG9.setBounds(0, 0, 0, 0);
        drnG9.setOpaque(false);
        drnG9.setVisible(false);        
        drnH9 = new Hilo(drn1X, drn1Y, drnG9, this);
        
        
        /*- Drone 10 -*/
        drn10X = new CoorX(0);
        drn10Y = new CoorY(0);
        drnG10 = new DroneGraphic(drn1X, drn1Y, 10);
        this.add(drnG10);
        drnG10.setBounds(0, 0, 0, 0);
        drnG10.setOpaque(false);
        drnG10.setVisible(false);        
        drnH10 = new Hilo(drn1X, drn1Y, drnG10, this);   
        
        
    }

      
    //Funcion para comenzar a declara la logica del panel de cotnrol drones simples 
    protected void IniciarDrones(int NoDrones){
        int ancho;
        int altura;
        switch(NoDrones){
            //Solo para un drone
            case 1:
                Reinicializar();          
                drnG1.setBounds(0, 0, this.getWidth(), this.getHeight());
                drnG1.setVisible(true);
                drn1X.setX(this.getWidth()/2);
                drn1Y.setY(this.getHeight()/2);
                
                drnH1.setX(drn1X);
                drnH1.setY(drn1Y);
                //Comprobacion para encender el hilo
                if(!drnH1.isAlive()){
                    drnH1.start();
                }
                
            break;
            
            case 2:
                ancho = this.getWidth()/2;
                altura = this.getHeight();
                Reinicializar();
                /*Datos para el hilo 1*/
                drnG1.setBounds(0, 0, ancho, altura);
                drnG1.setVisible(true);
                
                //Seteamos las posiciones del hilo
                drn1X.setX(drnG1.getWidth()/2);
                drn1Y.setY(drnG1.getHeight()/2);
                
                drnH1.setX(drn1X);
                drnH1.setY(drn1Y); 
                if(!drnH1.isAlive()){
                    drnH1.start();
                }
                               
                /*Datos para el hilo 2*/
                drnG2.setBounds(ancho, 0, ancho, altura);
                drnG2.setVisible(true);
                drn2X.setX(drnG2.getWidth()/2);
                drn2Y.setY(drnG2.getHeight()/2);
                //Coordenadas para el hilo
                drnH2.setX(drn2X);
                drnH2.setY(drn2Y);
                //Comprobacion para encender el hilo 2
                
                if(!drnH2.isAlive()){
                    drnH2.start();
                }                       
                
            break;
            
            //Para 4 hilos
            case 3:
                ancho = this.getWidth()/2;
                altura = this.getHeight()/2;
                                
                Reinicializar();
                //Drone 1
                drnG1.setBounds(0, 0, ancho, altura);
                drnG1.setVisible(true);
                      
                
                //Hilo 
                drn1X.setX(ancho/2);
                drn1Y.setY(altura/2);
                
                drnH1.setX(drn1X);
                drnH1.setY(drn1Y);
                
                //Condicion para inciar el hilo
                if(!drnH1.isAlive()){
                    drnH1.start();
                }
                
                //Drone 2
                drnG2.setBounds(ancho, 0, ancho, altura);
                drnG2.setVisible(true);
                //Hilo
                drn2X.setX(drnG2.getWidth()/2);
                drn2Y.setY(drnG2.getHeight()/2);
                
                drnH2.setX(drn2X);
                drnH2.setY(drn2Y);
                
                if(!drnH2.isAlive()){
                    drnH2.start();
                }
                
                //Drone 3
                drnG3.setBounds(0, altura, ancho, altura);
                drnG3.setVisible(true);
                drn3X.setX(drnG3.getWidth()/2);
                drn3Y.setY(drnG3.getHeight()/2);
                //Hilo
                drnH3.setX(drn3X);
                drnH3.setY(drn3Y);
                
                if(!drnH3.isAlive()){
                    drnH3.start();
                }
                
                //Drone 4
                drnG4.setBounds(ancho, altura, ancho, altura);
                drnG4.setVisible(true);
                drn4X.setX(drnG4.getWidth()/2);
                drn4Y.setY(drnG4.getHeight()/2);
                
                //Hilo
                drnH4.setX(drn4X);
                drnH4.setY(drn4Y);
                
                if(!drnH4.isAlive()){
                    drnH4.start();
                }
                
            break;
            
            
            //Para 6 Drones
            case 4:
                System.out.println("Llego al caso 4");
                ancho = this.getWidth()/2;
                altura = this.getHeight()/3;
                
                Reinicializar();
                
                //Drone 1
                drnG1.setBounds(0, 0, ancho, altura);
                drnG1.setVisible(true);
                drn1X.setX(drnG1.getWidth()/2);
                drn1Y.setY(drnG1.getHeight()/2);
                
                //Hilo
                drnH1.setX(drn1X);
                drnH1.setY(drn1Y);
                
                if(!drnH1.isAlive()){
                    drnH1.start();
                }
                
                //Drone 2
                drnG2.setBounds(ancho, 0, ancho, altura);
                drnG2.setVisible(true);
                drn2X.setX(drnG2.getWidth()/2);
                drn2Y.setY(drnG2.getHeight()/2);
                
                //Hilo
                drnH2.setX(drn2X);
                drnH2.setY(drn2Y);
                
                if(!drnH2.isAlive()){
                    drnH2.start();
                }
                
                //Drone 3
                drnG3.setBounds(0, altura, ancho, altura);
                drnG3.setVisible(true);                        
                drn3X.setX(drnG3.getWidth()/2);
                drn3Y.setY(drnG3.getHeight()/2);
                
                //Hilo
                drnH3.setX(drn3X);
                drnH3.setY(drn3Y);
                
                if(!drnH3.isAlive()){
                    drnH3.start();
                }
                
                //Drone 4
                drnG4.setBounds(ancho, altura, ancho, altura);
                drnG4.setVisible(true);
                drn4X.setX(drnG4.getWidth()/2);
                drn4Y.setY(drnG4.getHeight()/2);
                
                //Hilo
                drnH4.setX(drn4X);
                drnH4.setY(drn4Y);
                
                if(!drnH4.isAlive()){
                    drnH4.start();
                }
                
                //Drone 5
                drnG5.setBounds(0, altura*2, ancho, altura);
                drnG5.setVisible(true);
                drn5X.setX(drnG5.getWidth()/2);
                drn5Y.setY(drnG5.getHeight()/2);
                
                //Hilo 
                drnH5.setX(drn5X);
                drnH5.setY(drn5Y);
                
                if(!drnH5.isAlive()){
                    drnH5.start();
                }
                
                //Drone 6
                drnG6.setBounds(ancho, altura*2, ancho, altura);
                drnG6.setVisible(true);
                drn6X.setX(drnG6.getWidth()/2);
                drn6Y.setY(drnG6.getHeight()/2);
                
                //Hilo
                drnH6.setX(drn6X);
                drnH6.setY(drn6Y);
                
                if(!drnH6.isAlive()){
                    drnH6.start();
                }
                
            break;
            
            case 5:
                ancho = this.getWidth()/2;
                altura = this.getHeight()/4;
                
                Reinicializar();
                
                //Drone 1
                drnG1.setBounds(0, 0, ancho, altura);
                drnG1.setVisible(true);
                drn1X.setX(drnG1.getWidth()/2);
                drn1Y.setY(drnG1.getHeight()/2);
                
                //Hilo
                drnH1.setX(drn1X);
                drnH1.setY(drn1Y);
                
                if(!drnH1.isAlive()){
                    drnH1.start();
                }
                
                //Drone 2
                drnG2.setBounds(ancho, 0, ancho, altura);
                drnG2.setVisible(true);
                drn2X.setX(drnG2.getWidth()/2);
                drn2Y.setY(drnG2.getHeight()/2);
                
                //Hilo
                drnH2.setX(drn2X);
                drnH2.setY(drn2Y);
                
                if(!drnH2.isAlive()){
                    drnH2.start();
                }
                
                
                //Drone 3
                drnG3.setBounds(0, altura, ancho, altura);
                drnG3.setVisible(true);
                drn3X.setX(drnG3.getWidth()/2);
                drn3Y.setY(drnG3.getHeight()/2);
                
                //Hilos
                drnH3.setX(drn3X);
                drnH3.setY(drn3Y);
                
                if(!drnH3.isAlive()){
                    drnH3.start();
                }
                
                //Drone 4
                drnG4.setBounds(ancho, altura, ancho, altura);
                drnG4.setVisible(true);
                drn4X.setX(drnG4.getWidth()/2);
                drn4Y.setY(drnG4.getHeight()/2);
                
                //Hilo
                drnH4.setX(drn4X);
                drnH4.setY(drn4Y);
                
                if(!drnH4.isAlive()){
                    drnH4.start();
                }
                
                //Drone 5
                drnG5.setBounds(0, altura*2, ancho, altura);
                drnG5.setVisible(true);
                drn5X.setX(drnG5.getWidth()/2);
                drn5Y.setY(drnG5.getHeight()/2);
                
                //Hilo
                drnH5.setX(drn5X);
                drnH5.setY(drn5Y);
                
                if(!drnH5.isAlive()){
                    drnH5.start();
                }
                
                //Drone 6
                drnG6.setBounds(ancho, altura*2, ancho, altura);
                drnG6.setVisible(true);
                drn6X.setX(drnG6.getWidth()/2);
                drn6Y.setY(drnG6.getHeight()/2);
                
                //Hilos
                drnH6.setX(drn6X);
                drnH6.setY(drn6Y);

                if(!drnH6.isAlive()){
                    drnH6.start();
                }
                
                //Drone 7
                drnG7.setBounds(0, altura*3, ancho, altura);
                drnG7.setVisible(true);
                drn7X.setX(drnG7.getWidth()/2);
                drn7Y.setY(drnG7.getHeight()/2);
                
                //Hilos
                drnH7.setY(drn7Y);
                drnH7.setY(drn7Y);
                
                if(!drnH7.isAlive()){
                    drnH7.start();
                }
                
                //Drone 8
                drnG8.setBounds(ancho, altura*3, ancho, altura);
                drnG8.setVisible(true);
                drn8X.setX(drnG8.getWidth()/2);
                drn8Y.setY(drnG8.getHeight()/2);
                
                //Hilos
                drnH8.setX(drn8X);
                drnH8.setY(drn8Y);
                
                if(!drnH8.isAlive()){
                    drnH8.start();
                }     
               
             
                
            break;
            
            
            //Para 10 drones
            case 6:
                ancho = this.getWidth()/2;
                altura = this.getHeight()/5;
                
                Reinicializar();
                
                //Drone 1
                drnG1.setBounds(0, 0, ancho, altura);
                drnG1.setVisible(true);
                drn1X.setX(drnG1.getWidth()/2);
                drn1Y.setY(drnG1.getHeight()/2);
                
                //Hilos
                drnH1.setX(drn1X);
                drnH1.setY(drn1Y);
                
                if(!drnH1.isAlive()){
                    drnH1.start();
                }
                
                //Drone 2
                drnG2.setBounds(ancho, 0, ancho, altura);
                drnG2.setVisible(true);
                drn2X.setX(drnG2.getWidth()/2);
                drn2Y.setY(drnG2.getHeight()/2);
                
                //Hilos
                drnH2.setX(drn2X);
                drnH2.setY(drn2Y);
                
                if(!drnH2.isAlive()){
                    drnH2.start();
                }
                
                //Drone 3
                drnG3.setBounds(0, altura, ancho, altura);
                drnG3.setVisible(true);
                drn3X.setX(drnG3.getWidth()/2);
                drn3Y.setY(drnG3.getHeight()/2);
                
                //Hilos
                drnH3.setX(drn3X);
                drnH3.setY(drn3Y);
                
                if(!drnH3.isAlive()){
                    drnH3.start();
                }
                
                //Drone 4
                drnG4.setBounds(ancho, altura, ancho, altura);
                drnG4.setVisible(true);
                drn4X.setX(drnG4.getWidth()/2);
                drn4Y.setY(drnG4.getHeight()/2);
                
                //Hilos
                drnH4.setX(drn4X);
                drnH4.setY(drn4Y);
                
                if(!drnH4.isAlive()){
                    drnH4.start();
                }
                
                //Drone 5
                drnG5.setBounds(0, altura*2, ancho, altura);
                drnG5.setVisible(true);
                drn5X.setX(drnG5.getWidth()/2);
                drn5Y.setY(drnG5.getHeight()/2);
                
                //Hilos
                drnH5.setX(drn5X);
                drnH5.setY(drn5Y);
                
                if(!drnH5.isAlive()){
                    drnH5.start();
                }
                
                
                //Drone 6
                drnG6.setBounds(ancho, altura*2, ancho, altura);
                drnG6.setVisible(true);
                drn6X.setX(drnG6.getWidth()/2);
                drn6Y.setY(drnG6.getHeight()/2);
                
                //Hilos
                drnH6.setX(drn6X);
                drnH6.setY(drn6Y);
                
                if(!drnH6.isAlive()){
                    drnH6.start();
                }
                
                //Drone 7
                drnG7.setBounds(0, altura*3, ancho, altura);
                drnG7.setVisible(true);
                drn7X.setX(drnG7.getWidth()/2);
                drn7Y.setY(drnG7.getHeight()/2);
                
                //Hilos
                drnH7.setX(drn7X);
                drnH7.setY(drn7Y);
                
                if(!drnH7.isAlive()){
                    drnH7.start();
                }
                
                //Drone 8
                drnG8.setBounds(ancho, altura*3, ancho, altura);
                drnG8.setVisible(true);
                drn8X.setX(drnG8.getWidth()/2);
                drn8Y.setY(drnG8.getHeight()/2);
                
                //Hilos
                drnH8.setX(drn8X);
                drnH8.setY(drn8Y);
                
                if(!drnH8.isAlive()){
                    drnH8.start();
                }
                
                //Drone 9
                drnG9.setBounds(0, altura*4, ancho, altura);
                drnG9.setVisible(true);
                drn9X.setX(drnG9.getWidth()/2);
                drn9Y.setY(drnG9.getHeight()/2);
                
                //Hilos
                drnH9.setX(drn9X);
                drnH9.setY(drn9Y);
                
                if(!drnH9.isAlive()){
                    drnH9.start();
                }
                
                //Drone 9
                drnG10.setBounds(ancho, altura*4, ancho, altura);
                drnG10.setVisible(true);
                drn10X.setX(drnG10.getWidth()/2);
                drn10Y.setY(drnG10.getHeight()/2);
                
                //Hilos
                drnH10.setX(drn10X);
                drnH10.setY(drn10Y);
                
                if(!drnH10.isAlive()){
                    drnH10.start();
                } 
                
                
                
            break;
        }
    }
    
    
   
    //Funcion para reiniciar todos los drones
    protected void Reinicializar(){
        //Drone 2
        drnG2.setSize(0,0);
        drnG2.setVisible(false);
        
        //Drone 3
        drnG3.setSize(0,0);
        drnG3.setVisible(false);
        
        
        //Drone 4
        drnG4.setSize(0,0);
        drnG4.setVisible(false);
        
        //Drone 5
        drnG5.setSize(0,0);
        drnG5.setVisible(false);
        
        //Drone 6
        drnG6.setSize(0,0);
        drnG6.setVisible(false);
        
        //Drone 7
        drnG7.setSize(0,0);
        drnG7.setVisible(false);
        
        //Drone 8
        drnG8.setSize(0,0);
        drnG8.setVisible(false);
        
        //Drone 9 
        drnG9.setSize(0,0);
        drnG9.setVisible(false);
        
        //Drone 10 
        drnG10.setSize(0,0);
        drnG10.setVisible(false);
     
    }
}
