package event.listeners;

import event.events.JoystickEvent;

public interface GRTJoystickListener {

    public void XAxisMoved(JoystickEvent e);

    public void YAxisMoved(JoystickEvent e);

    public void AngleChanged(JoystickEvent e);
}
