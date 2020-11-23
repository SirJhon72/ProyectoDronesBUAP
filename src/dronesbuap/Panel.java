/*Codigo Hecho por Juan Angel Gonzalez Flores 201655221*/

package dronesbuap;

import java.awt.Graphics;
import java.awt.Image;
import javafx.scene.paint.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Panel extends JFrame{
    //Variables para nuestros Drones
    protected DroneGraphics Drone1, Drone2, Drone3, Drone4, Drone5, Drone6, Drone7, Drone8, Drone9, Drone10;
    //Variables para las coordenas 
    protected CoorX XD1, XD2, XD3, XD4, XD5, XD6, XD7, XD8, XD9, XD10;
    protected CoorY YD1, YD2, YD3, YD4, YD5, YD6, YD7, YD8, YD9, YD10; 
    
    //Variables para nuestros hilos 
    protected Hilo HDrone1;
    protected Hilo HDrone2;
    protected Hilo HDrone3;
    protected Hilo HDrone4;
    protected Hilo HDrone5;
    protected Hilo HDrone6;
    protected Hilo HDrone7;
    protected Hilo HDrone8;
    protected Hilo HDrone9;
    protected Hilo HDrone10;
   
    
    //Contador de los paneles
    private int contador_panel = 1;
    
    public Panel() {
        //this.setContentPane(fondo);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        InnerPanel = new Imagen();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Drones");

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        InnerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout InnerPanelLayout = new javax.swing.GroupLayout(InnerPanel);
        InnerPanel.setLayout(InnerPanelLayout);
        InnerPanelLayout.setHorizontalGroup(
            InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        InnerPanelLayout.setVerticalGroup(
            InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InnerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(509, 509, 509))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(511, Short.MAX_VALUE)
                .addComponent(Agregar)
                .addGap(480, 480, 480))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(InnerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Agregar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        switch(contador_panel){
            case 1:
                //Creamos variables para nuestro primer hilo
                
                //Coordenadas
                XD1 = new CoorX(NumeroAleatorio(InnerPanel.getWidth(), 1));
                YD1 = new CoorY(NumeroAleatorio(InnerPanel.getHeight(), 2));
                
                //Creamos nuestra pelota
                Drone1 = new DroneGraphics(XD1, YD1, 1);
                Drone1.setBounds(1, 1, InnerPanel.getWidth() - 2, InnerPanel.getHeight() - 2);
                Drone1.setOpaque(false);
                
                //Agregamos nuestro drone
                InnerPanel.add(Drone1);
                
                //Creamos nuestro hilo y movemos nuestra pelota
                HDrone1 = new Hilo(XD1, YD1, Drone1);
                HDrone1.start();
                contador_panel = 2;               
            break;
            
            case 2:
                //Constantes para el calculo del area 
                
                /*---------------------------DATOS PARA EL HILO 1---------------*/
                //Cambiamos valores para nuestro hilo 1                
                XD1.setX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD1.setY( NumeroAleatorio(InnerPanel.getHeight(), 2) );
                
                HDrone1.setX(XD1);
                HDrone1.setY(YD1);
                
                Drone1.setX(XD1);
                Drone1.setY(YD1);
                
                Drone1.setBounds(1, 1, (InnerPanel.getWidth()/2), InnerPanel.getHeight() - 1);
             
                
                /*---------------------------DATOS PARA EL HILO 2-----------------*/
                //Agregamos datos para nuestro hilo 2
                XD2 = new CoorX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD2 = new CoorY( NumeroAleatorio(InnerPanel.getHeight(), 2) );
                
                //Creacion de la pelota 
                Drone2 = new DroneGraphics(XD2, YD2, 2);
                Drone2.setBounds((InnerPanel.getWidth()/2) + 1, 1, InnerPanel.getWidth()/2, InnerPanel.getHeight() - 1);
                Drone2.setOpaque(false);
                
                //Agregamos nuestro drone
                InnerPanel.add(Drone2);
             
                //Creamos el hilo
                HDrone2 = new Hilo(XD2, YD2, Drone2);
                System.out.println("Llego al final del ciclo");
                HDrone2.start();
                
                contador_panel = 3; 
            break;
            
            case 3:
                //Datos para nuestro hilo 1
                /*---------------------------DATOS PARA EL HILO 1---------------*/
                //Cambiamos valores para nuestro hilo 1                
                XD1.setX( NumeroAleatorio(InnerPanel.getWidth()/2, 1));
                YD1.setY( NumeroAleatorio(InnerPanel.getHeight()/2, 2));
                
                HDrone1.setX(XD1);
                HDrone1.setY(YD1);
                
                Drone1.setX(XD1);
                Drone1.setY(YD1);
                
                Drone1.setBounds(1, 1, (InnerPanel.getWidth()/2), InnerPanel.getHeight()/2 - 1);
                
                
                /*---------------------------DATOS PARA EL HILO 2---------------*/
                //Cambiamos valores para nuestro hilo 1                
                XD2.setX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD2.setY( NumeroAleatorio(InnerPanel.getHeight()/2, 2) );
                
                HDrone2.setX(XD2);
                HDrone2.setY(YD2);
                
                Drone2.setX(XD2);
                Drone2.setY(YD2);
                
                Drone2.setBounds(InnerPanel.getWidth()/2 + 1, 1, (InnerPanel.getWidth()/2) -1, InnerPanel.getHeight()/2 - 1);
             
                
                /*---------------------------DATOS PARA EL HIJO 3------------------*/
                //Coordenadas
                XD3 = new CoorX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD3 = new CoorY( NumeroAleatorio(InnerPanel.getHeight()/2, 2) );
                
                //Creamos nuestra pelota
                Drone3 = new DroneGraphics(XD1, YD1, 3);
                Drone3.setBounds(1, InnerPanel.getHeight()/2, InnerPanel.getWidth()/2, InnerPanel.getHeight() - 2);
                Drone3.setOpaque(false);
                
                //Agregamos nuestro drone
                InnerPanel.add(Drone3);
                
                //Creamos nuestro hilo y movemos nuestra pelota
                HDrone3 = new Hilo(XD3, YD3, Drone3);
                HDrone3.start();
             
                
                /*---------------------------DATOS PARA EL HIJO 4------------------*/
                //Coordenadas
                XD4 = new CoorX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD4 = new CoorY( NumeroAleatorio(InnerPanel.getHeight()/2, 2) );
                
                //Creamos nuestra pelota
                Drone4 = new DroneGraphics(XD4, YD4, 4);
                Drone4.setBounds(InnerPanel.getWidth()/2 + 1, InnerPanel.getHeight()/2, InnerPanel.getWidth()/2 - 1, InnerPanel.getHeight()/2);
                Drone4.setOpaque(false);
                
                //Agregamos nuestro drone
                InnerPanel.add(Drone4);
                
                //Creamos nuestro hilo y movemos nuestra pelota
                HDrone4 = new Hilo(XD4, YD4, Drone4);
                HDrone4.start();
                contador_panel = 4; 
            break;
            
            case 4:
                /*---------------------------DATOS PARA EL HILO 1---------------*/
                //Cambiamos valores para nuestro hilo 1                
                XD1.setX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD1.setY( NumeroAleatorio(InnerPanel.getHeight()/3, 2) );
                
                HDrone1.setX(XD1);
                HDrone1.setY(YD1);
                
                Drone1.setX(XD1);
                Drone1.setY(YD1);
                
                Drone1.setBounds(1, 1, (InnerPanel.getWidth()/2), InnerPanel.getHeight()/3 - 1);
      
                
                /*---------------------------DATOS PARA EL HILO 2---------------*/
                //Cambiamos valores para nuestro hilo 1                
                XD2.setX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD2.setY( NumeroAleatorio(InnerPanel.getHeight()/3, 2) );
                
                HDrone2.setX(XD2);
                HDrone2.setY(YD2);
                
                Drone2.setX(XD2);
                Drone2.setY(YD2);
                
                Drone2.setBounds(InnerPanel.getWidth()/2 + 1, 1, (InnerPanel.getWidth()/2) -1, InnerPanel.getHeight()/3 - 1);

                
                /*---------------------------DATOS PARA EL HIJO 3------------------*/
                //Coordenadas
                XD3.setX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD3.setY( NumeroAleatorio(InnerPanel.getHeight()/3, 2) );
                
                HDrone3.setX(XD3);
                HDrone3.setY(YD3);
                
                Drone3.setX(XD3);
                Drone3.setY(YD3);
                
                Drone3.setBounds(1, InnerPanel.getHeight()/3, (InnerPanel.getWidth()/2) -1, InnerPanel.getHeight()/3 - 1);
   
                /*---------------------------DATOS PARA EL HIJO 4------------------*/
                //Coordenadas
                XD4.setX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD4.setY( NumeroAleatorio(InnerPanel.getHeight()/3, 2) );
                
                HDrone4.setX(XD4);
                HDrone4.setY(YD4);
                
                Drone4.setX(XD4);
                Drone4.setY(YD4);
                
                Drone4.setBounds(InnerPanel.getWidth()/ 2, InnerPanel.getHeight()/3, (InnerPanel.getWidth()/2), InnerPanel.getHeight()/3 - 1);
                
                /*---------------------------DATOS PARA EL HIJO 5------------------*/
                //Coordenadas
                XD5 = new CoorX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD5 = new CoorY( NumeroAleatorio(InnerPanel.getHeight()/3, 2) );
                
                //Creamos nuestra pelota
                Drone5 = new DroneGraphics(XD5, YD5, 5);
                Drone5.setBounds(1, (InnerPanel.getHeight()/3)*2, InnerPanel.getWidth()/2 - 1, (InnerPanel.getHeight()/3));
                Drone5.setOpaque(false);
                
                
                //Agregamos nuestro drone
                InnerPanel.add(Drone5);
                
                //Creamos nuestro hilo y movemos nuestra pelota
                HDrone5 = new Hilo(XD5, YD5, Drone5);
                HDrone5.start();
                
                /*---------------------------DATOS PARA EL HIJO 6------------------*/
                //Coordenadas
                XD6 = new CoorX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD6 = new CoorY( NumeroAleatorio(InnerPanel.getHeight()/3, 2) );
                
                //Creamos nuestra pelota
                Drone6 = new DroneGraphics(XD6, YD6, 6);
                Drone6.setBounds(InnerPanel.getWidth()/2, (InnerPanel.getHeight()/3)*2, InnerPanel.getWidth()/2 - 1, (InnerPanel.getHeight()/3));
                Drone6.setOpaque(false);
                
                //Agregamos nuestro drone
                InnerPanel.add(Drone6);
                
                //Creamos nuestro hilo y movemos nuestra pelota
                HDrone6 = new Hilo(XD6, YD6, Drone6);
                HDrone6.start();
                contador_panel = 5; 
            break;
            
            case 5:
                /*---------------------------DATOS PARA EL HILO 1---------------*/
                //Cambiamos valores para nuestro hilo 1                
                XD1.setX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD1.setY( NumeroAleatorio(InnerPanel.getHeight()/4, 2) );
                
                HDrone1.setX(XD1);
                HDrone1.setY(YD1);
                
                Drone1.setX(XD1);
                Drone1.setY(YD1);
                
                Drone1.setBounds(1, 1, (InnerPanel.getWidth()/2), InnerPanel.getHeight()/4 - 1);
                
                /*---------------------------DATOS PARA EL HILO 2---------------*/
                //Cambiamos valores para nuestro hilo 1                
                XD2.setX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD2.setY( NumeroAleatorio(InnerPanel.getHeight()/4, 1) );
                
                HDrone2.setX(XD2);
                HDrone2.setY(YD2);
                
                Drone2.setX(XD2);
                Drone2.setY(YD2);
                
                Drone2.setBounds(InnerPanel.getWidth()/2 + 1, 1, (InnerPanel.getWidth()/2) -1, InnerPanel.getHeight()/4 - 1);
                
                /*---------------------------DATOS PARA EL HIJO 3------------------*/
                //Coordenadas
                XD3.setX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD3.setY( NumeroAleatorio(InnerPanel.getHeight()/4, 2) );
                
                HDrone3.setX(XD3);
                HDrone3.setY(YD3);
                
                Drone3.setX(XD3);
                Drone3.setY(YD3);
                
                Drone3.setBounds(1, InnerPanel.getHeight()/4, (InnerPanel.getWidth()/2) -1, InnerPanel.getHeight()/4 - 1);
                
                /*---------------------------DATOS PARA EL HIJO 4------------------*/
                //Coordenadas
                XD4.setX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD4.setY( NumeroAleatorio(InnerPanel.getHeight()/4, 2) );
                
                HDrone4.setX(XD4);
                HDrone4.setY(YD4);
                
                Drone4.setX(XD4);
                Drone4.setY(YD4);
                
                Drone4.setBounds(InnerPanel.getWidth()/ 2, InnerPanel.getHeight()/4, (InnerPanel.getWidth()/2), InnerPanel.getHeight()/4 - 1);
                
                
                /*---------------------------DATOS PARA EL HIJO 5------------------*/
                //Coordenadas
                XD5.setX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD5.setY( NumeroAleatorio(InnerPanel.getHeight()/4, 2) );
                
                HDrone5.setX(XD5);
                HDrone5.setY(YD5);
                
                Drone5.setX(XD5);
                Drone5.setY(YD5);
                
                Drone5.setBounds(1, (InnerPanel.getHeight()/4)*2, (InnerPanel.getWidth()/2), (InnerPanel.getHeight()/4));
                
                /*---------------------------DATOS PARA EL HIJO 6------------------*/
                //Coordenadas
                XD6.setX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD6.setY( NumeroAleatorio(InnerPanel.getHeight()/4, 2) );
                
                HDrone6.setX(XD6);
                HDrone6.setY(YD6);
                
                Drone6.setX(XD6);
                Drone6.setY(YD6);
                
                Drone6.setBounds(InnerPanel.getWidth()/2 + 1, (InnerPanel.getHeight()/4)*2, (InnerPanel.getWidth()/2), (InnerPanel.getHeight()/4));
                
                /*---------------------------DATOS PARA EL HIJO 7------------------*/
                //Coordenadas
                XD7 = new CoorX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD7 = new CoorY( NumeroAleatorio(InnerPanel.getHeight()/4, 2) );
                
                //Creamos nuestra pelota
                Drone7 = new DroneGraphics(XD7, YD7, 7);
                Drone7.setBounds(1, (InnerPanel.getHeight()/4)*3, InnerPanel.getWidth()/2 - 1, (InnerPanel.getHeight()/4));
                Drone7.setOpaque(false);
                
                //Agregamos nuestro drone
                InnerPanel.add(Drone7);
                
                //Creamos nuestro hilo y movemos nuestra pelota
                HDrone7 = new Hilo(XD7, YD7, Drone7);
                HDrone7.start();
                
                /*---------------------------DATOS PARA EL HIJO 8------------------*/
                //Coordenadas
                XD8 = new CoorX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD8 = new CoorY( NumeroAleatorio(InnerPanel.getHeight()/4, 2) );
                
                //Creamos nuestra pelota
                Drone8 = new DroneGraphics(XD8, YD8, 8);
                Drone8.setBounds(InnerPanel.getWidth()/2, (InnerPanel.getHeight()/4)*3, InnerPanel.getWidth()/2 - 1, (InnerPanel.getHeight()/4));
                Drone8.setOpaque(false);
                
                //Agregamos nuestro drone
                InnerPanel.add(Drone8);
                
                //Creamos nuestro hilo y movemos nuestra pelota
                HDrone8 = new Hilo(XD8, YD8, Drone8);
                HDrone8.start();
                
                contador_panel = 6;
            break;
            
            
            case 6:
                /*---------------------------DATOS PARA EL HILO 1---------------*/
                //Cambiamos valores para nuestro hilo 1                
                XD1.setX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD1.setY( NumeroAleatorio(InnerPanel.getHeight()/5, 2) );
                
                HDrone1.setX(XD1);
                HDrone1.setY(YD1);
                
                Drone1.setX(XD1);
                Drone1.setY(YD1);
                
                Drone1.setBounds(1, 1, (InnerPanel.getWidth()/2), InnerPanel.getHeight()/5 - 1);
                
                
                
                /*---------------------------DATOS PARA EL HILO 2---------------*/
                //Cambiamos valores para nuestro hilo 1                
                XD2.setX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD2.setY( NumeroAleatorio(InnerPanel.getHeight()/5, 2) );
                
                HDrone2.setX(XD2);
                HDrone2.setY(YD2);
                
                Drone2.setX(XD2);
                Drone2.setY(YD2);
                
                Drone2.setBounds(InnerPanel.getWidth()/2 + 1, 1, (InnerPanel.getWidth()/2) -1, InnerPanel.getHeight()/5 - 1);
                
                /*---------------------------DATOS PARA EL HIJO 3------------------*/
                //Coordenadas
                XD3.setX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD3.setY( NumeroAleatorio(InnerPanel.getHeight()/5, 2) );
                
                HDrone3.setX(XD3);
                HDrone3.setY(YD3);
                
                Drone3.setX(XD3);
                Drone3.setY(YD3);
                
                Drone3.setBounds(1, InnerPanel.getHeight()/5, (InnerPanel.getWidth()/2) -1, InnerPanel.getHeight()/5 - 1);
                
                /*---------------------------DATOS PARA EL HIJO 4------------------*/
                //Coordenadas
                XD4.setX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD4.setY( NumeroAleatorio(InnerPanel.getHeight()/5, 2) );
                
                HDrone4.setX(XD4);
                HDrone4.setY(YD4);
                
                Drone4.setX(XD4);
                Drone4.setY(YD4);
                
                Drone4.setBounds(InnerPanel.getWidth()/ 2, InnerPanel.getHeight()/5, (InnerPanel.getWidth()/2), InnerPanel.getHeight()/5 - 1);
                
                /*---------------------------DATOS PARA EL HIJO 5------------------*/
                //Coordenadas
                XD5.setX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD5.setY( NumeroAleatorio(InnerPanel.getHeight()/5, 2) );
                
                HDrone5.setX(XD5);
                HDrone5.setY(YD5);
                
                Drone5.setX(XD5);
                Drone5.setY(YD5);
                
                Drone5.setBounds(1, (InnerPanel.getHeight()/5)*2, (InnerPanel.getWidth()/2), (InnerPanel.getHeight()/5));
                
                /*---------------------------DATOS PARA EL HIJO 6------------------*/
                //Coordenadas
                XD6.setX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD6.setY( NumeroAleatorio(InnerPanel.getHeight()/5, 2) );
                
                HDrone6.setX(XD6);
                HDrone6.setY(YD6);
                
                Drone6.setX(XD6);
                Drone6.setY(YD6);
                
                Drone6.setBounds(InnerPanel.getWidth()/2 + 1, (InnerPanel.getHeight()/5)*2, (InnerPanel.getWidth()/2), (InnerPanel.getHeight()/5));
                
                /*---------------------------DATOS PARA EL HIJO 7------------------*/
                //Coordenadas
                XD7.setX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD7.setY( NumeroAleatorio(InnerPanel.getHeight()/5, 2) );
                
                HDrone7.setX(XD7);
                HDrone7.setY(YD7);
                
                Drone7.setX(XD7);
                Drone7.setY(YD7);
                
                Drone7.setBounds(1, (InnerPanel.getHeight()/5)*3, (InnerPanel.getWidth()/2), (InnerPanel.getHeight()/5));
                
                /*---------------------------DATOS PARA EL HIJO 8------------------*/
                //Coordenadas
                XD8.setX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD8.setY( NumeroAleatorio(InnerPanel.getHeight()/5, 2) );
                
                HDrone8.setX(XD8);
                HDrone8.setY(YD8);
                
                Drone8.setX(XD8);
                Drone8.setY(YD8);
                
                Drone8.setBounds(InnerPanel.getWidth()/2 + 1, (InnerPanel.getHeight()/5)*3, (InnerPanel.getWidth()/2), (InnerPanel.getHeight()/5));
                
                /*---------------------------DATOS PARA EL HIJO 9------------------*/
                //Coordenadas
                XD9 = new CoorX(NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD9 = new CoorY( NumeroAleatorio(InnerPanel.getHeight()/5, 2) );
                
                //Creamos nuestra pelota
                Drone9 = new DroneGraphics(XD9, YD9, 9);
                Drone9.setBounds(1, (InnerPanel.getHeight()/5)*4, InnerPanel.getWidth()/2 - 1, (InnerPanel.getHeight()/5));
                Drone9.setOpaque(false);
                
                //Agregamos nuestro drone
                InnerPanel.add(Drone9);
                
                //Creamos nuestro hilo y movemos nuestra pelota
                HDrone9 = new Hilo(XD9, YD9, Drone9);
                HDrone9.start();
                
                /*---------------------------DATOS PARA EL HIJO 10------------------*/
                //Coordenadas
                XD10 = new CoorX( NumeroAleatorio(InnerPanel.getWidth()/2, 1) );
                YD10 = new CoorY( NumeroAleatorio(InnerPanel.getHeight()/5, 2) );
                
                //Creamos nuestra pelota
                Drone10 = new DroneGraphics(XD10, YD10, 10);
                Drone10.setBounds((InnerPanel.getWidth()/2), (InnerPanel.getHeight()/5)*4, InnerPanel.getWidth()/2 - 1, (InnerPanel.getHeight()/5));
                Drone10.setOpaque(false);
                
                //Agregamos nuestro drone
                InnerPanel.add(Drone10);
                
                //Creamos nuestro hilo y movemos nuestra pelota
                HDrone10 = new Hilo(XD10, YD10, Drone10);
                HDrone10.start();
                
                Agregar.setEnabled(false);
            break;
        }


    }//GEN-LAST:event_AgregarActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JPanel InnerPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    //Metodo para generar numeros aleatorios
    protected int NumeroAleatorio(int Num, int flag){
        int valor = 0;
        
        //Numeros de X
        if(flag == 1){
            valor = (int)(Math.random()*(Num - 25 ) + 25);
            if(valor <= 0){
                valor = 25;
            }else if(valor >= Num){
                valor = valor - 25;
            }
        }
        //Numertos de Y
        else{
            valor = (int)(Math.random()*(Num - 25 ) + 25);  
            if(valor <= 0){
                valor = 25;
            }else if(valor >= Num){
                valor = valor - 25;
            }
        }
        
       
              
        return valor;
    }



}

//Clase que contiene la imagen de fondo
class Imagen extends JPanel{
    private Image imagen;
    
    @Override
    public void paint(Graphics g){
        imagen = new ImageIcon(getClass().getResource("/Imagen/fondo.png")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        
        setOpaque(false);
        super.paint(g);
    }   
}