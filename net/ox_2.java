/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import deobf.Entity;

/*
 * Renamed from net.ox
 */
public class ox_2
extends Entity {
    public int ak;
    public int aj;

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        if (this.a(damageSource)) {
            return false;
        }
        if (!this.isDead && !this.worldObj.isRemote) {
            this.aj = 0;
            if (this.aj <= 0) {
                this.E();
                if (!this.worldObj.isRemote) {
                    aV8.a(this.worldObj, (Entity)null, this.posX, this.posY, this.posZ, 6.0f, true);
                }
            }
        }
        return true;
    }

    public ox_2(World world, double d, double d2, double d3) {
        this(world);
        this.j(d, d2, d3);
    }

    @Override
    public boolean N() {
        return true;
    }

    @Override
    protected void g(NBTTagCompound nBTTagCompound) {
    }

    public ox_2(World world) {
        super(world);
        this.P = true;
        this.c(2.0f, 2.0f);
        this.aj = 5;
        this.ak = a5_0.a(this.Q, 100000);
    }

    @Override
    protected void g() {
        aom_0.a(this.l, 8, P8.d(this.aj));
    }

    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        ++this.ak;
        aom_0.b(this.l, 8, P8.d(this.aj));
        int n = MathHelper.floor_double(this.posX);
        int n2 = MathHelper.floor_double(this.posY);
        int n3 = MathHelper.floor_double(this.posZ);
        if (this.worldObj.d instanceof a91 && BlockStateInvoker.getBlock(aV8.q(this.worldObj, new BlockPos(n, n2, n3))) != Blocks.c) {
            aV8.a(this.worldObj, new BlockPos(n, n2, n3), abb_1.a(Blocks.c));
        }
    }

    @Override
    protected boolean p() {
        return false;
    }
}

