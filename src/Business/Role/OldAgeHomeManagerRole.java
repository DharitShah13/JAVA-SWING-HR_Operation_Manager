/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.OldAgeHomeOrg;
import Business.Organization.Organization;
import Business.Organization.VeteransOrg;
import Business.UserAccount.UserAccount;
//import UserInterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.OldAgeHomeManager.OldAgeHomeWorkAreaPanel;
//import userinterface.Hospital.HospitalAdminWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class OldAgeHomeManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new OldAgeHomeWorkAreaPanel(userProcessContainer,account,business,(OldAgeHomeOrg)organization,enterprise.getOrganizationDirectory());
// return new HospitalAdminWorkAreaJPanel(userProcessContainer, enterprise);
    }

    
    
}
