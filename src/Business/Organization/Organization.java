/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Applicant.ApplicantDirectory;
import Business.Application.ApplicationDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.ApplicationWorkQueue.WorkQueue;
import Business.Jobs.JobDirectory;
import Business.Underprev.UnderprivilegedDirectory;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author tushar
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    //private ApplicantDirectory applicantDirectory;
    private UserAccountDirectory userAccountDirectory;
    private ApplicantDirectory applicantDirectory;
    private ApplicationDirectory applicationDirectory;
    private UnderprivilegedDirectory underPrivilegedDirectory;
    private int organizationID;
    private JobDirectory jobDirectory;
    private static int counter=0;
    public HashSet<Role> roles;
    
    public enum Type{
        CompanyOrg("Company Organization"),OldAgeHomeOrg("Old Age Home Organization"),
        VeteransOrg("Veterans Organization"), NGOOrg("NGO Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        roles = new HashSet<>();
        ++counter;
        jobDirectory= new JobDirectory();
        applicantDirectory = new ApplicantDirectory();
        applicationDirectory = new ApplicationDirectory();
        underPrivilegedDirectory= new UnderprivilegedDirectory();
    }

    public abstract HashSet<Role> getSupportedRole();

    public UnderprivilegedDirectory getUnderPrivilegedDirectory() {
        return underPrivilegedDirectory;
    }

    public void setUnderPrivilegedDirectory(UnderprivilegedDirectory underPrivilegedDirectory) {
        this.underPrivilegedDirectory = underPrivilegedDirectory;
    }
    
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public JobDirectory getJobDirectory() {
        return jobDirectory;
    }

    public void setJobDirectory(JobDirectory jobDirectory) {
        this.jobDirectory = jobDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public ApplicantDirectory getApplicantDirectory() {
        return applicantDirectory;
    }

    public void setApplicantDirectory(ApplicantDirectory applicantDirectory) {
        this.applicantDirectory = applicantDirectory;
    }

    public ApplicationDirectory getApplicationDirectory() {
        return applicationDirectory;
    }

    public void setApplicationDirectory(ApplicationDirectory applicationDirectory) {
        this.applicationDirectory = applicationDirectory;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    
}
