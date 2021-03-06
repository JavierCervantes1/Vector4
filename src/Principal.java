
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcervant23
 */
public class Principal extends javax.swing.JFrame {
    double v[];
    String res;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLongitud = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenar = new javax.swing.JButton();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        cmdLlenadoAutomatico = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtRepite = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Longitud:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 21, -1, 20));

        txtLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLongitudKeyTyped(evt);
            }
        });
        jPanel2.add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 90, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 280, 60));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, -1));

        cmdLlenar.setText("Llenar Manual");
        cmdLlenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 130, -1));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, -1));

        cmdLlenadoAutomatico.setText("Llenar Automático");
        cmdLlenadoAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoAutomaticoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenadoAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, -1));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 130, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 170, 240));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Vector:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, 20));

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, 110));

        jLabel3.setText("Numero que se Repite:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 140, 20));

        txtRepite.setEditable(false);
        jPanel4.add(txtRepite, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 110, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 280, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongitudKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtLongitudKeyTyped

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int longitud;

        if (txtLongitud.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite la longitud", "Error", JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
        } else if (txtLongitud.getText().trim().equals("0")) {
            JOptionPane.showMessageDialog(this, "La longitud debe ser mayor que cero", "Error", JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
            txtLongitud.selectAll();
        } else {
            longitud = Integer.parseInt(txtLongitud.getText());
            v = new double[longitud];
            JOptionPane.showMessageDialog(this, "Vector Creado satisfactoriamente!");

            cmdCrear.setEnabled(false);

            cmdLlenar.setEnabled(true);
            cmdLlenadoAutomatico.setEnabled(true);
            cmdCalcular.setEnabled(false);
            cmdBorrar.setEnabled(true);
            txtLongitud.setEditable(false);
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLlenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarActionPerformed
        double n;
        for (int i = 0; i < v.length; i++) {
            n = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite el elemento en la posición: " + i));
            v[i] = n;
        }
        cmdCrear.setEnabled(false);
        cmdLlenar.setEnabled(false);
        cmdLlenadoAutomatico.setEnabled(false);
        cmdCalcular.setEnabled(true);
        cmdBorrar.setEnabled(true);
    }//GEN-LAST:event_cmdLlenarActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        double cont = 0, num = 0;
        for (int i = 0; i < v.length; i++) {                
            for(int j = i+1 ; j< v.length; j++){
                if(v[i] == v[j])
                    cont++;                
            }
            if(cont > num){
                num = cont;
                num = v[i];
            }
        
        }
        JOptionPane.showMessageDialog(this, "Operaciones Calculadas satisfactoriamente");
        cmdCrear.setEnabled(false);
        cmdMostrar.setEnabled(true);
        cmdLlenar.setEnabled(false);
        cmdLlenadoAutomatico.setEnabled(false);
        cmdCalcular.setEnabled(false);
        cmdBorrar.setEnabled(true);
        res = String.valueOf(num);

    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        txtResultado.setText("");
        txtLongitud.setText("");
        txtRepite.setText("");

        txtLongitud.requestFocusInWindow();
        v = null;
        cmdCrear.setEnabled(true);
        cmdMostrar.setEnabled(false);
        cmdLlenar.setEnabled(false);
        cmdLlenadoAutomatico.setEnabled(false);
        cmdCalcular.setEnabled(false);
        cmdBorrar.setEnabled(true);
        txtLongitud.setEditable(true);
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdLlenadoAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoAutomaticoActionPerformed
        int n;
        for (int i = 0; i < v.length; i++) {
            n = (int) (Math.random() * 25 + 1);
            v[i] = n;
        }

        JOptionPane.showMessageDialog(this, "Vector llenado Satisfactoriamente");

        cmdCrear.setEnabled(false);
        cmdLlenar.setEnabled(false);
        cmdLlenadoAutomatico.setEnabled(false);
        cmdCalcular.setEnabled(true);
        cmdBorrar.setEnabled(true);
    }//GEN-LAST:event_cmdLlenadoAutomaticoActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < v.length; i++) {
            txtResultado.append("" + v[i] + "\n");
            txtRepite.setText(res);
        }
    }//GEN-LAST:event_cmdMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLlenadoAutomatico;
    private javax.swing.JButton cmdLlenar;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextField txtRepite;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
