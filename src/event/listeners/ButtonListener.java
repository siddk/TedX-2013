package event.listeners;

import event.events.ButtonEvent;

public interface ButtonListener {

    public void buttonPressed(ButtonEvent e);

    public void buttonReleased(ButtonEvent e);
}
