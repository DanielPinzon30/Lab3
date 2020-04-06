package lab3;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Comprar extends javax.swing.JFrame {
public static DefaultTableModel modelo1;
 public static String []espacio= new String[1];
int fila,cant;
float subtotal=0;
   
    public Comprar() {
        initComponents();
         modelo1 = new DefaultTableModel();
        this.jTable1.setModel(modelo1);
        modelo1.addColumn("Fila");
        modelo1.addColumn("Precio");
        for(int i=0;i<15;i++){
            modelo1.addRow(espacio);
            modelo1.setValueAt("Fila "+(i+1), i, 0);
            modelo1.setValueAt("$"+Teatro.precio.get(i),i, 1);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        filatxt = new javax.swing.JTextField();
        columntxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        preciolabel = new javax.swing.JLabel();
        canttxt = new javax.swing.JTextField();
        enterbt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Fila");

        jLabel2.setText("Columna");

        enterbt.setText("enter");
        enterbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterbtActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(canttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(enterbt))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(filatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(columntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(preciolabel))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(canttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterbt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(columntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preciolabel))
                .addGap(77, 77, 77)
                .addComponent(jButton1)
                .addGap(85, 85, 85))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int a=0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        if(Integer.parseInt(filatxt.getText())>15||Integer.parseInt(filatxt.getText())<1||Integer.parseInt(columntxt.getText())<1||Integer.parseInt(columntxt.getText())>30){
            JOptionPane.showMessageDialog(null,"LA FILA O COLUMNA INGRESADA NO EXISTE");
            filatxt.setText("");columntxt.setText("");            
        }else{        
        if(Teatro.modelo.getValueAt(Integer.parseInt(filatxt.getText())-1, Integer.parseInt(columntxt.getText())).equals("[||]")){
         JOptionPane.showMessageDialog(null,"ESTE PUESTO NO ESTA DISPONIBLE");
         a--;
        }else{
        Teatro.modelo.setValueAt("[||]",Integer.parseInt(filatxt.getText())-1, Integer.parseInt(columntxt.getText()));  
        fila=Integer.parseInt(filatxt.getText());
        Teatro.total+=Teatro.precio.get(fila-1);
       
        subtotal+=Teatro.precio.get(fila-1);
        
        }
        }
       
        
        
        filatxt.setText("");columntxt.setText("");  
        a++;
    if(a==cant){
    JOptionPane.showMessageDialog(null,"COMPRO "+cant+" BOLETO(S)"+"       PRECIO: $"+subtotal);
    this.setVisible(false);
    
    }
    
    
    int disp=0,ocup=0;   
    for(int i=0;i<15;i++){
        for(int j=0;j<30;j++){
        if(Teatro.modelo.getValueAt(i,j).equals("[||]")){
        ocup++;
        }else{
            disp=450-ocup;
        }
    }
    }
        
        Teatro.alabel.setText(String.valueOf(disp));
        Teatro.blabel.setText(String.valueOf(ocup));
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void enterbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterbtActionPerformed
       cant=Integer.parseInt(canttxt.getText());
    }//GEN-LAST:event_enterbtActionPerformed

   
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
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comprar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField canttxt;
    private javax.swing.JTextField columntxt;
    private javax.swing.JButton enterbt;
    private javax.swing.JTextField filatxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel preciolabel;
    // End of variables declaration//GEN-END:variables
}
