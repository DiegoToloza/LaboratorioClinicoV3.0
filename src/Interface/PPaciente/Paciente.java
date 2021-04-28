package Interface.PPaciente;

import java.sql.SQLException;
import java.util.*;
import javax.swing.JPanel;
import jdbc.*;

public class Paciente extends javax.swing.JPanel {

    public Paciente() throws SQLException {
        initComponents();
        cargarPaciente();
    }
    
    private void cargarPanel(JPanel nuevoPanel){
        jPanel3.removeAll();
        jPanel3.add(nuevoPanel);
        jPanel3.repaint();
        jPanel3.revalidate();
    }
    
    private void cargarPaciente() throws SQLException{
        List<domain.Paciente> listaPaciente = new JdbcPaciente().select();
        String matriz[][] = new String[listaPaciente.size()][5];
        for (int i = 0; i < listaPaciente.size(); i++) {
            matriz[i][0] = listaPaciente.get(i).getNombre();
            matriz[i][1] = "" + (listaPaciente.get(i).getEdad());
            matriz[i][2] = listaPaciente.get(i).getGenero();
            matriz[i][3] = listaPaciente.get(i).getCorreoElectronico();
            matriz[i][4] = listaPaciente.get(i).getTelefono();
        }
        tablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
        matriz, new String[]{
            "Nombre", "Edad","Género", "Email", "Teléfono"
        }));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPacientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BotonEliminarPaciente = new javax.swing.JButton();
        botonModificarPaciente = new javax.swing.JButton();
        botonAgregarPaciente = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        tablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Edad", "Genero", "Email", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaPacientes.setRowHeight(23);
        tablaPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPacientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaPacientes);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pacientes");

        BotonEliminarPaciente.setText("Eliminar");
        BotonEliminarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarPacienteActionPerformed(evt);
            }
        });

        botonModificarPaciente.setText("Modificar");

        botonAgregarPaciente.setText("Agregar");
        botonAgregarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(botonAgregarPaciente)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificarPaciente)
                        .addGap(18, 18, 18)
                        .addComponent(BotonEliminarPaciente))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonEliminarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void botonAgregarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPacienteActionPerformed
        try {
            DialogPaciente panel = new DialogPaciente(new javax.swing.JFrame() , true , 1, null);
            panel.setLocationRelativeTo(this);
            panel.setVisible(true);
            cargarPaciente();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }//GEN-LAST:event_botonAgregarPacienteActionPerformed

    private void BotonEliminarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarPacienteActionPerformed
        try {
            DialogPaciente panel = new DialogPaciente(new javax.swing.JFrame(), true, 2, null);
            panel.setLocationRelativeTo(this);
            panel.setVisible(true);
            cargarPaciente();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }//GEN-LAST:event_BotonEliminarPacienteActionPerformed

    private void tablaPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPacientesMouseClicked
        try {
            int tabla = tablaPacientes.getSelectedRow();
            List<domain.Paciente> listaPacientes = new JdbcPaciente().select();
            domain.Paciente paciente = listaPacientes.get(tabla);
            DialogPaciente panel = new DialogPaciente(new javax.swing.JFrame(), true, 3, paciente);
            panel.setLocationRelativeTo(this);
            panel.setVisible(true);
            cargarPaciente();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }//GEN-LAST:event_tablaPacientesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEliminarPaciente;
    private javax.swing.JButton botonAgregarPaciente;
    private javax.swing.JButton botonModificarPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaPacientes;
    // End of variables declaration//GEN-END:variables
}
