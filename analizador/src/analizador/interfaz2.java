package analizador;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author efralerma
 */
public class interfaz2 extends javax.swing.JFrame {

    //imagenes que cambian
    cls_imagen Img = new cls_imagen();
    cls_imagen2 Img2 = new cls_imagen2();
    cls_imagen3 Img3 = new cls_imagen3();
    cls_imagen4 Img4 = new cls_imagen4();
    cls_imagen5 Img5 = new cls_imagen5();
    cls_imagen6 Img6 = new cls_imagen6();
    cls_automatas automata = new cls_automatas();
    public interfaz2() {
        initComponents();
        ButtonGroup grupo_botones = new ButtonGroup();
        grupo_botones.add(rdb_a1);
        grupo_botones.add(rdb_a2);
        grupo_botones.add(rdb_a3);
        grupo_botones.add(rdb_a4);
        grupo_botones.add(rdb_a5);
        grupo_botones.add(rdb_a6);
        
        panel_a1.setVisible(true);
        panel_a1.add(Img);
        panel_a1.repaint();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdb_a1 = new javax.swing.JRadioButton();
        rdb_a2 = new javax.swing.JRadioButton();
        rdb_a3 = new javax.swing.JRadioButton();
        rdb_a4 = new javax.swing.JRadioButton();
        rdb_a5 = new javax.swing.JRadioButton();
        rdb_a6 = new javax.swing.JRadioButton();
        panel_a1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_expresion = new javax.swing.JTextField();
        btn_comprobar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rdb_a1.setText("A1  L = {a^n b^n | n>0}");
        rdb_a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_a1ActionPerformed(evt);
            }
        });

        rdb_a2.setText("A2 L = {a^n b^n | n>=0}");
        rdb_a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_a2ActionPerformed(evt);
            }
        });

        rdb_a3.setText("A3 L = {a^n b^2n |>0}");
        rdb_a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_a3ActionPerformed(evt);
            }
        });

        rdb_a4.setText("A4 L = {a^2n b |=>0}");
        rdb_a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_a4ActionPerformed(evt);
            }
        });

        rdb_a5.setText("A5 L = {a^2n b^n |>0}");
        rdb_a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_a5ActionPerformed(evt);
            }
        });

        rdb_a6.setText("A6 L = {a^n b^n+3 |>0}");
        rdb_a6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_a6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_a1Layout = new javax.swing.GroupLayout(panel_a1);
        panel_a1.setLayout(panel_a1Layout);
        panel_a1Layout.setHorizontalGroup(
            panel_a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );
        panel_a1Layout.setVerticalGroup(
            panel_a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        jLabel1.setText("Ingresa expresión aquí");

        txt_expresion.setDisabledTextColor(new java.awt.Color(255, 0, 102));

        btn_comprobar.setText("comprobar");
        btn_comprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comprobarActionPerformed(evt);
            }
        });

        jLabel2.setText("Analizador de Expresiones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdb_a2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdb_a1)
                            .addComponent(rdb_a3)
                            .addComponent(rdb_a4)
                            .addComponent(rdb_a5)
                            .addComponent(rdb_a6))
                        .addGap(98, 98, 98)
                        .addComponent(panel_a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_expresion))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_comprobar)
                        .addGap(72, 72, 72))))
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(txt_expresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btn_comprobar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdb_a1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdb_a2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdb_a3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdb_a4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdb_a5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdb_a6)))))
                .addContainerGap(222, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdb_a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_a1ActionPerformed
        
        panel_a1.removeAll();
        panel_a1.add(Img);
        panel_a1.repaint();
    }//GEN-LAST:event_rdb_a1ActionPerformed

    private void rdb_a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_a2ActionPerformed
        panel_a1.removeAll();
        panel_a1.add(Img2);
        panel_a1.repaint();
    }//GEN-LAST:event_rdb_a2ActionPerformed

    private void rdb_a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_a3ActionPerformed

       panel_a1.removeAll();
       panel_a1.add(Img3);
       panel_a1.repaint();
    }//GEN-LAST:event_rdb_a3ActionPerformed

    private void btn_comprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comprobarActionPerformed
        
        String palabra = txt_expresion.getText();
        if(rdb_a1.isSelected()){
            if(automata.automata1(palabra)==true){
                JOptionPane.showMessageDialog(null, "la expresión SI pertenece al lenguaje");
                
            }
            else{
                JOptionPane.showMessageDialog(null, "la expresión NO pertenece al lenguaje");
            }
        }else if(rdb_a2.isSelected()){
        if(automata.automata2(palabra)==true){
                JOptionPane.showMessageDialog(null, "la expresión SI pertenece al lenguaje");
            }
            else{
                JOptionPane.showMessageDialog(null, "la expresión NO pertenece al lenguaje");
            }

        }else if(rdb_a3.isSelected()){
            if(automata.automata3(palabra)==true){
                JOptionPane.showMessageDialog(null, "la expresión SI pertenece al lenguaje");
            }
            else{
                JOptionPane.showMessageDialog(null, "la expresión NO pertenece al lenguaje");
            }

        }else if(rdb_a4.isSelected()){
            if(automata.automata4(palabra)==true){
                JOptionPane.showMessageDialog(null, "la expresión SI pertenece al lenguaje");
            }
            else{
                JOptionPane.showMessageDialog(null, "la expresión NO pertenece al lenguaje");
            }
        }else if(rdb_a5.isSelected()){
            if(automata.automata5(palabra)==true){
                JOptionPane.showMessageDialog(null, "la expresión SI pertenece al lenguaje");
            }
            else{
                JOptionPane.showMessageDialog(null, "la expresión NO pertenece al lenguaje");
            }
        }else if(rdb_a6.isSelected()){
            if(automata.automata6(palabra)==true){
                JOptionPane.showMessageDialog(null, "la expresión SI pertenece al lenguaje");
            }
            else{
                JOptionPane.showMessageDialog(null, "la expresión NO pertenece al lenguaje");
            }
        }else{
        
        }
    }//GEN-LAST:event_btn_comprobarActionPerformed

    private void rdb_a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_a4ActionPerformed
        panel_a1.removeAll();
        panel_a1.add(Img4);
        panel_a1.repaint();
    }//GEN-LAST:event_rdb_a4ActionPerformed

    private void rdb_a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_a5ActionPerformed
        panel_a1.removeAll();
        panel_a1.add(Img5);
        panel_a1.repaint();
    }//GEN-LAST:event_rdb_a5ActionPerformed

    private void rdb_a6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_a6ActionPerformed
        panel_a1.removeAll();
        panel_a1.add(Img6);
        panel_a1.repaint();
    }//GEN-LAST:event_rdb_a6ActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_comprobar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panel_a1;
    private javax.swing.JRadioButton rdb_a1;
    private javax.swing.JRadioButton rdb_a2;
    private javax.swing.JRadioButton rdb_a3;
    private javax.swing.JRadioButton rdb_a4;
    private javax.swing.JRadioButton rdb_a5;
    private javax.swing.JRadioButton rdb_a6;
    private javax.swing.JTextField txt_expresion;
    // End of variables declaration//GEN-END:variables
}
