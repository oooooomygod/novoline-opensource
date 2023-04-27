/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import net.a7r_0;
import net.ad__0;
import net.af3_0;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.afx
 */
class afx_2
extends af3_0 {
    private af3_0[] c;

    afx_2(af3_0[] af3_0Array) {
        this.c = (af3_0[])a7r_0.a((Object[])af3_0Array, af3_0Array.length);
    }

    @Override
    public void a(@NonNull ad__0 ad__02) {
        af3_0.b();
        af3_0[] af3_0Array = this.c;
        int n = af3_0Array.length;
        int n2 = 0;
        if (n2 < n) {
            af3_0 af3_02 = af3_0Array[n2];
            af3_02.a(ad__02);
            ++n2;
        }
    }
}

