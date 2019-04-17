/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Color;

/**
 *
 * @author alex
 */
public class frmain extends javax.swing.JFrame {

    /**
     * Creates new form frmain
     */
    public frmain() {
        initComponents();
        this.setLocationRelativeTo(null);
        btncerrar.setBackground(new Color(0,0,0,0));
        //jPanel1.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btncerrar = new javax.swing.JButton();
        rSMaterialButtonRectangle1 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle3 = new rojerusan.RSMaterialButtonRectangle();
        btniniciar = new rojerusan.RSMaterialButtonCircle();
        espera = new javax.swing.JLabel();
        pensando = new javax.swing.JLabel();
        comiendo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        filosofo5 = new rojerusan.RSMaterialButtonCircle();
        filosofo4 = new rojerusan.RSMaterialButtonCircle();
        filosofo3 = new rojerusan.RSMaterialButtonCircle();
        filosofo2 = new rojerusan.RSMaterialButtonCircle();
        filosofo1 = new rojerusan.RSMaterialButtonCircle();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(960, 540));
        setMinimumSize(new java.awt.Dimension(960, 540));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-cancel-60.png"))); // NOI18N
        btncerrar.setBorderPainted(false);
        btncerrar.setContentAreaFilled(false);
        btncerrar.setName("btncerrar"); // NOI18N
        btncerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-cancel-50.png"))); // NOI18N
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 60, 60));

        rSMaterialButtonRectangle1.setBackground(new java.awt.Color(0, 0, 255));
        getContentPane().add(rSMaterialButtonRectangle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 100, 40));

        rSMaterialButtonRectangle2.setBackground(new java.awt.Color(255, 51, 51));
        getContentPane().add(rSMaterialButtonRectangle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 100, 40));

        rSMaterialButtonRectangle3.setBackground(new java.awt.Color(0, 255, 0));
        getContentPane().add(rSMaterialButtonRectangle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 100, 40));

        btniniciar.setBackground(new java.awt.Color(0, 153, 255));
        btniniciar.setForeground(new java.awt.Color(51, 0, 51));
        btniniciar.setText("Iniciar");
        btniniciar.setName("btniniciar"); // NOI18N
        btniniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btniniciarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btniniciarMouseReleased(evt);
            }
        });
        getContentPane().add(btniniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 250, -1));

        espera.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        espera.setText("En espera");
        espera.setName("espera"); // NOI18N
        getContentPane().add(espera, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        pensando.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pensando.setText("Pensando");
        pensando.setName("pensando"); // NOI18N
        getContentPane().add(pensando, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, -1));

        comiendo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        comiendo.setText("Comiendo");
        comiendo.setName("comiendo"); // NOI18N
        getContentPane().add(comiendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, -1, -1));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        filosofo5.setBackground(new java.awt.Color(255, 51, 51));
        filosofo5.setText("Filósofo 5");
        filosofo5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filosofo5.setName("filosofo5"); // NOI18N
        jPanel1.add(filosofo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        filosofo4.setBackground(new java.awt.Color(255, 51, 51));
        filosofo4.setText("Filósofo 4");
        filosofo4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filosofo4.setName("filosofo4"); // NOI18N
        jPanel1.add(filosofo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        filosofo3.setBackground(new java.awt.Color(255, 51, 51));
        filosofo3.setText("Filósofo 3");
        filosofo3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filosofo3.setName("filosofo3"); // NOI18N
        jPanel1.add(filosofo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        filosofo2.setBackground(new java.awt.Color(255, 51, 51));
        filosofo2.setText("Filósofo 2");
        filosofo2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filosofo2.setName("filosofo2"); // NOI18N
        jPanel1.add(filosofo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        filosofo1.setBackground(new java.awt.Color(255, 51, 51));
        filosofo1.setText("Filósofo 1");
        filosofo1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filosofo1.setName("filosofo1"); // NOI18N
        jPanel1.add(filosofo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 870, 360));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.jpg"))); // NOI18N
        fondo.setName("fondo"); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btniniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btniniciarMousePressed
        btniniciar.setSize(btniniciar.getWidth()-5,btniniciar.getHeight()-5);
    }//GEN-LAST:event_btniniciarMousePressed

    private void btniniciarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btniniciarMouseReleased
        btniniciar.setSize(btniniciar.getWidth()+5,btniniciar.getHeight()+5);
    }//GEN-LAST:event_btniniciarMouseReleased

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
            java.util.logging.Logger.getLogger(frmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncerrar;
    private rojerusan.RSMaterialButtonCircle btniniciar;
    private javax.swing.JLabel comiendo;
    private javax.swing.JLabel espera;
    private rojerusan.RSMaterialButtonCircle filosofo1;
    private rojerusan.RSMaterialButtonCircle filosofo2;
    private rojerusan.RSMaterialButtonCircle filosofo3;
    private rojerusan.RSMaterialButtonCircle filosofo4;
    private rojerusan.RSMaterialButtonCircle filosofo5;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pensando;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle3;
    // End of variables declaration//GEN-END:variables
}
