/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.inventory.Container;
import deobf.Entity;
import deobf.EntityPlayer;

public class _1
extends _v_0 {
    private nz_0 b;

    public _1(nz_0 nz_02) {
        this.b = nz_02;
        this.a(5);
    }

    @Override
    public boolean g() {
        if (!ayh_1.r(this.b)) {
            return false;
        }
        if (ayh_1.d(this.b)) {
            return false;
        }
        if (!this.b.onGround) {
            return false;
        }
        if (this.b.aa) {
            return false;
        }
        EntityPlayer entityPlayer = ayh_1.h(this.b);
        return !(ayh_1.a(this.b, (Entity)entityPlayer) > 16.0) && entityPlayer.bI instanceof Container;
    }

    @Override
    public void b() {
        tz_1.a(ayh_1.o(this.b));
    }

    @Override
    public void a() {
        ayh_1.a(this.b, (EntityPlayer)null);
    }
}

