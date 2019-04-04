/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

//import Business.Enterprise.CDCEnterprise;
import Business.Jobs.JobDirectory;
import Business.Organization.Organization.Type;
//import Business.Supplier.Provider;
//import Business.Supplier.Supplier;
import java.util.ArrayList;

/**
 *
 * @author tushar
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    //public JobDirectory jobDirectory;
    
    
    

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
        //jobDirectory = new JobDirectory();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.OldAgeHomeOrg.getValue())){
            organization = new OldAgeHomeOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.NGOOrg.getValue())){
            organization = new NGOOrg();
            organizationList.add(organization);
        }
       
        else if (type.getValue().equals(Type.VeteransOrg.getValue())){
            organization = new VeteransOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CompanyOrg.getValue())){
            organization = new CompanyOrg();
            organizationList.add(organization);
        }
        return organization;
    }
    
    /*public JobDirectory getJobDirectory() {
        return jobDirectory;
    }

    public void setJobDirectory(JobDirectory jobDirectory) {
        this.jobDirectory = jobDirectory;
    } */
}