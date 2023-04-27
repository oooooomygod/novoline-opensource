/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityLivingBase;
import net.minecraft.util.MovingObjectPosition;

/*
 * Renamed from net.oP
 */
public class op_1
extends ob_1 {
    public op_1(World world, EntityLivingBase entityLivingBase) {
        super(world, entityLivingBase);
    }

    public op_1(World world, double d, double d2, double d3) {
        super(world, d, d2, d3);
    }

    @Override
    protected void a(MovingObjectPosition movingObjectPosition) {
        if (movingObjectPosition.entityHit != null) {
            movingObjectPosition.entityHit.a(aDJ.a(this, (Entity)this.d()), 0.0f);
        }
        if (!this.worldObj.isRemote && a5_0.a(this.Q, 8) == 0) {
            int n = 1;
            if (a5_0.a(this.Q, 32) == 0) {
                n = 4;
            }
            int n2 = 0;
            while (true) {
                nd_1 nd_12 = new nd_1(this.worldObj);
                aBT.a(nd_12, -24000);
                nd_12.c(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0f);
                aV8.b(this.worldObj, nd_12);
                ++n2;
            }
        }
        double d = 0.08;
        int n = 0;
        while (true) {
            aV8.a(this.worldObj, B7.ITEM_CRACK, this.posX, this.posY, this.posZ, ((double)a5_0.e(this.Q) - 0.5) * 0.08, ((double)a5_0.e(this.Q) - 0.5) * 0.08, ((double)a5_0.e(this.Q) - 0.5) * 0.08, new int[]{px_0.a(Items.egg)});
            ++n;
        }
    }

    public op_1(World world) {
        super(world);
    }
}

