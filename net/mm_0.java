/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.Callable;
import net.awn_1;

/*
 * Renamed from net.Mm
 */
class mm_0
implements Callable<String> {
    awn_1 a;

    mm_0(awn_1 awn_12) {
        this.a = awn_12;
    }

    public String a() throws Exception {
        return this.a.getName();
    }
}

