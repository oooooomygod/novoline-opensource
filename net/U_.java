/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import cc.novoline.invoke.EntityPlayerInvoker;
import com.google.common.base.Predicate;
import deobf.EntityPlayerMP;
import net.minecraft.stats.Achievement;
import deobf.StatBase;

class U_
implements Predicate<Achievement> {
    bh_0 c;
    StatBase b;
    EntityPlayerMP a;

    public boolean a(Achievement achievement) {
        return Q3.b(EntityPlayerInvoker.D(this.a), achievement) && achievement != this.b;
    }

    U_(bh_0 bh_02, EntityPlayerMP entityPlayerMP, StatBase statBase) {
        this.c = bh_02;
        this.a = entityPlayerMP;
        this.b = statBase;
    }
}

