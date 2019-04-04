/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Underprev;

import Business.NGOPersonDirectory.NGOPersonDirectory;
import Business.OldAgePersonDirectory.OldAgeHomePersonDirectory;
import Business.VeteransPersonDirectory.VeteransPersonDirectory;

/**
 *
 * @author Tushar
 */
public class UnderprivilegedDirectory {
    private VeteransPersonDirectory veteranPersonDirectory;
    private NGOPersonDirectory ngoPersonDirectory;
    private OldAgeHomePersonDirectory oldAgePersonDirectory;
    
    public UnderprivilegedDirectory(){
        this.veteranPersonDirectory=new VeteransPersonDirectory();
        this.oldAgePersonDirectory= new OldAgeHomePersonDirectory();
        this.ngoPersonDirectory= new NGOPersonDirectory();
        
    }

    public VeteransPersonDirectory getVeteranPersonDirectory() {
        return veteranPersonDirectory;
    }

    public void setVeteranPersonDirectory(VeteransPersonDirectory veteranPersonDirectory) {
        this.veteranPersonDirectory = veteranPersonDirectory;
    }

    public NGOPersonDirectory getNgoPersonDirectory() {
        return ngoPersonDirectory;
    }

    public void setNgoPersonDirectory(NGOPersonDirectory ngoPersonDirectory) {
        this.ngoPersonDirectory = ngoPersonDirectory;
    }

    public OldAgeHomePersonDirectory getOldAgePersonDirectory() {
        return oldAgePersonDirectory;
    }

    public void setOldAgePersonDirectory(OldAgeHomePersonDirectory oldAgePersonDirectory) {
        this.oldAgePersonDirectory = oldAgePersonDirectory;
    }
    
    
}
