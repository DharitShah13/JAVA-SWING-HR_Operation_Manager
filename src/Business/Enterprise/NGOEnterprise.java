/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;
import Business.Role.EnterpriseAdminRole;
import Business.Role.HRRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Tushar
 */
public class NGOEnterprise extends Enterprise{
      public NGOEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.NGO);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new EnterpriseAdminRole());
        return roles;
    }
}
