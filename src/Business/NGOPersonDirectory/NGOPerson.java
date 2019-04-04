/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NGOPersonDirectory;

import Business.Jobs.Job;

/**
 *
 * @author Tushar
 */ 
public class NGOPerson {

    private String name;
    private Boolean flag;
    private Job job;
    private int personID;
    private static int count=0;
    private String hired;

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getHired() {
        return hired;
    }

    public void setHired(String hired) {
        this.hired = hired;
    }

    
    
    
    public NGOPerson() {
        count++;
        personID = count;
        this.job = new Job();
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
    
    
    @Override
    public String toString() {
        return name;
    }
    
    
}
