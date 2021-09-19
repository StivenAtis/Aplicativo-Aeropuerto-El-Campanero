package View;

import javax.swing.JOptionPane;

/**
 *
 * @author Booh
 */
public class frmHome extends javax.swing.JFrame {

    public frmHome() {
        initComponents();
    }

    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btRegisterHome = new javax.swing.JButton();
        btLoginHome = new javax.swing.JButton();
        btExitHome = new javax.swing.JButton();
        lbBannerHome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenido a Aeropuerto El Campanero");
        setLocation(new java.awt.Point(350, 180));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 70)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aeropuerto El Campanero");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1000, 110));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 42)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenido");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/madeby.gif"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 650, 200, 40));

        btRegisterHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/registro_min.jpg"))); // NOI18N
        btRegisterHome.setContentAreaFilled(false);
        btRegisterHome.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/registro_min.jpg"))); // NOI18N
        btRegisterHome.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/registro_max.jpg"))); // NOI18N
        btRegisterHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegisterHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btRegisterHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 410, 180));

        btLoginHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/login_min.jpg"))); // NOI18N
        btLoginHome.setContentAreaFilled(false);
        btLoginHome.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/login_min.jpg"))); // NOI18N
        btLoginHome.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/login_max.jpg"))); // NOI18N
        btLoginHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btLoginHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 510, 180));

        btExitHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/exit_min.jpg"))); // NOI18N
        btExitHome.setContentAreaFilled(false);
        btExitHome.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/exit_min.jpg"))); // NOI18N
        btExitHome.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/exit_max.jpg"))); // NOI18N
        btExitHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btExitHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 410, 180));

        lbBannerHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/home.gif"))); // NOI18N
        jPanel1.add(lbBannerHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
    private void btExitHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitHomeActionPerformed
        JOptionPane.showMessageDialog(this, "¡¡¡Gracias por visitar Aerpuerto El Campanero!!!");
        dispose();
    }//GEN-LAST:event_btExitHomeActionPerformed

    //--------------------------------------------------------------------------
    
    private void btRegisterHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegisterHomeActionPerformed
        frmRegister register = new  frmRegister();
        register.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btRegisterHomeActionPerformed

    //--------------------------------------------------------------------------
    
    private void btLoginHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginHomeActionPerformed
        frmLogin login = new  frmLogin();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btLoginHomeActionPerformed

    //--------------------------------------------------------------------------
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHome().setVisible(true);
            }
        });
    }

    //--------------------------------------------------------------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExitHome;
    private javax.swing.JButton btLoginHome;
    private javax.swing.JButton btRegisterHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBannerHome;
    // End of variables declaration//GEN-END:variables
}
