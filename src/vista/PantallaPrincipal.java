
package vista;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class PantallaPrincipal extends javax.swing.JFrame {

    
    public PantallaPrincipal() {
        initComponents();
        this.setTitle("PANTALLA PRINCIPAL");
        this.setLocation(500, 200);
        //para que se vea centrado
        this.setLocationRelativeTo(this);
        //para que el usuario no pueda modificar la ventana
        this.setResizable(false);
        //para que se vea en la pantalla completa
        //this.setExtendedState(MAXIMIZED_BOTH);
        //para el tamaño del frame
        this.setSize(1000, 700);
        //indicamos que la aplicacion finaliza al cerrar la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //para poner una imagen en el logo de java del frame
        //setIconImage(new ImageIcon(getClass().getResource("/imagenes/Ghost_emoji.png")).getImage());
        //para agregar imagenes a los botones
        /*ImageIcon agregar = new ImageIcon(getClass().getResource("/imagenes/botonAgregar.png"));
        Icon fondo = new ImageIcon(agregar.getImage().getScaledInstance(btnAgregar.getWidth(), btnAgregar.getHeight(), Image.SCALE_DEFAULT));
        btnAgregar.setIcon(fondo);
        
        ImageIcon agregar1 = new ImageIcon(getClass().getResource("/imagenes/botonSalir.png"));
        Icon fondo1 = new ImageIcon(agregar1.getImage().getScaledInstance(btnSalir.getWidth(), btnSalir.getHeight(), Image.SCALE_DEFAULT));
        btnSalir.setIcon(fondo1);
        
        ImageIcon agregar2 = new ImageIcon(getClass().getResource("/imagenes/botonBuscar.png"));
        Icon fondo2 = new ImageIcon(agregar2.getImage().getScaledInstance(btnBuscarCliente.getWidth(), btnBuscarCliente.getHeight(), Image.SCALE_DEFAULT));
        btnBuscarCliente.setIcon(fondo2);
        
        ImageIcon agregar3 = new ImageIcon(getClass().getResource("/imagenes/botonDeudores.png"));
        Icon fondo3 = new ImageIcon(agregar3.getImage().getScaledInstance(btnDeudores.getWidth(), btnDeudores.getHeight(), Image.SCALE_DEFAULT));
        btnDeudores.setIcon(fondo3);
        
        ImageIcon agregar4 = new ImageIcon(getClass().getResource("/imagenes/botonReparaciones.png"));
        Icon fondo4 = new ImageIcon(agregar4.getImage().getScaledInstance(btnDeudores.getWidth(), btnDeudores.getHeight(), Image.SCALE_DEFAULT));
        btnReparaciones.setIcon(fondo4);
        
        ImageIcon agregar5 = new ImageIcon(getClass().getResource("/imagenes/botonBuscar1.png"));
        Icon fondo5 = new ImageIcon(agregar5.getImage().getScaledInstance(btnBuscarRep.getWidth(), btnBuscarRep.getHeight(), Image.SCALE_DEFAULT));
        btnBuscarRep.setIcon(fondo5);
        
        ImageIcon agregar6 = new ImageIcon(getClass().getResource("/imagenes/peso.png"));
        Icon fondo6 = new ImageIcon(agregar6.getImage().getScaledInstance(btnGanancia.getWidth(), btnGanancia.getHeight(), Image.SCALE_DEFAULT));
        btnGanancia.setIcon(fondo6);
        this.repaint();*/
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        btnDeudores = new javax.swing.JButton();
        btnReparaciones = new javax.swing.JButton();
        btnBuscarRep = new javax.swing.JButton();
        btnGanancia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/taller.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel2.setText("TALLER MECÀNICO \"APUNTO\"");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("INYECCIÒN ELECTRÒNICA, MECÀNICA EN GENERAL");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("ACCESO RUTA 60 Nº 334, RAUCH");

        btnAgregar.setText("Agregar Cliente");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnDeudores.setText("Deudores");
        btnDeudores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeudoresActionPerformed(evt);
            }
        });

        btnReparaciones.setText("Agregar Reparaciòn");
        btnReparaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReparacionesActionPerformed(evt);
            }
        });

        btnBuscarRep.setText("Buscar Reparaciones");
        btnBuscarRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRepActionPerformed(evt);
            }
        });

        btnGanancia.setText("Ganancias");
        btnGanancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGananciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnReparaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))
                        .addComponent(btnBuscarRep, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 75, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(btnGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeudores, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarRep, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReparaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeudores, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(190, 190, 190))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        AgregarCliente agregar = new AgregarCliente();
        agregar.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnReparacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReparacionesActionPerformed
        Reparaciones rep = new Reparaciones();
        rep.setVisible(true);
        
    }//GEN-LAST:event_btnReparacionesActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        
        MostrarCliente mc = new MostrarCliente();
        mc.setVisible(true);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnBuscarRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRepActionPerformed
        
        MostrarReparaciones mr = new MostrarReparaciones();
        mr.setVisible(true);
    }//GEN-LAST:event_btnBuscarRepActionPerformed

    private void btnDeudoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeudoresActionPerformed
        
        Deudores d = new Deudores();
        d.setVisible(true);
    }//GEN-LAST:event_btnDeudoresActionPerformed

    private void btnGananciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGananciaActionPerformed
        Ganancia g = new Ganancia();
        g.setVisible(true);
    }//GEN-LAST:event_btnGananciaActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarRep;
    private javax.swing.JButton btnDeudores;
    private javax.swing.JButton btnGanancia;
    private javax.swing.JButton btnReparaciones;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
