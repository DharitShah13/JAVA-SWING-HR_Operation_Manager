/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

//import Business.Role.DistributorAdminRole;
import Business.Role.Role;
import Business.Role.VeteransManagerRole;
import Business.VeteransPersonDirectory.VeteranPerson;
import Business.VeteransPersonDirectory.VeteransPersonDirectory;
//import Business.Supplier.Provider;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author tushar
 */
public class VeteransOrg extends Organization {

    public VeteransPersonDirectory veteransPersonDirectory;

    public VeteransOrg() {
        super(Organization.Type.VeteransOrg.getValue());
        this.veteransPersonDirectory = new VeteransPersonDirectory();
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new VeteransManagerRole());
        return roles;
    }

    public VeteransPersonDirectory getVeteransPersonDirectory() {
        return veteransPersonDirectory;
    }

    public void setVeteransPersonDirectory(VeteransPersonDirectory veteransPersonDirectory) {
        this.veteransPersonDirectory = veteransPersonDirectory;
    }
    
}
