/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package animalhome.UI;

import java.awt.Color;

import animalhome.metodos.TextPrompt;

/**
 *
 * @author Cristian Franco
 */
public class LoginAdmin extends javax.swing.JFrame {

    /**
     * Creates new form LoginAdmin
     */
    public LoginAdmin() {
        initComponents();
        this.setBackground(new Color(0,0,0,0));
        ph();
    }
    
    public void ph(){
        TextPrompt placeH;
        placeH = new TextPrompt("Contraseña", txtContraseña);
        placeH = new TextPrompt("Usuario", txtUsuario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagenRescala1 = new animalhome.metodos.ImagenRescala();
        panelRG1 = new animalhome.metodos.PanelRG();
        imagenRescala2 = new animalhome.metodos.ImagenRescala();
        jLabel1 = new javax.swing.JLabel();
        panelRG2 = new animalhome.metodos.PanelRG();
        jLabel2 = new javax.swing.JLabel();
        panelRG3 = new animalhome.metodos.PanelRG();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        panelRG4 = new animalhome.metodos.PanelRG();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        botonMod1 = new animalhome.metodos.BotonMod();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelRG1.setColor1(new java.awt.Color(0, 0, 153));
        panelRG1.setColor2(new java.awt.Color(0, 153, 247));
        panelRG1.setPunto1Y(80);
        panelRG1.setPunto2X(2);
        panelRG1.setPunto2Y(4);
        panelRG1.setRedonabajoderrecha(50);
        panelRG1.setRedonabajoizquierda(50);
        panelRG1.setRedonarribaderrecha(50);
        panelRG1.setRedonarribaizquierda(50);
        panelRG1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelRG1MouseDragged(evt);
            }
        });
        panelRG1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelRG1MousePressed(evt);
            }
        });

        imagenRescala2.setImage(new javax.swing.ImageIcon(getClass().getResource("/ImagenesLogin/AH2.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Animal Home");

        javax.swing.GroupLayout panelRG1Layout = new javax.swing.GroupLayout(panelRG1);
        panelRG1.setLayout(panelRG1Layout);
        panelRG1Layout.setHorizontalGroup(
            panelRG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRG1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRG1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(13, Short.MAX_VALUE))
                    .addGroup(panelRG1Layout.createSequentialGroup()
                        .addComponent(imagenRescala2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        panelRG1Layout.setVerticalGroup(
            panelRG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRG1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(imagenRescala2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        panelRG2.setColor2(new java.awt.Color(0, 0, 153));
        panelRG2.setRedonabajoderrecha(50);
        panelRG2.setRedonabajoizquierda(50);
        panelRG2.setRedonarribaderrecha(50);
        panelRG2.setRedonarribaizquierda(50);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesLogin/icons8_cancel_32px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        panelRG3.setColor1(new java.awt.Color(204, 204, 204));
        panelRG3.setColor2(new java.awt.Color(204, 204, 204));

        txtUsuario.setBackground(new java.awt.Color(204, 204, 204));
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setBorder(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageneUIAdmin/icons8_user_shield_40px.png"))); // NOI18N

        javax.swing.GroupLayout panelRG3Layout = new javax.swing.GroupLayout(panelRG3);
        panelRG3.setLayout(panelRG3Layout);
        panelRG3Layout.setHorizontalGroup(
            panelRG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRG3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        panelRG3Layout.setVerticalGroup(
            panelRG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRG3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUsuario)
                .addContainerGap())
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelRG4.setColor1(new java.awt.Color(204, 204, 204));
        panelRG4.setColor2(new java.awt.Color(204, 204, 204));

        txtContraseña.setBackground(new java.awt.Color(204, 204, 204));
        txtContraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(0, 0, 0));
        txtContraseña.setBorder(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageneUIAdmin/icons8_lock_40px.png"))); // NOI18N

        javax.swing.GroupLayout panelRG4Layout = new javax.swing.GroupLayout(panelRG4);
        panelRG4.setLayout(panelRG4Layout);
        panelRG4Layout.setHorizontalGroup(
            panelRG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRG4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRG4Layout.setVerticalGroup(
            panelRG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRG4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtContraseña)
                .addContainerGap())
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        botonMod1.setText("Iniciar Sesion");
        botonMod1.setColor2(new java.awt.Color(0, 51, 204));
        botonMod1.setColor3(new java.awt.Color(0, 0, 102));
        botonMod1.setDegrade(100);
        botonMod1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        botonMod1.setSizeSpeed(17.0F);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Administracion");

        javax.swing.GroupLayout panelRG2Layout = new javax.swing.GroupLayout(panelRG2);
        panelRG2.setLayout(panelRG2Layout);
        panelRG2Layout.setHorizontalGroup(
            panelRG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRG2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelRG2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelRG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panelRG3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRG4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRG2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(botonMod1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        panelRG2Layout.setVerticalGroup(
            panelRG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRG2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(panelRG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRG4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(botonMod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelRG2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRG1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelRG2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked
    int xx, xy;
    private void panelRG1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRG1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_panelRG1MousePressed

    private void panelRG1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRG1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        setLocation(x-xx, y-xy);
    }//GEN-LAST:event_panelRG1MouseDragged

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
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private animalhome.metodos.BotonMod botonMod1;
    private animalhome.metodos.ImagenRescala imagenRescala1;
    private animalhome.metodos.ImagenRescala imagenRescala2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private animalhome.metodos.PanelRG panelRG1;
    private animalhome.metodos.PanelRG panelRG2;
    private animalhome.metodos.PanelRG panelRG3;
    private animalhome.metodos.PanelRG panelRG4;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}