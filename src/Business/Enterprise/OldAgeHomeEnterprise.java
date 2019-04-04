/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.EnterpriseAdminRole;
//import Business.Role.ProviderRole;
import Business.Role.Role;
//import Business.Role.SupplierRole;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author tushar
 */
public class OldAgeHomeEnterprise extends Enterprise{
    
      public OldAgeHomeEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.OldAgeHome);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new EnterpriseAdminRole());
        
        return roles;
    }
}
