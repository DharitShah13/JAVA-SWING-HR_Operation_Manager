/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OldAgePersonDirectory;

import java.util.ArrayList;

/**
 *
 * @author Tushar
 */
public class OldAgeHomePersonDirectory { 
    
    private ArrayList<OLDAgeHomePerson> oldAgeHomePersonList;
    

    public OldAgeHomePersonDirectory() {
        
        this.oldAgeHomePersonList = new ArrayList<>();
    }

    public ArrayList<OLDAgeHomePerson> getOldAgeHomePersonList() {
        return oldAgeHomePersonList;
    }

    public void setOldAgeHomePersonList(ArrayList<OLDAgeHomePerson> oldAgeHomePersonList) {
        this.oldAgeHomePersonList = oldAgeHomePersonList;
    }

    
    
   public OLDAgeHomePerson addPerson(String name,Boolean flag, String hired)
    {
        OLDAgeHomePerson oLDAgeHomePerson= new OLDAgeHomePerson();
        oLDAgeHomePerson.setName(name);
        oLDAgeHomePerson.setFlag(flag);
        oLDAgeHomePerson.setHired(hired);
        oLDAgeHomePerson.setPersonID(oLDAgeHomePerson.getPersonID());
        oldAgeHomePersonList.add(oLDAgeHomePerson);
        return oLDAgeHomePerson;
    }
    
   public void removeperson(OLDAgeHomePerson oLDAgeHomePerson){
        oldAgeHomePersonList.remove(oLDAgeHomePerson);
            
    }
}
