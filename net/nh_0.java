/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EnumDifficulty;
import net.Ma;
import net.Potion;
import net.World;
import net.a2l_0;
import net.aV8;
import net.abb_0;
import net.ach_0;
import net.amk_0;
import net.ari_0;
import net.n9_0;

/*
 * Renamed from net.nH
 */
public class nh_0
extends n9_0 {
    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.b), 12.0);
    }

    @Override
    public float w() {
        return 0.45f;
    }

    @Override
    public amk_0 a(ach_0 ach_02, amk_0 amk_02) {
        return amk_02;
    }

    public nh_0(World world) {
        super(world);
        this.c(0.7f, 0.5f);
    }

    @Override
    public boolean d(Entity entity) {
        if (super.d(entity)) {
            if (entity instanceof EntityLivingBase) {
                int n = 0;
                if (aV8.p(this.worldObj) == EnumDifficulty.NORMAL) {
                    n = 7;
                } else if (aV8.p(this.worldObj) == EnumDifficulty.HARD) {
                    n = 15;
                }
                ((EntityLivingBase)entity).a(new a2l_0(ari_0.f(Potion.poison), n * 20, 0));
            }
            return true;
        }
        return false;
    }
}

