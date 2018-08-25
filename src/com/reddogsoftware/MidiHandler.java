package com.reddogsoftware;

import themidibus.*;

import javax.sound.midi.*;

public class MidiHandler {

    public MidiHandler() {

        MidiBus mb = new MidiBus(this, 1, 1);
        mb.addMidiListener(new MidiListener());


    }
}