/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package event.listeners;
import event.events.TedXEvent;

/**
 * A simple TedXListener. Interfaces the mechanisms with the controller by means
 * of catching TedXEvents that the mechanisms throw.
 * 
 * @author sidd
 */
public interface TedXListener {
    public void mechExtend(TedXEvent e);

    public void mechRetract(TedXEvent e);
}
