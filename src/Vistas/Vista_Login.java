/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

//import com.placeholder.PlaceHolder;

import Librerias.TextPrompt;
import javax.swing.ImageIcon;

/**
 *
 * @author I'm Max
 */
public class Vista_Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Vista_Login() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../img/sena4.png")).getImage());
        setLocationRelativeTo(null);
        
        //PlaceHolder holder;
        TextPrompt holder;
        holder= new TextPrompt("Escriba su usuario aquí", txtUSER);
        holder= new TextPrompt("Escriba su contraseña aquí", txtPASS);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelLogo = new javax.swing.JPanel();
        PanelCentralLogo = new javax.swing.JPanel();
        LBL_LOGO = new javax.swing.JLabel();
        PanelFormulario = new javax.swing.JPanel();
        LBL_SUR = new javax.swing.JLabel();
        PanelNorte = new javax.swing.JPanel();
        PanelWest = new javax.swing.JPanel();
        PanelEast = new javax.swing.JPanel();
        PanelCentral = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUSER = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPASS = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cboPRIVILEGIO = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnINGRESAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio Sesión - Clinisoft V1.0");
        setBackground(new java.awt.Color(255, 255, 255));

        PanelLogo.setBackground(new java.awt.Color(102, 102, 102));
        PanelLogo.setLayout(new java.awt.BorderLayout());

        PanelCentralLogo.setBackground(new java.awt.Color(255, 255, 255));

        LBL_LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/LogoClinisoft33.png"))); // NOI18N
        PanelCentralLogo.add(LBL_LOGO);

        PanelLogo.add(PanelCentralLogo, java.awt.BorderLayout.CENTER);

        getContentPane().add(PanelLogo, java.awt.BorderLayout.NORTH);

        PanelFormulario.setBackground(new java.awt.Color(255, 255, 255));
        PanelFormulario.setPreferredSize(new java.awt.Dimension(330, 291));
        PanelFormulario.setLayout(new java.awt.BorderLayout());

        LBL_SUR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_SUR.setText("\nTodos los derechos reservador por Copyright  © 2019");
        LBL_SUR.setPreferredSize(new java.awt.Dimension(303, 50));
        PanelFormulario.add(LBL_SUR, java.awt.BorderLayout.SOUTH);

        PanelNorte.setBackground(new java.awt.Color(255, 255, 255));
        PanelNorte.setPreferredSize(new java.awt.Dimension(503, 1));

        javax.swing.GroupLayout PanelNorteLayout = new javax.swing.GroupLayout(PanelNorte);
        PanelNorte.setLayout(PanelNorteLayout);
        PanelNorteLayout.setHorizontalGroup(
            PanelNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        PanelNorteLayout.setVerticalGroup(
            PanelNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        PanelFormulario.add(PanelNorte, java.awt.BorderLayout.NORTH);

        PanelWest.setBackground(new java.awt.Color(255, 255, 255));
        PanelWest.setPreferredSize(new java.awt.Dimension(30, 0));

        javax.swing.GroupLayout PanelWestLayout = new javax.swing.GroupLayout(PanelWest);
        PanelWest.setLayout(PanelWestLayout);
        PanelWestLayout.setHorizontalGroup(
            PanelWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        PanelWestLayout.setVerticalGroup(
            PanelWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PanelFormulario.add(PanelWest, java.awt.BorderLayout.WEST);

        PanelEast.setBackground(new java.awt.Color(255, 255, 255));
        PanelEast.setPreferredSize(new java.awt.Dimension(30, 0));

        javax.swing.GroupLayout PanelEastLayout = new javax.swing.GroupLayout(PanelEast);
        PanelEast.setLayout(PanelEastLayout);
        PanelEastLayout.setHorizontalGroup(
            PanelEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        PanelEastLayout.setVerticalGroup(
            PanelEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PanelFormulario.add(PanelEast, java.awt.BorderLayout.EAST);

        PanelCentral.setBackground(new java.awt.Color(255, 255, 255));
        PanelCentral.setLayout(new java.awt.GridLayout(4, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("  Usuario");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setPreferredSize(new java.awt.Dimension(59, 30));
        jPanel1.add(jLabel1, java.awt.BorderLayout.NORTH);

        txtUSER.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtUSER.setPreferredSize(new java.awt.Dimension(14, 50));
        jPanel1.add(txtUSER, java.awt.BorderLayout.CENTER);

        PanelCentral.add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("  Contraseña");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel2.setPreferredSize(new java.awt.Dimension(83, 30));
        jPanel2.add(jLabel2, java.awt.BorderLayout.NORTH);

        txtPASS.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txtPASS.setPreferredSize(new java.awt.Dimension(14, 50));
        jPanel2.add(txtPASS, java.awt.BorderLayout.CENTER);

        PanelCentral.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("  Rol");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(29, 30));
        jPanel3.add(jLabel3, java.awt.BorderLayout.NORTH);

        cboPRIVILEGIO.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        cboPRIVILEGIO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paciente", "Medico", "Administrador" }));
        jPanel3.add(cboPRIVILEGIO, java.awt.BorderLayout.CENTER);

        PanelCentral.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(270, 15));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, java.awt.BorderLayout.NORTH);

        btnINGRESAR.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnINGRESAR.setText("Ingesar");
        jPanel4.add(btnINGRESAR, java.awt.BorderLayout.CENTER);

        PanelCentral.add(jPanel4);

        PanelFormulario.add(PanelCentral, java.awt.BorderLayout.CENTER);

        getContentPane().add(PanelFormulario, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Vista_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBL_LOGO;
    private javax.swing.JLabel LBL_SUR;
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JPanel PanelCentralLogo;
    private javax.swing.JPanel PanelEast;
    private javax.swing.JPanel PanelFormulario;
    private javax.swing.JPanel PanelLogo;
    private javax.swing.JPanel PanelNorte;
    private javax.swing.JPanel PanelWest;
    public javax.swing.JButton btnINGRESAR;
    public javax.swing.JComboBox<String> cboPRIVILEGIO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JPasswordField txtPASS;
    public javax.swing.JTextField txtUSER;
    // End of variables declaration//GEN-END:variables
}
