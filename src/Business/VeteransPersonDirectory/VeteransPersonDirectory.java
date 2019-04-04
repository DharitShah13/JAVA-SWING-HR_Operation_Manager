/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VeteransPersonDirectory;

import java.util.ArrayList;

/**
 *
 * @author Tushar
 */
public class VeteransPersonDirectory {

    private ArrayList<VeteranPerson> veteranPersonList;

    public VeteransPersonDirectory() {

        this.veteranPersonList = new ArrayList<>();

    }

    public ArrayList<VeteranPerson> getVeteranPersonList() {
        return veteranPersonList;
    }

    public void setVeteranPersonList(ArrayList<VeteranPerson> veteranPersonList) {
        this.veteranPersonList = veteranPersonList;
    }

    public VeteranPerson addPerson(String name, Boolean flag, String hired) {
        VeteranPerson veteranPerson = new VeteranPerson();
        veteranPerson.setName(name);
        veteranPerson.setFlag(flag);
        veteranPerson.setHired(hired);
        veteranPerson.setPersonID(veteranPerson.getPersonID());
        veteranPersonList.add(veteranPerson);
        return veteranPerson;
    }

    public void removeperson(VeteranPerson veteranPerson) {
        veteranPersonList.remove(veteranPerson);

    }
}
