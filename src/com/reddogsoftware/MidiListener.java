package com.reddogsoftware;

import themidibus.SimpleMidiListener;

public class MidiListener implements SimpleMidiListener {
    public void noteOn(int channel, int pitch, int velocity) {
        // Receive a noteOn
        System.out.println();
        System.out.println("Note On:");
        System.out.println("--------");
        System.out.println("Channel:"+channel);
        System.out.println("Pitch:"+pitch);
        System.out.println("Velocity:"+velocity);
    }

    public void noteOff(int channel, int pitch, int velocity) {
        // Receive a noteOff
        System.out.println();
        System.out.println("Note Off:");
        System.out.println("--------");
        System.out.println("Channel:"+channel);
        System.out.println("Pitch:"+pitch);
        System.out.println("Velocity:"+velocity);
    }

    public void controllerChange(int channel, int number, int value) {
        // Receive a controllerChange
        System.out.println();
        System.out.println("Controller Change:");
        System.out.println("--------");
        System.out.println("Channel:"+channel);
        System.out.println("Number:"+number);
        System.out.println("Value:"+value);
    }
}
