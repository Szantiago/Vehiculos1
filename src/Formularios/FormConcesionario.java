/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import javax.swing.JOptionPane;
import vehiculos.*;

/**
 *
 * @author L3Li
 */
public class FormConcesionario extends javax.swing.JFrame {

    

       Concesionario miconcesionario = new Concesionario();
       Concesionario [] miListaC =  miconcesionario.crudListaConsecionario();
       boolean C;
       Concesionario mipoblado = new Concesionario();
       Concesionario [] miListaP =  mipoblado.crudListaPoblado();
       boolean P;
    
    
    /**
     * Creates new form Concesionario
     */
    public FormConcesionario() {
        initComponents();
        
        
      this.setLocation(300,120);//En esta instancia(this)cambiar(set)la posición(Location)
        this.setSize(540,480);
 //.................................
        //Contador del formulario        
        C=true;
        for(int intcont=0; intcont < miListaC.length; intcont++ ){
        jComboC.addItem(miListaC[intcont].getcons_cons()+" - "+ miListaC[intcont].getnomb_cons() 
                +" - "+ miListaC[intcont].getcodi_pobl()+" - "+ miListaC[intcont].gettele_cons()
                +" - "+miListaC[intcont].getdire_cons()+" - "+miListaC[intcont].getestado());                         
            }
        P=true;
        for(int intcont=0; intcont < miListaC.length; intcont++ ){
        cbxpoblado.addItem(miListaP[intcont].getcons_muni()+" - "+ miListaC[intcont].getcodi_pobl()
                +" - "+ miListaC[intcont].getnombre_muni());  
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
        txtnombcons = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbxpoblado = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txttel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btncrear = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        txtpoblado = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboEstado = new javax.swing.JComboBox<>();
        txtestado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboC = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Poblado:");

        cbxpoblado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxpobladoActionPerformed(evt);
            }
        });

        jLabel3.setText("Teléfono:");

        jLabel4.setText("Dirección:");

        btncrear.setText("Crear");
        btncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearActionPerformed(evt);
            }
        });

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jLabel6.setText("Estado");

        jComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        jComboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboEstadoActionPerformed(evt);
            }
        });

        jButton1.setText("Volver");

        jLabel7.setText("Concesionario");

        jComboC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxpoblado, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombcons, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtpoblado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btncrear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnmodificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnlimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))
                        .addGap(javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboC, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(114, 114, 114)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnbuscar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar)
                    .addComponent(jLabel6)
                    .addComponent(jComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnombcons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxpoblado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpoblado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncrear)
                    .addComponent(btnmodificar)
                    .addComponent(btnlimpiar)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearActionPerformed
       
       miconcesionario.crudCrearConsencionario(txtnombcons.getText(),txtpoblado.getText(),
       Integer.parseInt(txttel.getText()),txtdireccion.getText(), txtestado.getText());
       txtnombcons.setText("");
       txtpoblado.setText("");
       txttel.setText("");
       txtdireccion.setText("");
       txtestado.setText("");
       
       btnmodificar.setEnabled(false); 
      
    }//GEN-LAST:event_btncrearActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        Realizado e =new Realizado();
        FormConcesionario h = new FormConcesionario();
                
                        e.setVisible(true);
                        h.setVisible(false);
                        setVisible(false);
        
        miconcesionario.crudActualizarConsencionario(Integer.parseInt(txtID.getText()),txtnombcons.getText(),
        txtpoblado.getText(),Integer.parseInt(txttel.getText()),txtdireccion.getText(), txtestado.getText());
        
        txtID.setText(""+miconcesionario.getcons_cons());
        txtnombcons.setText("");
        txtpoblado.setText(""); // Entrega el valor en los campos de texto
        txttel.setText(""); // Entrega el valor en los campos de texto  
        txtdireccion.setText(""); // Entrega el valor en los campos de texto
        txtestado.setText(""); // Entrega el valor en los campos de texto
        
        btncrear.setEnabled(false); // Se mantiene el botón actualizar como falso  
        
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void cbxpobladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxpobladoActionPerformed
        
       if(P){ 
        txtpoblado.setText(cbxpoblado.getSelectedItem().toString());
        Concesionario[] miLista = miconcesionario.crudListaPoblado();
        miconcesionario = miLista[jComboC.getSelectedIndex()];
        btncrear.setEnabled(true); // Se mantiene el botón insertar como verdadero
        btnmodificar.setEnabled(true); // Se mantiene el botón actualizar como verdadero
        }
    }//GEN-LAST:event_cbxpobladoActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
       
       miconcesionario.crudMostrarConsecionario((Integer.parseInt(txtID.getText())));
        txtnombcons.setText(miconcesionario.getnomb_cons());
        txttel.setText(""+miconcesionario.gettele_cons());
        txtdireccion.setText(miconcesionario.getdire_cons());
        txtpoblado.setText(miconcesionario.getcodi_pobl());
        
        btncrear.setEnabled(false);
        
        
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // TODO add your handling code here:
        Realizado e =new Realizado();
        FormConcesionario h = new FormConcesionario();
                
        e.setVisible(true);
        h.setVisible(false);
        setVisible(false);
                
        C=false; // Se declara la variable booleana como falsa para no realizar la acción       
        txtnombcons.setText(""); // Entrega el valor en los campos de texto
        txtpoblado.setText(""); // Entrega el valor en los campos de texto  
        txttel.setText(""); // Entrega el valor en los campos de texto
        txtdireccion.setText(""); // Entrega el valor en los campos de texto
        txtestado.setText(""); // Entrega el valor en los campos de texto
        cbxpoblado.setSelectedIndex(0);

        btncrear.setEnabled(true); // Se mantiene el botón insertar como verdadero
        btnmodificar.setEnabled(true); // Se mantiene el botón actualizar como verdadero
       
        jComboC.removeAllItems(); //Se limpia el formulario.       
        Concesionario[] miLista =miconcesionario.crudListaConsecionario();
        // Se crea un for para borrar el formulario y que el jCombo no este vacio

        for(int intcont=0; intcont < miLista.length; intcont++ ){
        jComboC.addItem(miLista[intcont].getcons_cons()+" - "+ miLista[intcont].getnomb_cons()
        +" - "+ miLista[intcont].getcodi_pobl()+" - "+miLista[intcont].gettele_cons()
        +" - "+ miLista[intcont].getdire_cons()+" - "+miLista[intcont].getestado()); 
        jComboC.setSelectedIndex(0); // Posiciona el jcombo en la posición 0 
            }           
        C=true;
