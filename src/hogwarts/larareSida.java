/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwarts;

import forms.listaElev;
import forms.nyRegisterElev;

/**
 *
 * @author Firas & Joel
 */
public class larareSida extends javax.swing.JFrame {

    /**
     * Creates new form teacherSida
     */
    public larareSida() {
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

        teacherSida = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        combobox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        forNamn = new javax.swing.JTextField();
        fornamn = new javax.swing.JLabel();
        efternamn = new javax.swing.JLabel();
        Bytta = new javax.swing.JButton();
        elevid = new javax.swing.JLabel();
        efterNamn = new javax.swing.JTextField();
        elevID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 153));
        setMinimumSize(new java.awt.Dimension(1042, 736));
        setResizable(false);
        getContentPane().setLayout(null);

        teacherSida.setBackground(new java.awt.Color(0, 102, 153));
        teacherSida.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        teacherSida.setMaximumSize(new java.awt.Dimension(1067, 736));
        teacherSida.setMinimumSize(new java.awt.Dimension(1067, 736));
        teacherSida.setPreferredSize(new java.awt.Dimension(1067, 736));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton7.setText("Tillbaka");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        combobox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        combobox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nyregistrera elever", "ändra all information om enskild elev", "registrera huspoäng", "dra av huspoäng", "registrera kursbetyg för enskilda elever", "ändra kursbetyg för enskilda elever" }));
        combobox2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combobox2PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        combobox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Lärare sida");

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0), 3), "Bytta lösenord", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(153, 51, 0))); // NOI18N

        forNamn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        fornamn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        fornamn.setText("Ny lösenord:");

        efternamn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        efternamn.setText("Bekräfta lösenord:");

        Bytta.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Bytta.setText("Bytta");
        Bytta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ByttaActionPerformed(evt);
            }
        });

        elevid.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        elevid.setText("Gammal lösenord:");

        efterNamn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        elevID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bytta)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(efternamn)
                            .addComponent(fornamn)
                            .addComponent(elevid))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(forNamn)
                            .addComponent(efterNamn)
                            .addComponent(elevID, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elevID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elevid))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fornamn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(efterNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(efternamn))
                .addGap(34, 34, 34)
                .addComponent(Bytta)
                .addContainerGap())
        );

        javax.swing.GroupLayout teacherSidaLayout = new javax.swing.GroupLayout(teacherSida);
        teacherSida.setLayout(teacherSidaLayout);
        teacherSidaLayout.setHorizontalGroup(
            teacherSidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherSidaLayout.createSequentialGroup()
                .addContainerGap(852, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(107, 107, 107))
            .addGroup(teacherSidaLayout.createSequentialGroup()
                .addGroup(teacherSidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(teacherSidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(teacherSidaLayout.createSequentialGroup()
                            .addGap(376, 376, 376)
                            .addComponent(jLabel1))
                        .addGroup(teacherSidaLayout.createSequentialGroup()
                            .addGap(264, 264, 264)
                            .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        teacherSidaLayout.setVerticalGroup(
            teacherSidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherSidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(140, 140, 140)
                .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jButton7)
                .addGap(91, 91, 91))
        );

        getContentPane().add(teacherSida);
        teacherSida.setBounds(0, 0, 1060, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        new StartSida().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void combobox2PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combobox2PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        selectCombo2();
    }//GEN-LAST:event_combobox2PopupMenuWillBecomeInvisible

    private void combobox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox2ActionPerformed

    private void ByttaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ByttaActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_ByttaActionPerformed

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
            java.util.logging.Logger.getLogger(larareSida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(larareSida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(larareSida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(larareSida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new larareSida().setVisible(true);
            }
        });
    }

    
        public void selectCombo2(){
    int nr = combobox2.getSelectedIndex();
    if(nr==0){
        nyRegisterElev nre= new nyRegisterElev();
          nre.setVisible(true);
    }if(nr==1){
        listaElev ls= new listaElev();
        ls.setVisible(true); 
    }
    
    
    } 
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bytta;
    private javax.swing.JComboBox<String> combobox2;
    private javax.swing.JTextField efterNamn;
    private javax.swing.JLabel efternamn;
    private javax.swing.JTextField elevID;
    private javax.swing.JLabel elevid;
    private javax.swing.JTextField forNamn;
    private javax.swing.JLabel fornamn;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel teacherSida;
    // End of variables declaration//GEN-END:variables
}
