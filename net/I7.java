/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import net.I3;
import net.a5_0;
import net.ii_1;
import net.il_0;
import net.ip_0;

class I7
extends I3 {
    ip_0 aG;

    I7(ip_0 ip_02, int n, il_0 il_02) {
        this.aG = ip_02;
        super(n, il_02);
    }

    @Override
    public ii_1 b(Random random) {
        return a5_0.a(random) ? ip_0.aH : ip_0.aG;
    }
}

