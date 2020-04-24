/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimiento.empleado;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author ranbr
 */
public class Registros extends javax.swing.JFrame {

    /**
     * Creates new form Altas
     */
    public Registros() {
        initComponents();
       
             this.setTitle("Altas Empleados");
    
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/nominaproyect", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("select Nombre_Puesto from Puestos ");
            ResultSet rs = pst.executeQuery();
            
            PreparedStatement pst2 = cn.prepareStatement("select Nombre_Departamento from Departamentos");
            ResultSet rs2 = pst2.executeQuery();
            
            cbox_Puesto.addItem("Seleccione una opción");
            while(rs.next()){
            cbox_Puesto.addItem(rs.getString("Nombre_Puesto"));
            }
            
   
            cbox_Departamento.addItem("Seleccione una opción");
            while(rs2.next()){
            cbox_Departamento.addItem(rs2.getString("Nombre_Departamento"));
            }

        }catch (Exception e){

        }
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btn_Registrar = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label9 = new java.awt.Label();
        label10 = new java.awt.Label();
        label11 = new java.awt.Label();
        txt_Nombre = new java.awt.TextField();
        txt_Dpi = new java.awt.TextField();
        cbox_Departamento = new javax.swing.JComboBox<>();
        cbox_Puesto = new javax.swing.JComboBox<>();
        txt_Ubicacion = new java.awt.TextField();
        txt_Tel = new java.awt.TextField();
        txt_Sueldo = new java.awt.TextField();
        label12 = new java.awt.Label();
        label14 = new java.awt.Label();
        date_Nacimiento = new com.toedter.calendar.JDateChooser();
        date_Inicio = new com.toedter.calendar.JDateChooser();
        lb_Dep = new javax.swing.JLabel();
        lb_Pues = new javax.swing.JLabel();
        btn_Altas = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_Registrar.setText("REGISTRAR");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        label1.setText("Nombre");

        label2.setText("DPI");

        label3.setText("Departamento");

        label4.setText("Puesto");

        label5.setText("Fecha de Inicio");

        label9.setText("Telefono");

        label10.setText("Ubicacion");

        label11.setText("Sueldo");

