/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.OldAgePersonDirectory.OldAgeHomePersonDirectory;
import Business.Role.NGOManagerRole;
import Business.Role.OldAgeHomeManagerRole;
import Business.Role.VeteransManagerRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author tushar
 */
public class OldAgeHomeOrg extends Organization{
    
    public OldAgeHomePersonDirectory oldAgeHomePersonDirectory;
    
    public OldAgeHomeOrg() {
       
        super(Organization.Type.OldAgeHomeOrg.getValue());
        this.oldAgeHomePersonDirectory=new OldAgeHomePersonDirectory();
    }

    
    
    @Override
    public HashSet<Role> getSupportedRole() {     
        
        roles.add(new OldAgeHomeManagerRole());
        return roles;
    }

    public OldAgeHomePersonDirectory getOldAgeHomePersonDirectory() {
        return oldAgeHomePersonDirectory;
    }

    public void setOldAgeHomePersonDirectory(OldAgeHomePersonDirectory oldAgeHomePersonDirectory) {
        this.oldAgeHomePersonDirectory = oldAgeHomePersonDirectory;
    }
     
}