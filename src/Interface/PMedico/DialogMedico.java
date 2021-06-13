package Interface.PMedico;

import Interface.PMedico.AgregarMedico;
import java.sql.SQLException;
import javax.swing.JPanel;

public class DialogMedico extends javax.swing.JDialog {

    public DialogMedico(java.awt.Frame parent, boolean modal, int opcion, domain.Medico medico) throws SQLException {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        switch(opcion){
            case 1 -> {
                AgregarMedico panel = new AgregarMedico(this);
                cargarPanel(panel);
            }
            case 2 -> {
                EliminarMedico panel = new EliminarMedico(this);
                cargarPanel(panel);
            }
            case 3 -> {
                SeleccionMedicos panel = new SeleccionMedicos(this, medico);
                cargarPanel(panel);
            }
            case 4 -> {
                ModificarMedico panel = new ModificarMedico(this, medico);
                cargarPanel(panel);
            }
        }
        // Dialog utilizado para cambiar de panel en cada una de las opciones, en este caso las ventanas graficas correspondientes a Medico
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
