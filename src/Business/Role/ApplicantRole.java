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
import userinterface.Applicant.ApplicantRoleWorkAreaPanel;

/**
 *
 * @author Tushar
 */
public class ApplicantRole extends Role {

    public ApplicantRole() {
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ApplicantRoleWorkAreaPanel(userProcessContainer, business, account, (CompanyOrg) organization);

    }
}
