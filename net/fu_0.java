/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.item.ItemStack;
import java.util.List;

/*
 * Renamed from net.fU
 */
public abstract class fu_0
extends fc_2 {
    protected JC<dq_1> P;

    @Override
    protected a42 s() {
        return new a42(this, this.a());
    }

    protected fu_0() {
        this.f(BlockStateInvoker.a(aXF.c(this.D), this.a(), (Comparable)((Object)(this.b() == atA.RED ? dq_1.POPPY : dq_1.DANDELION))));
    }

    @Override
    public int h(IBlockState iBlockState) {
        return aj4.a((dq_1)((Object)BlockStateInvoker.b(iBlockState, this.a())));
    }

    @Override
    public int d(IBlockState iBlockState) {
        return aj4.a((dq_1)((Object)BlockStateInvoker.b(iBlockState, this.a())));
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        for (dq_1 dq_12 : aj4.a(this.b())) {
            ListInvoker.add(list, new ItemStack(item, 1, aj4.a(dq_12)));
        }
    }

    public a4_0<dq_1> a() {
        if (this.P == null) {
            this.P = xu_0.a(arq_2.a, dq_1.class, this::lambda$getTypeProperty$0);
        }
        return this.P;
    }

    private boolean lambda$getTypeProperty$0(dq_1 dq_12) {
        return dq_12.d() == this.b();
    }

    public abstract atA b();

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), this.a(), (Comparable)((Object)aj4.a(this.b(), n)));
    }

    @Override
    public qn_2 O() {
        return qn_2.XZ;
    }
}

