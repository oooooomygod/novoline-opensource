/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aL0;
import net.aen_0;
import net.ea_1;

public enum B9 {
    INFO,
    DEBUG,
    ERROR;


    public static void a(String string, B9 b9) {
        if (b9 != DEBUG) {
            ea_1.a(System.out, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aen_0.e), b9.name()), aen_0.b), string).toString());
        }
    }
}

