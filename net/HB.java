/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.KeyPressEvent;

public class HB {
    private static String b;

    public static String b() {
        return b;
    }

    static {
        if (HB.b() != null) {
            HB.b("ouVpZ");
        }
    }

    @EventTarget
    public void a(KeyPressEvent keyPressEvent) {
    }

    public static void b(String string) {
        b = string;
    }
}

