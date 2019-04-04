/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Applicant.Applicant;
import Business.Jobs.Job;
import Business.Jobs.JobDirectory;
import Business.Role.CTORole;
import Business.Role.CompanyManagerRole;
//import Business.Role.CompanyAdminRole;
import Business.Role.HRRole;
import Business.Role.OldAgeHomeManagerRole;
import Business.Role.Role;
import Business.Role.SupervisorRole;
import java.util.HashSet;

/**
 *
 * @author tushar
 */
public class CompanyOrg extends Organization {

    Applicant a;
    Job j;

    public CompanyOrg() {
        super(Type.CompanyOrg.getValue());
        a = new Applicant();
        j = new Job();
    }

    public Applicant getA() {
        return a;
    }
    
    public void setA(Applicant a) {
        this.a = a;
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new CompanyManagerRole());
        roles.add(new CTORole());
        roles.add(new HRRole());
        roles.add(new SupervisorRole());
        return roles;
        //return null;
    }    
}
