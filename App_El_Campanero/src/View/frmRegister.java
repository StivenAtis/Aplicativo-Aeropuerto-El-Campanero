package View;

import Classes.*;
import Controller.*;
import static java.awt.image.ImageObserver.WIDTH;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Booh
 */
public class frmRegister extends javax.swing.JFrame {

    ctlAiportStaff controlAiportStaff = new ctlAiportStaff();
    ctlAirlineStaff controlAirlineStaff = new ctlAirlineStaff();

    public frmRegister() {
        initComponents();
    }

    //--------------------------------------------------------------------------
    
    public void home(){
        frmRegister login = new  frmRegister();
        login.setVisible(true);
        int home = 1;
        this.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbMostrarC = new javax.swing.JCheckBox();
        cbMostrarCV = new javax.swing.JCheckBox();
        lbRegister = new javax.swing.JLabel();
        lbNamesRegister = new javax.swing.JLabel();
        tfNamesRegister = new javax.swing.JTextField();
        lbLastNames = new javax.swing.JLabel();
        tfLastNameRegister = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        tfEmailRegister = new javax.swing.JTextField();
        lbUser = new javax.swing.JLabel();
        tfUserRegister = new javax.swing.JTextField();
        lbPassword = new javax.swing.JLabel();
        pswPasswordRegisterConf = new javax.swing.JPasswordField();
        btRegisterRegisterAeropuerto = new javax.swing.JButton();
        btRegisterRegisterAerolinea = new javax.swing.JButton();
        btCancelRegister = new javax.swing.JButton();
        lbPassword1 = new javax.swing.JLabel();
        pswPasswordRegister = new javax.swing.JPasswordField();
        lbBannerRegister = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Aeropuerto El Campanero");
        setLocation(new java.awt.Point(350, 180));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbMostrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMostrarCActionPerformed(evt);
            }
        });
        jPanel1.add(cbMostrarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, -1, -1));

        cbMostrarCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMostrarCVActionPerformed(evt);
            }
        });
        jPanel1.add(cbMostrarCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 510, -1, -1));

        lbRegister.setFont(new java.awt.Font("Comic Sans MS", 1, 42)); // NOI18N
        lbRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRegister.setText("Registro");
        lbRegister.setToolTipText("");
        jPanel1.add(lbRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 80));

        lbNamesRegister.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lbNamesRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNamesRegister.setText("Nombres");
        lbNamesRegister.setToolTipText("");
        jPanel1.add(lbNamesRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 50));

        tfNamesRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfNamesRegister.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNamesRegisterKeyTyped(evt);
            }
        });
        jPanel1.add(tfNamesRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 490, 50));

        lbLastNames.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lbLastNames.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLastNames.setText("Apellidos");
        lbLastNames.setToolTipText("");
        jPanel1.add(lbLastNames, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 170, 50));

        tfLastNameRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfLastNameRegister.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfLastNameRegisterKeyTyped(evt);
            }
        });
        jPanel1.add(tfLastNameRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 490, 50));

        lbEmail.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lbEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmail.setText("Email");
        lbEmail.setToolTipText("");
        jPanel1.add(lbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 120, 50));

        tfEmailRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(tfEmailRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 490, 50));

        lbUser.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lbUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUser.setText("Usuario");
        lbUser.setToolTipText("");
        jPanel1.add(lbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 150, 50));

        tfUserRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(tfUserRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 490, 50));

        lbPassword.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lbPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPassword.setText("Confirmar contraseña");
        lbPassword.setToolTipText("");
        jPanel1.add(lbPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 310, 50));

        pswPasswordRegisterConf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pswPasswordRegisterConf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pswPasswordRegisterConfMouseClicked(evt);
            }
        });
        jPanel1.add(pswPasswordRegisterConf, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 490, 50));

        btRegisterRegisterAeropuerto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/RegistrarUser_min.jpg"))); // NOI18N
        btRegisterRegisterAeropuerto.setContentAreaFilled(false);
        btRegisterRegisterAeropuerto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/RegistrarUserAp_min.jpg"))); // NOI18N
        btRegisterRegisterAeropuerto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/RegistrarUserAp_max.jpg"))); // NOI18N
        btRegisterRegisterAeropuerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegisterRegisterAeropuertoActionPerformed(evt);
            }
        });
        jPanel1.add(btRegisterRegisterAeropuerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 380, 130));

        btRegisterRegisterAerolinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/RegistrarUser_min.jpg"))); // NOI18N
        btRegisterRegisterAerolinea.setContentAreaFilled(false);
        btRegisterRegisterAerolinea.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/RegistrarUserAer_min.jpg"))); // NOI18N
        btRegisterRegisterAerolinea.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/RegistrarUserAer_max.jpg"))); // NOI18N
        btRegisterRegisterAerolinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegisterRegisterAerolineaActionPerformed(evt);
            }
        });
        jPanel1.add(btRegisterRegisterAerolinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, 380, 130));

        btCancelRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cancel_min.jpg"))); // NOI18N
        btCancelRegister.setContentAreaFilled(false);
        btCancelRegister.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cancel_min.jpg"))); // NOI18N
        btCancelRegister.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/cancel_max.jpg"))); // NOI18N
        btCancelRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btCancelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 570, 250, 130));

        lbPassword1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lbPassword1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPassword1.setText("Contraseña");
        lbPassword1.setToolTipText("");
        jPanel1.add(lbPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 190, 50));

        pswPasswordRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pswPasswordRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pswPasswordRegisterMouseClicked(evt);
            }
        });
        jPanel1.add(pswPasswordRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 490, 50));

        lbBannerRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Register-background.jpg"))); // NOI18N
        jPanel1.add(lbBannerRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 700));

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
    
    private void cleanRegisterQuestionnaire(){
        tfNamesRegister.setText("");
        tfLastNameRegister.setText("");
        tfEmailRegister.setText("");
        pswPasswordRegisterConf.setText("");
        tfUserRegister.setText("");
    }
    
    //--------------------------------------------------------------------------
    
    private void btCancelRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelRegisterActionPerformed
        frmHome home = new  frmHome();
        home.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btCancelRegisterActionPerformed

    //--------------------------------------------------------------------------
    
    private void pswPasswordRegisterConfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pswPasswordRegisterConfMouseClicked
        pswPasswordRegisterConf.setText("");
    }//GEN-LAST:event_pswPasswordRegisterConfMouseClicked

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

    //--------------------------------------------------------------------------
    
    public String deecode(String secretKey, String cadenaEncriptada) {
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
    
    private void btRegisterRegisterAeropuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegisterRegisterAeropuertoActionPerformed
        
        String email = tfEmailRegister.getText();
        boolean email_valido = clsEmailVerification.es_un_email_valido(email);
        
        if(email_valido == true){
            
            try {
                String name = tfNamesRegister.getText();
                String lastName = tfLastNameRegister.getText();
                String email_emp = tfEmailRegister.getText();
                String user_emp =tfUserRegister.getText();
                String password =pswPasswordRegister.getText();
                String Cpassword =pswPasswordRegisterConf.getText();
                
                String secretKey = "aeropuertocampanero";
                String encryptedPassword = encode(secretKey, password);
                
                if(tfLastNameRegister.getText().equals("") || tfNamesRegister.getText().equals("") || tfEmailRegister.getText().equals("") || tfUserRegister.getText().equals("")){
                    Icon m = new ImageIcon(getClass().getResource("/Media/sad_emoji.gif"));
                    JOptionPane.showMessageDialog(this, "¡¡¡Debes ingresar todos \n los datos para registrarte!!!", "ERROR", WIDTH, m);
                }
                else{
                    if(password.equals(Cpassword)){
                        clsAirportStaff user = new clsAirportStaff(0, name, lastName, email_emp, user_emp, encryptedPassword);
                    
                        Icon m = new ImageIcon(getClass().getResource("/Media/passed.png"));
                        JOptionPane.showMessageDialog(this, "¡¡¡Se ha creado correctamente\n uuna cuenta de aeropuerto!!!", "Cuenta creada", WIDTH, m);
                
                        controlAiportStaff.createStaff(user);
                        cleanRegisterQuestionnaire();
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "¡La contraseña no coincide!");
                        pswPasswordRegisterConf.setText("");
                    }
                    
                }
                
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        else{
            Icon m = new ImageIcon(getClass().getResource("/Media/sad_emoji.gif"));
            JOptionPane.showMessageDialog(this, "¡¡¡Tu email no corresponde \n al dominio del aeropuerto!!!", "ERROR", WIDTH, m);
            tfEmailRegister.setText("");
        }
    }//GEN-LAST:event_btRegisterRegisterAeropuertoActionPerformed

    //--------------------------------------------------------------------------
    
    private void tfNamesRegisterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNamesRegisterKeyTyped
        
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter == '1') || (caracter  == '2') || (caracter  == '3') || (caracter  == '4') || (caracter  == '5') || (caracter  == '6')
            || (caracter  == '7') || (caracter  == '8') || (caracter  == '9') || (caracter  == '0')))
            {
            evt.consume();  // ignorar el evento de teclado
            }
        
    }//GEN-LAST:event_tfNamesRegisterKeyTyped

    //--------------------------------------------------------------------------
    
    private void tfLastNameRegisterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLastNameRegisterKeyTyped
        
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if(((caracter == '1') || (caracter  == '2') || (caracter  == '3') || (caracter  == '4') || (caracter  == '5') || (caracter  == '6')
            || (caracter  == '7') || (caracter  == '8') || (caracter  == '9') || (caracter  == '0')))
            {
            evt.consume();  // ignorar el evento de teclado
            }
    }//GEN-LAST:event_tfLastNameRegisterKeyTyped

    //--------------------------------------------------------------------------
    
    private void pswPasswordRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pswPasswordRegisterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pswPasswordRegisterMouseClicked

    //--------------------------------------------------------------------------
    
    private void btRegisterRegisterAerolineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegisterRegisterAerolineaActionPerformed
        
        String email = tfEmailRegister.getText();
        boolean email_valido = clsEmailVerification.email_valido(email);
        
        if(email_valido == true){
            
            try {
            String name = tfNamesRegister.getText();
            String lastName = tfLastNameRegister.getText();
            String email_emp = tfEmailRegister.getText();
            String user_emp =tfUserRegister.getText();
            String password =pswPasswordRegister.getText();
            String Cpassword =pswPasswordRegisterConf.getText();

            String secretKey = "aeropuertocampanero";
            String encryptedPassword = encode(secretKey, password);

            if(tfLastNameRegister.getText().equals("") || tfNamesRegister.getText().equals("") || tfEmailRegister.getText().equals("") || tfUserRegister.getText().equals("")){
                Icon m = new ImageIcon(getClass().getResource("/Media/sad_emoji.gif"));
                JOptionPane.showMessageDialog(this, "¡¡¡Debes ingresar todos \n los datos para registrarte!!!", "ERROR", WIDTH, m);
            }
            else{
                
                if(password.equals(Cpassword)){
                    
                    clsAirlineStaff user = new clsAirlineStaff(0, name, lastName, email_emp, user_emp, encryptedPassword);
                    controlAirlineStaff.createStaff(user);
                
                    Icon m = new ImageIcon(getClass().getResource("/Media/passed.png"));
                    JOptionPane.showMessageDialog(this, "¡¡¡Se ha creado correctamente\n uuna cuenta de aerolinea!!!", "Cuenta creada", WIDTH, m);
                    cleanRegisterQuestionnaire();
                }
                else{
                    
                    JOptionPane.showMessageDialog(this, "¡La contraseña no coincide!");
                        pswPasswordRegisterConf.setText("");
                }

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        }
        else{
            Icon m = new ImageIcon(getClass().getResource("/Media/sad_emoji.gif"));
            JOptionPane.showMessageDialog(this, "¡¡¡Verifica tu dirección email!!!", "ERROR", WIDTH, m);
            tfEmailRegister.setText("");
        }
        
    }//GEN-LAST:event_btRegisterRegisterAerolineaActionPerformed

    //--------------------------------------------------------------------------
    
    private void cbMostrarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMostrarCActionPerformed
        
        if (cbMostrarC.isSelected()) {
            pswPasswordRegister.setEchoChar((char) 0);
        } else {
            pswPasswordRegister.setEchoChar('*');
        }
    }//GEN-LAST:event_cbMostrarCActionPerformed

    //--------------------------------------------------------------------------
    
    private void cbMostrarCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMostrarCVActionPerformed
        
        if (cbMostrarCV.isSelected()) {
            pswPasswordRegisterConf.setEchoChar((char) 0);
        } else {
            pswPasswordRegisterConf.setEchoChar('*');
        }
    }//GEN-LAST:event_cbMostrarCVActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegister().setVisible(true);
            }
        });
    }

    //--------------------------------------------------------------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelRegister;
    private javax.swing.JButton btRegisterRegisterAerolinea;
    private javax.swing.JButton btRegisterRegisterAeropuerto;
    private javax.swing.JCheckBox cbMostrarC;
    private javax.swing.JCheckBox cbMostrarCV;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBannerRegister;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbLastNames;
    private javax.swing.JLabel lbNamesRegister;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbPassword1;
    private javax.swing.JLabel lbRegister;
    private javax.swing.JLabel lbUser;
    private javax.swing.JPasswordField pswPasswordRegister;
    private javax.swing.JPasswordField pswPasswordRegisterConf;
    private javax.swing.JTextField tfEmailRegister;
    private javax.swing.JTextField tfLastNameRegister;
    private javax.swing.JTextField tfNamesRegister;
    private javax.swing.JTextField tfUserRegister;
    // End of variables declaration//GEN-END:variables
}
