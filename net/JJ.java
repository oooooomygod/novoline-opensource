/*
 * Decompiled with CFR 0.152.
 */
package net;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Control;

public class JJ {
    public static Control a(Clip clip, Control.Type type) {
        return clip.getControl(type);
    }

    public static void a(Clip clip, long l4) {
        clip.setMicrosecondPosition(l4);
    }

    public static void a(Clip clip, int n) {
        clip.loop(n);
    }

    public static void a(Clip clip, AudioInputStream audioInputStream) {
        clip.open(audioInputStream);
    }

    public static void a(Clip clip) {
        clip.start();
    }
}

