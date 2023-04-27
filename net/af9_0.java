/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  paulscode.sound.SoundSystemConfig
 *  paulscode.sound.SoundSystemLogger
 */
package net;

import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemLogger;

/*
 * Renamed from net.af9
 */
public class af9_0 {
    public static void a(SoundSystemLogger soundSystemLogger) {
        SoundSystemConfig.setLogger((SoundSystemLogger)soundSystemLogger);
    }

    public static void a(String string, Class clazz) {
        SoundSystemConfig.setCodec((String)string, (Class)clazz);
    }

    public static void a(Class clazz) {
        SoundSystemConfig.addLibrary((Class)clazz);
    }
}

