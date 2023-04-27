/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EntityMinecart;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;

/*
 * Renamed from net.on
 */
public class on_2
extends EntityMinecart {
    private int av = 0;
    private awn_1 aw = new awi_2(this);

    @Override
    public IBlockState k() {
        return BlocksInvoker.t(Blocks.bz);
    }

    public on_2(World world, double d, double d2, double d3) {
        super(world, d, d2, d3);
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.t(), 23, aYH.a);
        aom_0.a(this.t(), 24, aYH.b);
    }

    @Override
    public void a(int n, int n2, int n3, boolean bl) {
        if (this.ticksExisted - this.av >= 4) {
            awo_0.a(this.a(), this.worldObj);
            this.av = this.ticksExisted;
        }
    }

    @Override
    public boolean b(EntityPlayer entityPlayer) {
        awo_0.a(this.aw, entityPlayer);
        return false;
    }

    private static Throwable b(Throwable throwable) {
        return throwable;
    }

    @Override
    public void g(int n) {
        super.g(n);
        if (n == 24) {
            try {
                awo_0.a(this.aw, aGU.a(aom_0.d(this.t(), 24)));
            }
            catch (Throwable throwable) {}
        } else if (n == 23) {
            awo_0.b(this.aw, aom_0.d(this.t(), 23));
        }
    }

    public awn_1 a() {
        return this.aw;
    }

    public on_2(World world) {
        super(world);
    }

    @Override
    public anf_0 d() {
        return anf_0.COMMAND_BLOCK;
    }

    @Override
    protected void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        awo_0.a(this.aw, nBTTagCompound);
        aom_0.b(this.t(), 23, awo_0.c(this.a()));
        aom_0.b(this.t(), 24, aGU.a(awo_0.f(this.a())));
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        awo_0.b(this.aw, nBTTagCompound);
    }
}

