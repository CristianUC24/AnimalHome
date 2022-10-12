/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package animalhome.UI;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author cris
 */
public final class UICliente extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public UICliente() {
        initComponents();
        this.setIconImage(getIconImage());
        setExtendedState(MAXIMIZED_BOTH);
        Mascotas.setVisible(true);
    }

    public void componentes() {

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("ImagenesUiCliente/AH2.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mascotas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Apartar = new javax.swing.JPanel();
        Tienda = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panelRG1 = new animalhome.metodos.PanelRG();
        imagenRescala1 = new animalhome.metodos.ImagenRescala();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Gen3 = new javax.swing.JLabel();
        Nombre3 = new javax.swing.JLabel();
        botonMod1 = new animalhome.metodos.BotonMod();
        btnTienda = new animalhome.metodos.BotonMantenerMod();
        btnMascotas = new animalhome.metodos.BotonMantenerMod();
        btnCita = new animalhome.metodos.BotonMantenerMod();
        contenedor = new javax.swing.JPanel();

        Mascotas.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Mascotas");

        javax.swing.GroupLayout MascotasLayout = new javax.swing.GroupLayout(Mascotas);
        Mascotas.setLayout(MascotasLayout);
        MascotasLayout.setHorizontalGroup(
            MascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MascotasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(560, Short.MAX_VALUE))
        );
        MascotasLayout.setVerticalGroup(
            MascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MascotasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(367, Short.MAX_VALUE))
        );

        Apartar.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout ApartarLayout = new javax.swing.GroupLayout(Apartar);
        Apartar.setLayout(ApartarLayout);
        ApartarLayout.setHorizontalGroup(
            ApartarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );
        ApartarLayout.setVerticalGroup(
            ApartarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        Tienda.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Tienda");

        javax.swing.GroupLayout TiendaLayout = new javax.swing.GroupLayout(Tienda);
        Tienda.setLayout(TiendaLayout);
        TiendaLayout.setHorizontalGroup(
            TiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TiendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(486, Short.MAX_VALUE))
        );
        TiendaLayout.setVerticalGroup(
            TiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TiendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new java.awt.BorderLayout());

        panelRG1.setColor1(new java.awt.Color(0, 0, 51));
        panelRG1.setColor2(new java.awt.Color(9, 43, 225));
        panelRG1.setMinimumSize(new java.awt.Dimension(800, 40));
        panelRG1.setPreferredSize(new java.awt.Dimension(800, 30));
        panelRG1.setPunto1X(800);
        panelRG1.setPunto1Y(50);
        panelRG1.setPunto2X(30);
        panelRG1.setRedonabajoderrecha(0);
        panelRG1.setRedonabajoizquierda(0);
        panelRG1.setRedonarribaderrecha(0);
        panelRG1.setRedonarribaizquierda(0);

        imagenRescala1.setImage(new javax.swing.ImageIcon(getClass().getResource("/ImagenesUiCliente/AH3.png"))); // NOI18N
        imagenRescala1.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Animal Home");

        javax.swing.GroupLayout panelRG1Layout = new javax.swing.GroupLayout(panelRG1);
        panelRG1.setLayout(panelRG1Layout);
        panelRG1Layout.setHorizontalGroup(
            panelRG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRG1Layout.createSequentialGroup()
                .addContainerGap(761, Short.MAX_VALUE)
                .addComponent(imagenRescala1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(38, 38, 38))
        );
        panelRG1Layout.setVerticalGroup(
            panelRG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRG1Layout.createSequentialGroup()
                .addGroup(panelRG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imagenRescala1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jPanel1.add(panelRG1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(9, 43, 225));
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 449));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 255, 51));
        jLabel10.setText("Conectado");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        Gen3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Gen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesUiCliente/icons8_male_user_43px.png"))); // NOI18N

        Nombre3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Nombre3.setForeground(new java.awt.Color(204, 204, 204));
        Nombre3.setText("Nombre del Usuario");
        Nombre3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Nombre3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Nombre3MouseClicked(evt);
            }
        });

        botonMod1.setBackground(new java.awt.Color(9, 43, 225));
        botonMod1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesUiCliente/exit_32px.png"))); // NOI18N
        botonMod1.setColor1(new java.awt.Color(7, 37, 196));
        botonMod1.setColor2(new java.awt.Color(0, 102, 153));
        botonMod1.setColor3(new java.awt.Color(0, 51, 204));
        botonMod1.setDegrade(30);
        botonMod1.setRedonabajoderrecha(30);
        botonMod1.setRedonabajoizquierda(30);
        botonMod1.setRedonarribaderrecha(30);
        botonMod1.setRedonarribaizquierda(30);
        botonMod1.setSizeSpeed(10.0F);
        botonMod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMod1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnTienda);
        btnTienda.setSelected(true);
        btnTienda.setColorfont(new java.awt.Color(0, 0, 0));
        btnTienda.setFondo(new java.awt.Color(9, 43, 225));
        btnTienda.setFont(new java.awt.Font("Poppins", 0, 25)); // NOI18N
        btnTienda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTienda.setHover(new java.awt.Color(255, 255, 255));
        btnTienda.setImagenClick(new javax.swing.ImageIcon(getClass().getResource("/ImagenesUiCliente/icons8_shop_43px_3.png"))); // NOI18N
        btnTienda.setImagenInicio(new javax.swing.ImageIcon(getClass().getResource("/ImagenesUiCliente/icons8_shop_43px.png"))); // NOI18N
        btnTienda.setLabel("Tienda");
        btnTienda.setLetra(new java.awt.Color(255, 255, 255));
        btnTienda.setRedonabajoderrecha(0);
        btnTienda.setRedonabajoizquierda(30);
        btnTienda.setRedonarribaderrecha(0);
        btnTienda.setRedonarribaizquierda(30);
        btnTienda.setSizeSpeed(9.0F);
        btnTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiendaActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnMascotas);
        btnMascotas.setColorfont(new java.awt.Color(0, 0, 0));
        btnMascotas.setFondo(new java.awt.Color(9, 43, 225));
        btnMascotas.setFont(new java.awt.Font("Poppins", 0, 25)); // NOI18N
        btnMascotas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMascotas.setHover(new java.awt.Color(255, 255, 255));
        btnMascotas.setImagenClick(new javax.swing.ImageIcon(getClass().getResource("/ImagenesUiCliente/icons8_animal_shelter_43px_1.png"))); // NOI18N
        btnMascotas.setImagenInicio(new javax.swing.ImageIcon(getClass().getResource("/ImagenesUiCliente/icons8_animal_shelter_43px.png"))); // NOI18N
        btnMascotas.setLabel("Mascotas");
        btnMascotas.setLetra(new java.awt.Color(255, 255, 255));
        btnMascotas.setRedonabajoderrecha(0);
        btnMascotas.setRedonabajoizquierda(30);
        btnMascotas.setRedonarribaderrecha(0);
        btnMascotas.setRedonarribaizquierda(30);
        btnMascotas.setSizeSpeed(9.0F);
        btnMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMascotasActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnCita);
        btnCita.setText("Cita");
        btnCita.setColorfont(new java.awt.Color(0, 0, 0));
        btnCita.setFondo(new java.awt.Color(9, 43, 225));
        btnCita.setFont(new java.awt.Font("Poppins", 0, 25)); // NOI18N
        btnCita.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCita.setHover(new java.awt.Color(255, 255, 255));
        btnCita.setImagenClick(new javax.swing.ImageIcon(getClass().getResource("/ImagenesUiCliente/icons8_veterinarian_43px_5.png"))); // NOI18N
        btnCita.setImagenInicio(new javax.swing.ImageIcon(getClass().getResource("/ImagenesUiCliente/icons8_veterinarian_43px_4.png"))); // NOI18N
        btnCita.setLetra(new java.awt.Color(255, 255, 255));
        btnCita.setRedonabajoderrecha(0);
        btnCita.setRedonabajoizquierda(30);
        btnCita.setRedonarribaderrecha(0);
        btnCita.setRedonarribaizquierda(30);
        btnCita.setSizeSpeed(9.0F);
        btnCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonMod1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Gen3)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTienda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMascotas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Gen3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel10))
                    .addComponent(Nombre3))
                .addGap(98, 98, 98)
                .addComponent(btnTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCita, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(botonMod1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_START);

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.setLayout(new java.awt.CardLayout());
        jPanel1.add(contenedor, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void Nombre3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nombre3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre3MouseClicked

    private void btnTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiendaActionPerformed
        contenedor.removeAll();
        contenedor.add(Tienda);
        Tienda.setVisible(true);
        contenedor.updateUI();
    }//GEN-LAST:event_btnTiendaActionPerformed

    private void btnMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMascotasActionPerformed
         contenedor.removeAll();
        contenedor.add(Mascotas);
        Mascotas.setVisible(true);
        contenedor.updateUI();
    }//GEN-LAST:event_btnMascotasActionPerformed

    private void btnCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitaActionPerformed
         contenedor.removeAll();
        contenedor.add(Apartar);
        Apartar.setVisible(true);
        contenedor.updateUI();
    }//GEN-LAST:event_btnCitaActionPerformed

    private void botonMod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMod1ActionPerformed
       this.dispose();
       Login LG = new Login();
       LG.setVisible(true);
    }//GEN-LAST:event_botonMod1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UICliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new UICliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Apartar;
    private javax.swing.JLabel Gen3;
    private javax.swing.JPanel Mascotas;
    private javax.swing.JLabel Nombre3;
    private javax.swing.JPanel Tienda;
    private animalhome.metodos.BotonMod botonMod1;
    private animalhome.metodos.BotonMantenerMod btnCita;
    private animalhome.metodos.BotonMantenerMod btnMascotas;
    private animalhome.metodos.BotonMantenerMod btnTienda;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel contenedor;
    private animalhome.metodos.ImagenRescala imagenRescala1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private animalhome.metodos.PanelRG panelRG1;
    // End of variables declaration//GEN-END:variables
}
