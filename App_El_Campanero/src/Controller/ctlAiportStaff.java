package Controller;

import Classes.*;
import Model.*;
/**
 *
 * @author Booh
 */
public class ctlAiportStaff {
    
    modelAirportStaff modelStaff;
    
    //--------------------------------------------------------------------------

    public ctlAiportStaff() {
    
        modelStaff = new modelAirportStaff();
    }
    
    //--------------------------------------------------------------------------
    
    public void createStaff(clsAirportStaff AirportStaff){
        
        modelStaff.createAirportStaff((clsAirportStaff) AirportStaff);
    }
    
    //--------------------------------------------------------------------------
    
    public clsLogin readStaff(String id){
        
        return modelStaff.readEmailAirportStaff(id);    
    }
    
    //--------------------------------------------------------------------------
    
    
    //--------------------------------------------------------------------------
    
    
    //--------------------------------------------------------------------------
    
}
