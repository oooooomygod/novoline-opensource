/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.TileEntity;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.aUo
 */
public class auo_0 {
    private World e;
    private TileEntity c;
    private IBlockState a;
    private boolean f;
    private boolean b;
    private BlockPos d;

    public TileEntity b() {
        if (this.c == null && !this.b) {
            this.c = aV8.z(this.e, this.d);
            this.b = true;
        }
        return this.c;
    }

    public IBlockState c() {
        if (this.a == null && (this.f || aV8.isBlockLoaded(this.e, this.d))) {
            this.a = aV8.q(this.e, this.d);
        }
        return this.a;
    }

    public auo_0(World world, BlockPos blockPos, boolean bl) {
        this.e = world;
        this.d = blockPos;
        this.f = bl;
    }

    public static Predicate<auo_0> a(Predicate<IBlockState> predicate) {
        return new awg_1(predicate);
    }

    public BlockPos a() {
        return this.d;
    }
}

