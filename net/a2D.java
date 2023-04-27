/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class a2D {
    public static AudioInputStream a(InputStream inputStream) {
        return AudioSystem.getAudioInputStream(inputStream);
    }

    public static Clip a() {
        return AudioSystem.getClip();
    }
}

