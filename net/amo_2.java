/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.atL;
import net.qz_2;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.amo
 */
public class amo_2
implements qz_2<atL> {
    private atL a;
    private int b;

    @Override
    public int a() {
        return this.b;
    }

    public atL a() {
        return new atL(this.a);
    }

    amo_2(atL atL2, int n) {
        this.a = atL2;
        this.b = n;
    }
}

