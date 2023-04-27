/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.util.MovingObjectPosition;

/*
 * Renamed from net.oF
 */
public class of_1
extends ob_1 {
    private EntityLivingBase at;

    public of_1(World world, EntityLivingBase entityLivingBase) {
        super(world, entityLivingBase);
        this.at = entityLivingBase;
    }

    @Override
    public void onUpdate() {
        EntityLivingBase entityLivingBase = this.d();
        if (entityLivingBase instanceof EntityPlayer && !entityLivingBase.n()) {
            this.E();
        } else {
            super.onUpdate();
        }
    }

    public of_1(World world) {
        super(world);
    }

    public of_1(World world, double d, double d2, double d3) {
        super(world, d, d2, d3);
    }

    @Override
    protected void a(MovingObjectPosition movingObjectPosition) {
        EntityLivingBase entityLivingBase = this.d();
        if (movingObjectPosition.entityHit != null) {
            if (movingObjectPosition.entityHit == this.at) {
                return;
            }
            movingObjectPosition.entityHit.a(aDJ.a(this, (Entity)entityLivingBase), 0.0f);
        }
        int n = 0;
        while (true) {
            aV8.a(this.worldObj, B7.PORTAL, this.posX, this.posY + a5_0.c(this.Q) * 2.0, this.posZ, a5_0.f(this.Q), 0.0, a5_0.f(this.Q), new int[0]);
            ++n;
        }
    }
}

