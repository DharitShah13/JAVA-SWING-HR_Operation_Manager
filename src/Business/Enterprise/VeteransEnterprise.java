/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

//import Business.Role.ClinicAdminRole;
import Business.Role.EnterpriseAdminRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author tushar
 */
public class VeteransEnterprise extends Enterprise{

    public VeteransEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Veterans);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new EnterpriseAdminRole());
        return roles;
    }
    
    
    
}
