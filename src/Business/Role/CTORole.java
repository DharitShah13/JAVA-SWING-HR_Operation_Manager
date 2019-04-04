/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CompanyOrg;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CTO.CTOWorkAreaPanel;

/**
 *
 * @author Tushar
 */
public class CTORole extends Role {

    public CTORole() {
    }   

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CTOWorkAreaPanel(userProcessContainer,business,enterprise,(CompanyOrg) organization,account,enterprise.getOrganizationDirectory());
    }
    }
