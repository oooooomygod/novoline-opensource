/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.item.ItemStack;
import java.util.List;

/*
 * Renamed from net.gJ
 */
public class gj_0
extends g1_0 {
    public static JC<F3> R = xu_0.a(wy_0.a, F3.class, gj_0::lambda$static$0);

    private static boolean lambda$static$0(F3 f3) {
        return aER.b(f3) < 4;
    }

    @Override
    public MapColor g(IBlockState iBlockState) {
        F3 f3 = (F3)((Object)BlockStateInvoker.b(iBlockState, R));
        switch ((cs_2)((Object)BlockStateInvoker.b(iBlockState, Q))) {
            default: {
                switch (f3) {
                    default: {
                        return aER.a(F3.SPRUCE);
                    }
                    case SPRUCE: {
                        return aER.a(F3.DARK_OAK);
                    }
                    case BIRCH: {
                        return MapColor.E;
                    }
                    case JUNGLE: 
                }
                return aER.a(F3.SPRUCE);
            }
            case Y: 
        }
        return aER.a(f3);
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= aER.b((F3)((Object)BlockStateInvoker.b(iBlockState, R)));
        switch ((cs_2)((Object)BlockStateInvoker.b(iBlockState, Q))) {
            case X: {
                n |= 4;
                break;
            }
            case Z: {
                n |= 8;
                break;
            }
            case NONE: {
                n |= 0xC;
            }
        }
        return n;
    }

    public gj_0() {
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), R, (Comparable)((Object)F3.OAK)), Q, (Comparable)((Object)cs_2.Y)));
    }

    @Override
    public int h(IBlockState iBlockState) {
        return aER.b((F3)((Object)BlockStateInvoker.b(iBlockState, R)));
    }

    @Override
    protected a42 s() {
        return new a42(this, R, Q);
    }

    @Override
    public IBlockState c(int n) {
        IBlockState iBlockState = BlockStateInvoker.a(this.m(), R, (Comparable)((Object)aER.a((n & 3) % 4)));
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

    @Override
    protected ItemStack b(IBlockState iBlockState) {
        return new ItemStack(px_0.a(this), 1, aER.b((F3)((Object)BlockStateInvoker.b(iBlockState, R))));
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        ListInvoker.add(list, new ItemStack(item, 1, aER.b(F3.OAK)));
        ListInvoker.add(list, new ItemStack(item, 1, aER.b(F3.SPRUCE)));
        ListInvoker.add(list, new ItemStack(item, 1, aER.b(F3.BIRCH)));
        ListInvoker.add(list, new ItemStack(item, 1, aER.b(F3.JUNGLE)));
    }
}

