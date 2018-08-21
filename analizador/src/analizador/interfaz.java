
package analizador;

import java.awt.Image;
import java.net.URL;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author efralerma
 */
public class interfaz extends javax.swing.JFrame {
    //imagenes que cambian
    cls_imagen Img = new cls_imagen();
    cls_imagen2 Img2 = new cls_imagen2();
    cls_imagen3 Img3 = new cls_imagen3();
    
    //Constructor de la clase
    public interfaz() {
        initComponents();
        ButtonGroup grupo_botones = new ButtonGroup();
        grupo_botones.add(rdb_a1);
        grupo_botones.add(rdb_a2);
        grupo_botones.add(rdb_a3);
        
        panel_a1.setVisible(true);
        panel_a1.add(Img);
        panel_a1.repaint();
        
        panel_a2.setVisible(false);
        panel_a2.add(Img2);
        panel_a2.repaint();
        
        panel_a3.setVisible(false);
        panel_a3.add(Img3);
        panel_a3.repaint();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdb_a1 = new javax.swing.JRadioButton();
        rdb_a2 = new javax.swing.JRadioButton();
        rdb_a3 = new javax.swing.JRadioButton();
        panel_a1 = new javax.swing.JPanel();
        panel_a2 = new javax.swing.JPanel();
        panel_a3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rdb_a1.setText("jRadioButton1");
        rdb_a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_a1ActionPerformed(evt);
            }
        });

        rdb_a2.setText("jRadioButton1");
        rdb_a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_a2ActionPerformed(evt);
            }
        });

        rdb_a3.setText("jRadioButton1");
        rdb_a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_a3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_a1Layout = new javax.swing.GroupLayout(panel_a1);
        panel_a1.setLayout(panel_a1Layout);
        panel_a1Layout.setHorizontalGroup(
            panel_a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 955, Short.MAX_VALUE)
        );
        panel_a1Layout.setVerticalGroup(
            panel_a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7259, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_a2Layout = new javax.swing.GroupLayout(panel_a2);
        panel_a2.setLayout(panel_a2Layout);
        panel_a2Layout.setHorizontalGroup(
            panel_a2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );
        panel_a2Layout.setVerticalGroup(
            panel_a2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_a3Layout = new javax.swing.GroupLayout(panel_a3);
        panel_a3.setLayout(panel_a3Layout);
        panel_a3Layout.setHorizontalGroup(
            panel_a3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );
        panel_a3Layout.setVerticalGroup(
            panel_a3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(rdb_a1)
                        .addGap(18, 18, 18)
                        .addComponent(rdb_a2)
                        .addGap(18, 18, 18)
                        .addComponent(rdb_a3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(386, 386, 386)
                    .addComponent(panel_a1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(386, 386, 386)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb_a3)
                    .addComponent(rdb_a2)
                    .addComponent(rdb_a1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7005, Short.MAX_VALUE)
                .addComponent(panel_a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addComponent(panel_a1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(104, 104, 104)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdb_a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_a1ActionPerformed
        panel_a1.setVisible(true);
        panel_a2.setVisible(false);
        panel_a3.setVisible(false);
    }//GEN-LAST:event_rdb_a1ActionPerformed

    private void rdb_a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_a2ActionPerformed
        panel_a1.setVisible(false);
        panel_a2.setVisible(true);
        panel_a3.setVisible(false); 
    }//GEN-LAST:event_rdb_a2ActionPerformed

    private void rdb_a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_a3ActionPerformed
        panel_a1.setVisible(false);
        panel_a2.setVisible(false);
        panel_a3.setVisible(true);
    }//GEN-LAST:event_rdb_a3ActionPerformed

 
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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel_a1;
    private javax.swing.JPanel panel_a2;
    private javax.swing.JPanel panel_a3;
    private javax.swing.JRadioButton rdb_a1;
    private javax.swing.JRadioButton rdb_a2;
    private javax.swing.JRadioButton rdb_a3;
    // End of variables declaration//GEN-END:variables
}
