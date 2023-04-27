/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.minecraft.block.Block;

/*
 * Renamed from net.Df
 */
public class df_0 {
    private Map<Block, acf_0> a = MapsInvoker.b();
    private Set<Block> b = axe_2.d();

    public void a(Block block, acf_0 acf_02) {
        MapInvoker.c(this.a, block, acf_02);
    }

    public Map<IBlockState, aRJ> a() {
        IdentityHashMap identityHashMap = MapsInvoker.b();
        Iterator iterator = a82.a(Block.m);
        while (dz_0.c(iterator)) {
            Block block = (Block)dz_0.b(iterator);
            if (aS0.c(this.b, block)) continue;
            MapInvoker.a((Map)identityHashMap, awg_0.a((acf_0)aWU.a(MapInvoker.c(this.a, block), new a6c_0()), block));
        }
        return identityHashMap;
    }

    public void a(Block ... blockArray) {
        asg_0.a(this.b, blockArray);
    }
}

