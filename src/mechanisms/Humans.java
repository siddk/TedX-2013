/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mechanisms;

import actuator.GRTSolenoid;
import core.TedXMech;

/**
 * Code for the Humans TedX Mechanism. Simply put, there is a pneumatic arm that 
 * is supposed to be triggered, effectively moving the human's arm in a downwards
 * pattern.
 * 
 * @author sidd
 */
public class Humans extends TedXMech {
    private GRTSolenoid Human1 = solenoids[0];
    private GRTSolenoid Human2 = solenoids[1];
    private GRTSolenoid Human3 = solenoids[2];
    
    public Humans(GRTSolenoid solenoid) {
        super("Humans", solenoid);
        
    }
    protected void extend() {
       
    }

    protected void retract() {
       
    }
    
}
