/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.Vec3;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.alr
 */
class alr_0
extends _v_0 {
    private nw_1 c;
    public int b;

    @Override
    public void b() {
        this.b = 0;
    }

    @Override
    public boolean g() {
        return lw_1.b(this.c) != null;
    }

    @Override
    public void d() {
        EntityLivingBase entityLivingBase = lw_1.b(this.c);
        double d = 64.0;
        if (atn_0.b(entityLivingBase, this.c) < d * d && lw_1.a(this.c, entityLivingBase)) {
            World world = this.c.worldObj;
            ++this.b;
            if (this.b == 10) {
                aV8.a(world, (EntityPlayer)null, 1007, new BlockPos(this.c), 0);
            }
            if (this.b == 20) {
                double d2 = 4.0;
                Vec3 vec3 = lw_1.a(this.c, 1.0f);
                double d3 = entityLivingBase.posX - (this.c.posX + vec3.xCoord * d2);
                double d4 = atn_0.i((EntityLivingBase)entityLivingBase).a + (double)(entityLivingBase.n / 2.0f) - (0.5 + this.c.posY + (double)(this.c.n / 2.0f));
                double d5 = entityLivingBase.posZ - (this.c.posZ + vec3.zCoord * d2);
                aV8.a(world, (EntityPlayer)null, 1008, new BlockPos(this.c), 0);
                oh_2 oh_22 = new oh_2(world, this.c, d3, d4, d5);
                oh_22.au = lw_1.f(this.c);
                oh_22.posX = this.c.posX + vec3.xCoord * d2;
                oh_22.posY = this.c.posY + (double)(this.c.n / 2.0f) + 0.5;
                oh_22.posZ = this.c.posZ + vec3.zCoord * d2;
                aV8.b(world, oh_22);
                this.b = -40;
            }
        } else if (this.b > 0) {
            --this.b;
        }
        lw_1.a(this.c, this.b > 10);
    }

    @Override
    public void a() {
        lw_1.a(this.c, false);
    }

    public alr_0(nw_1 nw_12) {
        this.c = nw_12;
    }
}

