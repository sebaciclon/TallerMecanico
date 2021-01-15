
package vista;


import hibernate.Factura;
import java.util.List;
import javax.swing.ImageIcon;
import operaciones.Operaciones;


public class Ganancia extends javax.swing.JFrame {

    Operaciones oper = new Operaciones();
    
    public Ganancia() {
        initComponents();
        this.setTitle("GANANCIAS");
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
        //setIconImage(new ImageIcon(getClass().getResource("/imagenes/peso.png")).getImage());
        
        List<Factura> listaFacturas = oper.listaFactura();
        if(listaFacturas == null){
            javax.swing.JOptionPane.showMessageDialog(this, "No hay reparaciones cargadas!\n", "ADVERTENCIA!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else{
            
            comboFechas.addItem(listaFacturas.get(0).getFecha());
            for(int i = 1; i < listaFacturas.size(); i ++){
                if(listaFacturas.get(i-1).getFecha().equals(listaFacturas.get(i).getFecha())){
                } else{
                    comboFechas.addItem(listaFacturas.get(i).getFecha());
                }
            }
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboFechas = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtGanancia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboMes = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtGananciaMes = new javax.swing.JTextField();
        btnCalcularMes = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        comboAño = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnLimpiarMes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("GANANCIAS ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Elija un dìa:");

        comboFechas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboFechas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        btnCalcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        BtnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("La ganancia del dìa es:");

        txtGanancia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Elija un mes:");

        comboMes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("La ganancia del mes es:");

        txtGananciaMes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtGananciaMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGananciaMesActionPerformed(evt);
            }
        });

        btnCalcularMes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCalcularMes.setText("Calcular");
        btnCalcularMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularMesActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Elija un año:");

        comboAño.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "2019", "2020", "2021", "2022", "2023", "2024" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("********************************************************************************************************************");

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnLimpiarMes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpiarMes.setText("Limpiar");
        btnLimpiarMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarMesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCalcular))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnLimpiar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboAño, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(btnCalcularMes, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnSalir)))
                        .addGap(109, 109, 109))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGananciaMes, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiarMes)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BtnSalir))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboFechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(comboAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcularMes))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtGananciaMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarMes))
                .addContainerGap(180, Short.MAX_VALUE))
        );

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

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        Double contador = 0.0;
        String fecha = comboFechas.getSelectedItem().toString();
        List<Factura> lista = oper.listaFactura();
        
        if(fecha.equals("Seleccione")){
            javax.swing.JOptionPane.showMessageDialog(this, "No a seleccionado ninguna fecha\n", "ADVERTENCIA!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else{
            for(int i = 0; i < lista.size(); i++){
                if(lista.get(i).getFecha().equals(fecha)){
                    contador = contador + lista.get(i).getImporte();
                }
            }
            txtGanancia.setText(contador.toString());
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnCalcularMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularMesActionPerformed
        
        String mes = "";
        Double contador = 0.0;
        String fecha = comboMes.getSelectedItem().toString();
        String año = comboAño.getSelectedItem().toString();
        List<Factura> lista = oper.listaFactura();
        
        //char aux = fecha.charAt(3);
        //char aux1 = fecha.charAt(4);
        
        if(fecha.equals("Seleccione") || año.equals("Seleccione")){
            javax.swing.JOptionPane.showMessageDialog(this, "No a seleccionado mes o año!\n", "ADVERTENCIA!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else{
            if(fecha.equals("Enero")){
                mes = "01";
            }
            if(fecha.equals("Febrero")){
                mes = "02";
            }
            if(fecha.equals("Marzo")){
                mes = "03";
            }
            if(fecha.equals("Abril")){
                mes = "04";
            }
            if(fecha.equals("Mayo")){
                mes = "05";
            }
            if(fecha.equals("Junio")){
                mes = "06";
            }
            if(fecha.equals("Julio")){
                mes = "07";
            }
            if(fecha.equals("Agosto")){
                mes = "08";
            }
            if(fecha.equals("Septiembre")){
                mes = "09";
            }
            if(fecha.equals("Octubre")){
                mes = "10";
            }
            if(fecha.equals("Noviembre")){
                mes = "11";
            }
            if(fecha.equals("Diciembre")){
                mes = "12";
            }
                                   
            for(int i = 0; i < lista.size(); i++){
                if(lista.get(i).getFecha().charAt(3) == mes.charAt(0) && lista.get(i).getFecha().charAt(4) == mes.charAt(1) && lista.get(i).getFecha().charAt(6) == año.charAt(0)
                        && lista.get(i).getFecha().charAt(7) == año.charAt(1) && lista.get(i).getFecha().charAt(8) == año.charAt(2) && lista.get(i).getFecha().charAt(9) == año.charAt(3)){
                    contador = contador + lista.get(i).getImporte();
                }
            }
            txtGananciaMes.setText(contador.toString());
        }
    }//GEN-LAST:event_btnCalcularMesActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        comboFechas.setSelectedItem("Seleccione");
        txtGanancia.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnLimpiarMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarMesActionPerformed
        txtGananciaMes.setText("");
        comboAño.setSelectedItem("Seleccione");
        comboMes.setSelectedItem("Seleccione");
    }//GEN-LAST:event_btnLimpiarMesActionPerformed

    private void txtGananciaMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGananciaMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGananciaMesActionPerformed

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
            java.util.logging.Logger.getLogger(Ganancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ganancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ganancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ganancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ganancia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCalcularMes;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiarMes;
    private javax.swing.JComboBox<String> comboAño;
    private javax.swing.JComboBox<String> comboFechas;
    private javax.swing.JComboBox<String> comboMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtGanancia;
    private javax.swing.JTextField txtGananciaMes;
    // End of variables declaration//GEN-END:variables
}
