/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EntityMinecart;
import net.minecraft.init.Blocks;

/*
 * Renamed from net.oo
 */
public class oo_2
extends EntityMinecart {
    private OP av = new of_0(this);

    @Override
    public IBlockState k() {
        return BlocksInvoker.t(Blocks.p);
    }

    public OP a() {
        return this.av;
    }

    @Override
    public void a(byte by) {
        apq_1.a(this.av, by);
    }

    @Override
    protected void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        this.av.b(nBTTagCompound);
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        apq_1.d(this.av);
    }

    public oo_2(World world) {
        super(world);
    }

    @Override
    public anf_0 d() {
        return anf_0.SPAWNER;
    }

    public oo_2(World world, double d, double d2, double d3) {
        super(world, d, d2, d3);
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        this.av.a(nBTTagCompound);
    }
}

