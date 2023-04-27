/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.Material;
import net.UH;
import net.ar0_0;
import net.n5_0;
import net.nb_2;
import net.nt_1;

public enum a40 {
    MONSTER(ar0_0.class, 70, Material.air, false, false),
    CREATURE(n5_0.class, 10, Material.air, true, true),
    AMBIENT(nb_2.class, 15, Material.air, true, false),
    WATER_CREATURE(nt_1.class, 5, Material.M, true, false);

    private Class<? extends UH> c;
    private boolean b;
    private int a;
    private Material f;
    private boolean e;

    public boolean a() {
        return this.e;
    }

    private a40(Class<? extends UH> clazz, int n2, Material material, boolean bl, boolean bl2) {
        this.c = clazz;
        this.a = n2;
        this.f = material;
        this.b = bl;
        this.e = bl2;
    }

    public boolean b() {
        return this.b;
    }

    public Class<? extends UH> c() {
        return this.c;
    }

    public int d() {
        return this.a;
    }
}

