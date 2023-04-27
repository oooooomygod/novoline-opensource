/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import net.auo_0;

/*
 * Renamed from net.awg
 */
class awg_1
implements Predicate<auo_0> {
    Predicate a;

    public boolean a(auo_0 auo_02) {
        return this.a.apply((Object)auo_02.c());
    }

    awg_1(Predicate predicate) {
        this.a = predicate;
    }
}

