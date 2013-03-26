package event.events;

import sensor.GRTJoystick;

public class JoystickEvent extends SensorEvent {

    public JoystickEvent(GRTJoystick source, int id, double value) {
        super(source, id, value);
    }
}
