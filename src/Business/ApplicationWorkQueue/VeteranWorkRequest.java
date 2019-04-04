/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ApplicationWorkQueue;

import Business.Applicant.Applicant;
import Business.Jobs.Job;
import Business.Role.Role;

/**
 *
 * @author Tushar
 */
public class VeteranWorkRequest extends WorkRequest{
     private Applicant applicant;
    private Job job;
    private Role role;
    private int applicationID;
    private static int count = 0;

    public VeteranWorkRequest() {
        count++;
        this.applicationID = count;
        this.applicant = applicant;
        this.job = job;
        this.role = role;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(int applicationID) {
        this.applicationID = applicationID;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        VeteranWorkRequest.count = count;
    }
    
    
    
    
}
