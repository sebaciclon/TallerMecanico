
package vista;

import hibernate.Cliente;
import hibernate.Factura;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import operaciones.Conexion;
import operaciones.Operaciones;


public class MostrarReparaciones extends javax.swing.JFrame {

    Operaciones oper = new Operaciones();
    DefaultTableModel modelo;
    
    public MostrarReparaciones() {
        initComponents();
        this.setTitle("REPARACIONES");
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
        //setIconImage(new ImageIcon(getClass().getResource("/imagenes/botonBuscar1.png")).getImage());
                    
        List<Cliente> listaCliente = oper.listaCliente();
        for(int i = 0; i < listaCliente.size(); i ++){
            comboApellidos.addItem(listaCliente.get(i).getApellido());
        }
        modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Patente");
        modelo.addColumn("Vehìculo");
        modelo.addColumn("Fecha");
        modelo.addColumn("Descripciòn");
        modelo.addColumn("Importe");
        modelo.addColumn("Pago");
        modelo.addColumn("Deuda");
        modelo.addColumn("Id_Rep.");
        
        tablaReparaciones.setModel(modelo);
        //Para el tamaño de las columnas de la tabla
        tablaReparaciones.getColumnModel().getColumn(0).setPreferredWidth(25);
        tablaReparaciones.getColumnModel().getColumn(6).setPreferredWidth(250);
        tablaReparaciones.getColumnModel().getColumn(7).setPreferredWidth(40);
        tablaReparaciones.getColumnModel().getColumn(8).setPreferredWidth(40);
        tablaReparaciones.getColumnModel().getColumn(9).setPreferredWidth(40);
        tablaReparaciones.getColumnModel().getColumn(10).setPreferredWidth(45);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboApellidos = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReparaciones = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("BUSCAR REPARACIONES POR CLIENTE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("*************************************************************************************************************************************");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Buscar");

        comboApellidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboApellidos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tablaReparaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Cliente", "Nombre", "Apellido", "Patente", "Vehìculo", "Fecha", "Descripciòn", "Importe", "Pago", "Deuda", "Id Rep."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaReparaciones);
        if (tablaReparaciones.getColumnModel().getColumnCount() > 0) {
            tablaReparaciones.getColumnModel().getColumn(0).setResizable(false);
            tablaReparaciones.getColumnModel().getColumn(1).setResizable(false);
            tablaReparaciones.getColumnModel().getColumn(2).setResizable(false);
            tablaReparaciones.getColumnModel().getColumn(3).setResizable(false);
            tablaReparaciones.getColumnModel().getColumn(4).setResizable(false);
            tablaReparaciones.getColumnModel().getColumn(5).setResizable(false);
            tablaReparaciones.getColumnModel().getColumn(6).setResizable(false);
            tablaReparaciones.getColumnModel().getColumn(7).setResizable(false);
            tablaReparaciones.getColumnModel().getColumn(8).setResizable(false);
            tablaReparaciones.getColumnModel().getColumn(9).setResizable(false);
        }

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnImprimir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addGap(233, 233, 233)
                        .addComponent(btnImprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(comboApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar)
                        .addComponent(btnImprimir))
                    .addComponent(btnSalir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        Boolean encontrado = false;
        
        int filas = modelo.getRowCount();
        for(int i = 0; i < filas; i++){
            modelo.removeRow(0);
        }
        
        if(comboApellidos.getSelectedIndex() == 0 ){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar un apellido de bùsqueda\n", "ADVERTENCIA!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else{
            String apellido = comboApellidos.getSelectedItem().toString();
            
            List<Cliente> lista = oper.listaCliente();
            List<Factura> lista1 = oper.listaFactura();
            if(lista == null){
                javax.swing.JOptionPane.showMessageDialog(this, "No hay clientes cargados\n", "ADVERTENCIA!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }else {
                for(int i = 0; i < lista.size(); i++){
                    
                    String aux = lista.get(i).getApellido();
                    
                    if(apellido.equals(aux)){
                        for(int j = 0; j < lista1.size(); j++){
                            int id = lista.get(i).getIdCliente();
                            if(lista1.get(j).getCliente().getIdCliente().equals(id)){
                                Object[] fila = new Object[15];
                                fila[0] = lista.get(i).getIdCliente();
                                fila[1] = lista.get(i).getNombre();
                                fila[2] = lista.get(i).getApellido();
                                fila[3] = lista.get(i).getPatente();
                                fila[4] = lista.get(i).getVehiculo();
                                fila[5] = lista1.get(j).getFecha();
                                fila[6] = lista1.get(j).getDescripcion();
                                fila[7] = lista1.get(j).getImporte();
                                fila[8] = lista1.get(j).getPago();
                                fila[9] = lista1.get(j).getDeuda();
                                fila[10] = lista1.get(j).getIdFactura();
                                modelo.addRow(fila);
                                encontrado = true;
                            }
                        }
                        if(encontrado == false){
                            javax.swing.JOptionPane.showMessageDialog(this, "El cliente " +apellido+ " no tiene reparaciones cargadas\n", "ADVERTENCIA!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                            i = lista.size();
                        }
                            
                        
                    }
                   
                }
            }
           
        
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        
        int filaSeleccionada = tablaReparaciones.getSelectedRow();
        
        if(filaSeleccionada == -1){
            javax.swing.JOptionPane.showMessageDialog(this, "No a seleccionado ninguna reparaciòn para imprimir!\n", "ADVERTENCIA", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else {
            try {
                Conexion con = new Conexion();
                Connection conn = con.getConexion();
                JasperReport reporte = null;
                reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/reporte/impresiones.jasper"));
                Map parametro = new HashMap();
                parametro.put("id_cliente", tablaReparaciones.getValueAt(filaSeleccionada, 10));
                JasperPrint jp = JasperFillManager.fillReport(reporte, parametro, conn);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setTitle("IMPRIMIR FACTURA");
                jv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                jv.setVisible(true);
            } catch (JRException ex) {
                Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
            }
            //dispose();
            
        }   
    }//GEN-LAST:event_btnImprimirActionPerformed

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
            java.util.logging.Logger.getLogger(MostrarReparaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarReparaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarReparaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarReparaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarReparaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboApellidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaReparaciones;
    // End of variables declaration//GEN-END:variables
}
