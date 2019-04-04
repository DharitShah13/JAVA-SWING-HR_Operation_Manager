/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Applicant;

import java.util.ArrayList;

/**
 *
 * @author raj
 */
public class ApplicantDirectory {

    private ArrayList<Applicant> applicantlist;
    private ArrayList<Applicant> applicantLoginList;

    public ApplicantDirectory() {
        this.applicantlist = new ArrayList<>();
        this.applicantLoginList = new ArrayList<>();
    }

    public ArrayList<Applicant> getApplicantLoginList() {
        return applicantLoginList;
    }

    public void setApplicantLoginList(ArrayList<Applicant> applicantLoginList) {
        this.applicantLoginList = applicantLoginList;
    }

    
    public ArrayList<Applicant> getApplicantlist() {
        return applicantlist;
    }

    public void setApplicantlist(ArrayList<Applicant> applicantlist) {
        this.applicantlist = applicantlist;
    }

    

    public Applicant addPersonalDetails(String fname, String mname, String lname, String age, String sex, String primContact, String secContact,String password,String username,String email,String education,String qualification,String resumeText) {
        Applicant applicant1 = new Applicant();
        applicant1.setFirstName(fname);
        applicant1.setMiddleName(mname);
        applicant1.setLastName(lname);
        //applicant1.setEmailAddress(emailAddress);
        applicant1.setAge(age);
        applicant1.setSex(sex);
        applicant1.setPrimaryNumber(primContact);
        applicant1.setSecondaryNumber(secContact);
        
        applicant1.setPassword(password);
        applicant1.setUserName(username);
        applicant1.setEmailAddress(email);
        applicant1.setEducation(education);
        applicant1.setQualification(qualification);
        applicant1.setResumeText(resumeText);
        applicantlist.add(applicant1);
        return applicant1;
    }

    



    public Applicant createApplicantLogin(String username, String password, String email) {
        Applicant applicant = new Applicant();
        applicant.setPassword(password);
        applicant.setUserName(username);
        applicant.setEmailAddress(email);
        applicantlist.add(applicant);
        return applicant;
    }
}
