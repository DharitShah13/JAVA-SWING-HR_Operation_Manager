/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

//import Business.Clinic.Pharmacy;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.OldAgeHomeOrg;
import Business.Organization.Organization;
import Business.Organization.VeteransOrg;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.VeteransManager.VeteransManagerWorkAreaPanel;
//import userinterface.Hospital.Clinic.ClinicAdminWorkAreaJPanel;
//import userinterface.Hospital.Clinic.Pharmacy.PharmacyAdminWorkAreaJPanel;

/**
 *
 * @author pooji
 */
public class VeteransManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new VeteransManagerWorkAreaPanel(userProcessContainer,account,business,(VeteransOrg)organization,enterprise.getOrganizationDirectory());
//return new PharmacyAdminWorkAreaJPanel(userProcessContainer,  account, (OldAgeHomeOrg) organization,  enterprise,  business);
    }
    
}
