/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.Item;
import net.Items;
import net.qx_1;

public enum ArmorMaterial {
    LEATHER(qx_1.f, 5, new int[]{1, 3, 2, 1}, 15),
    CHAIN(qx_1.a, 15, new int[]{2, 5, 4, 1}, 12),
    IRON(qx_1.b, 15, new int[]{2, 6, 5, 2}, 9),
    GOLD(qx_1.g, 7, new int[]{2, 5, 3, 1}, 25),
    DIAMOND(qx_1.d, 33, new int[]{3, 8, 6, 3}, 10);

    private int c;
    private int e;
    private String d;
    private int[] a;

    public int a() {
        return this.c;
    }

    private ArmorMaterial(String string2, int n2, int[] nArray, int n3) {
        this.d = string2;
        this.e = n2;
        this.a = nArray;
        this.c = n3;
    }

    public Item c() {
        return this == LEATHER ? Items.leather : (this == CHAIN ? Items.iron_ingot : (this == GOLD ? Items.gold_ingot : (this == IRON ? Items.iron_ingot : (this == DIAMOND ? Items.diamond : null))));
    }

    public int b(int n) {
        return ItemArmor.a()[n] * this.e;
    }

    public String b() {
        return this.d;
    }

    public int a(int n) {
        return this.a[n];
    }
}

