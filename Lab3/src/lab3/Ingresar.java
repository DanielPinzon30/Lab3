package lab3;

public  class Ingresar extends javax.swing.JFrame {
     
    public Ingresar() {
        initComponents();               
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Vehiculosbt = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        horabt = new javax.swing.ButtonGroup();
        placatxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        carrobt = new javax.swing.JRadioButton();
        motobt = new javax.swing.JRadioButton();
        bicibt = new javax.swing.JRadioButton();
        registrarbt = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Placa:");

        Vehiculosbt.add(carrobt);
        carrobt.setText("Automovil");
        carrobt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrobtActionPerformed(evt);
            }
        });

        Vehiculosbt.add(motobt);
        motobt.setText("Motocicleta");

        Vehiculosbt.add(bicibt);
        bicibt.setText("Bicicleta");

        registrarbt.setText("Registrar");
        registrarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(placatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(registrarbt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(carrobt)
                        .addGap(18, 18, 18)
                        .addComponent(motobt)
                        .addGap(18, 18, 18)
                        .addComponent(bicibt)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carrobt)
                    .addComponent(motobt)
                    .addComponent(bicibt))
                .addGap(59, 59, 59)
                .addComponent(registrarbt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carrobtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrobtActionPerformed
       
    }//GEN-LAST:event_carrobtActionPerformed
  
    private void registrarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarbtActionPerformed
     
    //--------------------------Registro de Placa------------------------ 
    Tabla.placa.add(placatxt.getText());  
  
   
        
        
        
    
    //---------------------------Condicional tipo de Vehiculo------------
    
   
     if(carrobt.isSelected()){
         Tabla.vehiculo.add(Tabla.x,"Automovil");
         Tabla.carro++;
     }  
     if(motobt.isSelected()){
          Tabla.vehiculo.add("Motocicleta");
          Tabla.moto++;
     }
     if(bicibt.isSelected()){
          Tabla.vehiculo.add("Bicicleta");
          Tabla.bici++;
          
     }
     
     
    RegHora.metodo();
    this.setVisible(false);
    Tabla.x++;
     
   
     
    }//GEN-LAST:event_registrarbtActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup Vehiculosbt;
    private javax.swing.JRadioButton bicibt;
    private javax.swing.JRadioButton carrobt;
    private javax.swing.ButtonGroup horabt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton motobt;
    public static javax.swing.JTextField placatxt;
    private javax.swing.JButton registrarbt;
    // End of variables declaration//GEN-END:variables
}
