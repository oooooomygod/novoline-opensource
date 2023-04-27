/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.init.Blocks;

/*
 * Renamed from net.anh
 */
public enum anh_2 {
    WOOD(0, 59, 2.0f, 0.0f, 15),
    STONE(1, 131, 4.0f, 1.0f, 5),
    IRON(2, 250, 6.0f, 2.0f, 14),
    EMERALD(3, 1561, 8.0f, 3.0f, 10),
    GOLD(0, 32, 12.0f, 0.0f, 22);

    private int e;
    private float f;
    private float c;
    private int d;
    private int a;

    public int a() {
        return this.e;
    }

    public int f() {
        return this.d;
    }

    private anh_2(int n2, int n3, float f, float f2, int n4) {
        this.e = n2;
        this.d = n3;
        this.f = f;
        this.c = f2;
        this.a = n4;
    }

    public float b() {
        return this.c;
    }

    public float e() {
        return this.f;
    }

    public Item c() {
        return this == WOOD ? px_0.a(Blocks.planks) : (this == STONE ? px_0.a(Blocks.cobblestone) : (this == GOLD ? Items.gold_ingot : (this == IRON ? Items.iron_ingot : (this == EMERALD ? Items.diamond : null))));
    }

    public int d() {
        return this.a;
    }
}

