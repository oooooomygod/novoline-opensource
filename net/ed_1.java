/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MapInvoker;
import net.minecraft.block.Block;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import java.io.InputStream;
import java.util.Map;

/*
 * Renamed from net.eD
 */
public class ed_1 {
    public static boolean a(ItemArmor itemArmor, ItemStack itemStack) {
        aP2.b();
        int n = xs_2.c(itemArmor, itemStack);
        return n != 0xFFFFFF;
    }

    public static boolean a(ItemStack itemStack) {
        aP2.b();
        return !ayy_0.d(ail_0.y) ? act_2.j(itemStack) : aDb.e(act_2.k(itemStack), ail_0.y, new Object[]{itemStack});
    }

    public static boolean a(RenderGlobal renderGlobal, float f, int n) {
        aP2.b();
        return !ayy_0.d(ail_0.cs) ? false : aDb.b(ail_0.cs, new Object[]{renderGlobal, axx_1.a(f), P8.d(n)});
    }

    public static void a(String string, Object object) {
        aP2.b();
        Map map = (Map)aDb.a(ail_0.b7);
        if (map != null) {
            MapInvoker.c(map, string, object);
        }
    }

    public static InputStream a(String string) {
        aP2.b();
        if (!aSG.a(ail_0.ds)) {
            return null;
        }
        aDb.a(ail_0.ds);
        return null;
    }

    public static boolean a(IBlockState iBlockState) {
        aP2.b();
        Block block = BlockStateInvoker.getBlock(iBlockState);
        return !ayy_0.d(ail_0.bc) ? BlocksInvoker.c(block) : aDb.e(block, ail_0.bc, new Object[]{iBlockState});
    }

    public static void a(ResourceLocation resourceLocation, String string) {
        aP2.b();
        if (!ayy_0.d(ail_0.Q)) {
            Object object = aDb.f(ail_0.ah, new Object[0]);
            aDb.f(object, ail_0.Q, new Object[]{resourceLocation, string});
        }
    }

    public static void a(ResourceLocation resourceLocation) {
        aP2.b();
        if (!ayy_0.d(ail_0.bp)) {
            Object object = aDb.f(ail_0.ah, new Object[0]);
            aDb.f(object, ail_0.bp, new Object[]{resourceLocation});
        }
    }
}

