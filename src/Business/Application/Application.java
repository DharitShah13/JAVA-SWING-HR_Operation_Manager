/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Application;

import Business.Applicant.Applicant;
import Business.Jobs.Job;
import Business.NGOPersonDirectory.NGOPerson;
import Business.OldAgePersonDirectory.OLDAgeHomePerson;
import Business.VeteransPersonDirectory.VeteranPerson;

/**
 *
 * @author Tushar
 */
public class Application {

    public Job job;
    private Applicant applicant;
    private NGOPerson nGOPerson;
    private OLDAgeHomePerson oLDAgeHomePerson;
    private VeteranPerson veteranPerson;
    private static int count = 0;
    private int applicationID;

    public Application() {
        this.job = job;
        count++;
        applicationID = count;
        this.applicant = applicant;

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

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Application.count = count;
    }

    public int getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(int applicationID) {
        this.applicationID = applicationID;
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

}
