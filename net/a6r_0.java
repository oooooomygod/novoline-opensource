/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.UnmodifiableIterator
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.block.Block;

/*
 * Renamed from net.a6r
 */
public abstract class a6r_0
implements acf_0 {
    protected Map<IBlockState, aRJ> a = MapsInvoker.c();

    public String a(Map<a4_0, Comparable> map) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = aS0.f(MapInvoker.b(map));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            if (aL0.a(stringBuilder) != 0) {
                aL0.a(stringBuilder, tj_1.b);
            }
            a4_0 a4_02 = (a4_0)FG.b(entry);
            Comparable comparable = (Comparable)FG.a(entry);
            aL0.a(stringBuilder, aPS.a(a4_02));
            aL0.a(stringBuilder, tj_1.a);
            aL0.a(stringBuilder, aPS.a(a4_02, comparable));
        }
        if (aL0.a(stringBuilder) == 0) {
            aL0.a(stringBuilder, tj_1.c);
        }
        return stringBuilder.toString();
    }

    @Override
    public Map<IBlockState, aRJ> a(Block block) {
        UnmodifiableIterator unmodifiableIterator = a7c_0.a(aXF.a(BlocksInvoker.E(block)));
        while (dz_0.c((Iterator)unmodifiableIterator)) {
            IBlockState iBlockState = (IBlockState)dz_0.b((Iterator)unmodifiableIterator);
            MapInvoker.c(this.a, iBlockState, this.a(iBlockState));
        }
        return this.a;
    }

    protected abstract aRJ a(IBlockState var1);
}

