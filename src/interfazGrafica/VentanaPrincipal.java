/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica;
/**
 *
 * @author marco
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        MenuOrdenamientos = new javax.swing.JComboBox<>();
        MetodoOrdenacion = new java.awt.Label();
        BotonAleatorio = new javax.swing.JButton();
        BotonManual = new javax.swing.JButton();
        TipoLista = new javax.swing.JComboBox<>();
        label1 = new java.awt.Label();
        TipoNumero = new javax.swing.JComboBox<>();
        TipoValor = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Animacion de Ordenamientos");

        MenuOrdenamientos.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        MenuOrdenamientos.setMaximumRowCount(13);
        MenuOrdenamientos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Intercambio", "Seleccion", "Insercion", "Burbuja", "Burbuja mejorado", "Shell", "Mergesort", "Quicksort", "Binsort", "Radixsort", "Bucketsort", "Counting Sort", "Heapsort" }));
        MenuOrdenamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuOrdenamientosActionPerformed(evt);
            }
        });

        MetodoOrdenacion.setAlignment(java.awt.Label.CENTER);
        MetodoOrdenacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MetodoOrdenacion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        MetodoOrdenacion.setText("Método de ordenacion:");

        BotonAleatorio.setText("Aleatorio");
        BotonAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAleatorioActionPerformed(evt);
            }
        });

        BotonManual.setText("Manual");
        BotonManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonManualActionPerformed(evt);
            }
        });

        TipoLista.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        TipoLista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simples", "Dobles", "Simples Circulares", "Dobles Circulares" }));
        TipoLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoListaActionPerformed(evt);
            }
        });

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setText("Tipo de Lista:");

        TipoNumero.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        TipoNumero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entero", "Decimal" }));
        TipoNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoNumeroActionPerformed(evt);
            }
        });

        TipoValor.setAlignment(java.awt.Label.CENTER);
        TipoValor.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TipoValor.setText("Tipo de Numero:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(MetodoOrdenacion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(MenuOrdenamientos, 0, 156, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TipoLista, 0, 124, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TipoNumero, 0, 122, Short.MAX_VALUE)
                    .addComponent(TipoValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addComponent(BotonAleatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonManual)
                .addGap(157, 157, 157))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MetodoOrdenacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MenuOrdenamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAleatorio)
                    .addComponent(BotonManual)
                    .addComponent(TipoLista, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(325, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuOrdenamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuOrdenamientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuOrdenamientosActionPerformed

    private void BotonManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonManualActionPerformed
        String ordenamiento = MenuOrdenamientos.getSelectedItem().toString();
        String tipoLista = TipoLista.getSelectedItem().toString();
        String tipoNumero = TipoNumero.getSelectedItem().toString();
        if("Radixsort".equals(ordenamiento) || "Bucketsort".equals(ordenamiento) || "Counting Sort".equals(ordenamiento)){
            if("Decimal".equals(tipoNumero)){
                Alerta alerta = new Alerta(new javax.swing.JFrame(),true);
                alerta.setVisible(true);
                
            }else{   
            InputDatosManual dialog = new InputDatosManual(new javax.swing.JFrame(), true);
            dialog.setSoloInt(true);
            dialog.setTipo(tipoLista);
            dialog.setMetodo(ordenamiento);
            dialog.setVisible(true);
            }
        }
        else{
            if("Decimal".equals(tipoNumero)){
                InputDatosManual dialog = new InputDatosManual(new javax.swing.JFrame(), true);
                dialog.setTipo(tipoLista);
                dialog.setMetodo(ordenamiento);
                dialog.setSoloInt(false);
                dialog.setDecimal(true);
                dialog.setVisible(true);
            }else{
                InputDatosManual dialog = new InputDatosManual(new javax.swing.JFrame(), true);
                dialog.setTipo(tipoLista);
                dialog.setMetodo(ordenamiento);
                dialog.setSoloInt(true);
                dialog.setVisible(true);
            }
        }
    }//GEN-LAST:event_BotonManualActionPerformed

    private void BotonAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAleatorioActionPerformed
        String ordenamiento = MenuOrdenamientos.getSelectedItem().toString();
        String tipoLista = TipoLista.getSelectedItem().toString();
        String tipoNumero = TipoNumero.getSelectedItem().toString();
        if("Radixsort".equals(ordenamiento) || "Bucketsort".equals(ordenamiento) || "Counting Sort".equals(ordenamiento)){
            if("Decimal".equals(tipoNumero)){
                Alerta alerta = new Alerta(new javax.swing.JFrame(),true);
                alerta.setVisible(true);
            }
            else{
                InputDatosAleatorio dialog = new InputDatosAleatorio(new javax.swing.JFrame(), true);
                dialog.setTipo(tipoLista);
                dialog.setMetodo(ordenamiento);
                dialog.setVisible(true);
            }
        }else{
                InputDatosAleatorio dialog = new InputDatosAleatorio(new javax.swing.JFrame(), true);
                dialog.setTipo(tipoLista);
                dialog.setMetodo(ordenamiento);
                dialog.setVisible(true);
        }
    }//GEN-LAST:event_BotonAleatorioActionPerformed

    private void TipoListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoListaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoListaActionPerformed

    private void TipoNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoNumeroActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAleatorio;
    private javax.swing.JButton BotonManual;
    private javax.swing.JComboBox<String> MenuOrdenamientos;
    private java.awt.Label MetodoOrdenacion;
    private javax.swing.JComboBox<String> TipoLista;
    private javax.swing.JComboBox<String> TipoNumero;
    private java.awt.Label TipoValor;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}