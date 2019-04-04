package Business;


import Business.Applicant.ApplicantDirectory;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.ApplicantRole;
import Business.Role.CTORole;
import Business.Role.CompanyManagerRole;
import Business.Role.EnterpriseAdminRole;
import Business.Role.HRRole;
import Business.Role.NGOManagerRole;
import Business.Role.OldAgeHomeManagerRole;
import Business.Role.Role;
import Business.Role.SupervisorRole;
import Business.Role.SystemAdminRole;
import Business.Role.VeteransManagerRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Tushar
 */
public class EcoSystem extends Organization{
    public static EcoSystem business;
    private ArrayList<Network> networkList;
    
    
    
    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        //applicantDirectory = new ApplicantDirectory();
        
        
    }

//    public ApplicantDirectory getApplicantDirectory() {
//        return applicantDirectory;
//    }
//
//    public void setApplicantDirectory(ApplicantDirectory applicantDirectory) {
//        this.applicantDirectory = applicantDirectory;
//    }

    

    

    public static EcoSystem getBusiness() {
        return business;
    }
    
    public static void setInstance(EcoSystem business) {
        business=business;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
       
     public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
     
    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new SystemAdminRole());
        roles.add(new CTORole());
        roles.add(new EnterpriseAdminRole());
        roles.add(new HRRole());
        roles.add(new NGOManagerRole());
        roles.add(new OldAgeHomeManagerRole());
        roles.add(new SupervisorRole());
        roles.add(new VeteransManagerRole());
        roles.add(new ApplicantRole());
        roles.add(new CompanyManagerRole());
        return roles;
    }
    
    public static boolean checkIfUsernameIsUnique(String username) {

      //  if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
             for (Network network : business.getNetworkList()) {
                 
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                        if(ua.getUsername().equals(username)){
                            return false;
                        }
                    }
                    
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                                 if(ua.getUsername().equals(username)){
                            return false;
                        }
                    }
                            }
                        }
                    }
            
      //  }

       

        return true;
    }
}
    
