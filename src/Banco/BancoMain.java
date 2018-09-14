package Banco;

import conexion.Conexion;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BancoMain extends javax.swing.JFrame {
    
    private final Datos_servicio datos_servicio = new Datos_servicio();
    private List<Datos> datos;
    
    public BancoMain() {
        initComponents();
        this.cargar_cuentas();
    }
    
    private void cargar_cuentas(){
        try{
            this.datos = this.datos_servicio.recuperarTodas(Conexion.obtener());
            DefaultTableModel dtm = (DefaultTableModel) tabla_cuentas.getModel();
            dtm.setRowCount(0);
            for(int i = 0; i < this.datos.size(); i++){
                dtm.addRow(new Object[]{
                    this.datos.get(i).getNum_cuenta(),
                    this.datos.get(i).getNombre(),
                        this.datos.get(i).getTipo()
                });
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, "Eerror, no se han recuperado las cuentas");
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(this, "Error, no se han recuperado las cuentas");
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_cuentas = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnCrearCuenta = new javax.swing.JButton();
        btnVerCuenta = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnDepositar = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnCerrarCuenta = new javax.swing.JButton();
        btnActivarCuenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso Cuentas");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTION DE CUENTAS");

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de cuentas"));

        tabla_cuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de cuenta", "Nombre", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(tabla_cuentas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 153, 153), new java.awt.Color(51, 51, 51)));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuentas"));

        btnCrearCuenta.setText("Crear cuenta");
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        btnVerCuenta.setText("Ver cuenta");
        btnVerCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCrearCuenta)
                .addGap(18, 18, 18)
                .addComponent(btnVerCuenta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Monto"));

        btnDepositar.setText("Depositar");
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDepositar)
                .addGap(18, 18, 18)
                .addComponent(btnRetirar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado"));

        btnCerrarCuenta.setText("Cerrar cuenta");
        btnCerrarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarCuentaActionPerformed(evt);
            }
        });

        btnActivarCuenta.setText("Activar cuenta");
        btnActivarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCerrarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActivarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnActivarCuenta)
                .addGap(18, 18, 18)
                .addComponent(btnCerrarCuenta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        
        BancoMain.this.dispose();
        CrearCuenta crearCuenta = new CrearCuenta();
        crearCuenta.setVisible(true);
        crearCuenta.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void btnVerCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCuentaActionPerformed
        // TODO add your handling code here:
        int cuenta_seleccionada = tabla_cuentas.getSelectedRow();
        if(cuenta_seleccionada >= 0){
            BancoMain.this.dispose();
            VerCuenta verCuenta = new VerCuenta(this.datos.get(cuenta_seleccionada));
            verCuenta.setVisible(true);
            verCuenta.setLocationRelativeTo(null);
        }else{
            JOptionPane.showMessageDialog(this, "Por favor seleccione una cuenta.");
        }
    }//GEN-LAST:event_btnVerCuentaActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        // TODO add your handling code here:
        int cuenta_seleccionada = tabla_cuentas.getSelectedRow();
        if(cuenta_seleccionada >= 0){
            if (this.datos.get(cuenta_seleccionada).getEstado().equals("activa")){
                BancoMain.this.dispose();
                MontoCuenta montoCuenta = new MontoCuenta(this.datos.get(cuenta_seleccionada), "depositar");
                montoCuenta.setVisible(true);
                montoCuenta.setLocationRelativeTo(null);
            }
            else {
                JOptionPane.showMessageDialog(this, "Esta cuenta se encuentra inactiva.");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Por favor seleccione una cuenta.");
        }
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        // TODO add your handling code here:
        int cuenta_seleccionada = tabla_cuentas.getSelectedRow();
        if(cuenta_seleccionada >= 0){
            if (this.datos.get(cuenta_seleccionada).getEstado().equals("activa")){
                BancoMain.this.dispose();
                MontoCuenta montoCuenta = new MontoCuenta(this.datos.get(cuenta_seleccionada), "retirar");
                montoCuenta.setVisible(true);
                montoCuenta.setLocationRelativeTo(null);
            }
            else {
                JOptionPane.showMessageDialog(this, "Esta cuenta se encuentra inactiva.");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Por favor seleccione una cuenta.");
        }
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnActivarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarCuentaActionPerformed
        // TODO add your handling code here:
        BancoMain.this.dispose();
        EstadoCuenta estadoCuenta = new EstadoCuenta("inactiva");
        estadoCuenta.setVisible(true);
        estadoCuenta.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnActivarCuentaActionPerformed

    private void btnCerrarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarCuentaActionPerformed
        // TODO add your handling code here:
        BancoMain.this.dispose();
        EstadoCuenta estadoCuenta = new EstadoCuenta("activa");
        estadoCuenta.setVisible(true);
        estadoCuenta.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCerrarCuentaActionPerformed

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
            java.util.logging.Logger.getLogger(BancoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BancoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BancoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BancoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BancoMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivarCuenta;
    private javax.swing.JButton btnCerrarCuenta;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton btnVerCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_cuentas;
    // End of variables declaration//GEN-END:variables
                                          
}
