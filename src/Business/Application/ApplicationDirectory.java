/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Application;

import Business.Applicant.Applicant;
import Business.Jobs.Job;
import java.util.ArrayList;

/**
 *
 * @author Tushar
 */
public class ApplicationDirectory {
    
    private ArrayList<Application> applicationList;

    public ApplicationDirectory() {
        this.applicationList = new ArrayList<>();
    }

    public ArrayList<Application> getApplicationList() {
        return applicationList;
    }

    public void setApplicationList(ArrayList<Application> applicationList) {
        this.applicationList = applicationList;
    }
    
    public Application createApplication(Job job,Applicant applicant ){
        Application application = new Application();
        application.setJob(job);
        application.setApplicationID(0);
        application.setApplicant(applicant);
        applicationList.add(application);
        return application;
    }
    
    
    
    
    
}
