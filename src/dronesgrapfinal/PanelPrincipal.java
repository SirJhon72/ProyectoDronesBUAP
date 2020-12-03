
package dronesgrapfinal;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;


public class PanelPrincipal extends javax.swing.JFrame {
    //Variables que nos ayuda a crontrolar el cambio entre los drones
    private int SwitchAlgorithm = 0;
    
    //Variables para los drones
    DronesSimple DS = new DronesSimple();
    
    //Variables para los semaforos
    SemaforosPanel SP = new SemaforosPanel();
    
    //Variables para las condiciones de competencia
    VCondicionPanel VC = new VCondicionPanel();
    
    
    //Varianles para los monitores
    MonitoresPanel MP = new MonitoresPanel();
    
    //Para las graficas del semaforo
    ChartPanel GraficoSemaforos = null;
    ChartPanel GraficoMonitores = null;
    ChartPanel GraficoVCondicion = null;
       

    public PanelPrincipal() {
        initComponents();
        LabelNombre.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelNombre = new javax.swing.JLabel();
        DesktopPanel = new Imagen();
        GenerarGrafico = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        SimpleDronesBtn = new javax.swing.JMenuItem();
        Semaforos = new javax.swing.JMenuItem();
        VariablesCondicion = new javax.swing.JMenuItem();
        Monitores = new javax.swing.JMenuItem();
        AddDrone1 = new javax.swing.JMenu();
        NoDrones1 = new javax.swing.JMenuItem();
        AddDrone2 = new javax.swing.JMenuItem();
        AddDrone4 = new javax.swing.JMenuItem();
        AddDrone6 = new javax.swing.JMenuItem();
        AddDrone8 = new javax.swing.JMenuItem();
        AddDrone10 = new javax.swing.JMenuItem();
        Graficar = new javax.swing.JMenu();
        GenerarGrafica = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelNombre.setText("Algoritmo");

        javax.swing.GroupLayout DesktopPanelLayout = new javax.swing.GroupLayout(DesktopPanel);
        DesktopPanel.setLayout(DesktopPanelLayout);
        DesktopPanelLayout.setHorizontalGroup(
            DesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DesktopPanelLayout.setVerticalGroup(
            DesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jMenu1.setText("Algoritmo");

        SimpleDronesBtn.setText("Simple");
        SimpleDronesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpleDronesBtnActionPerformed(evt);
            }
        });
        jMenu1.add(SimpleDronesBtn);

