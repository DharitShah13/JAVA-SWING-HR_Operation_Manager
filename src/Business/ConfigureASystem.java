/*
 * To change this license header, choose License Headers in ConfigureASystem Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.VeteransPersonDirectory.VeteranPerson;
import Business.VeteransPersonDirectory.VeteransPersonDirectory;
import java.util.ArrayList;

/**
 *
 * @author Tushar
 */
public class ConfigureASystem {

    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createEmployeeUserAccount("admin", "admin", employee, new SystemAdminRole(),"tushar");
        
        
        
        return system;
    }
}
