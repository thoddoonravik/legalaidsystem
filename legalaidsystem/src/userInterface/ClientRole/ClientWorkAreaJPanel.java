/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ClientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ClientOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author kranthikumar
 */
public class ClientWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private ClientOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private Network network;
//    private UserAccount sender;
//    private UserAccount receiver;
    /**
     * Creates new form ClientWorkAreaJPanel
     */
    public ClientWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, ClientOrganization organization, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.system = system;
        this.network = network;
//        this.sender = sender;
//        this.receiver = receiver;
        if(userAccount.getApplication() != null) {
            if(userAccount.getApplication().getLawyer() != null) {
                communicateLawyerBtn.setEnabled(true);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewProblemJButton = new javax.swing.JButton();
        askJButton = new javax.swing.JButton();
        selfHelpJButton = new javax.swing.JButton();
        rsvJButton = new javax.swing.JButton();
        applyButton = new javax.swing.JButton();
        communicateLawyerBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        viewProblemJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewProblemJButton.setText("My Problems");
        viewProblemJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProblemJButtonActionPerformed(evt);
            }
        });

        askJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        askJButton.setText("Ask Problems");
        askJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                askJButtonActionPerformed(evt);
            }
        });

        selfHelpJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        selfHelpJButton.setText("Self Help");
        selfHelpJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selfHelpJButtonActionPerformed(evt);
            }
        });

        rsvJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rsvJButton.setText("My Reservations");
        rsvJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsvJButtonActionPerformed(evt);
            }
        });

        applyButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        applyButton.setText("Apply for NPO");
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

        communicateLawyerBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        communicateLawyerBtn.setText("Communicate with NPO Lawyer");
        communicateLawyerBtn.setEnabled(false);
        communicateLawyerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communicateLawyerBtnActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Stencil", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 204));
        jLabel11.setText("client dashboard");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(askJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewProblemJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rsvJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(communicateLawyerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selfHelpJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(applyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(askJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(viewProblemJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(rsvJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(selfHelpJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(applyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(communicateLawyerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewProblemJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProblemJButtonActionPerformed
        // TODO add your handling code here:
        ManageProblemJPanel mpjp = new ManageProblemJPanel(userProcessContainer, userAccount);
        userProcessContainer.add("ManageProblemJPanel", mpjp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewProblemJButtonActionPerformed

    private void askJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_askJButtonActionPerformed

        RetrieveLawyerJPanel rljp = new RetrieveLawyerJPanel(userProcessContainer, userAccount, system);
        userProcessContainer.add("RetrieveLawyerJPanel", rljp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_askJButtonActionPerformed

    private void selfHelpJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selfHelpJButtonActionPerformed
        // TODO add your handling code here:
        
        SearchQuestionJPanel sqjp = new SearchQuestionJPanel(userProcessContainer, userAccount);
        userProcessContainer.add("SearchQuestionJPanel", sqjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_selfHelpJButtonActionPerformed

    private void rsvJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsvJButtonActionPerformed
        // TODO add your handling code here:
        ManageReservationJPanel mrjp = new ManageReservationJPanel(userProcessContainer, userAccount);
        userProcessContainer.add("ManageReservationJPanel", mrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_rsvJButtonActionPerformed

    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed
        // TODO add your handling code here:

        ApplyForNPOJPanel afpb =new ApplyForNPOJPanel (userProcessContainer,userAccount,enterprise,organization,network,system);
        userProcessContainer.add("ApplyForProBonoJPanel", afpb);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_applyButtonActionPerformed

    private void communicateLawyerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communicateLawyerBtnActionPerformed
        // TODO add your handling code here:
        if(userAccount.getApplication().getStatus().equals("Application Approved")){
            communicateLawyerBtn.setEnabled(true);
            CommunicateWithNPOLawyer cwnpol = new CommunicateWithNPOLawyer (userProcessContainer, userAccount, enterprise, network, system);
            userProcessContainer.add("CommunicateWithNPOLawyer", cwnpol);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else {
            communicateLawyerBtn.setEnabled(false);
        }
    }//GEN-LAST:event_communicateLawyerBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyButton;
    private javax.swing.JButton askJButton;
    private javax.swing.JButton communicateLawyerBtn;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton rsvJButton;
    private javax.swing.JButton selfHelpJButton;
    private javax.swing.JButton viewProblemJButton;
    // End of variables declaration//GEN-END:variables
}
