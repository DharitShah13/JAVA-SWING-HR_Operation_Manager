/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Jobs;

import java.util.ArrayList;

/**
 *
 * @author Tushar
 */
public class JobDirectory {

    private ArrayList<Job> joblist;

    public JobDirectory() {
        this.joblist = new ArrayList<>();
    }

    public ArrayList<Job> getJoblist() {
        return joblist;
    }

    public void setJoblist(ArrayList<Job> joblist) {
        this.joblist = joblist;
    }

    public Job createJob(String jobPosition,String category) {
        Job job = new Job();
        job.setJobID(job.getJobID());
        job.setJobPosition(jobPosition);
        job.setCategory(category);
        joblist.add(job);
        return (job);
    }

    public void removeJob(Job job) {
        joblist.remove(job);
    }

}
