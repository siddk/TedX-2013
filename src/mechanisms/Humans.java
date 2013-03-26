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
    private GRTSolenoid Humans = solenoids[0];
    public Humans(GRTSolenoid solenoid) {
        super("Humans", solenoid);
        
    }
    protected void extend() {
       Humans.set(true);
    }

    protected void retract() {
       Humans.set(false);
    }
    
}
