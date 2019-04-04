/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HR;

import Business.ApplicationWorkQueue.ApplicantWorkRequest;
import Business.ApplicationWorkQueue.HRWorkRequest;
import Business.ApplicationWorkQueue.WorkRequest;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Jobs.Job;
import Business.NGOPersonDirectory.NGOPerson;
import Business.Network.Network;
import Business.OldAgePersonDirectory.OLDAgeHomePerson;
import Business.Organization.CompanyOrg;
import Business.Organization.NGOOrg;
import Business.Organization.OldAgeHomeOrg;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.VeteransOrg;
import Business.Role.CTORole;
import Business.Role.HRRole;
import Business.Role.NGOManagerRole;
import Business.Role.OldAgeHomeManagerRole;
import Business.Role.Role;
import Business.Role.SupervisorRole;
import Business.Role.VeteransManagerRole;
import Business.UserAccount.UserAccount;
import Business.VeteransPersonDirectory.VeteranPerson;
import Business.VeteransPersonDirectory.VeteransPersonDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tushar
 */
public class UnderPrivilegedWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form UnderPrivilegedWorkAreaPanel
     */
    JPanel userProcessContainer;
    EcoSystem business;
    CompanyOrg organization;
    OrganizationDirectory organizationDirectory;
    UserAccount account;

    UnderPrivilegedWorkAreaPanel(JPanel userProcessContainer, EcoSystem business, CompanyOrg organization, OrganizationDirectory organizationDirectory, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.organization = organization;
        this.account = account;
        this.organizationDirectory = organizationDirectory;
        //populateJobTable();
        populateNGOTable();
        populateOldTable();
        populateVetTable();
        populateSupTable();
        populateHRWorkRequestTable();

    }

    UnderPrivilegedWorkAreaPanel(JPanel userProcessContainer, EcoSystem business, Organization organization, OrganizationDirectory organizationDirectory, UserAccount account) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void populateJobTable() {
        DefaultTableModel model = (DefaultTableModel) tblSUP.getModel();

        model.setRowCount(0);
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (Job job : org.getJobDirectory().getJoblist()) {
                        if (job.getCategory().equals("Underprivileged")) {
                            Object[] row = new Object[2];
                            row[0] = job;
                            row[1] = job.getJobID();
                            model.addRow(row);
                        }
                    }
                }
            }
        }
    }

    public void populateSupTable() {
        DefaultTableModel model = (DefaultTableModel) tblSUP.getModel();

        model.setRowCount(0);
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (org instanceof CompanyOrg) {
                        for (UserAccount useraccount : org.getUserAccountDirectory().getUserAccountList()) {
                            if (useraccount.getRole() instanceof SupervisorRole) {
                                Object[] row = new Object[4];
                                row[0] = useraccount.getRole();
                                row[1] = useraccount;
                                model.addRow(row);
                            }
                        }
                    }
                }
            }
        }
    }

    public void populateNGOTable() {
        DefaultTableModel model = (DefaultTableModel) tblNGO.getModel();

        model.setRowCount(0);
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (WorkRequest work : org.getWorkQueue().getWorkRequestList()) {
                        if (work instanceof ApplicantWorkRequest) {
                            if (((ApplicantWorkRequest) work).getnGOPerson() != null) {
                                Object[] row = new Object[5];
                                row[0] = work;
                                row[1] = ((ApplicantWorkRequest) work).getApplicationID();
                                row[2] = ((ApplicantWorkRequest) work).getJob().getJobPosition();
                                row[3] = ((ApplicantWorkRequest) work).getSendername();
                                model.addRow(row);
                            }
                        }
                    }
                }
            }
        }
    }

    public void populateOldTable() {
        DefaultTableModel model = (DefaultTableModel) tblOld.getModel();

        model.setRowCount(0);
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (WorkRequest work : org.getWorkQueue().getWorkRequestList()) {
                        if (work instanceof ApplicantWorkRequest) {
                            if (((ApplicantWorkRequest) work).getoLDAgeHomePerson() != null) {
                                Object[] row = new Object[5];
                                row[0] = work;
                                row[1] = ((ApplicantWorkRequest) work).getApplicationID();
                                row[2] = ((ApplicantWorkRequest) work).getJob().getJobPosition();
                                row[3] = ((ApplicantWorkRequest) work).getSendername();
                                model.addRow(row);
                            }
                        }
                    }
                }
            }
        }
    }

    public void populateVetTable() {
        DefaultTableModel model = (DefaultTableModel) tblVet.getModel();

        model.setRowCount(0);
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (WorkRequest work : org.getWorkQueue().getWorkRequestList()) {
                        if (work instanceof ApplicantWorkRequest) {
                            if (((ApplicantWorkRequest) work).getVeteranPerson() != null) {
                                Object[] row = new Object[5];
                                row[0] = work;
                                row[1] = ((ApplicantWorkRequest) work).getApplicationID();
                                row[2] = ((ApplicantWorkRequest) work).getJob().getJobPosition();
                                row[3] = ((ApplicantWorkRequest) work).getSendername();
                                model.addRow(row);
                            }
                        }
                    }
                }
            }
        }
    }

    public void populateHRWorkRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblHR.getModel();
        model.setRowCount(0);
        outer:
        for (UserAccount useraccount : organization.getUserAccountDirectory().getUserAccountList()) {
            if (useraccount.getRole() instanceof SupervisorRole) {
                for (WorkRequest work : useraccount.getWorkQueue().getWorkRequestList()) {

                    if (work instanceof HRWorkRequest) {
                        Object[] row = new Object[6];
                        row[0] = work;
                        row[1] = ((HRWorkRequest) work).getJob();
                        row[2] = ((HRWorkRequest) work).getName();
                        row[3] = ((HRWorkRequest) work).getSender();
                        model.addRow(row);

                    }

                }
//              
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSUP = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblHR = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblOld = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblNGO = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblVet = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnDisplay = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSUP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Role", "Supervisor Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSUP);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 224, 152));

        jButton1.setText("Assign to Supervisor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Supervisor for UnderPrivileded ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NGO Applicants");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Veterans Applicants");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HR Work Area for Underprivileged");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 310, -1));

        tblHR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Application Status", "Job Position", "Applicant Name", "Supervisor Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblHR);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 770, 150));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Application Status ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, -1, -1));

        tblOld.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Application Status", "Application ID", "Job Position", "Applicant Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblOld);

        add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 380, 150));

        tblNGO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Application Status", "Application ID", "Job Position", "Applicant Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tblNGO);

        add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 380, 150));

        tblVet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Application Status", "Application ID", "Job Position", "Applicant Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(tblVet);

        add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 380, 150));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("OldAgeHome Applicants");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, -1, -1));

        btnDisplay.setText("Display result to respective Managers");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });
        add(btnDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 230, -1));

        backBtn.setText("<<-Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int seletedVet = tblVet.getSelectedRow();
        int seletedNgo = tblNGO.getSelectedRow();
        int seletedOld = tblOld.getSelectedRow();
        int seletedSup = tblSUP.getSelectedRow();
        Role role = (Role) (SupervisorRole) tblSUP.getValueAt(seletedSup, 0);

        if (seletedNgo >= 0 && seletedSup >= 0) {

            outer:
            for (Network network : business.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        for (UserAccount useraccount : org.getUserAccountDirectory().getUserAccountList()) {
                            if (useraccount.getRole() instanceof SupervisorRole && useraccount.getRole().equals(role)) {

                                HRWorkRequest hRWorkRequest = new HRWorkRequest();
                                hRWorkRequest.setJob(((ApplicantWorkRequest) tblNGO.getValueAt(seletedNgo, 0)).getJob());
                                hRWorkRequest.setStatus("Interview Scheduled");
                                hRWorkRequest.setSender((UserAccount) tblSUP.getValueAt(seletedSup, 1));
                                hRWorkRequest.setApplicationID(((ApplicantWorkRequest) tblNGO.getValueAt(seletedNgo, 0)).getApplicationID());
                                hRWorkRequest.setName(((ApplicantWorkRequest) tblNGO.getValueAt(seletedNgo, 0)).getSendername());
                                org.getWorkQueue().getWorkRequestList().add(hRWorkRequest);
                                useraccount.getWorkQueue().getWorkRequestList().add(hRWorkRequest);
                                business.getWorkQueue().getWorkRequestList().add(hRWorkRequest);
                                System.out.println("tushar");
                                populateHRWorkRequestTable();
                                break outer;
                            }
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(jButton1, "Assigned Succesfully");
        } else if (seletedOld >= 0 && seletedSup >= 0) {

            outer:
            for (Network network : business.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        for (UserAccount useraccount : org.getUserAccountDirectory().getUserAccountList()) {
                            if (useraccount.getRole() instanceof SupervisorRole && useraccount.getRole().equals(role)) {

                                HRWorkRequest hRWorkRequest = new HRWorkRequest();
                                hRWorkRequest.setJob(((ApplicantWorkRequest) tblOld.getValueAt(seletedOld, 0)).getJob());
                                hRWorkRequest.setStatus("Interview Scheduled");
                                hRWorkRequest.setSender((UserAccount) tblSUP.getValueAt(seletedSup, 1));
                                hRWorkRequest.setApplicationID(((ApplicantWorkRequest) tblOld.getValueAt(seletedOld, 0)).getApplicationID());
                                hRWorkRequest.setName(((ApplicantWorkRequest) tblOld.getValueAt(seletedOld, 0)).getSendername());
                                org.getWorkQueue().getWorkRequestList().add(hRWorkRequest);
                                useraccount.getWorkQueue().getWorkRequestList().add(hRWorkRequest);
                                business.getWorkQueue().getWorkRequestList().add(hRWorkRequest);
                                System.out.println("tushar");
                                populateHRWorkRequestTable();
                                break outer;
                            }
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(jButton1, "Assigned Succesfully");
        } else if (seletedVet >= 0 && seletedSup >= 0) {

            outer:
            for (Network network : business.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        for (UserAccount useraccount : org.getUserAccountDirectory().getUserAccountList()) {
                            if (useraccount.getRole() instanceof SupervisorRole && useraccount.getRole().equals(role)) {

                                HRWorkRequest hRWorkRequest = new HRWorkRequest();
                                hRWorkRequest.setJob(((ApplicantWorkRequest) tblVet.getValueAt(seletedVet, 0)).getJob());
                                hRWorkRequest.setStatus("Interview Scheduled");
                                hRWorkRequest.setSender((UserAccount) tblSUP.getValueAt(seletedSup, 1));
                                hRWorkRequest.setApplicationID(((ApplicantWorkRequest) tblVet.getValueAt(seletedVet, 0)).getApplicationID());
                                hRWorkRequest.setName(((ApplicantWorkRequest) tblVet.getValueAt(seletedVet, 0)).getSendername());
                                org.getWorkQueue().getWorkRequestList().add(hRWorkRequest);
                                useraccount.getWorkQueue().getWorkRequestList().add(hRWorkRequest);
                                business.getWorkQueue().getWorkRequestList().add(hRWorkRequest);
                                System.out.println("tushar");
                                populateHRWorkRequestTable();
                                break outer;
                            }
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(jButton1, "Assigned Succesfully");
        }
        else
            JOptionPane.showMessageDialog(jButton1, "Please select proper values");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        int selectedDisplay = tblHR.getSelectedRow();
        if(selectedDisplay>=0)
        {
        HRWorkRequest hrreRequest = (HRWorkRequest) tblHR.getValueAt(selectedDisplay, 0);
        outer:
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (org instanceof NGOOrg || org instanceof OldAgeHomeOrg || org instanceof VeteransOrg) {
                        for (WorkRequest work : org.getWorkQueue().getWorkRequestList()) {
                            if (work instanceof ApplicantWorkRequest && hrreRequest.getName().equals(((ApplicantWorkRequest) work).getSendername())) {
                                if (hrreRequest.getStatus().equals("Rejected")) {
                                    work.setStatus("Better luck next time");
                                    hrreRequest.setStatus("Better luck next time");
                                    for (Network network1 : business.getNetworkList()) {
                                        for (Enterprise enterprise1 : network1.getEnterpriseDirectory().getEnterpriseList()) {
                                            for (Organization org1 : enterprise1.getOrganizationDirectory().getOrganizationList()) {
                                                if (org1 instanceof NGOOrg) {// || org instanceof OldAgeHomeOrg || org instanceof VeteransOrg) {
                                                    for (NGOPerson nGOPerson : ((NGOOrg) org1).getnGOPersonDirectory().getNgoPersonList()) {
                                                        if (nGOPerson.getName().equals(((ApplicantWorkRequest) work).getSendername())) {
                                                            nGOPerson.setHired("unhired");
                                                            
                                                            String host = "smtp.gmail.com";
                                                            String port = "587";
                                                            String mailFrom = "guptatushar1907@gmail.com";
                                                            String password = "wanttobetushar";                                                            
                                                            String mailTo = null;
                                                            for (UserAccount useraccount : org1.getUserAccountDirectory().getUserAccountList()) {
                                                                if (useraccount.getRole() instanceof NGOManagerRole) {
                                                                    mailTo = useraccount.getEmail();
                                                                }
                                                            }                                                            
                                                            String subject = "Hello my friend";                                                            
                                                            String message = "<i>Greetings from HR</i><br>";
                                                            message += "<b>Wish you a nice day!</b><br>";
                                                            //message += "<font color=red>Duke</font>";
                                                            message += "Unfortunately <br>";
                                                            message += nGOPerson.getName();  
                                                            message += " has not been selected from your orgaization for Job Position: <br>";
                                                            message += hrreRequest.getJob();
                                                            HtmlEmailSender mailer = new HtmlEmailSender();

                                                            try {
                                                                mailer.sendHtmlEmail(host, port, mailFrom, password, mailTo,
                                                                        subject, message);
                                                                System.out.println("Email sent.");
                                                            } catch (Exception ex) {
                                                                System.out.println("Failed to sent email.");
                                                                ex.printStackTrace();
                                                            }

                                                        }
                                                    }
                                                } else if (org1 instanceof OldAgeHomeOrg) {// || org instanceof OldAgeHomeOrg || org instanceof VeteransOrg) {
                                                    for (OLDAgeHomePerson oLDAgeHomePerson : ((OldAgeHomeOrg) org1).getOldAgeHomePersonDirectory().getOldAgeHomePersonList()) {
                                                        if (oLDAgeHomePerson.getName().equals(((ApplicantWorkRequest) work).getSendername())) {
                                                            oLDAgeHomePerson.setHired("unhired");
                                                            
                                                            String host = "smtp.gmail.com";
                                                            String port = "587";
                                                            String mailFrom = "guptatushar1907@gmail.com";
                                                            String password = "wanttobetushar";                                                            
                                                            String mailTo = null;
                                                            for(UserAccount useraccount : org1.getUserAccountDirectory().getUserAccountList()){
                                                                if(useraccount.getRole() instanceof OldAgeHomeManagerRole){
                                                                    mailTo = useraccount.getEmail();                                                                         
                                                                }
                                                            }                                                            
                                                            String subject = "Hello my friend";                                                            
                                                            String message = "<i>Greetings from HR</i><br>";
                                                            message += "<b>Wish you a nice day!</b><br>";
                                                            //message += "<font color=red>Duke</font>";
                                                            message += "Unfortunately <br>";
                                                            message += oLDAgeHomePerson.getName();  
                                                            message += " has not been selected from your orgaization for Job Position: <br>";
                                                            message += hrreRequest.getJob();
                                                            HtmlEmailSender mailer = new HtmlEmailSender();

                                                            try {
                                                                mailer.sendHtmlEmail(host, port, mailFrom, password, mailTo,
                                                                        subject, message);
                                                                System.out.println("Email sent.");
                                                            } catch (Exception ex) {
                                                                System.out.println("Failed to sent email.");
                                                                ex.printStackTrace();
                                                            }

                                                        }
                                                    }
                                                } else if (org1 instanceof VeteransOrg) {// || org instanceof OldAgeHomeOrg || org instanceof VeteransOrg) {
                                                    for (VeteranPerson veteranPerson : ((VeteransOrg) org1).getVeteransPersonDirectory().getVeteranPersonList()) {
                                                        if (veteranPerson.getName().equals(((ApplicantWorkRequest) work).getSendername())) {
                                                            veteranPerson.setHired("unhired");
                                                            
                                                            String host = "smtp.gmail.com";
                                                            String port = "587";
                                                            String mailFrom = "guptatushar1907@gmail.com";
                                                            String password = "wanttobetushar";                                                            
                                                            String mailTo = null;
                                                            for(UserAccount useraccount : org1.getUserAccountDirectory().getUserAccountList()){
                                                                if(useraccount.getRole() instanceof VeteransManagerRole){
                                                                    mailTo = useraccount.getEmail();                                                                         
                                                                }
                                                            }                                                            
                                                            String subject = "Hello my friend";                                                            
                                                            String message = "<i>Greetings from HR</i><br>";
                                                            message += "<b>Wish you a nice day!</b><br>";
                                                            //message += "<font color=red>Duke</font>";
                                                            message += "Unfortunately <br>";
                                                            message += veteranPerson.getName();  
                                                            message += " has not been selected from your orgaization for Job Position: <br>";
                                                            message += hrreRequest.getJob();
                                                            HtmlEmailSender mailer = new HtmlEmailSender();

                                                            try {
                                                                mailer.sendHtmlEmail(host, port, mailFrom, password, mailTo,
                                                                        subject, message);
                                                                System.out.println("Email sent.");
                                                            } catch (Exception ex) {
                                                                System.out.println("Failed to sent email.");
                                                                ex.printStackTrace();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    hrreRequest.setStatus("Congratulations");
                                    work.setStatus("Congratulations");
                                    for (Network network1 : business.getNetworkList()) {
                                        for (Enterprise enterprise1 : network1.getEnterpriseDirectory().getEnterpriseList()) {
                                            for (Organization org1 : enterprise1.getOrganizationDirectory().getOrganizationList()) {
                                                if (org1 instanceof NGOOrg) {// || org instanceof OldAgeHomeOrg || org instanceof VeteransOrg) {
                                                    for (NGOPerson nGOPerson : ((NGOOrg) org1).getnGOPersonDirectory().getNgoPersonList()) {
                                                        if (nGOPerson.getName().equals(((ApplicantWorkRequest) work).getSendername())) {
                                                            nGOPerson.setHired("hired");
                                                            
                                                            String host = "smtp.gmail.com";
                                                            String port = "587";
                                                            String mailFrom = "guptatushar1907@gmail.com";
                                                            String password = "wanttobetushar";                                                            
                                                            String mailTo = null;
                                                            for(UserAccount useraccount : org1.getUserAccountDirectory().getUserAccountList()){
                                                                if(useraccount.getRole() instanceof NGOManagerRole){
                                                                    mailTo = useraccount.getEmail();                                                                         
                                                                }
                                                            }                                                            
                                                            String subject = "Hello my friend";                                                            
                                                            String message = "<i>Greetings from HR</i><br>";
                                                            message += "<b>Wish you a nice day!</b><br>";
                                                            //message += "<font color=red>Duke</font>";
                                                            message += nGOPerson.getName();
                                                            message += " has been selected form your organization for Job Position: <br>";
                                                            message += hrreRequest.getJob();
                                                            HtmlEmailSender mailer = new HtmlEmailSender();

                                                            try {
                                                                mailer.sendHtmlEmail(host, port, mailFrom, password, mailTo,
                                                                        subject, message);
                                                                System.out.println("Email sent.");
                                                            } catch (Exception ex) {
                                                                System.out.println("Failed to sent email.");
                                                                ex.printStackTrace();
                                                            }
                                                            
                                                            
                                                        }
                                                    }
                                                } else if (org1 instanceof OldAgeHomeOrg) {// || org instanceof OldAgeHomeOrg || org instanceof VeteransOrg) {
                                                    for (OLDAgeHomePerson oLDAgeHomePerson : ((OldAgeHomeOrg) org1).getOldAgeHomePersonDirectory().getOldAgeHomePersonList()) {
                                                        if (oLDAgeHomePerson.getName().equals(((ApplicantWorkRequest) work).getSendername())) {
                                                            oLDAgeHomePerson.setHired("hired");
                                                            
                                                            String host = "smtp.gmail.com";
                                                            String port = "587";
                                                            String mailFrom = "guptatushar1907@gmail.com";
                                                            String password = "wanttobetushar";                                                            
                                                            String mailTo = null;
                                                            for(UserAccount useraccount : org1.getUserAccountDirectory().getUserAccountList()){
                                                                if(useraccount.getRole() instanceof OldAgeHomeManagerRole){
                                                                    mailTo = useraccount.getEmail();                                                                         
                                                                }
                                                            }                                                            
                                                            String subject = "Hello my friend";                                                            
                                                            String message = "<i>Greetings from HR</i><br>";
                                                            message += "<b>Wish you a nice day!</b><br>";
                                                            //message += "<font color=red>Duke</font>";
                                                            message += oLDAgeHomePerson.getName();
                                                            message += " has been selected form your organization for Job Position: <br>";
                                                            message += hrreRequest.getJob();
                                                            HtmlEmailSender mailer = new HtmlEmailSender();

                                                            try {
                                                                mailer.sendHtmlEmail(host, port, mailFrom, password, mailTo,
                                                                        subject, message);
                                                                System.out.println("Email sent.");
                                                            } catch (Exception ex) {
                                                                System.out.println("Failed to sent email.");
                                                                ex.printStackTrace();
                                                            }

                                                        }
                                                    }
                                                } else if (org1 instanceof VeteransOrg) {// || org instanceof OldAgeHomeOrg || org instanceof VeteransOrg) {
                                                    for (VeteranPerson veteranPerson : ((VeteransOrg) org1).getVeteransPersonDirectory().getVeteranPersonList()) {
                                                        if (veteranPerson.getName().equals(((ApplicantWorkRequest) work).getSendername())) {
                                                            veteranPerson.setHired("hired");
                                                            
                                                            String host = "smtp.gmail.com";
                                                            String port = "587";
                                                            String mailFrom = "guptatushar1907@gmail.com";
                                                            String password = "wanttobetushar";                                                            
                                                            String mailTo = null;
                                                            for(UserAccount useraccount : org1.getUserAccountDirectory().getUserAccountList()){
                                                                if(useraccount.getRole() instanceof VeteransManagerRole){
                                                                    mailTo = useraccount.getEmail();                                                                         
                                                                }
                                                            }                                                            
                                                            String subject = "Hello my friend";                                                            
                                                            String message = "<i>Greetings from HR</i><br>";
                                                            message += "<b>Wish you a nice day!</b><br>";
                                                            //message += "<font color=red>Duke</font>";
                                                            message += veteranPerson.getName();
                                                            message += " has been selected form your organization for Job Position: <br>";
                                                            message += hrreRequest.getJob();
                                                            HtmlEmailSender mailer = new HtmlEmailSender();

                                                            try {
                                                                mailer.sendHtmlEmail(host, port, mailFrom, password, mailTo,
                                                                        subject, message);
                                                                System.out.println("Email sent.");
                                                            } catch (Exception ex) {
                                                                System.out.println("Failed to sent email.");
                                                                ex.printStackTrace();
                                                            }
                                                            
                                                            
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                break outer;
                            }
                        }
                    }
                }
            }
        }

        populateNGOTable();

        populateOldTable();

        populateVetTable();

        populateHRWorkRequestTable();
        JOptionPane.showMessageDialog(btnDisplay, "Sent succesfully to Respective Manager");
        }
        else
           JOptionPane.showMessageDialog(btnDisplay, "Please select a row from the table supervisor and NgoApplicant/OldAgehome Applicant/Veterans Applicant"); 
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable tblHR;
    private javax.swing.JTable tblNGO;
    private javax.swing.JTable tblOld;
    private javax.swing.JTable tblSUP;
    private javax.swing.JTable tblVet;
    // End of variables declaration//GEN-END:variables
}
