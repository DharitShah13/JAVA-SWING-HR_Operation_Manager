/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ApplicationWorkQueue;

/**
 *
 * @author pooji
 */
public class SupervisorWorkRequest extends WorkRequest{
    private int requestQuantity;
    private boolean add;
    
    public SupervisorWorkRequest(){
        add = false;
    }
    
    public int getQuantity() {
        return requestQuantity;
    }

    public void setQuantity(int quantity) {
        this.requestQuantity = quantity;
    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

   
}
