package event.listeners;

import event.events.SensorEvent;

public interface SensorChangeListener {

    public void sensorStateChanged(SensorEvent e);
}