        Semaforos.setText("Semaforos");
        Semaforos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemaforosActionPerformed(evt);
            }
        });
        jMenu1.add(Semaforos);

        VariablesCondicion.setText("Variables de condicion");
        VariablesCondicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VariablesCondicionActionPerformed(evt);
            }
        });
        jMenu1.add(VariablesCondicion);

        Monitores.setText("Monitores");
        Monitores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonitoresActionPerformed(evt);
            }
        });
        jMenu1.add(Monitores);

        GenerarGrafico.add(jMenu1);

        AddDrone1.setText("Drones");
        AddDrone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDrone1ActionPerformed(evt);
            }
        });

        NoDrones1.setText("1");
        NoDrones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoDrones1ActionPerformed(evt);
            }
        });
        AddDrone1.add(NoDrones1);

        AddDrone2.setText("2");
        AddDrone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDrone2ActionPerformed(evt);
            }
        });
        AddDrone1.add(AddDrone2);

        AddDrone4.setText("4");
        AddDrone4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDrone4ActionPerformed(evt);
            }
        });
        AddDrone1.add(AddDrone4);

        AddDrone6.setText("6");
        AddDrone6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDrone6ActionPerformed(evt);
            }
        });
        AddDrone1.add(AddDrone6);

        AddDrone8.setText("8");
        AddDrone8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDrone8ActionPerformed(evt);
            }
        });
        AddDrone1.add(AddDrone8);

        AddDrone10.setText("10");
        AddDrone10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDrone10ActionPerformed(evt);
            }
        });
        AddDrone1.add(AddDrone10);

        GenerarGrafico.add(AddDrone1);

        Graficar.setText("Graficar");

        GenerarGrafica.setText("Generar Grafica");
        GenerarGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarGraficaActionPerformed(evt);
            }
        });
        Graficar.add(GenerarGrafica);

        GenerarGrafico.add(Graficar);

        setJMenuBar(GenerarGrafico);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DesktopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(644, 644, 644)
                .addComponent(LabelNombre)
                .addContainerGap(649, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(DesktopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SimpleDronesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpleDronesBtnActionPerformed
        InicializacionDronesSimples();      
        
    }//GEN-LAST:event_SimpleDronesBtnActionPerformed
   
   
    private void AddDrone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDrone1ActionPerformed
        InicializarDronesMonitores();
    }//GEN-LAST:event_AddDrone1ActionPerformed

    private void NoDrones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoDrones1ActionPerformed
        switch(SwitchAlgorithm){
            
            //Para el algoritmo de drones no sincronizados 
            case 1:
                DS.IniciarDrones(1);
            break;
            
            //Para el algoritmo de drones con semaforos
            case 2:
                SP.InicializarDronesSemaforo(1);
            break;
            
            //Para el algoritmo de drones con variables de competencia
            case 3:
                VC.InicializarDronesVariablesCondicion(1);
                
            break;
            
            //Para el algoritmo de drones con monitores
            case 4:
                MP.InicializarDronesMonitores(1);
            break;
        
            
            
        }
    }//GEN-LAST:event_NoDrones1ActionPerformed

    private void AddDrone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDrone2ActionPerformed
         switch(SwitchAlgorithm){
            
            //Para el algoritmo de drones no sincronizados 
            case 1:
               
                DS.IniciarDrones(2);
            break;
            
            //Para el algoritmo de drones con semaforos
            case 2:
                SP.InicializarDronesSemaforo(2);
            break;
            
            //Para el algoritmo de drones con variables de competencia
            case 3:
                VC.InicializarDronesVariablesCondicion(2);
                
            break;
            
            //Para el algoritmo de drones con monitores
            case 4:
                MP.InicializarDronesMonitores(2);
            break;
        }
    }//GEN-LAST:event_AddDrone2ActionPerformed

    private void AddDrone4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDrone4ActionPerformed
          switch(SwitchAlgorithm){
            
            //Para el algoritmo de drones no sincronizados 
            case 1:
                
                DS.IniciarDrones(3);
            break;
            
            //Para el algoritmo de drones con semaforos
            case 2:
                SP.InicializarDronesSemaforo(3);
            break;
            
            //Para el algoritmo de drones con variables de competencia
            case 3:
                VC.InicializarDronesVariablesCondicion(3);
                
            break;
            
            //Para el algoritmo de drones con monitores
            case 4:
                MP.InicializarDronesMonitores(3);
            break;
        }
    }//GEN-LAST:event_AddDrone4ActionPerformed

    private void AddDrone6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDrone6ActionPerformed
            switch(SwitchAlgorithm){
            
            //Para el algoritmo de drones no sincronizados 
            case 1:
                DS.IniciarDrones(4);
            break;
            
            //Para el algoritmo de drones con semaforos
            case 2:
                SP.InicializarDronesSemaforo(4);
            break;
            
            //Para el algoritmo de drones con variables de competencia
            case 3:
                VC.InicializarDronesVariablesCondicion(4);
                
            break;
            
            //Para el algoritmo de drones con monitores
            case 4:
                MP.InicializarDronesMonitores(4);
            break;
        }
    }//GEN-LAST:event_AddDrone6ActionPerformed

    private void AddDrone8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDrone8ActionPerformed
            switch(SwitchAlgorithm){
            
            //Para el algoritmo de drones no sincronizados 
            case 1:
                DS.IniciarDrones(5);
            break;
            
            //Para el algoritmo de drones con semaforos
            case 2:
                SP.InicializarDronesSemaforo(5);
            break;
            
            //Para el algoritmo de drones con variables de competencia
            case 3:
                VC.InicializarDronesVariablesCondicion(5);
                
            break;
            
            //Para el algoritmo de drones con monitores
            case 4:
                MP.InicializarDronesMonitores(5);
            break;
        }
    }//GEN-LAST:event_AddDrone8ActionPerformed

    private void AddDrone10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDrone10ActionPerformed
        switch(SwitchAlgorithm){
            
            //Para el algoritmo de drones no sincronizados 
            case 1:
                DS.IniciarDrones(6);
            break;
            
            //Para el algoritmo de drones con semaforos
            case 2:
                SP.InicializarDronesSemaforo(6);
            break;
            
            //Para el algoritmo de drones con variables de competencia
            case 3:
                VC.InicializarDronesVariablesCondicion(6);
                
            break;
                        
            //Para el algoritmo de drones con monitores
            case 4:
                MP.InicializarDronesMonitores(6);
            break;
        }
        
        
    }//GEN-LAST:event_AddDrone10ActionPerformed

    private void SemaforosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemaforosActionPerformed
            InicializaDronesSemaforos();
    }//GEN-LAST:event_SemaforosActionPerformed

    private void GenerarGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarGraficaActionPerformed
        //Funcion para generar las graficas de nuestros algoritmmos 
        switch(SwitchAlgorithm){
            
            //Caso para los semaforos
            case 2:
                GraficoSemaforos = SP.GenerarGraficaSemaforos();
                SP.setVisible(false);
                DesktopPanel.removeAll();
                GraficoSemaforos.setSize(DesktopPanel.getWidth(), DesktopPanel.getHeight());
                GraficoSemaforos.setLocation(0,0);
                DesktopPanel.add(GraficoSemaforos);
                DesktopPanel.validate();
            break;
            
            
            
            //Caso para las variables de condicion
            case 3:
                GraficoVCondicion = VC.GenerarGraficaVCondicion();
                VC.setVisible(false);
                DesktopPanel.removeAll();
                GraficoVCondicion.setSize(DesktopPanel.getWidth(), DesktopPanel.getHeight());
                GraficoVCondicion.setLocation(0,0);
                DesktopPanel.add(GraficoVCondicion);
                DesktopPanel.validate();                
            break;
            
            //Caso para los monitores
            case 4:
                GraficoMonitores = MP.GenerarGraficaMonitores();
                MP.setVisible(false);
                DesktopPanel.removeAll();
                GraficoMonitores.setSize(DesktopPanel.getWidth(), DesktopPanel.getHeight());
                GraficoMonitores.setLocation(0,0);
                DesktopPanel.add(GraficoMonitores);
                DesktopPanel.validate();
            break;
            
            
            
        }
    }//GEN-LAST:event_GenerarGraficaActionPerformed

    private void VariablesCondicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VariablesCondicionActionPerformed
        InicializaDronesCompetencia();
    }//GEN-LAST:event_VariablesCondicionActionPerformed

    private void MonitoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonitoresActionPerformed
        InicializarDronesMonitores();
    }//GEN-LAST:event_MonitoresActionPerformed

    
   

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AddDrone1;
    private javax.swing.JMenuItem AddDrone10;
    private javax.swing.JMenuItem AddDrone2;
    private javax.swing.JMenuItem AddDrone4;
    private javax.swing.JMenuItem AddDrone6;
    private javax.swing.JMenuItem AddDrone8;
    private javax.swing.JPanel DesktopPanel;
    private javax.swing.JMenuItem GenerarGrafica;
    private javax.swing.JMenuBar GenerarGrafico;
    private javax.swing.JMenu Graficar;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JMenuItem Monitores;
    private javax.swing.JMenuItem NoDrones1;
    private javax.swing.JMenuItem Semaforos;
    private javax.swing.JMenuItem SimpleDronesBtn;
    private javax.swing.JMenuItem VariablesCondicion;
    private javax.swing.JMenu jMenu1;
    // End of variables declaration//GEN-END:variables

    //Funciones para el control del panel que controla los drones simples
    protected void InicializacionDronesSimples(){
        //Resetamos los paneles
        Reset();
        
        //Cambiamos el nombre de nuestro algoritmo
        LabelNombre.setText("Drones No sync");
        LabelNombre.setLocation(this.getWidth()/2, LabelNombre.getHeight());
        LabelNombre.setVisible(true);
        
        //Control de nuestro panel de drones simple
        DesktopPanel.add(DS);
        DS.setSize(DesktopPanel.getWidth(), DesktopPanel.getHeight());
        DS.setLocation(0,0);
        DS.setVisible(true);
        
        //Cambiamos la variable que va a controlar la cantidad de drones
        SwitchAlgorithm = 1;
        
        //Inicializamos las variables que se van a controlar con este panel
        DS.Inicializar();
        
    }
    
    //Funcion para inicializar el panel de los drones 
    protected void InicializarDronesMonitores(){
        //Reseteamos los paneles
        Reset();
        
        //Cambiamos el nombre de nuestro algoritmo 
        LabelNombre.setText("Drones con Monitores");
        LabelNombre.setLocation(this.getWidth()/2, LabelNombre.getHeight());
        LabelNombre.setVisible(true);
        
        
        //Control de nuesto panel de drones simple
        DesktopPanel.add(MP);
        MP.setSize(DesktopPanel.getWidth(), DesktopPanel.getHeight());
        System.out.println("Dekstop width: " + DesktopPanel.getWidth() + " Dekstop height: " + DesktopPanel.getHeight());
        MP.setLocation(0,0);
        MP.setOpaque(false);
        MP.setVisible(true);
        
        //Cambiamos la variable que controla el acceso a las funciones de los drones con semaforos
        SwitchAlgorithm = 4;
         
        //inicializamos las variables para los drones con semaforos
        MP.InicializacionMonitores();
    }
    
    //Funciones para el control del panel que controla los drones de semaforos
    protected void InicializaDronesSemaforos(){
        //Reseteamos los paneles
        Reset();
        
        //Cambiamos el nombre de nuestro algoritmo 
        LabelNombre.setText("Drones con semaforos");
        LabelNombre.setLocation(this.getWidth()/2, LabelNombre.getHeight());
        LabelNombre.setVisible(true);
        
        
        //Control de nuesto panel de drones simple
        DesktopPanel.add(SP);
        SP.setSize(DesktopPanel.getWidth(), DesktopPanel.getHeight());
        System.out.println("Dekstop width: " + DesktopPanel.getWidth() + " Dekstop height: " + DesktopPanel.getHeight());
        SP.setLocation(0,0);
        SP.setOpaque(false);
        SP.setVisible(true);
        
        //Cambiamos la variable que controla el acceso a las funciones de los drones con semaforos
        SwitchAlgorithm = 2;
         
        //inicializamos las variables para los drones con semaforos
        SP.InicializacionSemaforos();
    }
    
    //Funcion para el control del panel, inicializa el panel para condiciones de competencia
    protected void InicializaDronesCompetencia(){
        //Reseteamos los paneles
        Reset();
        //RemoveCharts();
        //Cambiamos el nombre de nuestro algoritmo 
        LabelNombre.setText("Drones con Variables de Condicion");
        LabelNombre.setLocation(this.getWidth()/2, LabelNombre.getHeight());
        LabelNombre.setVisible(true);
        
        
        //Control de nuesto panel de drones simple
        VC.setSize(DesktopPanel.getWidth(), DesktopPanel.getHeight());
        System.out.println("Dekstop width: " + DesktopPanel.getWidth() + " Dekstop height: " + DesktopPanel.getHeight());
        VC.setLocation(0,0);
        VC.setOpaque(false);
        VC.setVisible(true);
        DesktopPanel.add(VC);
       
        
        //Cambiamos la variable que controla el acceso a las funciones de los drones con semaforos
        SwitchAlgorithm = 3;
         
        //inicializamos las variables para los drones con semaforos
        VC.InicializacionVariablesCondicion();
    }
    
    protected void Reset(){
        
        //Para los drones simples
        DS.setSize(0,0);
        DS.setLocation(0, 0);
        DS.setVisible(false);
        DesktopPanel.remove(DS);
        
        //Para los drones con semaforos
        SP.setSize(0,0);
        SP.setLocation(0,0);
        SP.setVisible(false);
        DesktopPanel.remove(SP);
        
        //Para los drones con VCondiciones
        VC.setSize(0,0);
        VC.setLocation(0,0);
        VC.setVisible(false);
        DesktopPanel.remove(VC);
        
        //Para los drones con Monitores
        MP.setSize(0,0);
        MP.setLocation(0,0);
        MP.setVisible(false);
        DesktopPanel.remove(MP);
        
        if(GraficoSemaforos!= null){
            //Removemos las graficas 
            GraficoSemaforos.setSize(0,0);
            GraficoSemaforos.setLocation(0,0);
            GraficoSemaforos.setVisible(false);
            DesktopPanel.remove(GraficoSemaforos);
        }

        if(GraficoMonitores!= null){
            GraficoMonitores.setSize(0,0);
            GraficoMonitores.setLocation(0,0);
            GraficoMonitores.setVisible(false);
            DesktopPanel.remove(GraficoMonitores);
        }
        
        if(GraficoVCondicion!= null){
            GraficoVCondicion.setSize(0,0);
            GraficoVCondicion.setLocation(0,0);
            GraficoVCondicion.setVisible(false);
            DesktopPanel.remove(GraficoVCondicion);
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
}
