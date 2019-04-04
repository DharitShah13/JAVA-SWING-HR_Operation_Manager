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
import Business.VeteransPersonDirectory.VeteranPerson;

/**
 *
 * @author Tushar
 */
public class ApplicantWorkRequest extends WorkRequest {

    public Job job;
    private Applicant applicant;
    private int applicationID;
    private String status;
    private NGOPerson nGOPerson;
    private OLDAgeHomePerson oLDAgeHomePerson;
    private VeteranPerson veteranPerson;
    private Boolean flag;
    private String sendername;
    
    
    
    public ApplicantWorkRequest() {
        
        this.job = new Job();
        this.applicant = new Applicant();
        this.nGOPerson=nGOPerson;
        this.oLDAgeHomePerson=oLDAgeHomePerson;
        this.veteranPerson=veteranPerson;
    }

    public String getSendername() {
        return sendername;
    }

    public void setSendername(String sendername) {
        this.sendername = sendername;
    }

    
    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public NGOPerson getnGOPerson() {
        return nGOPerson;
    }

    public void setnGOPerson(NGOPerson nGOPerson) {
        this.nGOPerson = nGOPerson;
    }

    public OLDAgeHomePerson getoLDAgeHomePerson() {
        return oLDAgeHomePerson;
    }

    public void setoLDAgeHomePerson(OLDAgeHomePerson oLDAgeHomePerson) {
        this.oLDAgeHomePerson = oLDAgeHomePerson;
    }

    public VeteranPerson getVeteranPerson() {
        return veteranPerson;
    }

    public void setVeteranPerson(VeteranPerson veteranPerson) {
        this.veteranPerson = veteranPerson;
    }

    
    
    public int getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(int applicationID) {
        this.applicationID = applicationID;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status ;
    }
    
    
}
