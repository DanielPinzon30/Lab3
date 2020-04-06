package lab3;

import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
public class Tabla extends javax.swing.JFrame {
    
public static DefaultTableModel modelo;
public static String []espacio= new String[1];
public static ArrayList<String> placa = new ArrayList<>();   
public static ArrayList<String> estadia = new ArrayList<>();
public static ArrayList<String> vehiculo = new ArrayList<>();  
public static ArrayList<String> fecha = new ArrayList<>(); 
public static ArrayList<String> fecha2 = new ArrayList<>(); 
public static ArrayList<Float> pago = new ArrayList<>(); 

//--------------------------contadores----------------------------------------------
public static int carro=0,moto=0,bici=0,x=0;



    public Tabla() {
       
        initComponents(); 
        modelo = new DefaultTableModel();
        this.jTable1.setModel(modelo);
        modelo.addColumn("Placa");
        modelo.addColumn("Tipo de Vehiculo");
        modelo.addColumn("Hora de Ingreso");
        modelo.addColumn("Hora de Salida");
        modelo.addColumn("Tiempo de Estadia");
        modelo.addColumn("Tarifa");
     
     
    }
    //--------------------Metodod para filtrar datos----------------------------------
    private void filter(String id){
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(modelo);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(id));  
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        Tipobt = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ingresarbt = new javax.swing.JButton();
        retirarbt = new javax.swing.JButton();
        buscarbt = new javax.swing.JButton();
        carrobt = new javax.swing.JRadioButton();
        motobt = new javax.swing.JRadioButton();
        bicibt = new javax.swing.JRadioButton();
        mostrarbt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        totaltxt = new javax.swing.JTextField();
        totalbt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        ingresarbt.setText("Ingresar Vehiculo");
        ingresarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarbtActionPerformed(evt);
            }
        });

        retirarbt.setText("Retirar Vehiculo");
        retirarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarbtActionPerformed(evt);
            }
        });

        buscarbt.setText("Ordenar");
        buscarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarbtActionPerformed(evt);
            }
        });

        Tipobt.add(carrobt);
        carrobt.setText("Carro");

        Tipobt.add(motobt);
        motobt.setText("Moto");

        Tipobt.add(bicibt);
        bicibt.setText("Bicicleta");
        bicibt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bicibtActionPerformed(evt);
            }
        });

        mostrarbt.setText("Mostrar Datos");
        mostrarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarbtActionPerformed(evt);
            }
        });

        jLabel2.setText("Filtrar por Tipo de Vehiculo:");

        jLabel3.setText("Movimientos del Dia");

        totalbt.setText("Mostrar Total");
        totalbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalbtActionPerformed(evt);
            }
        });

        jLabel1.setText("Total del dia: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(238, 238, 238)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(buscarbt)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(mostrarbt))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(carrobt)
                                            .addGap(18, 18, 18)
                                            .addComponent(motobt)
                                            .addGap(18, 18, 18)
                                            .addComponent(bicibt)))))
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ingresarbt)
                        .addGap(18, 18, 18)
                        .addComponent(retirarbt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totalbt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carrobt)
                    .addComponent(motobt)
                    .addComponent(bicibt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarbt)
                    .addComponent(mostrarbt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalbt))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(retirarbt)
                        .addComponent(ingresarbt)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarbtActionPerformed
       Tabla.totaltxt.setText(" ");
       Ingresar ingresar =new Ingresar();
       ingresar.setVisible(true); 
      
    }//GEN-LAST:event_ingresarbtActionPerformed

    private void retirarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarbtActionPerformed
       Retirar retirar =new Retirar();
       retirar.setVisible(true); 
    
    }//GEN-LAST:event_retirarbtActionPerformed
 
    private void buscarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarbtActionPerformed
      //---------------------------------Registro filtro segun tipo de Vehiculo-----------------------
        String id=" ";
       if(carrobt.isSelected()){
           id="Automovil";       
       }
       if(motobt.isSelected()){
           id="Motocicleta";       
       }
        if(bicibt.isSelected()){
           id="Bicicleta";       
       }     
        filter(id);
        
               
       
    }//GEN-LAST:event_buscarbtActionPerformed

    private void bicibtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bicibtActionPerformed
        
    }//GEN-LAST:event_bicibtActionPerformed

    private void mostrarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarbtActionPerformed
        String tip ="i",id;     
        id=tip;
        filter(id);
        Tipobt.clearSelection();
       
    }//GEN-LAST:event_mostrarbtActionPerformed

    private void totalbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalbtActionPerformed
       //--------------------------Suma de pagos--------------------------------
        
        float tot=0;
        for(int i=0;i<pago.size();i++){
          tot+=pago.get(i);
        }        
        totaltxt.setText(String.valueOf(tot));
    }//GEN-LAST:event_totalbtActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup Tipobt;
    public static javax.swing.JRadioButton bicibt;
    private javax.swing.JButton buscarbt;
    public static javax.swing.JRadioButton carrobt;
    private javax.swing.JButton ingresarbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    public static javax.swing.JButton mostrarbt;
    public static javax.swing.JRadioButton motobt;
    private javax.swing.JButton retirarbt;
    private javax.swing.JButton totalbt;
    public static javax.swing.JTextField totaltxt;
    // End of variables declaration//GEN-END:variables
}
