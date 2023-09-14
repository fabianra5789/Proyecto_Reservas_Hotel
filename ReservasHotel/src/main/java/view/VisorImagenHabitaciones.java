/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 import javax.swing.ImageIcon;
import javax.swing.Timer;
/**
 *
 * @author Ana Maria
 */
public class VisorImagenHabitaciones extends javax.swing.JFrame {

    ImageIcon Imagen[] = new ImageIcon[7];
    int contador = 1;    
    /**
     * Creates new form Vispr
     */
    public VisorImagenHabitaciones() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false) ;
        txCerrar.setIcon(new javax.swing.ImageIcon(("/Users/fabianra5789/Documents/torrents/salida.png")));
        this.setTitle("Habitaciones Hotel Manantial");
        for(int a =1; a<6; a++){
           Imagen[a] = new ImageIcon("/Users/fabianra5789/Documents/torrents/im"+a+".jpg");
        }
        jLabel1.setIcon(Imagen[1]);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btizquierda = new javax.swing.JButton();
        btderecha = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txCerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jLabel2.setBackground(new java.awt.Color(191, 217, 215));
        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(191, 217, 215));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 217, 215), 3, true));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 880, 510));

        btizquierda.setText("Anterior");
        btizquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btizquierdaActionPerformed(evt);
            }
        });
        getContentPane().add(btizquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, 115, -1));

        btderecha.setText("Siguiente");
        btderecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btderechaActionPerformed(evt);
            }
        });
        getContentPane().add(btderecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 590, 115, -1));

        jButton1.setText("Automatico");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 590, 120, -1));

        txCerrar.setText("Cerrar");
        txCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(txCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 650, 120, -1));

        jPanel1.setBackground(new java.awt.Color(191, 217, 215));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fotos De Las Habitaciones"));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btderechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btderechaActionPerformed
       if(contador ==5){
           contador = 0;   
       }
       contador ++;
       jLabel1.setIcon(Imagen[contador]);
       
    }//GEN-LAST:event_btderechaActionPerformed

    private void btizquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btizquierdaActionPerformed
       if(contador == 1){
           contador =7;
       }
      contador--;
      jLabel1.setIcon(Imagen[contador]);
    }//GEN-LAST:event_btizquierdaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Timer timer = new Timer (1000, new ActionListener (){
          @Override
          public void actionPerformed(ActionEvent e) {
             jLabel1.setIcon(new javax.swing.ImageIcon("/Users/fabianra5789/Documents/torrents/im"+contador+".jpg"));
             contador ++;
             if(contador ==7) contador = 1;
          }
          
      });
      timer.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_txCerrarActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(VisorImagenHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisorImagenHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisorImagenHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisorImagenHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
   new VisorImagenHabitaciones().setVisible(true);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisorImagenHabitaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btderecha;
    private javax.swing.JButton btizquierda;
    private javax.swing.JButton jButton1;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton txCerrar;
    // End of variables declaration//GEN-END:variables
}
