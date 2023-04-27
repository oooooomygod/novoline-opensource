/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityLivingBase;
import net.minecraft.util.MovingObjectPosition;

/*
 * Renamed from net.oh
 */
public class oh_2
extends oa_1 {
    public int au = 1;

    public oh_2(World world, double d, double d2, double d3, double d4, double d5, double d6) {
        super(world, d, d2, d3, d4, d5, d6);
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        if (tn_0.a(nBTTagCompound, ug_0.c, 99)) {
            this.au = tn_0.g(nBTTagCompound, ug_0.a);
        }
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.b(nBTTagCompound, ug_0.b, this.au);
    }

    public oh_2(World world, EntityLivingBase entityLivingBase, double d, double d2, double d3) {
        super(world, entityLivingBase, d, d2, d3);
    }

    @Override
    protected void a(MovingObjectPosition movingObjectPosition) {
        if (!this.worldObj.isRemote) {
            if (movingObjectPosition.entityHit != null) {
                movingObjectPosition.entityHit.a(aDJ.a(this, (Entity)this.ak), 6.0f);
                this.a(this.ak, movingObjectPosition.entityHit);
            }
            boolean bl = J9.c(aV8.k(this.worldObj), ug_0.d);
            aV8.a(this.worldObj, null, this.posX, this.posY, this.posZ, (float)this.au, bl, bl);
            this.E();
        }
    }

    public oh_2(World world) {
        super(world);
    }
}

