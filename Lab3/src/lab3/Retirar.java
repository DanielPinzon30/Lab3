package lab3;

import javax.swing.JOptionPane;
import java.util.Date;

public class Retirar extends javax.swing.JFrame {
  
   
    public int []tiempotot=new int[2];
    public Retirar() {
        initComponents();
       
      
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        horabt = new javax.swing.ButtonGroup();
        placatxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        retirarbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Placa:");

        retirarbt.setText("Retirar");
        retirarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarbtActionPerformed(evt);
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
                        .addGap(153, 153, 153)
                        .addComponent(retirarbt)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(retirarbt)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void retirarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarbtActionPerformed
    String placa=placatxt.getText();
    Date fecha = new Date();
    String hora2 = Integer.toString(fecha.getHours());
    String minutos2 = Integer.toString(fecha.getMinutes());
    String segundos2 = Integer.toString(fecha.getSeconds());
    int Ht=0,min=0,seg=0;
    String var;
    String[] aux0 = new String[3];
    String[] aux= new String[3];
    aux0[0]=hora2;
    aux0[1]=minutos2;
    aux0[2]=segundos2;
    float pago;
    
    //---------------------------------Registro Hora de salida-----------------------------------
    Tabla.fecha2.add(0,hora2+":"+minutos2+":"+segundos2);
    JOptionPane.showMessageDialog(null,"VEHICULO RETIRADO   Hora de salida: "+Tabla.fecha2.get(0));
    
     
    placatxt.setText("");
    this.setVisible(false);
    
    //----------------------------Comparacion placa ingrasadas------------------------------------
            if(Tabla.placa.contains(placa)){
                
                if(Tabla.modelo.getValueAt(Tabla.placa.indexOf(placa), 1).equals("Automovil")){
                    Tabla.carro--;
                   
                }
                if(Tabla.modelo.getValueAt(Tabla.placa.indexOf(placa), 1).equals("Motocicleta")){
                    Tabla.moto--;
                }
                if(Tabla.modelo.getValueAt(Tabla.placa.indexOf(placa), 1).equals("Bicicleta")){
                    Tabla.bici--;
                }             
                
                Tabla.modelo.setValueAt(Tabla.fecha2.get(0), Tabla.placa.indexOf(placa), 3);
                var=(String)Tabla.fecha.get(Tabla.placa.indexOf(placa));  
                aux=var.split(":");
            }
            
            
            //---------------------------Hora de estadi--------------------------
            if(Integer.parseInt(aux0[0])==Integer.parseInt(aux[0])){
                 Ht=(Integer.parseInt(aux0[0])-Integer.parseInt(aux[0]));
            }else{
            Ht=(Integer.parseInt(aux0[0])-Integer.parseInt(aux[0]))-1;
            }
            
            if(Integer.parseInt(aux0[1])<Integer.parseInt(aux[1])){
                min=Integer.parseInt(aux[1])-Integer.parseInt(aux0[1]);
            }
             if(Integer.parseInt(aux0[1])>Integer.parseInt(aux[1])){
                min=(Integer.parseInt(aux0[1])-Integer.parseInt(aux[1]));
            }
             
             if(Integer.parseInt(aux0[2])<Integer.parseInt(aux[2])){
                seg=Integer.parseInt(aux[2])-Integer.parseInt(aux0[2]);
            }
             if(Integer.parseInt(aux0[2])>Integer.parseInt(aux[2])){
                seg=(Integer.parseInt(aux0[2])-Integer.parseInt(aux[2]));
            }
             
             Tabla.estadia.add(0,Ht+":"+min+":"+seg);
             Tabla.modelo.setValueAt(Tabla.estadia.get(0), Tabla.placa.indexOf(placa), 4);
                         
             //---------------------------------------Cobro------------------------------
             
             var=(String)Tabla.estadia.get(0);
             aux=var.split(":");
             
             pago=((Float.parseFloat(aux[0]))*60)+Float.parseFloat(aux[1])+(Float.parseFloat(aux[2])/60);
             
             if(Tabla.modelo.getValueAt(Tabla.placa.indexOf(placa), 1).equals("Automovil")){
                 if(Float.parseFloat(aux[0])>=10){
                     Tabla.modelo.setValueAt("$13.000",Tabla.placa.indexOf(placa), 5);
                     Tabla.pago.add(pago);
                 }else{
                    pago=(((Float.parseFloat(aux[0]))*60)+Float.parseFloat(aux[1])+((Float.parseFloat(aux[2]))/60))*75;
                    Tabla.modelo.setValueAt("$"+pago,Tabla.placa.indexOf(placa), 5);
                    Tabla.pago.add(pago);
                 }
                }
                if(Tabla.modelo.getValueAt(Tabla.placa.indexOf(placa), 1).equals("Motocicleta")){                    
                     if(Float.parseFloat(aux[0])>=10){
                     Tabla.modelo.setValueAt("$13.000",Tabla.placa.indexOf(placa), 5);
                     Tabla.pago.add(pago);
                 }else{
                    pago=(((Float.parseFloat(aux[0]))*60)+Float.parseFloat(aux[1])+((Float.parseFloat(aux[2]))/60))*20;
                    Tabla.modelo.setValueAt("$"+pago,Tabla.placa.indexOf(placa), 5);
                    Tabla.pago.add(pago);
                     }
                }
                if(Tabla.modelo.getValueAt(Tabla.placa.indexOf(placa), 1).equals("Bicicleta")){
                     if(Float.parseFloat(aux[0])>=10){
                     Tabla.modelo.setValueAt("$13.000",Tabla.placa.indexOf(placa), 5);
                     Tabla.pago.add(pago);
                 }else{
                    pago=(((Float.parseFloat(aux[0]))*60)+Float.parseFloat(aux[1])+((Float.parseFloat(aux[2]))/60))*10;
                    Tabla.modelo.setValueAt("$"+pago,Tabla.placa.indexOf(placa), 5);
                    Tabla.pago.add(pago);
                     }
                }
             

                
               
    }//GEN-LAST:event_retirarbtActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Retirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Retirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Retirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Retirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Retirar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup horabt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField placatxt;
    private javax.swing.JButton retirarbt;
    // End of variables declaration//GEN-END:variables
}
