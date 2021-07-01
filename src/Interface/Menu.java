package Interface;

import Interface.PMedico.Medico;
import Interface.PPaciente.Paciente;
import Interface.PBusqueda.*;
import domain.*;
import java.io.*;
import java.sql.SQLException;
import java.util.*;
import javax.swing.JPanel;
import jdbc.*;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        setUndecorated(true);
        initComponents();
    }

    private void cargarPanel(JPanel nuevoPanel) {
        jPanel3.removeAll();
        jPanel3.add(nuevoPanel);
        jPanel3.repaint();
        jPanel3.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotonMedico = new javax.swing.JButton();
        BotonPacientes = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        BotonReporte = new javax.swing.JButton();
        BotonBusquedaPorParametro = new javax.swing.JButton();
        BotonBusquedaPorMuestra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(606, 597));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/PNG/adn feliz.png"))); // NOI18N

        BotonMedico.setText("Medicos");
        BotonMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMedicoActionPerformed(evt);
            }
        });

        BotonPacientes.setText("Pacientes");
        BotonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPacientesActionPerformed(evt);
            }
        });

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new java.awt.CardLayout());

        BotonReporte.setText("Reporte");
        BotonReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReporteActionPerformed(evt);
            }
        });

        BotonBusquedaPorParametro.setText("Hemoglobina par");
        BotonBusquedaPorParametro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBusquedaPorParametroActionPerformed(evt);
            }
        });

        BotonBusquedaPorMuestra.setText("Busqueda Muestra");
        BotonBusquedaPorMuestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBusquedaPorMuestraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(40, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonReporte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonBusquedaPorParametro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonBusquedaPorMuestra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(BotonMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonBusquedaPorParametro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonBusquedaPorMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPacientesActionPerformed
        try {
            Paciente paciente1 = new Paciente();
            cargarPanel(paciente1);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }//GEN-LAST:event_BotonPacientesActionPerformed

    private void BotonMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMedicoActionPerformed
        try {
            Medico hola = new Medico();
            cargarPanel(hola);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }//GEN-LAST:event_BotonMedicoActionPerformed

    private void BotonReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReporteActionPerformed
        File reporte = new File("Reporte.txt");
        PrintWriter salida;
        try {
            List<Persona> listaMedicos = new JdbcMedico().select();
            salida = new PrintWriter(reporte);
            salida.println("    Reporte de datos.\n\n");
            for (Persona medico : listaMedicos) {
                salida.println("     Médico:\n");
                salida.println("     " + medico.toString() + "\n");
                salida.println("     Paciente(s) del Médico:\n");
                Map<Integer, domain.Paciente> mapaPaciente = new JdbcPaciente().selectMedico(((domain.Medico)medico).getId());
                for (domain.Paciente paciente : mapaPaciente.values()) {
                    salida.println("        " + paciente.toString());
                    Orina orina = new JdbcOrina().select(paciente.getId());
                    Sangre sangre = new JdbcSangre().select(paciente.getId());
                    Semen semen = new JdbcSemen().select(paciente.getId());
                    if(orina != null){
                        salida.println("");
                        salida.println("            Muestra orina:");
                        salida.println("            " + orina.escribir());
                    }
                    if(sangre != null){
                        salida.println("");
                        salida.println("            Muestra sangre:");
                        salida.println("            " + sangre.escribir() + "\n");
                    }
                    if(semen != null){
                        salida.println("            Muestra semen:");
                        salida.println("            " + semen.escribir());
                        salida.println("");
                    }
                    salida.println("");
                }
            }
            // Lo que se hace es basicamente revisar cada uno de los mapas por orden para poder generear un reporte con un formato designado
            salida.close();
            AvisorReporte hola = new AvisorReporte();
            cargarPanel(hola);
        } catch (FileNotFoundException | SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }//GEN-LAST:event_BotonReporteActionPerformed

    private void BotonBusquedaPorParametroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBusquedaPorParametroActionPerformed
        try {
            BusquedaParametroPaciente hola = new BusquedaParametroPaciente();
            cargarPanel(hola);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }//GEN-LAST:event_BotonBusquedaPorParametroActionPerformed

    private void BotonBusquedaPorMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBusquedaPorMuestraActionPerformed
        try {
            BusquedaPorMuestra hola = new BusquedaPorMuestra();
            cargarPanel(hola);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }//GEN-LAST:event_BotonBusquedaPorMuestraActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBusquedaPorMuestra;
    private javax.swing.JButton BotonBusquedaPorParametro;
    private javax.swing.JButton BotonMedico;
    private javax.swing.JButton BotonPacientes;
    private javax.swing.JButton BotonReporte;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
