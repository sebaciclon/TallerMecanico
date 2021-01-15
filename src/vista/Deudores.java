
package vista;

import hibernate.Cliente;
import hibernate.Factura;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import operaciones.Operaciones;


public class Deudores extends javax.swing.JFrame {

    Operaciones oper = new Operaciones();
    DefaultTableModel modelo;
    public Set<Factura> setFactura = null;
    
    public Deudores() {
        initComponents();
        this.setTitle("CLIENTES DEUDORES");
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
        //setIconImage(new ImageIcon(getClass().getResource("/imagenes/botonDeudores.png")).getImage());
                    
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
        modelo.addColumn("id");
        modelo.addColumn("Fecha");
        modelo.addColumn("Descripciòn");
        modelo.addColumn("Importe");
        modelo.addColumn("Pago");
        modelo.addColumn("Deuda");
        modelo.addColumn("Entregado");
        
        tablaReparaciones.setModel(modelo);
        //Para el tamaño de las columnas de la tabla
        tablaReparaciones.getColumnModel().getColumn(0).setPreferredWidth(20);
        tablaReparaciones.getColumnModel().getColumn(1).setPreferredWidth(40);
        tablaReparaciones.getColumnModel().getColumn(2).setPreferredWidth(40);
        tablaReparaciones.getColumnModel().getColumn(3).setPreferredWidth(40);
        tablaReparaciones.getColumnModel().getColumn(5).setPreferredWidth(20);
        tablaReparaciones.getColumnModel().getColumn(7).setPreferredWidth(250);
        tablaReparaciones.getColumnModel().getColumn(8).setPreferredWidth(40);
        tablaReparaciones.getColumnModel().getColumn(9).setPreferredWidth(40);
        tablaReparaciones.getColumnModel().getColumn(10).setPreferredWidth(40);
        tablaReparaciones.getColumnModel().getColumn(11).setPreferredWidth(40);
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
        btnTodos = new javax.swing.JButton();
        btnIngresarPago = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("CLIENTES DEUDORES");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("*************************************************************************************************************************************");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Buscar por Apellido:");

        comboApellidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboApellidos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        comboApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboApellidosActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tablaReparaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Cliente", "Nombre", "Apellido", "Patente", "Vehìculo", "Id", "Fecha", "Descripciòn", "Importe", "Pago", "Deuda", "Entregado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true, true
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

        btnTodos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTodos.setText("Todos");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });

        btnIngresarPago.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnIngresarPago.setText("Ingresar Pago");
        btnIngresarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarPagoActionPerformed(evt);
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
                        .addGap(94, 94, 94)
                        .addComponent(btnTodos)
                        .addGap(118, 118, 118)
                        .addComponent(btnIngresarPago)
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
                        .addComponent(btnTodos)
                        .addComponent(btnIngresarPago))
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
                                if(lista1.get(j).getDeuda() > 0.0){
                                    Object[] fila = new Object[15];
                                    fila[0] = lista.get(i).getIdCliente();
                                    fila[1] = lista.get(i).getNombre();
                                    fila[2] = lista.get(i).getApellido();
                                    fila[3] = lista.get(i).getPatente();
                                    fila[4] = lista.get(i).getVehiculo();
                                    fila[5] = lista1.get(j).getIdFactura();
                                    fila[6] = lista1.get(j).getFecha();
                                    fila[7] = lista1.get(j).getDescripcion();
                                    fila[8] = lista1.get(j).getImporte();
                                    fila[9] = lista1.get(j).getPago();
                                    fila[10] = lista1.get(j).getDeuda();
                                    fila[11] = lista1.get(j).getEntregado();
                                    //j = lista1.size();
                                    modelo.addRow(fila);
                                    encontrado = true;
                                }
                            }
                        }
                        if(encontrado == false){
                            javax.swing.JOptionPane.showMessageDialog(this, "El cliente " +apellido+ " no posee deuda!\n", "ADVERTENCIA!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                            i = lista.size();
                        }
                            
                        
                    }
                   
                }
            }
           
        
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void comboApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboApellidosActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        
        int filas = modelo.getRowCount();
        for(int i = 0; i < filas; i++){
            modelo.removeRow(0);
        }
        
        Boolean encontrado = false;
        List<Factura> lista1 = oper.listaFactura();
        if(lista1 == null){
            javax.swing.JOptionPane.showMessageDialog(this, "No hay reparaciones cargadas\n", "ADVERTENCIA!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else {
            for(int i = 0; i < lista1.size(); i++){
                if(lista1.get(i).getDeuda() > 0.0){
                    Object[] fila = new Object[15];
                    fila[0] = lista1.get(i).getCliente().getIdCliente();
                    fila[1] = lista1.get(i).getCliente().getNombre();
                    fila[2] = lista1.get(i).getCliente().getApellido();
                    fila[3] = lista1.get(i).getCliente().getPatente();
                    fila[4] = lista1.get(i).getCliente().getVehiculo();
                    fila[5] = lista1.get(i).getIdFactura();
                    fila[6] = lista1.get(i).getFecha();
                    fila[7] = lista1.get(i).getDescripcion();
                    fila[8] = lista1.get(i).getImporte();
                    fila[9] = lista1.get(i).getPago();
                    fila[10] = lista1.get(i).getDeuda();
                    fila[11] = lista1.get(i).getEntregado();
                    modelo.addRow(fila);
                    encontrado = true;
                }
            }
            if(encontrado == false)
                javax.swing.JOptionPane.showMessageDialog(this, "No hay clientes con deuda\n", "ADVERTENCIA!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnTodosActionPerformed

    private void btnIngresarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarPagoActionPerformed
        
        int filaSeleccionada = tablaReparaciones.getSelectedRow();
        
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#.00", dfs);

        if (filaSeleccionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "No a seleccionado ningun cliente!\n", "ADVERTENCIA!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            Double deuda = (Double) tablaReparaciones.getValueAt(filaSeleccionada, 10);
            
            if(deuda == 0.0){
               javax.swing.JOptionPane.showMessageDialog(this, "El cliente seleccionado no posee deuda!\n", "ADVERTENCIA!", javax.swing.JOptionPane.INFORMATION_MESSAGE); 
            }else {
                double importe = 0;
                importe = oper.importe();
                if(importe > deuda){
                    javax.swing.JOptionPane.showMessageDialog(this, "El importe abonado no puede ser mayor a la deuda existente!\n", "ADVERTENCIA!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }else{
                    int id = (int) tablaReparaciones.getValueAt(filaSeleccionada, 0);
                    List<Factura> lista = oper.listaFactura();
                    for(int i = 0; i < lista.size(); i++){
                        //if(lista.get(i).getIdCliente() == id){
                        if(lista.get(i).getCliente().getIdCliente() == id){
                            String nombre = lista.get(i).getCliente().getNombre();
                            String apellido = lista.get(i).getCliente().getApellido();
                            String direccion = lista.get(i).getCliente().getDireccion();
                            String telefono = lista.get(i).getCliente().getTelefono();
                            String patente = lista.get(i).getCliente().getPatente();
                            String vehiculo = lista.get(i).getCliente().getVehiculo();
                            Cliente c = new Cliente(id, nombre, apellido, direccion, telefono, patente, vehiculo, setFactura);
                            int idFactura = (int) tablaReparaciones.getValueAt(filaSeleccionada, 5);
                            String fecha = tablaReparaciones.getValueAt(filaSeleccionada, 6).toString();
                            String descripcion = tablaReparaciones.getValueAt(filaSeleccionada, 7).toString();
                            Double impor = (Double) tablaReparaciones.getValueAt(filaSeleccionada, 8);
                            Double pago = (Double) tablaReparaciones.getValueAt(filaSeleccionada, 9) + importe;
                            Double d = impor - pago;
                            String entregado = tablaReparaciones.getValueAt(filaSeleccionada, 11).toString();
                            Factura f = new Factura(idFactura, c, fecha, descripcion, impor, pago, d, entregado);
                            oper.actualizarFactura(f);
                            i = lista.size();
                            javax.swing.JOptionPane.showMessageDialog(this, "Deuda actualizada!\n", "ADVERTENCIA!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    int filas = modelo.getRowCount();
                    for(int i = 0; i < filas; i++){
                    modelo.removeRow(0);
                }
            }
        
        }        
            
        }
          
        
                
        
    }//GEN-LAST:event_btnIngresarPagoActionPerformed
        
        
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
            java.util.logging.Logger.getLogger(Deudores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deudores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deudores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deudores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deudores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnIngresarPago;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTodos;
    private javax.swing.JComboBox<String> comboApellidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaReparaciones;
    // End of variables declaration//GEN-END:variables
}
