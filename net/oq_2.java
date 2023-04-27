/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityLivingBase;
import net.minecraft.util.MovingObjectPosition;

/*
 * Renamed from net.oq
 */
public class oq_2
extends ob_1 {
    @Override
    protected void a(MovingObjectPosition movingObjectPosition) {
        int n;
        if (movingObjectPosition.entityHit != null) {
            n = 0;
            if (movingObjectPosition.entityHit instanceof nt_2) {
                n = 3;
            }
            movingObjectPosition.entityHit.a(aDJ.a(this, (Entity)this.d()), (float)n);
        }
        n = 0;
        while (true) {
            aV8.a(this.worldObj, B7.SNOWBALL, this.posX, this.posY, this.posZ, 0.0, 0.0, 0.0, new int[0]);
            ++n;
        }
    }

    public oq_2(World world) {
        super(world);
    }

    public oq_2(World world, double d, double d2, double d3) {
        super(world, d, d2, d3);
    }

    public oq_2(World world, EntityLivingBase entityLivingBase) {
        super(world, entityLivingBase);
    }
}

