/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.*;


/**
 *
 * @author JuanJo
 */
public class frmMenuPrincipal extends javax.swing.JFrame {
    
    /**
     * Creates new form MenuPrincipal
     */
    public frmMenuPrincipal() {
        super("Asaf ");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCPanel1 = new com.bolivia.panel.JCPanel();
        jLabel3 = new javax.swing.JLabel();
        jCPanel2 = new com.bolivia.panel.JCPanel();
        jCPanel3 = new com.bolivia.panel.JCPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCPanel4 = new com.bolivia.panel.JCPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCPanel5 = new com.bolivia.panel.JCPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCPanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/Azules.jpeg"))); // NOI18N
        jCPanel1.setIconLogo(null);
        jCPanel1.setVisibleLogo(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ASAF - Ver. 2.0.0");

        javax.swing.GroupLayout jCPanel1Layout = new javax.swing.GroupLayout(jCPanel1);
        jCPanel1.setLayout(jCPanel1Layout);
        jCPanel1Layout.setHorizontalGroup(
            jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addContainerGap())
        );
        jCPanel1Layout.setVerticalGroup(
            jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jCPanel2.setToolTipText("");
        jCPanel2.setBiColor_Orientation(com.bolivia.panel.BICOLOR_ORIENTATION.VERTICAL);
        jCPanel2.setDegradedOrientation(com.bolivia.panel.DEGRADED_ORIENTATION.VERTICAL);
        jCPanel2.setDegraded_percent(0.6F);
        jCPanel2.setFocusable(false);
        jCPanel2.setName(""); // NOI18N
        jCPanel2.setSecondColor(new java.awt.Color(0, 0, 153));
        jCPanel2.setUseMode(com.bolivia.panel.USEMODE.DEGRADED);
        jCPanel2.setVisibleLogo(false);

        jCPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jCPanel3.setdarker(false);
        jCPanel3.setDegradedOrientation(com.bolivia.panel.DEGRADED_ORIENTATION.VERTICAL);
        jCPanel3.setDegraded_percent(0.9F);
        jCPanel3.setFirstColor(new java.awt.Color(255, 255, 255));
        jCPanel3.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/gnome_panel_workspace_switcher.png"))); // NOI18N
        jCPanel3.setLocationLogo(new java.awt.Point(69, 12));
        jCPanel3.setSecondColor(new java.awt.Color(204, 204, 255));
        jCPanel3.setUseMode(com.bolivia.panel.USEMODE.DEGRADED);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("MANTENIMIENTO Y SISTEMA");

        jLabel2.setText("Ingreso y  Mantenimiento de Usuarios");

        jLabel5.setText("Copia de Seguridad");

        javax.swing.GroupLayout jCPanel3Layout = new javax.swing.GroupLayout(jCPanel3);
        jCPanel3.setLayout(jCPanel3Layout);
        jCPanel3Layout.setHorizontalGroup(
            jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCPanel3Layout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addGroup(jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jCPanel3Layout.setVerticalGroup(
            jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jCPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jCPanel4.setdarker(false);
        jCPanel4.setDegradedOrientation(com.bolivia.panel.DEGRADED_ORIENTATION.VERTICAL);
        jCPanel4.setDegraded_percent(0.9F);
        jCPanel4.setFirstColor(new java.awt.Color(255, 255, 255));
        jCPanel4.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/kde_folder.png"))); // NOI18N
        jCPanel4.setLocationLogo(new java.awt.Point(69, 12));
        jCPanel4.setSecondColor(new java.awt.Color(204, 204, 255));
        jCPanel4.setUseMode(com.bolivia.panel.USEMODE.DEGRADED);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("MANTENIMIENTO Y SISTEMA");

        jLabel6.setText("Ingreso y  Mantenimiento de Usuarios");

        jLabel7.setText("Copia de Seguridad");

        javax.swing.GroupLayout jCPanel4Layout = new javax.swing.GroupLayout(jCPanel4);
        jCPanel4.setLayout(jCPanel4Layout);
        jCPanel4Layout.setHorizontalGroup(
            jCPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCPanel4Layout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addGroup(jCPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jCPanel4Layout.setVerticalGroup(
            jCPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jCPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jCPanel5.setdarker(false);
        jCPanel5.setDegradedOrientation(com.bolivia.panel.DEGRADED_ORIENTATION.VERTICAL);
        jCPanel5.setDegraded_percent(0.9F);
        jCPanel5.setFirstColor(new java.awt.Color(255, 255, 255));
        jCPanel5.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/lock.png"))); // NOI18N
        jCPanel5.setLocationLogo(new java.awt.Point(69, 12));
        jCPanel5.setSecondColor(new java.awt.Color(204, 204, 255));
        jCPanel5.setUseMode(com.bolivia.panel.USEMODE.DEGRADED);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 51));
        jLabel8.setText("MANTENIMIENTO Y SISTEMA");

        jLabel9.setText("Ingreso y  Mantenimiento de Usuarios");

        jLabel10.setText("Copia de Seguridad");

        javax.swing.GroupLayout jCPanel5Layout = new javax.swing.GroupLayout(jCPanel5);
        jCPanel5.setLayout(jCPanel5Layout);
        jCPanel5Layout.setHorizontalGroup(
            jCPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCPanel5Layout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addGroup(jCPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jCPanel5Layout.setVerticalGroup(
            jCPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jCPanel2Layout = new javax.swing.GroupLayout(jCPanel2);
        jCPanel2.setLayout(jCPanel2Layout);
        jCPanel2Layout.setHorizontalGroup(
            jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                    .addComponent(jCPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                    .addComponent(jCPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jCPanel2Layout.setVerticalGroup(
            jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jMenu3.setText("Archivo");
        jMenu3.setIconTextGap(5);

        jMenuItem1.setText("Empresa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Ayuda");

        jMenuItem3.setText("Acerca de");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                    .addComponent(jCPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Programa:\n"+
                                                                     "        Sistema Para la Empresa: ", "Acerca de", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmge_empresa vista = new frmge_empresa();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.bolivia.panel.JCPanel jCPanel1;
    private com.bolivia.panel.JCPanel jCPanel2;
    private com.bolivia.panel.JCPanel jCPanel3;
    private com.bolivia.panel.JCPanel jCPanel4;
    private com.bolivia.panel.JCPanel jCPanel5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
