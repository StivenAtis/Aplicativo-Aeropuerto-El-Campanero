package View;

import Classes.clsLogin;
import javax.swing.JOptionPane;
import Controller.*;
import static java.awt.image.ImageObserver.WIDTH;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Booh
 */
public class frmLogin extends javax.swing.JFrame {

    ctlAiportStaff controlLogin = new ctlAiportStaff();
    ctlAirlineStaff controlLoginAirline = new ctlAirlineStaff();
    
    public frmLogin() {
        initComponents();
    }

    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbAeropuerto = new javax.swing.JCheckBox();
        cbAerolinea = new javax.swing.JCheckBox();
        jcbMostrar = new javax.swing.JCheckBox();
        lbEmailUserLogin = new javax.swing.JLabel();
        tfEmailUserLogin = new javax.swing.JTextField();
        lbPasswordLogin = new javax.swing.JLabel();
        pswPasswordLogin = new javax.swing.JPasswordField();
        btCancelLogin = new javax.swing.JButton();
        lbLogin = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbBannerLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio Sesión Aeropuerto El Campanero");
        setLocation(new java.awt.Point(350, 180));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbAeropuerto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbAeropuerto.setText("Aeropuerto");
        cbAeropuerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAeropuertoActionPerformed(evt);
            }
        });
        jPanel1.add(cbAeropuerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 150, -1, 30));

        cbAerolinea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbAerolinea.setText("Aerolinea");
        cbAerolinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAerolineaActionPerformed(evt);
            }
        });
        jPanel1.add(cbAerolinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 100, 30));

        jcbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(jcbMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, -1, -1));

        lbEmailUserLogin.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lbEmailUserLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailUserLogin.setText("Email / Usuario");
        lbEmailUserLogin.setToolTipText("");
        jPanel1.add(lbEmailUserLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 180, 50));

        tfEmailUserLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(tfEmailUserLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 580, 50));

        lbPasswordLogin.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lbPasswordLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPasswordLogin.setText("Contraseña");
        lbPasswordLogin.setToolTipText("");
        jPanel1.add(lbPasswordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 130, 50));

        pswPasswordLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(pswPasswordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 580, 50));

        btCancelLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cancel_min.jpg"))); // NOI18N
        btCancelLogin.setContentAreaFilled(false);
        btCancelLogin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cancel_min.jpg"))); // NOI18N
        btCancelLogin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cancel_max.jpg"))); // NOI18N
        btCancelLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btCancelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 250, 140));

        lbLogin.setFont(new java.awt.Font("Comic Sans MS", 1, 42)); // NOI18N
        lbLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogin.setText("Inicio de Sesión");
        lbLogin.setToolTipText("");
        jPanel1.add(lbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 130));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/loginAp_min.jpg"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/loginAp_min.jpg"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/loginAp_max.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 310, 140));

        lbBannerLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/BannerLoginn.jpg"))); // NOI18N
        jPanel1.add(lbBannerLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
    private void cleanLoginQuestionnaire(){
        tfEmailUserLogin.setText("");
        pswPasswordLogin.setText("");
    }
    
    //--------------------------------------------------------------------------
    public String encode(String secretKey, String cadena) {
        String encriptacion = "";
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] llavePassword = md5.digest(secretKey.getBytes("utf-8"));
            byte[] BytesKey = Arrays.copyOf(llavePassword, 24);
            SecretKey key = new SecretKeySpec(BytesKey, "DESede");
            Cipher cifrado = Cipher.getInstance("DESede");
            cifrado.init(Cipher.ENCRYPT_MODE, key);
            byte[] plainTextBytes = cadena.getBytes("utf-8");
            byte[] buf = cifrado.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            encriptacion = new String(base64Bytes);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Algo salió mal");
        }
        return encriptacion;
    }
    
    //-------------------
    
    public String decode(String secretKey, String cadenaEncriptada) {
        String desencriptacion = "";
        try {
            byte[] message = Base64.decodeBase64(cadenaEncriptada.getBytes("utf-8"));
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md5.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);
            byte[] plainText = decipher.doFinal(message);
            desencriptacion = new String(plainText, "UTF-8");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Algo salió mal");
        }
        return desencriptacion;
    }
    
    //--------------------------------------------------------------------------
    
    private void btCancelLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelLoginActionPerformed
        frmHome home = new  frmHome();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btCancelLoginActionPerformed

    //--------------------------------------------------------------------------
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String email = tfEmailUserLogin.getText();
        String contrasenia = pswPasswordLogin.getText();
                
        if(email.equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar el correo electronico.");
        }
        if(contrasenia.equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar la contraseña.");
        }
        else{
            clsLogin login = controlLogin.readStaff(email);
            clsLogin loginAirline = controlLoginAirline.readStaff(email);
            
            if (cbAeropuerto.isSelected() == true) {
                
                if (login == null) {
                JOptionPane.showMessageDialog(this, "¡El correo electronico: " + email + ". No se encuentra registrado!");
                cleanLoginQuestionnaire();
                }
                else{
                    String pass = pswPasswordLogin.getText();
                    String emailL = tfEmailUserLogin.getText();

                    String secretKey = "aeropuertocampanero";
                    String encryptedPassword = encode(secretKey, pass);

                    if (!login.getEmail().equals(emailL) && login.getPassword().equals(encryptedPassword)) {
                        JOptionPane.showMessageDialog(this, "¡El correo electronico: " + email + ". No se encuentra registrado!");
                        tfEmailUserLogin.setText("");
                    }

                    else if (!login.getPassword().equals(encryptedPassword) && login.getEmail().equals(emailL)) {
                        JOptionPane.showMessageDialog(this, "¡la contraseña es incorrecta!");
                        pswPasswordLogin.setText("");
                    }

                    else if(login.getEmail().equals(emailL) && login.getPassword().equals(encryptedPassword)){
                        Icon m = new ImageIcon(getClass().getResource("/Media/vuelo.png"));
                        JOptionPane.showMessageDialog(this, "¡¡¡Bienvenido!!!", "welcome", WIDTH, m);
                        frmScheduleFlight_Airport  ScheduleFlight_Airport = new  frmScheduleFlight_Airport();
                        ScheduleFlight_Airport.setVisible(true);
                        this.setVisible(false);
                    }
                }
            }
            
            if (cbAerolinea.isSelected() == true) {
                
                if (loginAirline == null) {
                JOptionPane.showMessageDialog(this, "¡El correo electronico: " + email + ". No se encuentra registrado!");
                cleanLoginQuestionnaire();
            }
                else{
                    String pass = pswPasswordLogin.getText();
                    String emailL = tfEmailUserLogin.getText();

                    String secretKey = "aeropuertocampanero";
                    String encryptedPassword = encode(secretKey, pass);

                    if (!loginAirline.getEmail().equals(emailL) && loginAirline.getPassword().equals(encryptedPassword)) {
                        JOptionPane.showMessageDialog(this, "¡El correo electronico: " + email + ". No se encuentra registrado!");
                        tfEmailUserLogin.setText("");
                    }

                    else if (!loginAirline.getPassword().equals(encryptedPassword) && loginAirline.getEmail().equals(emailL)) {
                        JOptionPane.showMessageDialog(this, "¡la contraseña es incorrecta!");
                        pswPasswordLogin.setText("");
                    }

                    else if(loginAirline.getEmail().equals(emailL) && loginAirline.getPassword().equals(encryptedPassword)){
                        Icon m = new ImageIcon(getClass().getResource("/Media/vuelo.png"));
                        JOptionPane.showMessageDialog(this, "¡¡¡Bienvenido!!!", "welcome", WIDTH, m);
                        frmScheduleFlight_Airline  ScheduleFlight_Airline = new  frmScheduleFlight_Airline();
                        ScheduleFlight_Airline.setVisible(true);
                        this.setVisible(false);
                    }
                }
            }
            
            if(cbAerolinea.isSelected() ==  false && cbAeropuerto.isSelected() == false){
                JOptionPane.showMessageDialog(this, "Debe seleccionar un tipo de cuenta");
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    //--------------------------------------------------------------------------
    
    private void jcbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMostrarActionPerformed
        
        if (jcbMostrar.isSelected()) {
            pswPasswordLogin.setEchoChar((char) 0);
        } else {
            pswPasswordLogin.setEchoChar('*');
        }
    }//GEN-LAST:event_jcbMostrarActionPerformed

    //--------------------------------------------------------------------------
    
    private void cbAeropuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAeropuertoActionPerformed
        
         if(cbAeropuerto.isSelected() == true){
            
            cbAerolinea.setSelected(false);
            }
    }//GEN-LAST:event_cbAeropuertoActionPerformed

    //--------------------------------------------------------------------------
    
    private void cbAerolineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAerolineaActionPerformed
        
        if(cbAerolinea.isSelected() == true){
            
            cbAeropuerto.setSelected(false);
            }
    }//GEN-LAST:event_cbAerolineaActionPerformed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }
    
    //--------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelLogin;
    private javax.swing.JCheckBox cbAerolinea;
    private javax.swing.JCheckBox cbAeropuerto;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jcbMostrar;
    private javax.swing.JLabel lbBannerLogin;
    private javax.swing.JLabel lbEmailUserLogin;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbPasswordLogin;
    private javax.swing.JPasswordField pswPasswordLogin;
    private javax.swing.JTextField tfEmailUserLogin;
    // End of variables declaration//GEN-END:variables
}
