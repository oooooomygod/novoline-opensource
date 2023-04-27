/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net._v_0;
import net.aSY;
import net.apt_2;
import net.atn_0;
import net.ny_1;
import net.pp_0;

/*
 * Renamed from net.alQ
 */
class alq_1
extends _v_0 {
    private ny_1 b;
    private int c;

    @Override
    public void b() {
        this.c = 300;
        super.b();
    }

    @Override
    public boolean g() {
        EntityLivingBase entityLivingBase = apt_2.b(this.b);
        return atn_0.J(entityLivingBase) && (!(entityLivingBase instanceof EntityPlayer) || !aSY.b(((EntityPlayer)entityLivingBase).abilities));
    }

    @Override
    public void d() {
        apt_2.a(this.b, apt_2.b(this.b), 10.0f, 10.0f);
        ((pp_0)apt_2.f(this.b)).a(this.b.rotationYaw, this.b.d());
    }

    @Override
    public boolean f() {
        EntityLivingBase entityLivingBase = apt_2.b(this.b);
        return atn_0.J(entityLivingBase) && (!(entityLivingBase instanceof EntityPlayer) || !aSY.b(((EntityPlayer)entityLivingBase).abilities)) && --this.c > 0;
    }

    public alq_1(ny_1 ny_12) {
        this.b = ny_12;
        this.a(2);
    }
}

