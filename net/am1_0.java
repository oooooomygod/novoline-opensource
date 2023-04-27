/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.renderer.entity.RenderItem;

/*
 * Renamed from net.am1
 */
public class am1_0 {
    public static boolean a(EntityLivingBase entityLivingBase, ItemStack itemStack, q1_0 q1_02, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        ys_2.aX();
        boolean bl = aQQ.a(entityLivingBase, itemStack, q1_02, f, f2, f3, f4, f5, f6, f7);
        ListInvoker.b(new ListInvoker[2]);
        return bl;
    }

    public static boolean b() {
        return aQQ.d();
    }

    public static boolean a(ItemStack itemStack, int n, String string) {
        return aQQ.a(itemStack, n, string);
    }

    public static boolean a(RenderItem renderItem, ItemStack itemStack, JE jE) {
        return aQQ.a(renderItem, itemStack, jE);
    }

    public static JE a(ItemStack itemStack, JE jE, aRJ aRJ2) {
        return aQQ.a(itemStack, jE, aRJ2);
    }

    public static void a() {
        aQQ.c();
    }
}

