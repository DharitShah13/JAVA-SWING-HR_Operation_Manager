/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Applicant.Applicant;
import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public UserAccount authenticateUser(String username, String password) {

        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }

        return null;
    }

    public UserAccount createEmployeeUserAccount(String username, String password, Employee employee, Role role, String email) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setEmail(email);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public boolean checkIfUsernameIsUnique(String username) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
    
    public UserAccount creatApplicantUserAccount(String username, String password, Applicant applicant, Role role ,String email){
        UserAccount useraccount1= new UserAccount();
        useraccount1.setUsername(username);
        useraccount1.setPassword(password);
        useraccount1.setApplicant(applicant);
        useraccount1.setEmail(email);
        useraccount1.setRole(role);
        userAccountList.add(useraccount1);
        return useraccount1;
        
    }
    
    public void removeAccount(UserAccount u){
        userAccountList.remove(u);
    }
}
