package Interface.PMedico;

import domain.Persona;
import java.sql.SQLException;
import java.util.*;
import jdbc.*;

public class Medico extends javax.swing.JPanel {

    public Medico() throws SQLException {
        initComponents();
        cargarMedico();
    }

    private void cargarMedico() throws SQLException {
        List<Persona> listaMedicos = new JdbcMedico().select();
        String matriz[][] = new String[listaMedicos.size()][4];
        // Se genera una matriz la cual es entregada a la tabla para que este muestre el listado completo de medicos
        for (int i = 0; i < listaMedicos.size(); i++) {
            matriz[i][0] = listaMedicos.get(i).getNombre();
            matriz[i][1] = ((domain.Medico)listaMedicos.get(i)).getEspecializacion();
            matriz[i][2] = ((domain.Medico)listaMedicos.get(i)).getCorreoElectronico();
            matriz[i][3] = ((domain.Medico)listaMedicos.get(i)).getTelefono();
        }
        tablaMedicos.setModel(new javax.swing.table.DefaultTableModel(
                matriz, new String[]{
                    "Nombre", "Especialización", "Email", "Teléfono"
                }));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMedicos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BotonEliminarMedico = new javax.swing.JButton();
        BotonAgregarMedico = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        tablaMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Especialización", "Email", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaMedicos.setRowHeight(23);
        tablaMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMedicosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaMedicos);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Médicos");

        BotonEliminarMedico.setText("Eliminar");
        BotonEliminarMedico.setPreferredSize(new java.awt.Dimension(80, 24));
        BotonEliminarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarMedicoActionPerformed(evt);
            }
        });

        BotonAgregarMedico.setText("Agregar");
        BotonAgregarMedico.setPreferredSize(new java.awt.Dimension(80, 24));
        BotonAgregarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonAgregarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(BotonEliminarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonEliminarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAgregarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAgregarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarMedicoActionPerformed
        try {
            DialogMedico panel = new DialogMedico(new javax.swing.JFrame(), true, 1, null);
            panel.setLocationRelativeTo(this);
            panel.setVisible(true);
            cargarMedico();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }//GEN-LAST:event_BotonAgregarMedicoActionPerformed

    private void BotonEliminarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarMedicoActionPerformed
        try {
            DialogMedico panel = new DialogMedico(new javax.swing.JFrame(), true, 2, null);
            panel.setLocationRelativeTo(this);
            panel.setVisible(true);
            cargarMedico();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }//GEN-LAST:event_BotonEliminarMedicoActionPerformed

    private void tablaMedicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMedicosMouseClicked
        try {
            int tabla = tablaMedicos.getSelectedRow();
            List<Persona> listaMedicos = new JdbcMedico().select();
            domain.Medico medico = (domain.Medico)listaMedicos.get(tabla);
            DialogMedico panel = new DialogMedico(new javax.swing.JFrame(), true, 3, medico);
            panel.setLocationRelativeTo(this);
            panel.setVisible(true);
            cargarMedico();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }//GEN-LAST:event_tablaMedicosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregarMedico;
    private javax.swing.JButton BotonEliminarMedico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaMedicos;
    // End of variables declaration//GEN-END:variables
}
