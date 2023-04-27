/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.J7;
import net.OS;

/*
 * Renamed from net.afR
 */
class afr_1
extends Thread {
    J7 a;

    @Override
    public void run() {
        OS.a(this.a.a);
    }

    afr_1(J7 j7, String string) {
        this.a = j7;
        super(string);
    }
}

