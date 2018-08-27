package com.reddogsoftware;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyboardController {
    Robot keyboardRobot;
    InputBindings bindings = new InputBindings();

    public KeyboardController() {
        try {
            keyboardRobot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void doKeyDown(String note) {
        Integer binding = bindings.getBinding(note);
        if (binding != null) {
            keyboardRobot.keyPress(binding);
        }
    }

    public void doKeyUp(String note) {
        Integer binding = bindings.getBinding(note);
        if (binding != null) {
            keyboardRobot.keyRelease(binding);
        }
    }
}