//.......................................................................................................................
        P=false; // Se declara la variable booleana como falsa para no realizar la acción

        btncrear.setEnabled(true); // Se mantiene el botón insertar como verdadero
        btnmodificar.setEnabled(true); // Se mantiene el botón actualizar como verdadero
       
        jComboC.removeAllItems(); //Se limpia el formulario.
        Concesionario[] miLista2 =miconcesionario.crudListaConsecionario();
         
        // Se crea un for para borrar el formulario y que el jCombo no este vacio
        for(int intcont=0; intcont < miLista2.length; intcont++ ){
        cbxpoblado.addItem(miListaP[intcont].getcons_muni()+" - "+ miListaP[intcont].getcodi_pobl()
        +" - "+ miListaP[intcont].getnombre_muni());    
        cbxpoblado.setSelectedIndex(0); // Posiciona el jcombo en la posició 0
            }
        P=true; // Se declara la variable booleana como verdadera para que luego se pueda realizar la acción
        
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void jComboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboEstadoActionPerformed
        // TODO add your handling code here:
        txtestado.setText(jComboEstado.getSelectedItem().toString());
    }//GEN-LAST:event_jComboEstadoActionPerformed

    private void jComboCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCActionPerformed
        // TODO add your handling code here:
        if(C){
        Concesionario[] miLista = miconcesionario.crudListaConsecionario();
        miconcesionario = miLista[jComboC.getSelectedIndex()];

        txtnombcons.setText(miconcesionario.getnomb_cons());
        txtpoblado.setText(miconcesionario.getcodi_pobl());
        txttel.setText(" " + miconcesionario.gettele_cons());
        txtdireccion.setText(" " + miconcesionario.getdire_cons());
        txtestado.setText(" " + miconcesionario.getestado());
        
        btncrear.setEnabled(true); // Se mantiene el botón insertar como verdadero
        btnmodificar.setEnabled(true); // Se mantiene el botón actualizar como verdadero
        }
    }//GEN-LAST:event_jComboCActionPerformed

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
            java.util.logging.Logger.getLogger(FormConcesionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormConcesionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormConcesionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormConcesionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormConcesionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncrear;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JComboBox cbxpoblado;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboC;
    private javax.swing.JComboBox<String> jComboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextField txtnombcons;
    private javax.swing.JTextField txtpoblado;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables

   

}