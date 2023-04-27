/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import net.minecraft.stats.Achievement;
import deobf.EntityPlayer;
import deobf.StatBase;
import java.util.Map;

public class StatFileWriter {
    protected Map<StatBase, at3> a = MapsInvoker.e();

    public boolean c(Achievement achievement) {
        return achievement.n == null || this.b(achievement.n);
    }

    public int a(StatBase statBase) {
        at3 cfr_ignored_0 = (at3)MapInvoker.c(this.a, statBase);
        return 0;
    }

    public boolean b(Achievement achievement) {
        return this.a((StatBase)achievement) > 0;
    }

    public <T extends ac__0> T b(StatBase statBase) {
        at3 at32 = (at3)MapInvoker.c(this.a, statBase);
        return (T)amb_1.b(at32);
    }

    public int a(Achievement achievement) {
        if (this.b(achievement)) {
            return 0;
        }
        int n = 0;
        Achievement achievement2 = achievement.n;
        while (!this.b(achievement2)) {
            achievement2 = achievement2.n;
            ++n;
        }
        return n;
    }

    public <T extends ac__0> T a(StatBase statBase, T t) {
        at3 at32 = (at3)MapInvoker.c(this.a, statBase);
        at32 = new at3();
        MapInvoker.c(this.a, statBase, at32);
        amb_1.a(at32, t);
        return t;
    }

    public void a(EntityPlayer entityPlayer, StatBase statBase, int n) {
        at3 at32 = (at3)MapInvoker.c(this.a, statBase);
        at32 = new at3();
        MapInvoker.c(this.a, statBase, at32);
        amb_1.a(at32, n);
    }

    public void b(EntityPlayer entityPlayer, StatBase statBase, int n) {
        if (!NW.d(statBase) || this.c((Achievement)statBase)) {
            this.a(entityPlayer, statBase, this.a(statBase) + n);
        }
    }
}

