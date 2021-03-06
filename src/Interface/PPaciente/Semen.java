package Interface.PPaciente;

import java.sql.SQLException;
import jdbc.JdbcSemen;

public class Semen extends javax.swing.JPanel {

    SeleccionPacientes sp = null;

    public Semen(SeleccionPacientes se) throws SQLException {
        this.sp = se;
        initComponents();
        JdbcSemen jse = new JdbcSemen();
        domain.Semen sem = jse.select(se.paciente.getId());
        if (sem != null) {
            textVolumen.setText("" + sem.getVolumen());
            textConcentracion.setText("" + sem.getConcentracion());
            textGlobulosBlancos.setText("" + sem.getGlobulosBlancos());
            textVitalidad.setText("" + sem.getVitalidad());
            botonAgregarMuestra.setVisible(false);
        } else {
            botonModificarMuestra.setVisible(false);
            botonEliminarMuestra.setVisible(false);
        }

        if (sem != null) {
            
            textVolumenExamen.setText(validar(sem.getVolumen(), 1.5, 5));

            textConcentracionExamen.setText(validar(sem.getConcentracion(), 20, 150));
            
            textGlobulosBlancosExamen.setText(validar(sem.getGlobulosBlancos(), 0.1, 1));
            
            textVitalidadExamen.setText(validar(sem.getVitalidad(), 58, 100));

        } else {
            textVolumenExamen.setText("No ha ingresado datos");
            textConcentracionExamen.setText("No ha ingresado datos");
            textGlobulosBlancosExamen.setText("No ha ingresado datos");
            textVitalidadExamen.setText("No ha ingresado datos");
        }
    }

    private String validar(double comparador, double min, double max) {
        if (comparador < min) {
            return "Niveles bajos";
        } else if (comparador >= min && comparador <= max) {
            return "Niveles normales";
        } else {
            return "Niveles altos";
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textVolumen = new javax.swing.JLabel();
        textConcentracion = new javax.swing.JLabel();
        textVitalidad = new javax.swing.JLabel();
        textGlobulosBlancos = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        botonModificarMuestra = new javax.swing.JButton();
        botonEliminarMuestra = new javax.swing.JButton();
        botonAgregarMuestra = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textVolumenExamen = new javax.swing.JLabel();
        textConcentracionExamen = new javax.swing.JLabel();
        textGlobulosBlancosExamen = new javax.swing.JLabel();
        textVitalidadExamen = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(773, 327));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Volumen:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Concentraci??n:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Globulos Blancos: ");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Vitalidad(%):");

        textVolumen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        textConcentracion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        textVitalidad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        textGlobulosBlancos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("RANGOS OBTENIDOS");

        botonModificarMuestra.setText("Modificar Muestra");
        botonModificarMuestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarMuestraActionPerformed(evt);
            }
        });

        botonEliminarMuestra.setText("Eliminar Muestra");
        botonEliminarMuestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarMuestraActionPerformed(evt);
            }
        });

        botonAgregarMuestra.setText("Agregar Muestra");
        botonAgregarMuestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarMuestraActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("RANGOS NORMALES");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("1.5 - 5.0 mL");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("20 - 150 MM/mL");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("0.1 - 1.0 MM/mL");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("> 58 %");

        textVolumenExamen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        textConcentracionExamen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        textGlobulosBlancosExamen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        textVitalidadExamen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel6)
                .addGap(112, 112, 112)
                .addComponent(jLabel10))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(textVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(textVolumenExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(textConcentracion, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addGap(154, 154, 154)
                .addComponent(textConcentracionExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addComponent(textGlobulosBlancos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel8)
                .addGap(154, 154, 154)
                .addComponent(textGlobulosBlancosExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textVitalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182)
                .addComponent(textVitalidadExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(botonAgregarMuestra)
                .addGap(12, 12, 12)
                .addComponent(botonModificarMuestra)
                .addGap(12, 12, 12)
                .addComponent(botonEliminarMuestra))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel10)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel7))
                    .addComponent(textVolumenExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textConcentracion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textConcentracionExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textGlobulosBlancos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel8))
                    .addComponent(textGlobulosBlancosExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textVitalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel11))
                    .addComponent(textVitalidadExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAgregarMuestra)
                    .addComponent(botonModificarMuestra)
                    .addComponent(botonEliminarMuestra)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarMuestraActionPerformed
        try {
            DialogPaciente panel = new DialogPaciente(new javax.swing.JFrame(), true, 7, sp.paciente);
            panel.setLocationRelativeTo(this);
            panel.setVisible(true);
            Semen semen1 = new Semen(sp);
            sp.cargarPanel(semen1);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }//GEN-LAST:event_botonAgregarMuestraActionPerformed

    private void botonModificarMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarMuestraActionPerformed
        try {
            DialogPaciente panel = new DialogPaciente(new javax.swing.JFrame(), true, 10, sp.paciente);
            panel.setLocationRelativeTo(this);
            panel.setVisible(true);
            Semen semencito = new Semen(sp);
            sp.cargarPanel(semencito);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }//GEN-LAST:event_botonModificarMuestraActionPerformed

    private void botonEliminarMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarMuestraActionPerformed
        try {
            domain.Semen semen = new JdbcSemen().select(sp.paciente.getId());
            new JdbcSemen().delete(semen);
            Semen semencito = new Semen(sp);
            sp.cargarPanel(semencito);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }//GEN-LAST:event_botonEliminarMuestraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarMuestra;
    private javax.swing.JButton botonEliminarMuestra;
    private javax.swing.JButton botonModificarMuestra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel textConcentracion;
    private javax.swing.JLabel textConcentracionExamen;
    private javax.swing.JLabel textGlobulosBlancos;
    private javax.swing.JLabel textGlobulosBlancosExamen;
    private javax.swing.JLabel textVitalidad;
    private javax.swing.JLabel textVitalidadExamen;
    private javax.swing.JLabel textVolumen;
    private javax.swing.JLabel textVolumenExamen;
    // End of variables declaration//GEN-END:variables
}
