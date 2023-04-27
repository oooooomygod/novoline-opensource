/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.MN;

public enum aET {
    FILE(MN.a),
    SOUND_EVENT(MN.d);

    private String b;

    private aET(String string2) {
        this.b = string2;
    }

    public static aET a(String string) {
        for (aET aET2 : aET.values()) {
            if (!aET2.b.equals(string)) continue;
            return aET2;
        }
        return null;
    }
}

