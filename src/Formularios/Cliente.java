
package Formularios;

/**
 * /**
 * UNIVERSIDAD DE CUNDINAMARCA
 * Ingenieria de Sistemas
 * Estudiantes: - Ivan Corredor Briceño
 *              - Víctor Pinzón Rodríguez
 * 
 * Profesor: Jorge Páramo Fonseca
 * 
 * @author Víctor Pinzón
 * @version 1.0
 * 
 * Es el formulario superautos y la tabla tbCliente
 */
public class Cliente extends javax.swing.JFrame {
    tbCliente micliente = new tbCliente(); //Crear constructor vacio de la clase tbCliente
    tbCliente[] miListaCl = micliente.CrudListaCliente();//array de los clientes
    boolean b;
    ctTipoDocumento mitdocumento = new ctTipoDocumento(); //Crear constructor vacio de la clase ctTiposDocumento 
    ctTipoDocumento[] miListaTD = mitdocumento.CrudListaTipoDocumento();//array de los tipos de documento
    boolean c;
    /**
     * Creates new form FormCliente
     */
    public Cliente() {
        initComponents();
        this.setLocation(300,120);//En esta instancia(this)cambiar(set)la posición(Location) 
//.................................
        //Contador del formulario  
        b=true;
        for(int intcont=0; intcont < miListaCl.length; intcont++ ){
        jComboCl.addItem(miListaCl[intcont].getintIdCliente()+" - "+miListaCl[intcont].getintTipoDocumentoCliente()
        +" - "+ miListaCl[intcont].getstrDocumentoIdentidad()+" - "+ miListaCl[intcont].getstrPrimerNombreCliente()
        +" - "+ miListaCl[intcont].getstrSegundoNombreCliente()+" - "+ miListaCl[intcont].getstrPrimerApellidoCliente()
        +" - "+ miListaCl[intcont].getstrSegundoApellidoCliente()+" - "+ miListaCl[intcont].getstrTelefonoCliente()
        +" - "+ miListaCl[intcont].getstrDireccionCliente());    
            }
        
        c=true;
        for(int intcont=0; intcont < miListaTD.length; intcont++ ){
        jComboTD.addItem(miListaTD[intcont].getintIdTipoDocumento()+" - "+miListaTD[intcont].getstrNombreTipoDocumento()+" - "
         + miListaTD[intcont].getstrSiglasTipoDocumento());    
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
        jComboCl = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNumD = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtPN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSN = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtPA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSA = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtDir = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnInsertar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jComboTD = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 23, -1, -1));

        jComboCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboClActionPerformed(evt);
            }
        });
        getContentPane().add(jComboCl, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 20, 204, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 51, 497, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Tipo Documento");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("# Documento");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        txtNumD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumDActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumD, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 67, 130, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 105, 497, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Primer nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 124, -1, -1));
        getContentPane().add(txtPN, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 121, 150, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("Segundo nombre");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 124, -1, -1));

        txtSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSNActionPerformed(evt);
            }
        });
        getContentPane().add(txtSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 121, 128, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 159, 497, 10));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("Primer apellido");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 178, -1, -1));

        txtPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPAActionPerformed(evt);
            }
        });
        getContentPane().add(txtPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 175, 150, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 255));
        jLabel7.setText("Segundo Apellido");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 178, -1, -1));

        txtSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSAActionPerformed(evt);
            }
        });
        getContentPane().add(txtSA, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 175, 127, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 213, 497, 10));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 255));
        jLabel8.setText("Dirección");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 232, -1, -1));

        txtDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirActionPerformed(evt);
            }
        });
        getContentPane().add(txtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 229, 149, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 255));
        jLabel9.setText("Teléfono");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 232, -1, -1));

        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });
        getContentPane().add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 229, 146, -1));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 267, 497, 10));

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 288, -1, -1));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 288, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 288, -1, -1));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 288, -1, -1));

        jComboTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTDActionPerformed(evt);
            }
        });
        getContentPane().add(jComboTD, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 70, 160, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/fondo-rojo-5634.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumDActionPerformed

    private void txtSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSNActionPerformed

    private void txtPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPAActionPerformed

    private void txtSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSAActionPerformed

    private void txtDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // TODO add your handling code here:
        
        micliente.CrudInsertarCliente(mitdocumento.getintIdTipoDocumento(), txtNumD.getText(),
                    txtPN.getText(), txtSN.getText(), txtPA.getText(), 
                    txtSA.getText(), txtTel.getText(), txtDir.getText()); //Se importa el método y los parámetros necesarios
        
        jComboTD.setSelectedIndex(micliente.getintTipoDocumentoCliente());
        txtNumD.setText(""); // Entrega el valor en los campos de texto
        txtPN.setText(""); // Entrega el valor en los campos de texto
        txtSN.setText(""); // Entrega el valor en los campos de texto
        txtPA.setText(""); // Entrega el valor en los campos de texto
        txtSA.setText(""); // Entrega el valor en los campos de texto
        txtDir.setText(""); // Entrega el valor en los campos de texto
        txtTel.setText(""); // Entrega el valor en los campos de texto
        txtNumD.setText(""); // Entrega el valor en los campos de texto

        btnActualizar.setEnabled(false); // Se mantiene el botón actualizar como falso
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
            FormMenuVendedor Fmenu =  new FormMenuVendedor();
            Fmenu.setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void jComboTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTDActionPerformed
        // TODO add your handling code here:
        if(c){
        ctTipoDocumento[] miListad = mitdocumento.CrudListaTipoDocumento();
        mitdocumento = miListad[jComboTD.getSelectedIndex()];
        
        btnInsertar.setEnabled(true); // Se mantiene el botón insertar como verdadero
        btnActualizar.setEnabled(true); // Se mantiene el botón actualizar como verdadero
        }    
    }//GEN-LAST:event_jComboTDActionPerformed

    private void jComboClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboClActionPerformed
        // TODO add your handling code here:
          if(b){
        tbCliente[] miLista = micliente.CrudListaCliente();
        micliente = miLista[jComboCl.getSelectedIndex()];
        
        txtNumD.setText(" " + micliente.getstrDocumentoIdentidad()); // Entrega el valor en los campos de texto
        txtPN.setText(" " + micliente.getstrPrimerNombreCliente()); // Entrega el valor en los campos de texto
        txtSN.setText(" " + micliente.getstrSegundoNombreCliente()); // Entrega el valor en los campos de texto
        txtPA.setText(" " + micliente.getstrPrimerApellidoCliente()); // Entrega el valor en los campos de texto
        txtSA.setText(" " + micliente.getstrSegundoApellidoCliente()); // Entrega el valor en los campos de texto
        txtDir.setText(" " + micliente.getstrDireccionCliente()); // Entrega el valor en los campos de texto
        txtTel.setText(" " + micliente.getstrTelefonoCliente()); // Entrega el valor en los campos de texto
        
        btnInsertar.setEnabled(true); // Se mantiene el botón insertar como verdadero
        btnActualizar.setEnabled(true); // Se mantiene el botón actualizar como verdadero
        }
    }//GEN-LAST:event_jComboClActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:

        micliente.CrudActualizarCliente(micliente.getintIdCliente(),mitdocumento.getintIdTipoDocumento(),
                txtNumD.getText(),txtPN.getText(), txtSN.getText(), txtPA.getText(),txtSA.getText(),txtDir.getText(),
                txtTel.getText()); //Se importa el método y los parámetros necesarios
        

        jComboTD.setSelectedIndex(micliente.getintTipoDocumentoCliente());
        txtNumD.setText(micliente.getstrDocumentoIdentidad()); // Entrega el valor en los campos de texto
        txtPN.setText(micliente.getstrPrimerNombreCliente()); // Entrega el valor en los campos de texto
        txtSN.setText(micliente.getstrSegundoNombreCliente()); // Entrega el valor en los campos de texto
        txtPA.setText(micliente.getstrPrimerApellidoCliente()); // Entrega el valor en los campos de texto
        txtSA.setText(micliente.getstrSegundoApellidoCliente()); // Entrega el valor en los campos de texto
        txtDir.setText(micliente.getstrDireccionCliente()); // Entrega el valor en los campos de texto
        txtTel.setText(micliente.getstrTelefonoCliente()); // Entrega el valor en los campos de texto
        
        btnInsertar.setEnabled(false); // Se mantiene el botón insertar como falso
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        b=false; // Se declara la variable booleana como falsa para no realizar la acción
        
        txtNumD.setText(""); // Entrega el valor en los campos de texto
        txtPN.setText(""); // Entrega el valor en los campos de texto
        txtSN.setText(""); // Entrega el valor en los campos de texto
        txtPA.setText(""); // Entrega el valor en los campos de texto
        txtSA.setText(""); // Entrega el valor en los campos de texto
        txtDir.setText(""); // Entrega el valor en los campos de texto
        txtTel.setText(""); // Entrega el valor en los campos de texto
        txtNumD.setText(""); // Entrega el valor en los campos de texto

        btnInsertar.setEnabled(true); // Se mantiene el botón insertar como verdadero
        btnActualizar.setEnabled(true); // Se mantiene el botón actualizar como verdadero
       
        jComboCl.removeAllItems(); //Se limpia el formulario.
        tbCliente[] miLista =micliente.CrudListaCliente(); 
         
        // Se crea un for para borrar el formulario y que el jCombo no este vacio
        for(int intcont=0; intcont < miLista.length; intcont++ ){
        jComboCl.addItem(miLista[intcont].getintIdCliente()+" - "+miLista[intcont].getintTipoDocumentoCliente()
         +" - "+ miLista[intcont].getstrDocumentoIdentidad()+" - "+miLista[intcont].getstrPrimerNombreCliente()
         +" - "+miLista[intcont].getstrSegundoNombreCliente()+" - "+miLista[intcont].getstrPrimerApellidoCliente()
         +" - "+miLista[intcont].getstrSegundoApellidoCliente()+" - "+miLista[intcont].getstrTelefonoCliente()
         +" - "+miLista[intcont].getstrDireccionCliente()+""); 
        jComboCl.setSelectedIndex(0); // Posiciona el jcombo en la posición 0
            }   
        b=true;
        
        c=false;

        btnInsertar.setEnabled(true); // Se mantiene el botón insertar como verdadero
        btnActualizar.setEnabled(true); // Se mantiene el botón actualizar como verdadero
       
        jComboTD.removeAllItems(); //Se limpia el formulario.
        ctTipoDocumento[] miListad =mitdocumento.CrudListaTipoDocumento(); 
         
        // Se crea un for para borrar el formulario y que el jCombo no este vacio
        for(int intcont=0; intcont < miListad.length; intcont++ ){
        jComboTD.addItem(miListad[intcont].getintIdTipoDocumento()+" - "+miListad[intcont].getstrNombreTipoDocumento()+" - "
         + miListad[intcont].getstrSiglasTipoDocumento());  
        jComboTD.setSelectedIndex(0); // Posiciona el jcombo en la posició 0
            }
       c=true;
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox jComboCl;
    private javax.swing.JComboBox jComboTD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtNumD;
    private javax.swing.JTextField txtPA;
    private javax.swing.JTextField txtPN;
    private javax.swing.JTextField txtSA;
    private javax.swing.JTextField txtSN;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}