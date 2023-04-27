/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import net.minecraft.block.BlockPos;
import net.minecraft.util.MovingObjectPosition;

/*
 * Renamed from net.oZ
 */
public class oz_1
extends ob_1 {
    public oz_1(World world, double d, double d2, double d3) {
        super(world, d, d2, d3);
    }

    @Override
    protected void a(MovingObjectPosition movingObjectPosition) {
        if (!this.worldObj.isRemote) {
            aV8.c(this.worldObj, 2002, new BlockPos(this), 0);
            int n = 3 + a5_0.a(this.worldObj.o, 5) + a5_0.a(this.worldObj.o, 5);
            while (true) {
                int n2 = TC.a(n);
                n -= n2;
                aV8.b(this.worldObj, new oa_2(this.worldObj, this.posX, this.posY, this.posZ, n2));
            }
        }
    }

    public oz_1(World world, EntityLivingBase entityLivingBase) {
        super(world, entityLivingBase);
    }

    public oz_1(World world) {
        super(world);
    }

    @Override
    protected float c() {
        return 0.7f;
    }

    @Override
    protected float b() {
        return 0.07f;
    }

    @Override
    protected float a() {
        return -20.0f;
    }
}

