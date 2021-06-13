 package Interface.PBusqueda;

import Interface.PPaciente.*;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import jdbc.*;

public class BusquedaPorMuestra extends javax.swing.JPanel {
    
    List<domain.Paciente> filtrado = new ArrayList<>();

    public BusquedaPorMuestra() throws SQLException {
        initComponents();
    }

    private void cargarPanel(JPanel nuevoPanel) {
        jPanel3.removeAll();
        jPanel3.add(nuevoPanel);
        jPanel3.repaint();
        jPanel3.revalidate();
    }

    private void cargarPaciente() throws SQLException {
        filtrado.removeAll(filtrado);
        List<domain.Paciente> listaPaciente = new JdbcPaciente().select();
        for (int i = 0; i < listaPaciente.size(); i++) {
            if (ComboBoxMuestra.getSelectedIndex() == 0) {
                JdbcSangre msangre = new JdbcSangre();
                domain.Sangre sangre = msangre.select(listaPaciente.get(i).getIdPaciente());
                if(sangre != null){
                    filtrado.add(listaPaciente.get(i));
                }
            }else if (ComboBoxMuestra.getSelectedIndex() == 1) {
                JdbcSemen msemen = new JdbcSemen();
                domain.Semen semen = msemen.select(listaPaciente.get(i).getIdPaciente());
                if(semen != null){
                    filtrado.add(listaPaciente.get(i));
                }
            }else if (ComboBoxMuestra.getSelectedIndex() == 2) {
                JdbcOrina morina = new JdbcOrina();
                domain.Orina orina = morina.select(listaPaciente.get(i).getIdPaciente());
                if(orina != null){
                    filtrado.add(listaPaciente.get(i));
                }
            }  
        }
        String matriz[][] = new String[filtrado.size()][5];
        for (int i = 0; i < filtrado.size(); i++) {
            matriz[i][0] = filtrado.get(i).getNombre();
            matriz[i][1] = "" + (filtrado.get(i).getEdad());
            matriz[i][2] = filtrado.get(i).getGenero();
            matriz[i][3] = filtrado.get(i).getCorreoElectronico();
            matriz[i][4] = filtrado.get(i).getTelefono();
        }
        tablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
                matriz, new String[]{
                    "Nombre", "Edad", "Género", "Email", "Teléfono"
                }));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPacientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        ComboBoxMuestra = new javax.swing.JComboBox<>();

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
        jLabel1.setText("Pacientes Encontrados");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Buscar Pacientes que dispongan de una muestra de:");

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        ComboBoxMuestra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sangre", "Semen", "Orina" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonBuscar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar)
                    .addComponent(ComboBoxMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void tablaPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPacientesMouseClicked
        try {
            int tabla = tablaPacientes.getSelectedRow();
            domain.Paciente paciente = filtrado.get(tabla);
            DialogPaciente panel = new DialogPaciente(new javax.swing.JFrame(), true, 3, paciente);
            panel.setLocationRelativeTo(this);
            panel.setVisible(true);
            cargarPaciente();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }//GEN-LAST:event_tablaPacientesMouseClicked

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        try {
            cargarPaciente();
        } catch (SQLException ex) {
            Logger.getLogger(BusquedaPorMuestra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxMuestra;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaPacientes;
    // End of variables declaration//GEN-END:variables
}
