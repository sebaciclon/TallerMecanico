
package vista;

import hibernate.Cliente;
import hibernate.Factura;
import java.util.List;
import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import operaciones.Operaciones;


public class MostrarCliente extends javax.swing.JFrame {

    Operaciones oper = new Operaciones();
    DefaultTableModel modelo;
    
    public MostrarCliente() {
        initComponents();
        this.setTitle("CLIENTES");
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
        //setIconImage(new ImageIcon(getClass().getResource("/imagenes/botonBuscar.png")).getImage());
            
        List<Cliente> listaCliente = oper.listaCliente();
        for(int i = 0; i < listaCliente.size(); i ++){
            comboApellidos.addItem(listaCliente.get(i).getApellido());
        }
        modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Direcciòn");
        modelo.addColumn("Telèfono");
        modelo.addColumn("Patente");
        modelo.addColumn("Vehìculo");
        tablaClientes.setModel(modelo);
    }    
    
    /*public String[] arregloClientes(){
        int ultimo = 1;
        Boolean aux = false;
        List<Cliente> lista = oper.listaCliente();
        String[] apellidos = new String[lista.size()];
        apellidos[0] = lista.get(0).getApellido();
        for(int i = 1; i < lista.size(); i++){
            for(int j = 0; i < apellidos.length; j++){
                String 1 = apellidos[j];
                String 2 = lista.get(i).getApellido();
                if(apellidos[j].compareTo(lista.get(i).getApellido()) == 0){
                    aux = true;
                    j = apellidos.length;
                }
            if(aux == false){
                ultimo ++;
                apellidos[ultimo] = lista.get(i).getApellido();
            }
                
            }
        
        }
        return apellidos;
    }*/

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        comboApellidos = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("CLIENTES");

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "iD", "Nombre", "Apellido", "Direcciòn", "Telèfono", "Patente", "Vehìculo"
            }
        ));
        jScrollPane1.setViewportView(tablaClientes);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Apellido:");

        comboApellidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboApellidos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        BtnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("*********************************************************************************************************************************");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(160, 160, 160)
                .addComponent(BtnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnSalir)
                    .addComponent(BtnEliminar)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        int filas = modelo.getRowCount();
        for(int i = 0; i < filas; i++){
            modelo.removeRow(0);
        }
        
        if(comboApellidos.getSelectedIndex() == 0 ){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar un apellido de bùsqueda\n", "ADVERTENCIA!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else{
            String desde = comboApellidos.getSelectedItem().toString();
            
            List<Cliente> lista = oper.listaCliente();
            if(lista == null){
                javax.swing.JOptionPane.showMessageDialog(this, "No hay clientes cargados\n", "ADVERTENCIA!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }else {
                for(int i = 0; i < lista.size(); i++){
                    
                    String aux = lista.get(i).getApellido();
                    
                    if(desde.equals(aux)){
                            Object[] fila = new Object[15];
                            fila[0] = lista.get(i).getIdCliente();
                            fila[1] = lista.get(i).getNombre();
                            fila[2] = lista.get(i).getApellido();
                            fila[3] = lista.get(i).getDireccion();
                            fila[4] = lista.get(i).getTelefono();
                            fila[5] = lista.get(i).getPatente();
                            fila[6] = lista.get(i).getVehiculo();
                            modelo.addRow(fila);
                    }
                   
                }
            }
           
        
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        
        int filaSeleccionada = tablaClientes.getSelectedRow();

        if (filaSeleccionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "No a seleccionado ningùn cliente para eliminar\n", "ADVERTENCIA!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            
            Cliente a = new Cliente();
            a.setIdCliente((int) tablaClientes.getValueAt(filaSeleccionada, 0));
            a.setNombre(tablaClientes.getValueAt(filaSeleccionada, 1).toString());
            a.setApellido(tablaClientes.getValueAt(filaSeleccionada, 2).toString());
            a.setDireccion(tablaClientes.getValueAt(filaSeleccionada, 3).toString());
            a.setTelefono(tablaClientes.getValueAt(filaSeleccionada, 4).toString());
            a.setPatente(tablaClientes.getValueAt(filaSeleccionada, 5).toString());
            a.setVehiculo(tablaClientes.getValueAt(filaSeleccionada, 6).toString());
                    
            oper.eliminarCliente(a);
            javax.swing.JOptionPane.showMessageDialog(this, "Cliente eliminado de la base de datos\n", "ADVERTENCIA!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            modelo.removeRow(filaSeleccionada);
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(MostrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboApellidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables
}
