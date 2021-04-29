package Interface.PPaciente;

import java.sql.SQLException;
import javax.swing.JPanel;

public class DialogPaciente extends javax.swing.JDialog {

    public DialogPaciente(java.awt.Frame parent, boolean modal, int opcion, domain.Paciente paciente) throws SQLException {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        switch(opcion){
            case 1 -> {
                AgregarPaciente panel = new AgregarPaciente(this);
                cargarPanel(panel);
            }
            case 2 -> {
                EliminarPaciente panel = new EliminarPaciente(this);
                cargarPanel(panel);
            }
            case 3 -> {
                SeleccionPacientes panel = new SeleccionPacientes(this, paciente);
                cargarPanel(panel);
            }
            case 4 -> {
                ModificarPaciente panel = new ModificarPaciente(this, paciente);
                cargarPanel(panel);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarPanel(JPanel nuevoPanel) {
        jPanel1.removeAll();
        jPanel1.add(nuevoPanel);
        jPanel1.repaint();
        jPanel1.revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
