package lab3;

import java.util.Date;
import javax.swing.JOptionPane;

public class RegHora {
    
    public static void metodo(){
Date fecha = new Date();
      //----------------------------------Registro Hora de entrada--------------------------------
    String hora = Integer.toString(fecha.getHours());
    String minutos = Integer.toString(fecha.getMinutes());
    String segundos = Integer.toString(fecha.getSeconds());    
    Ingresar.Vehiculosbt.clearSelection();     
    Tabla.fecha.add(hora+":"+minutos+":"+segundos);     
    JOptionPane.showMessageDialog(null,"VEHICULO REGISTRADO    Hora Entrada: "+Tabla.fecha.get(Tabla.x));
    
    Tabla.modelo.addRow(Tabla.espacio);
       
    //-------------------------Agregar valores a la tabla--------------------------------------------
       for(int i=0;i<Tabla.placa.size();i++){
       
            Tabla.modelo.setValueAt(Tabla.placa.get(i),i , 0);
            Tabla.modelo.setValueAt(Tabla.vehiculo.get(i),i , 1);
            Tabla.modelo.setValueAt(Tabla.fecha.get(i),i, 2);   
        }
     

}
}

