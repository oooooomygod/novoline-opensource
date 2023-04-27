/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.utils.fonts.api.FontRenderer;
import deobf.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.renderer.entity.RenderItem;

public class DU {
    private static String[] b;

    public static void a(RenderItem renderItem, ItemStack itemStack, JE jE) {
        renderItem.a(itemStack, jE);
    }

    public static void a(RenderItem renderItem, ItemStack itemStack, EntityLivingBase entityLivingBase, go_0 go_02) {
        renderItem.a(itemStack, entityLivingBase, go_02);
    }

    public static a8h_0 a(RenderItem renderItem) {
        return renderItem.a();
    }

    public static void a(RenderItem renderItem, ItemStack itemStack, float f, float f2, int n) {
        renderItem.a(itemStack, f, f2, n);
    }

    public static void a(RenderItem renderItem, deobf.FontRenderer fontRenderer, ItemStack itemStack, int n, int n2) {
        renderItem.a(fontRenderer, itemStack, n, n2);
    }

    public static void a(RenderItem renderItem, ItemStack itemStack, float f, float f2, double d) {
        renderItem.a(itemStack, f, f2, d);
    }

    public static boolean a(RenderItem renderItem, ItemStack itemStack) {
        return renderItem.c(itemStack);
    }

    public static String[] b() {
        return b;
    }

    public static void a(RenderItem renderItem, ItemStack itemStack, float f, float f2) {
        renderItem.b(itemStack, f, f2);
    }

    static {
        if (DU.b() == null) {
            DU.b(new String[3]);
        }
    }

    public static void a(RenderItem renderItem, boolean bl) {
        renderItem.a(bl);
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static void a(RenderItem renderItem, FontRenderer fontRenderer, ItemStack itemStack, int n, int n2) {
        renderItem.a(fontRenderer, itemStack, n, n2);
    }

    public static void a(RenderItem renderItem, JE jE, int n) {
        renderItem.a(jE, n);
    }

    public static void a(RenderItem renderItem, ItemStack itemStack, go_0 go_02) {
        renderItem.a(itemStack, go_02);
    }

    public static void a(RenderItem renderItem, deobf.FontRenderer fontRenderer, ItemStack itemStack, int n, int n2, String string) {
        renderItem.a(fontRenderer, itemStack, n, n2, string);
    }

    public static void b(RenderItem renderItem, ItemStack itemStack, float f, float f2) {
        renderItem.a(itemStack, f, f2);
    }
}

