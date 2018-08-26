package com.reddogsoftware;

import java.util.HashMap;

class MidiPitchMap {
    private static final HashMap<Integer, String> keyMap = new HashMap<>();
    static {
        keyMap.put(21, "A0");
        keyMap.put(22, "A#0");
        keyMap.put(23, "B0");
        keyMap.put(24, "C1");
        keyMap.put(25, "C#1");
        keyMap.put(26, "D1");
        keyMap.put(27, "D#1");
        keyMap.put(28, "E1");
        keyMap.put(29, "F1");
        keyMap.put(30, "F#1");
        keyMap.put(31, "G1");
        keyMap.put(32, "G#1");
        keyMap.put(33, "A1");
        keyMap.put(34, "A#1");
        keyMap.put(35, "B1");
        keyMap.put(36, "C2");
        keyMap.put(37, "C#2");
        keyMap.put(38, "D2");
        keyMap.put(39, "D#2");
        keyMap.put(40, "E2");
        keyMap.put(41, "F2");
        keyMap.put(42, "F#2");
        keyMap.put(43, "G2");
        keyMap.put(44, "G#2");
        keyMap.put(45, "A2");
        keyMap.put(46, "A#2");
        keyMap.put(47, "B2");
        keyMap.put(48, "C3");
        keyMap.put(49, "C#3");
        keyMap.put(50, "D3");
        keyMap.put(51, "D#3");
        keyMap.put(52, "E3");
        keyMap.put(53, "F3");
        keyMap.put(54, "F#3");
        keyMap.put(55, "G3");
        keyMap.put(56, "G#3");
        keyMap.put(57, "A3");
        keyMap.put(58, "A#3");
        keyMap.put(59, "B3");
        keyMap.put(60, "C4");
        keyMap.put(61, "C#4");
        keyMap.put(62, "D4");
        keyMap.put(63, "D#4");
        keyMap.put(64, "E4");
        keyMap.put(65, "F4");
        keyMap.put(66, "F#4");
        keyMap.put(67, "G4");
        keyMap.put(68, "G#4");
        keyMap.put(69, "A4");
        keyMap.put(70, "A#4");
        keyMap.put(71, "B4");
        keyMap.put(72, "C5");
        keyMap.put(73, "C#5");
        keyMap.put(74, "D5");
        keyMap.put(75, "D#5");
        keyMap.put(76, "E5");
        keyMap.put(77, "F5");
        keyMap.put(78, "F#5");
        keyMap.put(79, "G5");
        keyMap.put(80, "G#5");
        keyMap.put(81, "A5");
        keyMap.put(82, "A#5");
        keyMap.put(83, "B5");
        keyMap.put(84, "C6");
        keyMap.put(85, "C#6");
        keyMap.put(86, "D6");
        keyMap.put(87, "D#6");
        keyMap.put(88, "E6");
        keyMap.put(89, "F6");
        keyMap.put(90, "F#6");
        keyMap.put(91, "G6");
        keyMap.put(92, "G#6");
        keyMap.put(93, "A6");
        keyMap.put(94, "A#6");
        keyMap.put(95, "B6");
        keyMap.put(96, "C7");
        keyMap.put(97, "C#7");
        keyMap.put(98, "D7");
        keyMap.put(99, "D#7");
        keyMap.put(100, "E7");
        keyMap.put(101, "F7");
        keyMap.put(102, "F#7");
        keyMap.put(103, "G7");
        keyMap.put(104, "G#7");
        keyMap.put(105, "A7");
        keyMap.put(106, "A#7");
        keyMap.put(107, "B7");
        keyMap.put(108, "C8");
    }

    String getNote(int pitch) {
        return keyMap.get(pitch);
    }

}
