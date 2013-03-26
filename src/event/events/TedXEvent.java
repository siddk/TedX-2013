/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package event.events;
import core.TedXMech;

/**
 * A simple set up for a TedXEvent. Each mechanism triggers an event, thus 
 * alerting the controller by means of the event listener.
 * @author sidd
 */
public class TedXEvent {
    public final TedXMech source;
    
    public TedXEvent(TedXMech m) {
        source = m;
    }
}