        cbox_Departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_DepartamentoActionPerformed(evt);
            }
        });

        cbox_Puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_PuestoActionPerformed(evt);
            }
        });

        txt_Ubicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UbicacionActionPerformed(evt);
            }
        });

        txt_Tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TelActionPerformed(evt);
            }
        });

        txt_Sueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SueldoActionPerformed(evt);
            }
        });

        label12.setText("REGISTRO EMPLEADO");

        label14.setText("Fecha de Nacimiento");

        lb_Dep.setText("Codigo");

        lb_Pues.setText("Codigo");
        lb_Pues.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_Altas.setText("INGRESAR ALTA");
        btn_Altas.setEnabled(false);
        btn_Altas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AltasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(date_Inicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                .addComponent(txt_Ubicacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_Sueldo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_Registrar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_Altas))
                                    .addComponent(cbox_Departamento, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbox_Puesto, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_Dep)
                                    .addComponent(lb_Pues)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Dpi, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(txt_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(date_Nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(label12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_Dpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_Dep)
                    .addComponent(cbox_Departamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbox_Puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_Pues)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(btn_Altas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
            java.util.Date fecha=date_Nacimiento.getDate();
            long d=fecha.getTime();
            java.sql.Date date = new java.sql.Date(d);
            
            java.util.Date fechaI=date_Inicio.getDate();
            long di=fechaI.getTime();
            java.sql.Date datei = new java.sql.Date(di);
            
            
        String nombre = txt_Nombre.getText().trim();
        String dpi = txt_Dpi.getText().trim();
    
        String tel = txt_Tel.getText().trim();
        String ubicacion = txt_Ubicacion.getText().trim();
        String sueldo = txt_Sueldo.getText().trim();
     
        String departamento=cbox_Departamento.getSelectedItem().toString();
        String puesto=cbox_Puesto.getSelectedItem().toString();
        String valor="";
        if (nombre.isEmpty()||dpi.isEmpty()|| tel.isEmpty()|| ubicacion.isEmpty()|| sueldo.isEmpty()|| departamento.isEmpty()|| puesto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡Debe Llenar todos los campos!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/nominaproyect", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("insert into Empleados values(?,?,?,?,?,?,?,?,?,?,?)");
   
            pst.setString(1, "0");
            pst.setString(2, txt_Nombre.getText().trim());
            pst.setString(3, txt_Dpi.getText().trim());
            pst.setString(4, date.toString());
            pst.setString(5, txt_Tel.getText().trim());
            pst.setString(6, txt_Ubicacion.getText().trim());
            pst.setString(7, txt_Sueldo.getText().trim());
            pst.setString(8, "A");
            pst.setString(9, datei.toString());
            pst.setString(10, lb_Pues.getText().trim());
            pst.setString(11, lb_Dep.getText().trim());
            
            
            pst.executeUpdate();
            btn_Altas.setEnabled(true);
            btn_Registrar.setEnabled(false);
            txt_Nombre.setEnabled(false);
            txt_Dpi.setEnabled(false);
            txt_Tel.setEnabled(false);
            txt_Ubicacion.setEnabled(false);
            txt_Sueldo.setEnabled(false);
            date_Nacimiento.setEnabled(false);
            date_Inicio.setEnabled(false);
            cbox_Departamento.setEnabled(false);
            cbox_Puesto.setEnabled(false);

          
            

            JOptionPane.showMessageDialog(this, "¡REGISTRO EXITOSO!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "¡REGISTRO FALLIDO!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
       

// TODO add your handling code here:
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void txt_UbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UbicacionActionPerformed

    private void txt_TelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TelActionPerformed

    private void txt_SueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SueldoActionPerformed

    private void cbox_DepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_DepartamentoActionPerformed
try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/nominaproyect", "root", "6182");

            PreparedStatement pst2 = cn.prepareStatement("select Codigo_Departamento from Departamentos where Nombre_Departamento = ?");
           
            pst2.setString(1, cbox_Departamento.getSelectedItem().toString());
            
            ResultSet rs2 = pst2.executeQuery();
            

            if(rs2.next()){
                lb_Dep.setText(rs2.getString("Codigo_Departamento"));
                

            } else {
                
            }
    
            

           
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "¡REGISTRO FALLIDO!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_DepartamentoActionPerformed

    private void cbox_PuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_PuestoActionPerformed
try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/nominaproyect", "root", "6182");
            PreparedStatement pst3 = cn.prepareStatement("select Codigo_Puesto from Puestos where Nombre_Puesto = ?");
          
            pst3.setString(1, cbox_Puesto.getSelectedItem().toString());

            
            ResultSet rs3 = pst3.executeQuery();

            if(rs3.next() ){
                
                lb_Pues.setText(rs3.getString("Codigo_Puesto"));

            } else {
                
            }
    
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "¡REGISTRO FALLIDO!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_PuestoActionPerformed

    private void btn_AltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AltasActionPerformed

            
            java.util.Date fechaI=date_Inicio.getDate();
            long di=fechaI.getTime();
            java.sql.Date datei = new java.sql.Date(di);
            String valor = null;
        
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/nominaproyect", "root", "6182");
            String id= txt_Dpi.getText();
            
            PreparedStatement pst3 = cn.prepareStatement("select Codigo_Empleado from Empleados where Dpi_Empleado=?");
            pst3.setString(1,id);
            ResultSet rs = pst3.executeQuery();
            
            if(rs.next()){
                valor=(rs.getString("Codigo_Empleado"));
                

            } else {
                JOptionPane.showMessageDialog(null, "Empleado no registrado.");
            }



            PreparedStatement pst2 = cn.prepareStatement("insert into Altas values(?,?,?,?,?)");
            pst2.setString(1, "0");
            pst2.setString(2, valor);
            pst2.setString(3, datei.toString());
            pst2.setString(4, lb_Dep.getText().trim());
            pst2.setString(5, lb_Pues.getText().trim());


            
            pst2.executeUpdate();

            txt_Nombre.setText("");
            txt_Dpi.setText("");
            txt_Tel.setText("");
            txt_Ubicacion.setText("");
            txt_Sueldo.setText("");
            btn_Altas.setEnabled(false);
            btn_Registrar.setEnabled(true);
            cbox_Departamento.setSelectedIndex(0);
            cbox_Puesto.setSelectedIndex(0);
              txt_Nombre.setEnabled(true);
            txt_Dpi.setEnabled(true);
            txt_Tel.setEnabled(true);
            txt_Ubicacion.setEnabled(true);
            txt_Sueldo.setEnabled(true);
            date_Nacimiento.setEnabled(true);
            date_Inicio.setEnabled(true);
            cbox_Departamento.setEnabled(true);
            cbox_Puesto.setEnabled(true);



            JOptionPane.showMessageDialog(this, "¡REGISTRO EXITOSO!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "¡REGISTRO FALLIDO!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
       
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AltasActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Altas;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JComboBox<String> cbox_Departamento;
    private javax.swing.JComboBox<String> cbox_Puesto;
    private com.toedter.calendar.JDateChooser date_Inicio;
    private com.toedter.calendar.JDateChooser date_Nacimiento;
    private javax.swing.JButton jButton1;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label14;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label9;
    private javax.swing.JLabel lb_Dep;
    private javax.swing.JLabel lb_Pues;
    private java.awt.TextField txt_Dpi;
    private java.awt.TextField txt_Nombre;
    private java.awt.TextField txt_Sueldo;
    private java.awt.TextField txt_Tel;
    private java.awt.TextField txt_Ubicacion;
    // End of variables declaration//GEN-END:variables
}
