/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

//import Business.Role.DistributorAdminRole;
import Business.NGOPersonDirectory.NGOPersonDirectory;
import Business.Role.NGOManagerRole;
import Business.Role.Role;

import java.util.HashSet;

/**
 *
 * @author tushar
 */
public class NGOOrg extends Organization {

    public NGOPersonDirectory nGOPersonDirectory;

    public NGOOrg() {
        super(Organization.Type.NGOOrg.getValue());
        this.nGOPersonDirectory= new NGOPersonDirectory();
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new NGOManagerRole());
        return roles;
    }

    public NGOPersonDirectory getnGOPersonDirectory() {
        return nGOPersonDirectory;
    }

    public void setnGOPersonDirectory(NGOPersonDirectory nGOPersonDirectory) {
        this.nGOPersonDirectory = nGOPersonDirectory;
    }

}
