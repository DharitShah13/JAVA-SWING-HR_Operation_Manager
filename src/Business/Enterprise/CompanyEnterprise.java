/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

//import Business.Role.HRRole;
import Business.Role.EnterpriseAdminRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author tushar
 */
public class CompanyEnterprise extends Enterprise{
      public CompanyEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Company);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new EnterpriseAdminRole());
        return roles;
    }
}
