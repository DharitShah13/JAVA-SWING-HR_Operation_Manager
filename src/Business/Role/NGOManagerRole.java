/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.NGOOrg;
import Business.Organization.OldAgeHomeOrg;
import Business.Organization.Organization;
import Business.Organization.VeteransOrg;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.NGOManager.NGOWorkAreaPanel;
//import userinterface.Hospital.Clinic.Pharmacy.DoctorJPanel;

/**
 *
 * @author raunak
 */
public class NGOManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
    return new NGOWorkAreaPanel(userProcessContainer,account,business,(NGOOrg)organization,enterprise.getOrganizationDirectory());   
    //return new DoctorJPanel(userProcessContainer);
    }
    
    
}
