/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.item.ItemStack;
import java.util.List;

/*
 * Renamed from net.gT
 */
public class gt_1
extends g1_0 {
    public static JC<F3> R = xu_0.a(lk_0.a, F3.class, gt_1::lambda$static$0);

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        ListInvoker.add(list, new ItemStack(item, 1, aER.b(F3.ACACIA) - 4));
        ListInvoker.add(list, new ItemStack(item, 1, aER.b(F3.DARK_OAK) - 4));
    }

    @Override
    public MapColor g(IBlockState iBlockState) {
        F3 f3 = (F3)((Object)BlockStateInvoker.b(iBlockState, R));
        switch (awf_1.a[((cs_2)((Object)BlockStateInvoker.b(iBlockState, Q))).ordinal()]) {
            default: {
                switch (f3) {
                    default: {
                        return MapColor.e;
                    }
                    case DARK_OAK: 
                }
                return aER.a(F3.DARK_OAK);
            }
            case 4: 
        }
        return aER.a(f3);
    }

    @Override
    protected a42 s() {
        return new a42(this, R, Q);
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= aER.b((F3)((Object)BlockStateInvoker.b(iBlockState, R))) - 4;
        switch (awf_1.a[((cs_2)((Object)BlockStateInvoker.b(iBlockState, Q))).ordinal()]) {
            case 1: {
                n |= 4;
                break;
            }
            case 2: {
                n |= 8;
                break;
            }
            case 3: {
                n |= 0xC;
            }
        }
        return n;
    }

    @Override
    public int h(IBlockState iBlockState) {
        return aER.b((F3)((Object)BlockStateInvoker.b(iBlockState, R))) - 4;
    }

    public gt_1() {
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), R, (Comparable)((Object)F3.ACACIA)), Q, (Comparable)((Object)cs_2.Y)));
    }

    @Override
    public IBlockState c(int n) {
        IBlockState iBlockState = BlockStateInvoker.a(this.m(), R, (Comparable)((Object)aER.a((n & 3) + 4)));
        switch (n & 0xC) {
            case 0: {
                iBlockState = BlockStateInvoker.a(iBlockState, Q, (Comparable)((Object)cs_2.Y));
                break;
            }
            case 4: {
                iBlockState = BlockStateInvoker.a(iBlockState, Q, (Comparable)((Object)cs_2.X));
                break;
            }
            case 8: {
                iBlockState = BlockStateInvoker.a(iBlockState, Q, (Comparable)((Object)cs_2.Z));
                break;
            }
            default: {
                iBlockState = BlockStateInvoker.a(iBlockState, Q, (Comparable)((Object)cs_2.NONE));
            }
        }
        return iBlockState;
    }

    private static boolean lambda$static$0(F3 f3) {
        return aER.b(f3) >= 4;
    }

    @Override
    protected ItemStack b(IBlockState iBlockState) {
        return new ItemStack(px_0.a(this), 1, aER.b((F3)((Object)BlockStateInvoker.b(iBlockState, R))) - 4);
    }
}

