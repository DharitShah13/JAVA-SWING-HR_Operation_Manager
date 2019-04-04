/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ApplicationWorkQueue;

import Business.Applicant.Applicant;
import Business.Jobs.Job;
import Business.NGOPersonDirectory.NGOPerson;
import Business.OldAgePersonDirectory.OLDAgeHomePerson;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.VeteransPersonDirectory.VeteranPerson;

/**
 *
 * @author pooji
 */
public class HRWorkRequest extends WorkRequest {

    private Applicant applicant;
    private Job job;
    //private Organization organization;
    private Role role;
    private int applicationID;
    private static int count = 0;
    private UserAccount account;

    public HRWorkRequest() {
        count++;
        this.applicationID = count;
        this.applicant = applicant;
        this.job = job;
        //this.role = role;
    }

    public UserAccount getAccount() {
        return account;
    }

    public void setAccount(UserAccount account) {
        this.account = account;
    }

    

    
    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    /*public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
     */
    public int getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(int applicationID) {
        this.applicationID = applicationID;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
