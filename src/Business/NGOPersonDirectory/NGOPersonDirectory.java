/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NGOPersonDirectory;

import java.util.ArrayList;

/**
 *
 * @author Tushar
 */
public class NGOPersonDirectory {
    
    private ArrayList<NGOPerson> ngoPersonList;

    public NGOPersonDirectory() {
        this.ngoPersonList = new ArrayList<>();
    }

    public ArrayList<NGOPerson> getNgoPersonList() {
        return ngoPersonList;
    }

    public void setNgoPersonList(ArrayList<NGOPerson> ngoPersonList) {
        this.ngoPersonList = ngoPersonList;
    }
    
   public NGOPerson addPerson(String name,Boolean flag, String hired)
    {
        NGOPerson np= new NGOPerson();
        np.setName(name);
        np.setFlag(flag);
        np.setPersonID(np.getPersonID());
        np.setHired(hired);
        ngoPersonList.add(np);
        return np;
    }  
    
    public void removeperson(NGOPerson nGOPerson){
        ngoPersonList.remove(nGOPerson);
            
    }
}
