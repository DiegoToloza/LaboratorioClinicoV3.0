package Interface;

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
                AgregarMedico panel = new AgregarMedico(this);
                cargarPanel(panel);
            }
            case 3 -> {
                EliminarMedico panel = new EliminarMedico(this);
                cargarPanel(panel);
            }
            case 4 -> {
                EliminarPaciente panel = new EliminarPaciente(this);
                cargarPanel(panel);
            }
            case 5 -> {
                
                
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(100, 100));

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

    private void cargarPanel(JPanel nuevoPanel) {
        jPanel1.removeAll();
        jPanel1.add(nuevoPanel);
        jPanel1.repaint();
        jPanel1.revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
