/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CompanyOrg;
import Business.Organization.OldAgeHomeOrg;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.CompanyOrg;
import Business.Organization.VeteransOrg;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
//import userinterface.CDC.CDCCatalogJPanel;
import userinterface.HR.HRWorkAreaPanel;

/**
 *
 * @author tushar
 */
public class HRRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
    return new HRWorkAreaPanel(userProcessContainer,account,business, (CompanyOrg)organization ,enterprise.getOrganizationDirectory());

    }
    
}
