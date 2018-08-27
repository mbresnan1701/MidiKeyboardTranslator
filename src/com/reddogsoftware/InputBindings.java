package com.reddogsoftware;

import java.awt.event.KeyEvent;
import java.util.HashMap;

public class InputBindings {
    private static final HashMap<String, Integer> kbBindings = new HashMap<>();
    private static final HashMap<Integer, String> mouseBindings = new HashMap<>();
    static {
        // Set keyboard binds

        // Right hand
        kbBindings.put("C4", KeyEvent.VK_Q); // Interact
        kbBindings.put("D4", KeyEvent.VK_SPACE); // Roll
        kbBindings.put("E4", KeyEvent.VK_H); // Lgt attack
        kbBindings.put("F4", KeyEvent.VK_U); // Hvy attack
        kbBindings.put("G4", KeyEvent.VK_R); // Item
        kbBindings.put("A4", KeyEvent.VK_SHIFT); // Lock on
//        kbBindings.put("A#5", KeyEvent.VK_Q); //

        // Left hand
        kbBindings.put("A2", KeyEvent.VK_D); // Go right
        kbBindings.put("G2", KeyEvent.VK_S); // Go back
        kbBindings.put("F2", KeyEvent.VK_W); // Go straight
        kbBindings.put("E2", KeyEvent.VK_A); // Go left
        kbBindings.put("D2", KeyEvent.VK_O); // Camera / lock on
    }

    Integer getBinding(String note) {
        return kbBindings.get(note);
    }
}
