/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import com.google.common.base.Predicate;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.block.Block;

/*
 * Renamed from net.k2
 */
public class k2_0
implements Predicate<IBlockState> {
    private a42 b;
    private Map<a4_0, Predicate> a = MapsInvoker.a();

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public boolean a(IBlockState iBlockState) {
        if (BlockStateInvoker.getBlock(iBlockState).equals(aXF.d(this.b))) {
            Iterator iterator = aS0.f(MapInvoker.b(this.a));
            while (dz_0.c(iterator)) {
                Map.Entry entry = (Map.Entry)dz_0.b(iterator);
                Comparable comparable = BlockStateInvoker.b(iBlockState, (a4_0)FG.b(entry));
                if (((Predicate)FG.a(entry)).apply((Object)comparable)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public <V extends Comparable<V>> k2_0 a(a4_0<V> a4_02, Predicate<? extends V> predicate) {
        if (!ms_0.b(aXF.b(this.b), a4_02)) {
            throw new IllegalArgumentException(aL0.a(aL0.a(aL0.a(new StringBuilder(), this.b), ace_0.a), a4_02).toString());
        }
        MapInvoker.c(this.a, a4_02, predicate);
        return this;
    }

    private k2_0(a42 a422) {
        this.b = a422;
    }

    public static k2_0 a(Block block) {
        return new k2_0(BlocksInvoker.E(block));
    }
}

