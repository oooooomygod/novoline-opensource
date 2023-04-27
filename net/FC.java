/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.minecraft.block.BlockPos;

public class FC
extends F_ {
    private BlockPos m;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void b() {
        block4: {
            block5: {
                if (!this.f()) {
                    super.b();
                    return;
                }
                if (this.m == null) return;
                double d = this.e.width * this.e.width;
                if (!(CG.a(this.e, this.m) >= d)) break block4;
                if (this.e.posY <= (double)amv_2.h(this.m)) break block5;
                BlockPos blockPos = new BlockPos(amv_2.j(this.m), MathHelper.floor_double(this.e.posY), amv_2.i(this.m));
                if (!(CG.a(this.e, blockPos) >= d)) break block4;
            }
            MK.a(CG.i(this.e), amv_2.j(this.m), amv_2.h(this.m), amv_2.i(this.m), this.c);
            return;
        }
        this.m = null;
    }

    @Override
    public boolean a(Entity entity, double d) {
        aMH aMH2 = this.a(entity);
        return this.a(aMH2, d);
    }

    public FC(nl_1 nl_12, World world) {
        super(nl_12, world);
    }

    @Override
    public aMH a(BlockPos blockPos) {
        this.m = blockPos;
        return super.a(blockPos);
    }

    @Override
    public aMH a(Entity entity) {
        this.m = new BlockPos(entity);
        return super.a(entity);
    }
}

